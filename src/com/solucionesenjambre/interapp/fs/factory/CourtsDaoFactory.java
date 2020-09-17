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

public class CourtsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CourtsDao
	 */
	public static CourtsDao create()
	{
		return new CourtsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CourtsDao
	 */
	public static CourtsDao create(Connection conn)
	{
		return new CourtsDaoImpl( conn );
	}

}
