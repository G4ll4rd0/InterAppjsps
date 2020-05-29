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

public class JugadoresDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return JugadoresDao
	 */
	public static JugadoresDao create()
	{
		return new JugadoresDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return JugadoresDao
	 */
	public static JugadoresDao create(Connection conn)
	{
		return new JugadoresDaoImpl( conn );
	}

}
