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

public class FavoritoDelUsuarioDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return FavoritoDelUsuarioDao
	 */
	public static FavoritoDelUsuarioDao create()
	{
		return new FavoritoDelUsuarioDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return FavoritoDelUsuarioDao
	 */
	public static FavoritoDelUsuarioDao create(Connection conn)
	{
		return new FavoritoDelUsuarioDaoImpl( conn );
	}

}
