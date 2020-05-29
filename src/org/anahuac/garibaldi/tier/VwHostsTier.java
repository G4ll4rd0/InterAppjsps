package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.VwHostsDao;
import org.anahuac.garibaldi.fs.dto.VwHosts;
import org.anahuac.garibaldi.fs.exceptions.VwHostsDaoException;
import org.anahuac.garibaldi.fs.factory.VwHostsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwHostsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private VwHostsDao dao = null;
	
	public VwHostsTier()
	{
		dao 	= VwHostsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwHostsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwHostsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwHosts> get(String seed)
	{
		VwHosts[] array = null;
		List<VwHosts> results = new ArrayList<VwHosts>();
		
		try
		{
			VwHosts[] sqlparams = null;
			String sql;
			
			sql  = "	padre_seed = '" + seed + "'";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			results = Arrays.asList(array);
		}
		catch (VwHostsDaoException e)
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