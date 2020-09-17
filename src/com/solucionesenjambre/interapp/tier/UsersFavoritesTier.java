package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.UsersFavoritesDao;
import com.solucionesenjambre.interapp.fs.dto.UsersFavorites;
import com.solucionesenjambre.interapp.fs.exceptions.UsersFavoritesDaoException;
import com.solucionesenjambre.interapp.fs.factory.UsersFavoritesDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class UsersFavoritesTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(UsersFavoritesTier.class);
	
	private UsersFavoritesDao dao = null;
	
	public UsersFavoritesTier()
	{
		dao 	= UsersFavoritesDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public UsersFavoritesTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= UsersFavoritesDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	//Add Favourite
	public boolean add(String name, int favId, int isSport, int isSchool, int isTeam, int userId)
	{
		
		UsersFavorites obj = new UsersFavorites(); 
				
		try
		{
			obj.setUserId(userId);
			if(isSport == 1)
			{
				obj.setSportId(favId);
			}
			else if (isSchool == 1)
			{
				obj.setSchoolId(favId);
			}
			else if (isTeam == 1)
			{
				obj.setTeamId(favId);
			}
			else
			{
				return false;
			}
			
			dao.insert(obj);
			
		}
		catch (UsersFavoritesDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return false;
		}
		
		return true;
	}
	
	//Delete Favourite
	public boolean delete(int pk)
	{
		
		UsersFavorites obj = new UsersFavorites();
		
		obj.setUserFavoriteId(pk);
		
		try
		{
			dao.delete(obj.createPk());
		}
		catch (UsersFavoritesDaoException e)
		{
			logger.error(e.getMessage());
			
			error.setCode(Errors.Codes.DB_DAO.getCode());
			error.setWindowTitle(Errors.Codes.DB_DAO.getWindowTitle());
			error.setMessage(Errors.Codes.DB_DAO.getMessage());
			
			error.setExceptionMessage(e.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return false;
		}
		
		return true;
	}

	//Busqueda por usuarios
	public List<UsersFavorites> findByUser(int userId)
	{		
		List<UsersFavorites> results = null;
		UsersFavorites[] array = null;
		
		try
		{			
			array = dao.findWhereUserIdEquals(userId);
			results = Arrays.asList(array);
		}
		catch (UsersFavoritesDaoException e)
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