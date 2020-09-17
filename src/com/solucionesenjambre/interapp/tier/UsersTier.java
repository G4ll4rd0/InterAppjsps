package com.solucionesenjambre.interapp.tier;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

import com.solucionesenjambre.interapp.fs.dao.UsersDao;
import com.solucionesenjambre.interapp.fs.dto.Users;
import com.solucionesenjambre.interapp.fs.exceptions.UsersDaoException;
import com.solucionesenjambre.interapp.fs.factory.UsersDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class UsersTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(UsersTier.class);
	
	private UsersDao dao = null;
	
	public UsersTier()
	{
		dao 	= UsersDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public UsersTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= UsersDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	
	//Obtener usuarios por usuario y contraseña
	public List<Users> findUser(String us, String pw)
	{
		List<Users> results = null;
		Users[] array = null;
		
		try
		{
			Object[] sqlParams = null;
			String sql = null;
			
			sql = "		username = '" + us + "'";
			sql += "	AND pssword = '" + pw + "'";	
			
			array = dao.findByDynamicWhere(sql, sqlParams);

			results = Arrays.asList(array);
		}
		catch (UsersDaoException e)
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
	
	
	//Borrar Usuarios
	public boolean delete(int pk)
	{
		Users obj = new Users();
		
		obj.setUserId(pk);
		
		try
		{
			dao.delete(obj.createPk());
		}
		catch (UsersDaoException e)
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
	
	
	//Busqueda de usuarios por seed
	public List<Users> findBySeed(String sd)
	{		
		List<Users> results = null;
		Users[] array = null;
		
		try
		{			
			array = dao.findWhereSeedEquals(sd);

			results = Arrays.asList(array);
		}
		catch (UsersDaoException e)
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
	
	
	//Insercion de Usuarios
	public boolean set(String us, String pw, String email, int eid)
	{		
		Users obj = new Users();
		
		obj.setEmail(email);
		obj.setEventId(eid);
		obj.setPssword(pw);
		obj.setUsername(us);
		obj.setUserTypeId(4);
		
		//!En el DaoImpl Modificamos el seed para ponerlo a placer
		
		try
		{
			dao.insert(obj);
		}
		catch (UsersDaoException e)
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
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}