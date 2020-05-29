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

public class VwPorristasDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwPorristasDao
	 */
	public static VwPorristasDao create()
	{
		return new VwPorristasDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwPorristasDao
	 */
	public static VwPorristasDao create(Connection conn)
	{
		return new VwPorristasDaoImpl( conn );
	}

}
