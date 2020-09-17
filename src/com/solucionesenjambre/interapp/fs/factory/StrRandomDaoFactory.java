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

public class StrRandomDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return StrRandomDao
	 */
	public static StrRandomDao create()
	{
		return new StrRandomDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return StrRandomDao
	 */
	public static StrRandomDao create(Connection conn)
	{
		return new StrRandomDaoImpl( conn );
	}

}
