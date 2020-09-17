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

public class UsersTypesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UsersTypesDao
	 */
	public static UsersTypesDao create()
	{
		return new UsersTypesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UsersTypesDao
	 */
	public static UsersTypesDao create(Connection conn)
	{
		return new UsersTypesDaoImpl( conn );
	}

}
