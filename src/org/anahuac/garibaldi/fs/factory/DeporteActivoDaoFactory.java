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

public class DeporteActivoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DeporteActivoDao
	 */
	public static DeporteActivoDao create()
	{
		return new DeporteActivoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DeporteActivoDao
	 */
	public static DeporteActivoDao create(Connection conn)
	{
		return new DeporteActivoDaoImpl( conn );
	}

}
