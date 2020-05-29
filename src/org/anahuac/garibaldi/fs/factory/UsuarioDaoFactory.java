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

public class UsuarioDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UsuarioDao
	 */
	public static UsuarioDao create()
	{
		return new UsuarioDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UsuarioDao
	 */
	public static UsuarioDao create(Connection conn)
	{
		return new UsuarioDaoImpl( conn );
	}

}
