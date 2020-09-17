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

public class VwGamesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwGamesDao
	 */
	public static VwGamesDao create()
	{
		return new VwGamesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwGamesDao
	 */
	public static VwGamesDao create(Connection conn)
	{
		return new VwGamesDaoImpl( conn );
	}

}
