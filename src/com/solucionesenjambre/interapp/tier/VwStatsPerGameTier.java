package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwStatsPerGameDao;
import com.solucionesenjambre.interapp.fs.dto.VwStatsPerGame;
import com.solucionesenjambre.interapp.fs.exceptions.VwStatsPerGameDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwStatsPerGameDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwStatsPerGameTier 
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwStatsPerGameTier.class);
	
	private VwStatsPerGameDao dao = null;
	
	public VwStatsPerGameTier()
	{
		dao 	= VwStatsPerGameDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwStatsPerGameTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwStatsPerGameDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las ramas
	public List<VwStatsPerGame> all()
	{
		List<VwStatsPerGame> results = new ArrayList<VwStatsPerGame>();
		VwStatsPerGame[] array = null;
		
		try
		{
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (VwStatsPerGameDaoException e)
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
	
	//Obtiene todas las ramas
	public List<VwStatsPerGame> byGameTeam(String[] params)
	{
		List<VwStatsPerGame> results = new ArrayList<VwStatsPerGame>();
		VwStatsPerGame[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{				
				String sql = "";
				
				sql  = "	game_id = ? ";
				sql  += "		team_id = ? ";
								
				array = dao.findByDynamicWhere(sql, params);
			}
			results = Arrays.asList(array);
		}
		catch (VwStatsPerGameDaoException e)
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
