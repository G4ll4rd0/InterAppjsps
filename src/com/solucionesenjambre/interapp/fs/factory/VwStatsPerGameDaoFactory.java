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

public class VwStatsPerGameDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwStatsPerGameDao
	 */
	public static VwStatsPerGameDao create()
	{
		return new VwStatsPerGameDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwStatsPerGameDao
	 */
	public static VwStatsPerGameDao create(Connection conn)
	{
		return new VwStatsPerGameDaoImpl( conn );
	}

}
