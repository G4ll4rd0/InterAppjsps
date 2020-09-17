package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwStatsDao;
import com.solucionesenjambre.interapp.fs.dto.VwStats;
import com.solucionesenjambre.interapp.fs.exceptions.VwStatsDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwStatsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class VwStatsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwStats.class);
	
	private VwStatsDao dao = null;
	
	public VwStatsTier()
	{		
		dao 	= VwStatsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwStatsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwStatsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	/**
	 * Obtiene la estadistica buscando por el nombre, apellido 1 o apellido 2 de un jugador
	 * @param params arreglo con la palabra clave a buscar
	 * @return listado de elementos encontrados o 'null' si no hay resultado
	 */
	public List<VwStats> browse(String[] params)
	{
		List<VwStats> results = new ArrayList<VwStats>();
		VwStats[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{
				ArrayList<Object> sqlParams = new ArrayList<Object>();
				
				//like filter (agrega los %% al inicio y al final)
				params[0] = GeneralUtils.addLikeFormat(params[0]);
				
				String sql = null;
				
				sql  = "	nombre LIKE ? ";
				sql += "		OR primer_apellido LIKE ? ";
				sql += "		OR segundo_apellido LIKE ? ";
				
				//funcion que me inserta el parametro 'n' veces en el arreglo
				GeneralUtils.addSqlParams(sqlParams, params[0], 3);
				
				array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return results;
	}
	
	/**
	 * Obtiene la estadistica buscando por el equipo de un jugador
	 * @param params arreglo con la palabra clave a buscar
	 * @return listado de elementos encontrados o 'null' si no hay resultado
	 */
	public List<VwStats> team(int keyword)
	{
		List<VwStats> results = new ArrayList<VwStats>();
		VwStats[] array = null;
		
		try
		{
			Object[] sqlparams = null;
			String sql;
			
			sql  = "	equipo_id = " + keyword;
			sql += "		ORDER BY numero";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return results;
	}
	
	/**
	 * Obtiene un registro de la vista por jugador
	 * @param keyId id del jugador
	 * @return registro buscado o 'null' si no hay resultado
	 */
	public VwStats get(int keyId)
	{
		VwStats[] array = null;
		
		try
		{
			array = dao.findWherePlayerIdEquals(keyId);
		}
		catch (VwStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return array.length == 0 ? null : array[0];
	}
	
	public List<VwStats> getTeams(String params)
	{
		List<VwStats> results = new ArrayList<VwStats>();
		VwStats[] array = null;
		
		try
		{
			Object[] sqlparams = null;
			String sql;
			
			sql  = "	deporte LIKE '" + params + "%'";
			sql += "		GROUP BY nombre_equipo";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return results;
	}
	
	/**
	 * Lista los mejores 'x' jugadores del deporte, rama y sección definido
	 * @param params
	 * @return
	 */
	public List<VwStats> topPlayers(int topLimit, int deporteId, int seccionId)
	{
		List<VwStats> results = new ArrayList<VwStats>();
		VwStats[] array = null;
		
		try
		{
			ArrayList<Object> sqlParams = new ArrayList<Object>();
			
			String sql = null;
			
			sql  = "	sport_id = ? ";
			sql += "		AND event-id = ? ";
			sql += "	ORDER BY points DESC ";
			sql += "	LIMIT ? ";
			
			sqlParams.add(deporteId);
			sqlParams.add(seccionId);

			//el limite se aumenta por consideraciones de empates, de todas maneras, el ciclo es
			//lo suficientemente rapido para ser considerado 'despreciable'
			sqlParams.add(topLimit + 20);
			
			array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			
			/*
			 * Lo comun es que el array se hubiera convertido en la lista directamente, pero debemos considerar
			 * si hay "empates" en los maximos anotadores.
			 * 
			 * Se debe considerar que los empates, tipo olimpiadas, es decir:
			 *  - Si hay 2 de primer lugar, se premian 2 oros y 1 bronce, si hay 3 o mas oros no hay platas ni bronces
			 *  - Si se empata en 2do lugar 2, entonces es 1 oro y 2 platas solamente, si hay 3 o mas platas se premian todas las platas
			 *  - Si se empata en 3er lugar, se premian todos los bronces
			 *  
			 *  De momento solo considera si hay empates en lugar 'N' consultado, no es una cuestion muy importante, asi que
			 *  se deja así. La funcionalidad corercta sería hacer un "distinct" de los goles, sacando el limit sobre topLimit y
			 *  traerte todos los goleadores con marcador igual o mayor al menor de ese "distinct" y a partir de ahi ir determinando cuando
			 *  pasas del topLimit... como ves, no vale la pena en este caso
			 */
			
			//FIXME: dejaste goles como "long", en serio crees que meten mas de 2,147,483,647 goles / puntos?
			long lastScore = 0;
			int pos = 0;
			
			for (int i = 0; i < array.length; i++)
			{
				VwStats estadistica = array[i];
				
				if (lastScore != estadistica.getPoints())
					pos++;
				
				if (pos <= topLimit)
					results.add(estadistica);
				else
					break;
				
				lastScore = estadistica.getPoints();
			}
		}
		catch (VwStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return results;
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}