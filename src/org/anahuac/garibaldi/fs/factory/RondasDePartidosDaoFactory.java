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

public class RondasDePartidosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RondasDePartidosDao
	 */
	public static RondasDePartidosDao create()
	{
		return new RondasDePartidosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RondasDePartidosDao
	 */
	public static RondasDePartidosDao create(Connection conn)
	{
		return new RondasDePartidosDaoImpl( conn );
	}

}
