package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.PlayersDao;
import com.solucionesenjambre.interapp.fs.dto.Players;
import com.solucionesenjambre.interapp.fs.exceptions.PlayersDaoException;
import com.solucionesenjambre.interapp.fs.factory.PlayersDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class PlayersTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(PlayersTier.class);
	
	private PlayersDao dao = null;
	
	public PlayersTier()
	{
		dao 	= PlayersDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public PlayersTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= PlayersDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las noticias
	public List<Players> all()
	{
		List<Players> results = new ArrayList<Players>();
		Players[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (PlayersDaoException e)
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
	
	//Obtiene todos los juagdores de un equipo
	public List<Players> getByTId(int teamId)
	{
		List<Players> results = new ArrayList<Players>();
		Players[] array = null;
		
		try
		{		
			array = dao.findByTeams(teamId);
			
			results = Arrays.asList(array);
		}
		catch (PlayersDaoException e)
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
	
	
	//Insercion de Juagdores
	public boolean save(Players obj)
	{		
		try
		{
			if(obj.getPlayerId() == 0)
				dao.insert(obj);
			else
				dao.update(obj.createPk(), obj);
		}
		catch (PlayersDaoException e)
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