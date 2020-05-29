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

public class EquipoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EquipoDao
	 */
	public static EquipoDao create()
	{
		return new EquipoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EquipoDao
	 */
	public static EquipoDao create(Connection conn)
	{
		return new EquipoDaoImpl( conn );
	}

}
