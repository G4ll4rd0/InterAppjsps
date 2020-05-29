package org.anahuac.garibaldi.tier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import org.anahuac.garibaldi.fs.dao.VwPuntosDao;
import org.anahuac.garibaldi.fs.dto.VwPuntos;
import org.anahuac.garibaldi.fs.exceptions.VwPuntosDaoException;
import org.anahuac.garibaldi.fs.factory.VwPuntosDaoFactory;

import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.log.log4j.AksLogger;

public class VwPuntosTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(JugadoresTier.class);
	
	private VwPuntosDao dao = null;
	
	public VwPuntosTier()
	{
		dao 	= VwPuntosDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public VwPuntosTier(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwPuntosDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	public List<VwPuntos> get(int keyword, int keyId)
	{
		List<VwPuntos> results = new ArrayList<VwPuntos>();
		VwPuntos[] array = null;
		
		try
		{
			VwPuntos[] sqlparams = null;
			String sql;
			
			sql  = "	deporte_id = " + keyword;
			sql	+= "	AND seccion_id = " + keyId;
			sql += "		ORDER BY puntos_prioridad DESC, puntos DESC, diff DESC, GF DESC";
			
			array = dao.findByDynamicWhere(sql, sqlparams);
			
			results = Arrays.asList(array);
		}
		catch (VwPuntosDaoException e)
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