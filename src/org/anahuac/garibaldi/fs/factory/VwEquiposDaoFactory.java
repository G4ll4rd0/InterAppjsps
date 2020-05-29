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

public class VwEquiposDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwEquiposDao
	 */
	public static VwEquiposDao create()
	{
		return new VwEquiposDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwEquiposDao
	 */
	public static VwEquiposDao create(Connection conn)
	{
		return new VwEquiposDaoImpl( conn );
	}

}
