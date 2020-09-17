package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.RoundsDao;
import com.solucionesenjambre.interapp.fs.dto.Rounds;
import com.solucionesenjambre.interapp.fs.exceptions.RoundsDaoException;
import com.solucionesenjambre.interapp.fs.factory.RoundsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class RoundsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(RoundsTier.class);
	
	private RoundsDao dao = null;
	
	public RoundsTier()
	{
		dao 	= RoundsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public RoundsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= RoundsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos las rondas de juego
	public List<Rounds> all()
	{
		List<Rounds> results = new ArrayList<Rounds>();
		Rounds[] array = null;
		
		try
		{
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (RoundsDaoException e)
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