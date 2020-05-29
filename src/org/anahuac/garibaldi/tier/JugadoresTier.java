package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.util.GeneralUtils;

import org.anahuac.garibaldi.fs.dao.JugadoresDao;
import org.anahuac.garibaldi.fs.dto.Jugadores;
import org.anahuac.garibaldi.fs.exceptions.JugadoresDaoException;
import org.anahuac.garibaldi.fs.factory.JugadoresDaoFactory;

public class JugadoresTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private JugadoresDao dao = null;
	
	public JugadoresTier()
	{		
		dao 	= JugadoresDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public JugadoresTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= JugadoresDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<Jugadores> browse(String[] params)
	{
		List<Jugadores> results	= new ArrayList<Jugadores>();
		Jugadores[] array			= null;
		
		try
		{
			if (params == null)
			{
				array = dao.findAll();
			}
			else 
			{
				ArrayList<Object> sqlParams = new ArrayList<Object>();
				
				//like filter
				params[0] = GeneralUtils.addLikeFormat(params[0]);
				
				String sql = "";
				
				sql  = "	Nombre LIKE ?  ";
				//sql += "		OR name LIKE ?) ";
				
				GeneralUtils.addSqlParams(sqlParams, params[0], 1);
				
				array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			}
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (JugadoresDaoException e)
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
	
	public List<Jugadores> team(int params)
	{
		List<Jugadores> results	= new ArrayList<Jugadores>();
		Jugadores[] array			= null;
		
		try
		{						
			array = dao.findByEquipo(params);
			
			// convert array to list
			results = Arrays.asList(array);
		}
		catch (JugadoresDaoException e)
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
	
	public ProcessDataResult browsePDR(String[] params)
	{
		List<Jugadores> results = browse(params);
		pdr.setResult(results);
		return pdr;
	}
	
	public Jugadores get(int keyId)
	{
		Jugadores results = null;
		
		try
		{
			results = dao.findByPrimaryKey(keyId);
		}
		catch (JugadoresDaoException e)
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
	
	public ProcessDataResult getPDR(int keyId)
	{
		Jugadores results = get(keyId);
		
		pdr.setResult(results);
		
		return pdr;
	}
	
	public Jugadores save(Jugadores obj)
	{
		try
		{
			if (obj.getJugadoresId() == 0)
			{
				dao.insert(obj);
			}
			else
			{
				dao.update(obj.createPk(), obj);
			}
		}
		catch (JugadoresDaoException e)
		{
			logger.error(e.getMessage());
			
			if (Errors.isExceptionDuplicatedEntry(e.getMessage()))
			{
				error.setCode(Errors.Codes.DB_DUPLICATE_ENTRY.getCode());
				error.setWindowTitle(Errors.Codes.DB_DUPLICATE_ENTRY.getWindowTitle());
				error.setMessage(Errors.Codes.DB_DUPLICATE_ENTRY.getMessage());
				error.setExceptionMessage(e.getMessage());

				error.extendsDuplicatedEntryMessage();
			}
			else
			{
				error.setCode(Errors.Codes.NOT_DEFINED .getCode());
				error.setWindowTitle(Errors.Codes.NOT_DEFINED.getWindowTitle());
				error.setMessage(Errors.Codes.DB_NO_ADD.getMessage());
			}
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return null;
		}
		
		return obj;
	}
	
	public ProcessDataResult savePDR(Jugadores obj)
	{
		Object[] results = {null, null};
		
		Jugadores objSaved = save(obj);
		
		if (objSaved != null)
		{
			results[0] = objSaved;
			
			//si el browse es de un vw, aqui debe buscarse dicho renglon, si no, es el mismo obj
//			results[1] = objSaved; //mismo Objeto ya que no es de un VW
			
			VwBJugadoresTier tier;
			
			if (userConn != null)
				tier = new VwBJugadoresTier(userConn);
			else
				tier = new VwBJugadoresTier();
			
			results[1] = tier.get(objSaved.getJugadoresId());
			
			pdr.setResult(results);
		}
		else
		{
			pdr.setResult(null);
		}
		
		return pdr;
	}
	
	public boolean delete(int keyId)
	{
		Jugadores obj = new Jugadores();
		
		obj.setJugadoresId(keyId);
		
		try
		{
			dao.delete(obj.createPk());
		}
		catch (JugadoresDaoException e)
		{
			logger.error(e.getMessage());

			error.setExceptionMessage(e.getMessage());
			
			if (Errors.isExceptionReferentialIntegrity(e.getMessage()))
			{
				error.setCode(Errors.Codes.DB_REFERENTIAL_INTEGRITY.getCode());
				error.setWindowTitle(Errors.Codes.DB_REFERENTIAL_INTEGRITY.getWindowTitle());
				error.setMessage(Errors.Codes.DB_REFERENTIAL_INTEGRITY.getMessage());
			}
			else
			{
				error.setCode(Errors.Codes.NOT_DEFINED .getCode());
				error.setWindowTitle(Errors.Codes.NOT_DEFINED.getWindowTitle());
				error.setMessage(Errors.Codes.DB_NO_DELETE.getMessage());
			}
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return false;
		}
		
		return true;
	}
	
	public ProcessDataResult deletePDR(int keyId)
	{
		boolean results = delete(keyId);
		
		pdr.setResult(results ? results : null);
		
		return pdr;
	}
	
	/**
	 * @return the error
	 */
	public Errors getError()
	{
		return error;
	}
}