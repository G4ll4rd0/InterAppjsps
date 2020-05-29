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

public class VwHostsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwHostsDao
	 */
	public static VwHostsDao create()
	{
		return new VwHostsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwHostsDao
	 */
	public static VwHostsDao create(Connection conn)
	{
		return new VwHostsDaoImpl( conn );
	}

}
