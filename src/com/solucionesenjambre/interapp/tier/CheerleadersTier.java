package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.CheerleadersDao;
import com.solucionesenjambre.interapp.fs.dto.Cheerleaders;
import com.solucionesenjambre.interapp.fs.exceptions.CheerleadersDaoException;
import com.solucionesenjambre.interapp.fs.factory.CheerleadersDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class CheerleadersTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(CheerleadersTier.class);
	
	private CheerleadersDao dao = null;
	
	public CheerleadersTier()
	{
		dao 	= CheerleadersDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public CheerleadersTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= CheerleadersDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las noticias
	public List<Cheerleaders> all()
	{
		List<Cheerleaders> results = new ArrayList<Cheerleaders>();
		Cheerleaders[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (CheerleadersDaoException e)
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
	
	//Insercion de Noticias
	public boolean save(Cheerleaders obj)
	{		
		try
		{
			if(obj.getCheerleaderId() == 0)
				dao.insert(obj);
			else
				dao.update(obj.createPk(), obj);
		}
		catch (CheerleadersDaoException e)
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