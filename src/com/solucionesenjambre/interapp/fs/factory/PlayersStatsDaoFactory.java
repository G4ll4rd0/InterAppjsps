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

public class PlayersStatsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PlayersStatsDao
	 */
	public static PlayersStatsDao create()
	{
		return new PlayersStatsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PlayersStatsDao
	 */
	public static PlayersStatsDao create(Connection conn)
	{
		return new PlayersStatsDaoImpl( conn );
	}

}
