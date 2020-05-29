/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.factory;

import java.sql.Connection;
import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.jdbc.*;

public class EstadisticasJugadorDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EstadisticasJugadorDao
	 */
	public static EstadisticasJugadorDao create()
	{
		return new EstadisticasJugadorDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EstadisticasJugadorDao
	 */
	public static EstadisticasJugadorDao create(Connection conn)
	{
		return new EstadisticasJugadorDaoImpl( conn );
	}

}
