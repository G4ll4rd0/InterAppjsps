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

public class FnRemoveAccentsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return FnRemoveAccentsDao
	 */
	public static FnRemoveAccentsDao create()
	{
		return new FnRemoveAccentsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return FnRemoveAccentsDao
	 */
	public static FnRemoveAccentsDao create(Connection conn)
	{
		return new FnRemoveAccentsDaoImpl( conn );
	}

}
