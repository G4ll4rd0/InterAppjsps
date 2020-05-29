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

public class VwPartidosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwPartidosDao
	 */
	public static VwPartidosDao create()
	{
		return new VwPartidosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwPartidosDao
	 */
	public static VwPartidosDao create(Connection conn)
	{
		return new VwPartidosDaoImpl( conn );
	}

}
