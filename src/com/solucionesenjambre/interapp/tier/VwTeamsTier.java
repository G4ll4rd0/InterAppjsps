package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.VwTeamsDao;
import com.solucionesenjambre.interapp.fs.dto.VwTeams;
import com.solucionesenjambre.interapp.fs.exceptions.VwTeamsDaoException;
import com.solucionesenjambre.interapp.fs.factory.VwTeamsDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

public class VwTeamsTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(VwTeamsTier.class);
	
	private VwTeamsDao dao = null;
	
	public VwTeamsTier()
	{
		dao 	= VwTeamsDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwTeamsTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwTeamsDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//obtiene un equipo por id
	public VwTeams get(int teamId)
	{
		VwTeams [] results = null;
		
		try
		{
			results = dao.findWhereTeamIdEquals(teamId);			
		}
		catch (VwTeamsDaoException e)
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
	
	//Obtiene todos los equipos activos en el evento
	public List<VwTeams> getByEvent(int eventId)
	{
		List<VwTeams> results = new ArrayList<VwTeams>();
		VwTeams[] array = null;
		
		try
		{
			array = dao.findWhereEventIdEquals(eventId);
			
			results = Arrays.asList(array);
		}
		catch (VwTeamsDaoException e)
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
	
	//Obtiene todos los de una categoria
	public List<VwTeams> browse(String[] params)
	{
		List<VwTeams> results	= new ArrayList<VwTeams>();
		VwTeams[] array			= null;
		
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
				
				String sql = "";
				
				sql  = "	team_name LIKE ?  ";
				sql  += "		event_id = ? ";
								
				array = dao.findByDynamicWhere(sql, params);
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (VwTeamsDaoException e)
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