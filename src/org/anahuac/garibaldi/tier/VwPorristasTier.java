package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.VwPorristasDao;
import org.anahuac.garibaldi.fs.dto.VwPorristas;
import org.anahuac.garibaldi.fs.exceptions.VwPorristasDaoException;
import org.anahuac.garibaldi.fs.factory.VwPorristasDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwPorristasTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private VwPorristasDao dao = null;
	
	public VwPorristasTier()
	{
		dao 	= VwPorristasDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwPorristasTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwPorristasDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwPorristas> get(int eventoId)
	{
		List<VwPorristas> results = new ArrayList<VwPorristas>();
		VwPorristas[] array = null;
		
		try
		{
			VwPorristas[] sqlparams = null;
			String sql;
			
			sql  = "	evento_id = " + eventoId;
			sql += "		ORDER BY puntos DESC";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (VwPorristasDaoException e)
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