package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.GamesDao;
import com.solucionesenjambre.interapp.fs.dto.Games;
import com.solucionesenjambre.interapp.fs.exceptions.GamesDaoException;
import com.solucionesenjambre.interapp.fs.factory.GamesDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class GamesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(GamesTier.class);
	
	private GamesDao dao = null;
	
	public GamesTier()
	{
		dao 	= GamesDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public GamesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= GamesDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los juegos
	public List<Games> all()
	{
		List<Games> results = new ArrayList<Games>();
		Games[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (GamesDaoException e)
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
	
	//Obtiene por dia
	public List<Games> getByDate(Date date)
	{
		List<Games> results = new ArrayList<Games>();
		Games[] array = null;
		
		try
		{		
			array = dao.findWhereDateEquals(date);
			
			results = Arrays.asList(array);
		}
		catch (GamesDaoException e)
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
	
	
	//Insercion de Juego o actualizacion
	public boolean save(Games obj)
	{		
		try
		{
			if(obj.getGameId() == 0)
				dao.insert(obj);
			else
				dao.update(obj.createPk(), obj);
		}
		catch (GamesDaoException e)
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