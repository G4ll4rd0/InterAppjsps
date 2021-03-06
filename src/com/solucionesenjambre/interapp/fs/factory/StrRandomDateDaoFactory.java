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

public class StrRandomDateDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return StrRandomDateDao
	 */
	public static StrRandomDateDao create()
	{
		return new StrRandomDateDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return StrRandomDateDao
	 */
	public static StrRandomDateDao create(Connection conn)
	{
		return new StrRandomDateDaoImpl( conn );
	}

}
