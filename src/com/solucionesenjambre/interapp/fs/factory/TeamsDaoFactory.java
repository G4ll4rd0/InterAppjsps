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

public class TeamsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TeamsDao
	 */
	public static TeamsDao create()
	{
		return new TeamsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TeamsDao
	 */
	public static TeamsDao create(Connection conn)
	{
		return new TeamsDaoImpl( conn );
	}

}
