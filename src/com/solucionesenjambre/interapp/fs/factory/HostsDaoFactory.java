/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.factory;

import java.sql.Connection;
import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.jdbc.*;

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
