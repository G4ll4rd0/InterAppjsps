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

public class CanchaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CanchaDao
	 */
	public static CanchaDao create()
	{
		return new CanchaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CanchaDao
	 */
	public static CanchaDao create(Connection conn)
	{
		return new CanchaDaoImpl( conn );
	}

}
