package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwSportsDao;
import com.solucionesenjambre.interapp.fs.dto.VwSports;
import com.solucionesenjambre.interapp.fs.exceptions.VwSportsDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwSportsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class VwSportsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwSportsTier.class);
	
	private VwSportsDao dao = null;
	
	public VwSportsTier()
	{
		dao 	= VwSportsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwSportsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwSportsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los deportes activos en el evento
	public List<VwSports> getByEvent(int eventId)
	{
		List<VwSports> results = new ArrayList<VwSports>();
		VwSports[] array = null;
		
		try
		{
			array = dao.findWhereEventIdEquals(eventId);
			
			results = Arrays.asList(array);
		}
		catch (VwSportsDaoException e)
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
	
	//Busca uno que este activo en el evento y que sea del tipo de deporte
	public List<VwSports> browse(String[] params)
	{
		List<VwSports> results = new ArrayList<VwSports>();
		VwSports[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{			
				//like filter
				params[0] = GeneralUtils.addLikeFormat(params[0]);
				
				String sql = null;
				
				sql  = "	description LIKE ? ";
				sql += "		AND event_id = ?";
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwSportsDaoException e)
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