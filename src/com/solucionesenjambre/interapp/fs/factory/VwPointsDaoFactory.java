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

public class VwPointsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwPointsDao
	 */
	public static VwPointsDao create()
	{
		return new VwPointsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwPointsDao
	 */
	public static VwPointsDao create(Connection conn)
	{
		return new VwPointsDaoImpl( conn );
	}

}
