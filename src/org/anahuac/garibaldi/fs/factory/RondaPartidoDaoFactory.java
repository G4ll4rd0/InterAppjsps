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

public class RondaPartidoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RondaPartidoDao
	 */
	public static RondaPartidoDao create()
	{
		return new RondaPartidoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RondaPartidoDao
	 */
	public static RondaPartidoDao create(Connection conn)
	{
		return new RondaPartidoDaoImpl( conn );
	}

}
