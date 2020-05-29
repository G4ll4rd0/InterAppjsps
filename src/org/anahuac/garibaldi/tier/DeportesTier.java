package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.DeporteDao;
import org.anahuac.garibaldi.fs.dto.Deporte;
import org.anahuac.garibaldi.fs.exceptions.DeporteDaoException;
import org.anahuac.garibaldi.fs.factory.DeporteDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class DeportesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(Deporte.class);
	
	private DeporteDao dao = null;
	
	public DeportesTier()
	{		
		dao 	= DeporteDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public DeportesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= DeporteDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<Deporte> browse(String[] params)
	{
		List<Deporte> results = new ArrayList<Deporte>();
		Deporte[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{
				ArrayList<Object> sqlParams = new ArrayList<Object>();
				
				//like filter
				params[0] = GeneralUtils.addLikeFormat(params[0]);
				
				String sql = null;
				
				sql  = "	Descripcion LIKE ? ";
				
				sqlParams.add(params[0]);
				
				array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (DeporteDaoException e)
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
	
	public ProcessDataResult browsePDR(String[] params)
	{
		List<Deporte> results = browse(params);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	public List<Deporte> browseUnique(String params)
	{
		List<Deporte> results = new ArrayList<Deporte>();
		Deporte[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{

				Object[] sqlParams = null;
				
				String sql = null;
				
				sql  = "	Descripcion LIKE '" + params + "%'";
				
				array = dao.findByDynamicWhere(sql, sqlParams);
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (DeporteDaoException e)
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
	
	public ProcessDataResult browseUniquePDR(String params)
	{
		List<Deporte> results = browseUnique(params);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	public List<Deporte> get(String keyId)
	{
		List<Deporte> results = new ArrayList<Deporte>();
		Deporte[] array = null;
		
		try
		{
			Object[] sqlParams = {keyId};
			
			String sql = null;
			
			sql  = "	item_id = ? ORDER BY locality_description, warehouse_code, warehouse_description";
			
			array = dao.findByDynamicWhere(sql, sqlParams);
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (DeporteDaoException e)
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
	
	public ProcessDataResult getPDR(String keyId)
	{
		List<Deporte> results = get(keyId);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}