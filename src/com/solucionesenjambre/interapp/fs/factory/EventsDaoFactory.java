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

public class EventsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EventsDao
	 */
	public static EventsDao create()
	{
		return new EventsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EventsDao
	 */
	public static EventsDao create(Connection conn)
	{
		return new EventsDaoImpl( conn );
	}

}
