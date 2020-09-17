package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwGamesDao;
import com.solucionesenjambre.interapp.fs.dto.VwGames;
import com.solucionesenjambre.interapp.fs.exceptions.VwGamesDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwGamesDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwGamesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwGamesTier.class);
	
	private VwGamesDao dao = null;
	
	public VwGamesTier()
	{
		dao 	= VwGamesDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwGamesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwGamesDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los juegos
	public List<VwGames> all()
	{
		List<VwGames> results = new ArrayList<VwGames>();
		VwGames[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (VwGamesDaoException e)
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
	
	//Obtiene un Partido
	public VwGames[] get(int gameId)
	{
		VwGames[] results = null;
		
		try
		{				
			results = dao.findWhereGameIdEquals(gameId);
		}
		catch (VwGamesDaoException e)
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
	
	//Obtiene todos los juegos pendientes de resultado/jugar
	public List<VwGames> pending(String[] params)
	{
		List<VwGames> results = new ArrayList<VwGames>();
		VwGames[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{
				String sql = null;
				
				sql  = "	sport_id = ? ";
				sql += "		AND already_played = ?";
										
				array = dao.findByDynamicWhere(sql, params);
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwGamesDaoException e)
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
	
	//Obtiene por dia/evento
	public List<VwGames> getByDate(String[] params)
	{
		List<VwGames> results = new ArrayList<VwGames>();
		VwGames[] array = null;
		
		try
		{		
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{							
				String sql = null;
				
				sql  = "	date = ? ";
				sql += "		AND event_id = ?";
				sql += "			ORDER BY time ASC";
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			results = Arrays.asList(array);
		}
		catch (VwGamesDaoException e)
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
	
	//Obtiene por deporte/evento
	public List<VwGames> getBySport(String[] params)
	{
		List<VwGames> results = new ArrayList<VwGames>();
		VwGames[] array = null;
		
		try
		{		
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{							
				String sql = null;
				
				sql  = "	sport_id = ? ";
				sql += "		AND event_id = ?";
				sql += "			ORDER BY date ASC, time ASC";
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			results = Arrays.asList(array);
		}
		catch (VwGamesDaoException e)
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