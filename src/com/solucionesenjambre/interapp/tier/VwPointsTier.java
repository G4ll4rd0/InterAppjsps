package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwPointsDao;
import com.solucionesenjambre.interapp.fs.dto.VwPoints;
import com.solucionesenjambre.interapp.fs.exceptions.VwPointsDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwPointsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwPointsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwPointsTier.class);
	
	private VwPointsDao dao = null;
	
	public VwPointsTier()
	{
		dao 	= VwPointsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwPointsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwPointsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los deportes activos en el evento
	public List<VwPoints> getByEvent(int eventId)
	{
		List<VwPoints> results = new ArrayList<VwPoints>();
		VwPoints[] array = null;
		
		try
		{
			array = dao.findWhereEventIdEquals(eventId);
			
			results = Arrays.asList(array);
		}
		catch (VwPointsDaoException e)
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
	
	//Busca la tabla de posiciones del deporte/evento
	public List<VwPoints> positions(String[] params)
	{
		List<VwPoints> results = new ArrayList<VwPoints>();
		VwPoints[] array = null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{		
				String sql = null;
				
				sql  = "	sport_id = ? ";
				sql += "		AND event_id = ?";
				sql += "			ORDER BY priority_points DESC, points DESC, dff DESC, gf DESC";	 
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwPointsDaoException e)
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