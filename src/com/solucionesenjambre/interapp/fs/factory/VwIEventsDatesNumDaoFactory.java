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

public class VwIEventsDatesNumDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwIEventsDatesNumDao
	 */
	public static VwIEventsDatesNumDao create()
	{
		return new VwIEventsDatesNumDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwIEventsDatesNumDao
	 */
	public static VwIEventsDatesNumDao create(Connection conn)
	{
		return new VwIEventsDatesNumDaoImpl( conn );
	}

}
