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

public class VwEstadisticasDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return VwEstadisticasDao
	 */
	public static VwEstadisticasDao create()
	{
		return new VwEstadisticasDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return VwEstadisticasDao
	 */
	public static VwEstadisticasDao create(Connection conn)
	{
		return new VwEstadisticasDaoImpl( conn );
	}

}
