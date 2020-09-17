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

public class UsersFavoritesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UsersFavoritesDao
	 */
	public static UsersFavoritesDao create()
	{
		return new UsersFavoritesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UsersFavoritesDao
	 */
	public static UsersFavoritesDao create(Connection conn)
	{
		return new UsersFavoritesDaoImpl( conn );
	}

}
