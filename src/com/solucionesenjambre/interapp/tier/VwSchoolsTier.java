package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwSchoolsDao;
import com.solucionesenjambre.interapp.fs.dto.VwSchools;
import com.solucionesenjambre.interapp.fs.exceptions.VwSchoolsDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwSchoolsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwSchoolsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwSchoolsTier.class);
	
	private VwSchoolsDao dao = null;
	
	public VwSchoolsTier()
	{
		dao 	= VwSchoolsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwSchoolsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwSchoolsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las escuelas presentes en el evento
	public List<VwSchools> getByEvent(int eventId)
	{
		List<VwSchools> results = new ArrayList<VwSchools>();
		VwSchools[] array = null;
		
		try
		{
			array = dao.findWhereEventIdEquals(eventId);
			
			results = Arrays.asList(array);
		}
		catch (VwSchoolsDaoException e)
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
	
	//Obtiene la escuela
	public VwSchools get(int schoolId)
	{
		VwSchools[] results = null;
		
		try
		{
			results = dao.findWhereSchoolIdEquals(schoolId);
			
		}
		catch (VwSchoolsDaoException e)
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
		
		return results.length == 0 ? null : results[0];
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}