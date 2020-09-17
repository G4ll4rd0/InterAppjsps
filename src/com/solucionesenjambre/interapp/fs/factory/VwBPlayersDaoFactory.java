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

public class VwBPlayersDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwBPlayersDao
	 */
	public static VwBPlayersDao create()
	{
		return new VwBPlayersDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwBPlayersDao
	 */
	public static VwBPlayersDao create(Connection conn)
	{
		return new VwBPlayersDaoImpl( conn );
	}

}
