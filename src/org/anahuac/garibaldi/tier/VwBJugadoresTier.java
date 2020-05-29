package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.VwBJugadoresDao;
import org.anahuac.garibaldi.fs.dto.VwBJugadores;
import org.anahuac.garibaldi.fs.exceptions.VwBJugadoresDaoException;
import org.anahuac.garibaldi.fs.factory.VwBJugadoresDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class VwBJugadoresTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwBJugadores.class);
	
	private VwBJugadoresDao dao = null;
	
	public VwBJugadoresTier()
	{		
		dao 	= VwBJugadoresDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwBJugadoresTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwBJugadoresDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwBJugadores> browse(String[] params)
	{
		List<VwBJugadores> results = new ArrayList<VwBJugadores>();
		VwBJugadores[] array = null;
		
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
				
				sql  = "	Nombre LIKE ? ";
				sql += "		OR Primer_Apellido LIKE ? ";
				sql += "		OR Segundo_Apellido LIKE ? ";
				
				GeneralUtils.addSqlParams(sqlParams, params[0], 3);
				
				array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwBJugadoresDaoException e)
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
		List<VwBJugadores> results = browse(params);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	public VwBJugadores get(int keyId)
	{
		VwBJugadores[] array = null;
		
		try
		{
			array = dao.findWhereJugadoresIdEquals(keyId);
		}
		catch (VwBJugadoresDaoException e)
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
		
		return array.length == 0 ? null : array[0];
	}
	
	public ProcessDataResult getPDR(int keyId)
	{
		VwBJugadores results = get(keyId);
		
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