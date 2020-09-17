package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.BranchesDao;
import com.solucionesenjambre.interapp.fs.dto.Branches;
import com.solucionesenjambre.interapp.fs.exceptions.BranchesDaoException;
import com.solucionesenjambre.interapp.fs.factory.BranchesDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class BranchesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(BranchesTier.class);
	
	private BranchesDao dao = null;
	
	public BranchesTier()
	{
		dao 	= BranchesDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public BranchesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= BranchesDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todas las ramas
	public List<Branches> all()
	{
		List<Branches> results = new ArrayList<Branches>();
		Branches[] array = null;
		
		try
		{
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (BranchesDaoException e)
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