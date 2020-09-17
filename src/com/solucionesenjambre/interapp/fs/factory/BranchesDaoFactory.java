/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.factory;

import java.sql.Connection;
import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.jdbc.*;

public class BranchesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return BranchesDao
	 */
	public static BranchesDao create()
	{
		return new BranchesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return BranchesDao
	 */
	public static BranchesDao create(Connection conn)
	{
		return new BranchesDaoImpl( conn );
	}

}
