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

public class ParentsHostsPlayersDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ParentsHostsPlayersDao
	 */
	public static ParentsHostsPlayersDao create()
	{
		return new ParentsHostsPlayersDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ParentsHostsPlayersDao
	 */
	public static ParentsHostsPlayersDao create(Connection conn)
	{
		return new ParentsHostsPlayersDaoImpl( conn );
	}

}
