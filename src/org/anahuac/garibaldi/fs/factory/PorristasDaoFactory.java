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

public class PorristasDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PorristasDao
	 */
	public static PorristasDao create()
	{
		return new PorristasDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PorristasDao
	 */
	public static PorristasDao create(Connection conn)
	{
		return new PorristasDaoImpl( conn );
	}

}
