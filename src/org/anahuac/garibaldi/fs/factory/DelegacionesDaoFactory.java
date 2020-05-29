/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.factory;

import java.sql.Connection;
import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.jdbc.*;

public class DelegacionesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DelegacionesDao
	 */
	public static DelegacionesDao create()
	{
		return new DelegacionesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DelegacionesDao
	 */
	public static DelegacionesDao create(Connection conn)
	{
		return new DelegacionesDaoImpl( conn );
	}

}
