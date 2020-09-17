package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwDatesDao;
import com.solucionesenjambre.interapp.fs.dto.VwDates;
import com.solucionesenjambre.interapp.fs.exceptions.VwDatesDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwDatesDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwDatesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwDatesTier.class);
	
	private VwDatesDao dao = null;
	
	public VwDatesTier()
	{
		dao 	= VwDatesDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwDatesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwDatesDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los deportes activos en el evento
	public List<VwDates> getByEvent(int eventId)
	{
		List<VwDates> results = new ArrayList<VwDates>();
		VwDates[] array = null;
		
		try
		{
			array = dao.findWhereEventIdEquals(eventId);
			
			results = Arrays.asList(array);
		}
		catch (VwDatesDaoException e)
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