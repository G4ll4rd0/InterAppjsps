package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.SportsDao;
import com.solucionesenjambre.interapp.fs.dto.Sports;
import com.solucionesenjambre.interapp.fs.exceptions.SportsDaoException;
import com.solucionesenjambre.interapp.fs.factory.SportsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class SportsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(SportsTier.class);
	
	private SportsDao dao = null;
	
	public SportsTier()
	{
		dao 	= SportsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public SportsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= SportsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene el deporte por id
	public Sports get(int sportId)
	{
		Sports results = null;
		Sports obj = new Sports();
		
		try
		{
			obj.setSportId(sportId);
			results = dao.findByPrimaryKey(obj.createPk());
		}
		catch (SportsDaoException e)
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
	
	//Obtiene todos los deportes
	public List<Sports> all()
	{
		List<Sports> results = null;
		Sports[] array = null;
		
		try
		{
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (SportsDaoException e)
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