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

public class VwPuntosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwPuntosDao
	 */
	public static VwPuntosDao create()
	{
		return new VwPuntosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwPuntosDao
	 */
	public static VwPuntosDao create(Connection conn)
	{
		return new VwPuntosDaoImpl( conn );
	}

}
