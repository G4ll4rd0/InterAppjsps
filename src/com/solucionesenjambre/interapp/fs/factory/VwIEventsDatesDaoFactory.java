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

public class VwIEventsDatesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwIEventsDatesDao
	 */
	public static VwIEventsDatesDao create()
	{
		return new VwIEventsDatesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwIEventsDatesDao
	 */
	public static VwIEventsDatesDao create(Connection conn)
	{
		return new VwIEventsDatesDaoImpl( conn );
	}

}
