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

public class TipoDeUsuarioDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TipoDeUsuarioDao
	 */
	public static TipoDeUsuarioDao create()
	{
		return new TipoDeUsuarioDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TipoDeUsuarioDao
	 */
	public static TipoDeUsuarioDao create(Connection conn)
	{
		return new TipoDeUsuarioDaoImpl( conn );
	}

}
