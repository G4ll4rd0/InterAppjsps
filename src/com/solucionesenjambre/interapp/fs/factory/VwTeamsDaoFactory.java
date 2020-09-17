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

public class VwTeamsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwTeamsDao
	 */
	public static VwTeamsDao create()
	{
		return new VwTeamsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwTeamsDao
	 */
	public static VwTeamsDao create(Connection conn)
	{
		return new VwTeamsDaoImpl( conn );
	}

}
