package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwCheerDao;
import com.solucionesenjambre.interapp.fs.dto.VwCheer;
import com.solucionesenjambre.interapp.fs.exceptions.VwCheerDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwCheerDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwCheerTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwCheerTier.class);
	
	private VwCheerDao dao = null;
	
	public VwCheerTier()
	{
		dao 	= VwCheerDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwCheerTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwCheerDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las noticias
	public List<VwCheer> all()
	{
		List<VwCheer> results = new ArrayList<VwCheer>();
		VwCheer[] array = null;
		
		try
		{			
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (VwCheerDaoException e)
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
	public List<VwCheer> getByEID(int eid)
	{
		List<VwCheer> results = new ArrayList<VwCheer>();
		VwCheer[] array = null;
		
		try
		{		
			array = dao.findWhereEventIdEquals(eid);
			
			results = Arrays.asList(array);
		}
		catch (VwCheerDaoException e)
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
	public List<VwCheer> positions(String[] params)
	{
		List<VwCheer> results = new ArrayList<VwCheer>();
		VwCheer[] array = null;
		
		try
		{		
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{		
				String sql = null;
				
				sql  = "	event_id = ?";
				sql += "			ORDER BY points DESC";	 
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			results = Arrays.asList(array);
		}
		catch (VwCheerDaoException e)
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