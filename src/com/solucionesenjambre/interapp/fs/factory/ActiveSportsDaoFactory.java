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

public class ActiveSportsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ActiveSportsDao
	 */
	public static ActiveSportsDao create()
	{
		return new ActiveSportsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ActiveSportsDao
	 */
	public static ActiveSportsDao create(Connection conn)
	{
		return new ActiveSportsDaoImpl( conn );
	}

}
