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

public class RamaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RamaDao
	 */
	public static RamaDao create()
	{
		return new RamaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RamaDao
	 */
	public static RamaDao create(Connection conn)
	{
		return new RamaDaoImpl( conn );
	}

}
