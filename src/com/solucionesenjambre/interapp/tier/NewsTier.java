package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.NewsDao;
import com.solucionesenjambre.interapp.fs.dto.News;
import com.solucionesenjambre.interapp.fs.exceptions.NewsDaoException;
import com.solucionesenjambre.interapp.fs.factory.NewsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class NewsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(NewsTier.class);
	
	private NewsDao dao = null;
	
	public NewsTier()
	{
		dao 	= NewsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public NewsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= NewsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las noticias
	public List<News> all()
	{
		List<News> results = new ArrayList<News>();
		News[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (NewsDaoException e)
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
	
	//Obtiene todas las noticias del evento
	public List<News> getByEID(int eid)
	{
		List<News> results = new ArrayList<News>();
		News[] array = null;
		
		try
		{		
			array = dao.findByEvents(eid);
			
			results = Arrays.asList(array);
		}
		catch (NewsDaoException e)
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
	public boolean save(News obj)
	{				
		try
		{
			if(obj.getNewId() == 0)
				dao.insert(obj);
			else
				dao.update(obj.createPk(), obj);
		}
		catch (NewsDaoException e)
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