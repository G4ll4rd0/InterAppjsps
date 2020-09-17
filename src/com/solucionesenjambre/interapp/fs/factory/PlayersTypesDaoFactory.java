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

public class PlayersTypesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PlayersTypesDao
	 */
	public static PlayersTypesDao create()
	{
		return new PlayersTypesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PlayersTypesDao
	 */
	public static PlayersTypesDao create(Connection conn)
	{
		return new PlayersTypesDaoImpl( conn );
	}

}
