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

public class VwBJugadoresDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwBJugadoresDao
	 */
	public static VwBJugadoresDao create()
	{
		return new VwBJugadoresDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwBJugadoresDao
	 */
	public static VwBJugadoresDao create(Connection conn)
	{
		return new VwBJugadoresDaoImpl( conn );
	}

}
