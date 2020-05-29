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

public class NoticiasDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return NoticiasDao
	 */
	public static NoticiasDao create()
	{
		return new NoticiasDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return NoticiasDao
	 */
	public static NoticiasDao create(Connection conn)
	{
		return new NoticiasDaoImpl( conn );
	}

}
