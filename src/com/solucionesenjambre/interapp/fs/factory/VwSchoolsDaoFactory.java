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

public class VwSchoolsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwSchoolsDao
	 */
	public static VwSchoolsDao create()
	{
		return new VwSchoolsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwSchoolsDao
	 */
	public static VwSchoolsDao create(Connection conn)
	{
		return new VwSchoolsDaoImpl( conn );
	}

}
