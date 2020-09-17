package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.SchoolsDao;
import com.solucionesenjambre.interapp.fs.dto.Schools;
import com.solucionesenjambre.interapp.fs.exceptions.SchoolsDaoException;
import com.solucionesenjambre.interapp.fs.factory.SchoolsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class SchoolsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(SchoolsTier.class);
	
	private SchoolsDao dao = null;
	
	public SchoolsTier()
	{
		dao 	= SchoolsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public SchoolsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= SchoolsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene la escuela por id
	public Schools get(int schoolId)
	{
		Schools results = null;
		Schools obj = new Schools();
		
		try
		{
			obj.setSchoolId(schoolId);
			results = dao.findByPrimaryKey(obj.createPk());
		}
		catch (SchoolsDaoException e)
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