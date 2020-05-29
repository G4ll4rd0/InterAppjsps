package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.anahuac.garibaldi.fs.dao.SeccionDao;
import org.anahuac.garibaldi.fs.dto.Seccion;
import org.anahuac.garibaldi.fs.exceptions.SeccionDaoException;
import org.anahuac.garibaldi.fs.factory.SeccionDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class SeccionesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private SeccionDao dao = null;
	
	public SeccionesTier()
	{
		dao 	= SeccionDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public SeccionesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= SeccionDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<Seccion> get()
	{
		List<Seccion> results = new ArrayList<Seccion>();
		Seccion[] array = null;
		
		try
		{
			Seccion[] sqlparams = null;
			String sql;
			
			sql  = "	1=1";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (SeccionDaoException e)
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