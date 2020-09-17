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

public class VwCheerDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwCheerDao
	 */
	public static VwCheerDao create()
	{
		return new VwCheerDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwCheerDao
	 */
	public static VwCheerDao create(Connection conn)
	{
		return new VwCheerDaoImpl( conn );
	}

}
