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
