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

public class SeccionDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return SeccionDao
	 */
	public static SeccionDao create()
	{
		return new SeccionDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return SeccionDao
	 */
	public static SeccionDao create(Connection conn)
	{
		return new SeccionDaoImpl( conn );
	}

}
