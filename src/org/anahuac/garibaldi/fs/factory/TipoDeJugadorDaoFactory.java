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

public class TipoDeJugadorDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TipoDeJugadorDao
	 */
	public static TipoDeJugadorDao create()
	{
		return new TipoDeJugadorDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TipoDeJugadorDao
	 */
	public static TipoDeJugadorDao create(Connection conn)
	{
		return new TipoDeJugadorDaoImpl( conn );
	}

}
