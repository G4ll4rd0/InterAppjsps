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

public class ActiveSchoolsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ActiveSchoolsDao
	 */
	public static ActiveSchoolsDao create()
	{
		return new ActiveSchoolsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ActiveSchoolsDao
	 */
	public static ActiveSchoolsDao create(Connection conn)
	{
		return new ActiveSchoolsDaoImpl( conn );
	}

}
