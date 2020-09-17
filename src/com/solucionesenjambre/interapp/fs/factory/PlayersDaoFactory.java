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

public class PlayersDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PlayersDao
	 */
	public static PlayersDao create()
	{
		return new PlayersDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PlayersDao
	 */
	public static PlayersDao create(Connection conn)
	{
		return new PlayersDaoImpl( conn );
	}

}
