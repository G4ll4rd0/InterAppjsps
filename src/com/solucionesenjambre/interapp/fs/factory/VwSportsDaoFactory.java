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

public class VwSportsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwSportsDao
	 */
	public static VwSportsDao create()
	{
		return new VwSportsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwSportsDao
	 */
	public static VwSportsDao create(Connection conn)
	{
		return new VwSportsDaoImpl( conn );
	}

}
