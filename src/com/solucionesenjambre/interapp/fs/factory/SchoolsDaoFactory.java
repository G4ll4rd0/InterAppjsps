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

public class SchoolsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return SchoolsDao
	 */
	public static SchoolsDao create()
	{
		return new SchoolsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return SchoolsDao
	 */
	public static SchoolsDao create(Connection conn)
	{
		return new SchoolsDaoImpl( conn );
	}

}
