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

public class NewsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return NewsDao
	 */
	public static NewsDao create()
	{
		return new NewsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return NewsDao
	 */
	public static NewsDao create(Connection conn)
	{
		return new NewsDaoImpl( conn );
	}

}
