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

public class DeporteDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DeporteDao
	 */
	public static DeporteDao create()
	{
		return new DeporteDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DeporteDao
	 */
	public static DeporteDao create(Connection conn)
	{
		return new DeporteDaoImpl( conn );
	}

}
