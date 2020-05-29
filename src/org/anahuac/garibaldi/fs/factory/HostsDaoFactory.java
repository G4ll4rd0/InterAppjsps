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

public class HostsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return HostsDao
	 */
	public static HostsDao create()
	{
		return new HostsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return HostsDao
	 */
	public static HostsDao create(Connection conn)
	{
		return new HostsDaoImpl( conn );
	}

}
