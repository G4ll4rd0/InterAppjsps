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

public class VwStatsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwStatsDao
	 */
	public static VwStatsDao create()
	{
		return new VwStatsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwStatsDao
	 */
	public static VwStatsDao create(Connection conn)
	{
		return new VwStatsDaoImpl( conn );
	}

}
