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

public class StrRandomCharacterDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return StrRandomCharacterDao
	 */
	public static StrRandomCharacterDao create()
	{
		return new StrRandomCharacterDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return StrRandomCharacterDao
	 */
	public static StrRandomCharacterDao create(Connection conn)
	{
		return new StrRandomCharacterDaoImpl( conn );
	}

}
