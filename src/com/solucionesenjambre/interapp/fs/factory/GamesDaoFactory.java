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

public class GamesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return GamesDao
	 */
	public static GamesDao create()
	{
		return new GamesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return GamesDao
	 */
	public static GamesDao create(Connection conn)
	{
		return new GamesDaoImpl( conn );
	}

}
