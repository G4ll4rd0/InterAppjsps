/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.jdbc;

import com.solucionesenjambre.interapp.fs.dao.*;
import java.util.List;
import java.util.ArrayList;
import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class StrRandomDateDaoImpl extends AbstractDAO implements StrRandomDateDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/**
	 * Method 'StrRandomDateDaoImpl'
	 * 
	 */
	public StrRandomDateDaoImpl()
	{
	}

	/**
	 * Method 'StrRandomDateDaoImpl'
	 * 
	 * @param userConn
	 */
	public StrRandomDateDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/**
	 * Method 'execute'
	 * 
	 * @param param
	 * @throws StrRandomDateDaoException
	 */
	public void execute(StrRandomDateParam param) throws StrRandomDateDaoException
	{
		// declare variables
		final boolean _isConnSupplied = (userConn != null);
		Connection _conn = null;
		CallableStatement _stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			_conn = _isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// create a CallableStatement
			_stmt = _conn.prepareCall( "{call hdnsserv_interap.str_random_date(?, ?, ?)}" );
		
			_stmt.setString( 1, param.getPDateStart() );
			_stmt.setString( 2, param.getPDateEnd() );
			_stmt.setString( 3, param.getPFormat() );
			_stmt.execute();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrRandomDateDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(_stmt);
			if (!_isConnSupplied) {
				ResourceManager.close(_conn);
			}
		
		}
		
	}

}
