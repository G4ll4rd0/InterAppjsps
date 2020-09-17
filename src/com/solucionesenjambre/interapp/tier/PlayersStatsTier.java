package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.PlayersStatsDao;
import com.solucionesenjambre.interapp.fs.dto.PlayersStats;
import com.solucionesenjambre.interapp.fs.exceptions.PlayersStatsDaoException;
import com.solucionesenjambre.interapp.fs.factory.PlayersStatsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class PlayersStatsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(PlayersStatsTier.class);
	
	private PlayersStatsDao dao = null;
	
	public PlayersStatsTier()
	{
		dao 	= PlayersStatsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public PlayersStatsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= PlayersStatsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las estadisticas
	public List<PlayersStats> all()
	{
		List<PlayersStats> results = new ArrayList<PlayersStats>();
		PlayersStats[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (PlayersStatsDaoException e)
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
	
	//Insercion de estadisticas
	public boolean save(PlayersStats obj)
	{		
		try
		{
			if(obj.getPlayerStatId() == 0)
				dao.insert(obj);
			else
				dao.update(obj.createPk(), obj);
		}
		catch (PlayersStatsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}