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

public class VwDatesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwDatesDao
	 */
	public static VwDatesDao create()
	{
		return new VwDatesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwDatesDao
	 */
	public static VwDatesDao create(Connection conn)
	{
		return new VwDatesDaoImpl( conn );
	}

}
