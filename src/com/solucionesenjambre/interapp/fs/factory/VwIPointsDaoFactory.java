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

public class VwIPointsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwIPointsDao
	 */
	public static VwIPointsDao create()
	{
		return new VwIPointsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwIPointsDao
	 */
	public static VwIPointsDao create(Connection conn)
	{
		return new VwIPointsDaoImpl( conn );
	}

}
