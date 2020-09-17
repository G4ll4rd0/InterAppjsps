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

public class CheerleadersDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CheerleadersDao
	 */
	public static CheerleadersDao create()
	{
		return new CheerleadersDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CheerleadersDao
	 */
	public static CheerleadersDao create(Connection conn)
	{
		return new CheerleadersDaoImpl( conn );
	}

}
