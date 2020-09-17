package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwBPlayersDao;
import com.solucionesenjambre.interapp.fs.dto.VwBPlayers;
import com.solucionesenjambre.interapp.fs.exceptions.VwBPlayersDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwBPlayersDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class VwBPlayersTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwBPlayers.class);
	
	private VwBPlayersDao dao = null;
	
	public VwBPlayersTier()
	{		
		dao 	= VwBPlayersDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwBPlayersTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwBPlayersDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwBPlayers> browse(String[] params)
	{
		List<VwBPlayers> results = new ArrayList<VwBPlayers>();
		VwBPlayers[] array = null;
		
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
		catch (VwBPlayersDaoException e)
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
		List<VwBPlayers> results = browse(params);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	public VwBPlayers get(int keyId)
	{
		VwBPlayers[] array = null;
		
		try
		{
			array = dao.findWherePlayerIdEquals(keyId);
		}
		catch (VwBPlayersDaoException e)
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
		VwBPlayers results = get(keyId);
		
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