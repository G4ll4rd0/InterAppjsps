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

public class RoundsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RoundsDao
	 */
	public static RoundsDao create()
	{
		return new RoundsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RoundsDao
	 */
	public static RoundsDao create(Connection conn)
	{
		return new RoundsDaoImpl( conn );
	}

}
