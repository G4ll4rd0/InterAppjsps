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

public class PartidoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PartidoDao
	 */
	public static PartidoDao create()
	{
		return new PartidoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PartidoDao
	 */
	public static PartidoDao create(Connection conn)
	{
		return new PartidoDaoImpl( conn );
	}

}
