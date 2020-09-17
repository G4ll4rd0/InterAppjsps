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

public class StrRandomLipsumDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return StrRandomLipsumDao
	 */
	public static StrRandomLipsumDao create()
	{
		return new StrRandomLipsumDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return StrRandomLipsumDao
	 */
	public static StrRandomLipsumDao create(Connection conn)
	{
		return new StrRandomLipsumDaoImpl( conn );
	}

}
