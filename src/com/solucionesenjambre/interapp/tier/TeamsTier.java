package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.TeamsDao;
import com.solucionesenjambre.interapp.fs.dto.Teams;
import com.solucionesenjambre.interapp.fs.exceptions.TeamsDaoException;
import com.solucionesenjambre.interapp.fs.factory.TeamsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class TeamsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(TeamsTier.class);
	
	private TeamsDao dao = null;
	
	public TeamsTier()
	{
		dao 	= TeamsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public TeamsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= TeamsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Obtiene todos los equipos
	public List<Teams> all()
	{
		List<Teams> results = new ArrayList<Teams>();
		Teams[] array = null;
		
		try
		{
			array = dao.findAll();
			
			results = Arrays.asList(array);
		}
		catch (TeamsDaoException e)
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
	
	//Obtiene todas los equipos del evento
	public List<Teams> getByEID(int eid)
	{
		List<Teams> results = new ArrayList<Teams>();
		Teams[] array = null;
		
		try
		{		
			array = dao.findByEvents(eid);
			
			results = Arrays.asList(array);
		}
		catch (TeamsDaoException e)
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
	
	//Obtiene el id de un equipo
	public int findId(String[] params)
	{
		
		int result;
		Teams[] array = null;
		Teams obj = new Teams();
				
		try
		{		
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{
				String sql = null;
				
				sql  = "	school_id = ?";
				sql += "		AND sport_id = ?";
				sql += "		AND branch_id = ?";
				sql += "		AND event_id = ?";
				
				array = dao.findByDynamicWhere(sql, params);
			}
			
			// convert array to object
			obj = array.length == 0 ? null : array[0];
			
			// obtain id
			result = obj.getTeamId();
		}
		catch (TeamsDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return 0;
		}
		
		return result;
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}