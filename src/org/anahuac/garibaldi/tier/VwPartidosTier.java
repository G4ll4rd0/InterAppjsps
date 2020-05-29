package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.VwPartidosDao;
import org.anahuac.garibaldi.fs.dto.VwPartidos;
import org.anahuac.garibaldi.fs.exceptions.VwPartidosDaoException;
import org.anahuac.garibaldi.fs.factory.VwPartidosDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwPartidosTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private VwPartidosDao dao = null;
	
	public VwPartidosTier()
	{
		dao 	= VwPartidosDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwPartidosTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwPartidosDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwPartidos> get(int params)
	{
		List<VwPartidos> results = new ArrayList<VwPartidos>();
		VwPartidos[] array = null;
		
		try
		{
			VwPartidos[] sqlparams = null;
			String sql;
			
			sql  = "	1 = 1";
			
			if(params > 0)
			{
				sql+= " AND ya_jugado = 0";
				sql+= " AND deporte_id = " + params;
			}
				

			sql += "		ORDER BY fecha, hora";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (VwPartidosDaoException e)
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
	
	public List<VwPartidos> evento(int evento, int fecha)
	{
		List<VwPartidos> results = new ArrayList<VwPartidos>();
		VwPartidos[] array = null;
		
		try
		{
			VwPartidos[] sqlparams = null;
			String sql;
			
			sql  = "	seccion_id = " + evento;
			sql += "	AND fecha= '" + fecha + "'";
			sql += "		ORDER BY fecha, hora";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (VwPartidosDaoException e)
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
	
	public List<VwPartidos> deporte(int evento, int deporteId)
	{
		List<VwPartidos> results = new ArrayList<VwPartidos>();
		VwPartidos[] array = null;
		
		try
		{
			VwPartidos[] sqlparams = null;
			String sql;
			
			sql  = "	seccion_id = " + evento;
			sql += "	AND deporte_id = " + deporteId;
			sql += "		ORDER BY fecha, hora";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (VwPartidosDaoException e)
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
	
	public VwPartidos[] browse(int keyId)
	{
		VwPartidos[] results = null;
		
		System.out.println("obtuve el keyId: " + keyId);
		
		try
		{
			results = dao.findWherePartidoIdEquals(keyId);
		}
		catch (VwPartidosDaoException e)
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