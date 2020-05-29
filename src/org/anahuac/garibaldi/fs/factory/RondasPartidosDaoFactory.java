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

public class RondasPartidosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RondasPartidosDao
	 */
	public static RondasPartidosDao create()
	{
		return new RondasPartidosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RondasPartidosDao
	 */
	public static RondasPartidosDao create(Connection conn)
	{
		return new RondasPartidosDaoImpl( conn );
	}

}
