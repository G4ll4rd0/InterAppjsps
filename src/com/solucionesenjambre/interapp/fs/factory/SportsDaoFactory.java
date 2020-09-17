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

public class SportsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return SportsDao
	 */
	public static SportsDao create()
	{
		return new SportsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return SportsDao
	 */
	public static SportsDao create(Connection conn)
	{
		return new SportsDaoImpl( conn );
	}

}
