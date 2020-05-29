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

public class PadreHostJugadorDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PadreHostJugadorDao
	 */
	public static PadreHostJugadorDao create()
	{
		return new PadreHostJugadorDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PadreHostJugadorDao
	 */
	public static PadreHostJugadorDao create(Connection conn)
	{
		return new PadreHostJugadorDaoImpl( conn );
	}

}
