/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.jdbc;

import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.factory.*;
import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class UsersTypesDaoImpl extends AbstractDAO implements UsersTypesDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT user_type_id, code, description FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( user_type_id, code, description ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET user_type_id = ?, code = ?, description = ? WHERE user_type_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE user_type_id = ?";

	/** 
	 * Index of column user_type_id
	 */
	protected static final int COLUMN_USER_TYPE_ID = 1;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 2;

	/** 
	 * Index of column description
	 */
	protected static final int COLUMN_DESCRIPTION = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column user_type_id
	 */
	protected static final int PK_COLUMN_USER_TYPE_ID = 1;

	/** 
	 * Inserts a new row in the users_types table.
	 */
	public UsersTypesPk insert(UsersTypes dto) throws UsersTypesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getUserTypeId() );
			stmt.setString( index++, dto.getCode() );
			stmt.setString( index++, dto.getDescription() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setUserTypeId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the users_types table.
	 */
	public void update(UsersTypesPk pk, UsersTypes dto) throws UsersTypesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getUserTypeId() );
			stmt.setString( index++, dto.getCode() );
			stmt.setString( index++, dto.getDescription() );
			stmt.setInt( 4, pk.getUserTypeId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the users_types table.
	 */
	public void delete(UsersTypesPk pk) throws UsersTypesDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getUserTypeId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the users_types table that matches the specified primary-key value.
	 */
	public UsersTypes findByPrimaryKey(UsersTypesPk pk) throws UsersTypesDaoException
	{
		return findByPrimaryKey( pk.getUserTypeId() );
	}

	/** 
	 * Returns all rows from the users_types table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public UsersTypes findByPrimaryKey(int userTypeId) throws UsersTypesDaoException
	{
		UsersTypes ret[] = findByDynamicSelect( SQL_SELECT + " WHERE user_type_id = ?", new Object[] {  new Integer(userTypeId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the users_types table that match the criteria ''.
	 */
	public UsersTypes[] findAll() throws UsersTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY user_type_id", null );
	}

	/** 
	 * Returns all rows from the users_types table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public UsersTypes[] findWhereUserTypeIdEquals(int userTypeId) throws UsersTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_type_id = ? ORDER BY user_type_id", new Object[] {  new Integer(userTypeId) } );
	}

	/** 
	 * Returns all rows from the users_types table that match the criteria 'code = :code'.
	 */
	public UsersTypes[] findWhereCodeEquals(String code) throws UsersTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the users_types table that match the criteria 'description = :description'.
	 */
	public UsersTypes[] findWhereDescriptionEquals(String description) throws UsersTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/**
	 * Method 'UsersTypesDaoImpl'
	 * 
	 */
	public UsersTypesDaoImpl()
	{
	}

	/**
	 * Method 'UsersTypesDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsersTypesDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "hdnsserv_interap.users_types";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected UsersTypes fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			UsersTypes dto = new UsersTypes();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected UsersTypes[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			UsersTypes dto = new UsersTypes();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		UsersTypes ret[] = new UsersTypes[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(UsersTypes dto, ResultSet rs) throws SQLException
	{
		dto.setUserTypeId( rs.getInt( COLUMN_USER_TYPE_ID ) );
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(UsersTypes dto)
	{
	}

	/** 
	 * Returns all rows from the users_types table that match the specified arbitrary SQL statement
	 */
	public UsersTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersTypesDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the users_types table that match the specified arbitrary SQL statement
	 */
	public UsersTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersTypesDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
