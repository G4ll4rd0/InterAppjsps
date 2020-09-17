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

public class UsersDaoImpl extends AbstractDAO implements UsersDao
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
	protected final String SQL_SELECT = "SELECT user_id, username, pssword, email, seed, user_type_id, event_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	// Aqui esta modificado para insertar la seed con una uuid()
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( user_id, username, pssword, email, seed, user_type_id, event_id ) VALUES ( ?, ?, ?, ?, uuid(), ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET user_id = ?, username = ?, pssword = ?, email = ?, seed = ?, user_type_id = ?, event_id = ? WHERE user_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE user_id = ?";

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 1;

	/** 
	 * Index of column username
	 */
	protected static final int COLUMN_USERNAME = 2;

	/** 
	 * Index of column pssword
	 */
	protected static final int COLUMN_PSSWORD = 3;

	/** 
	 * Index of column email
	 */
	protected static final int COLUMN_EMAIL = 4;

	/** 
	 * Index of column seed
	 */
	protected static final int COLUMN_SEED = 5;

	/** 
	 * Index of column user_type_id
	 */
	protected static final int COLUMN_USER_TYPE_ID = 6;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column user_id
	 */
	protected static final int PK_COLUMN_USER_ID = 1;

	/** 
	 * Inserts a new row in the users table.
	 */
	public UsersPk insert(Users dto) throws UsersDaoException
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
			stmt.setInt( index++, dto.getUserId() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPssword() );
			stmt.setString( index++, dto.getEmail() );
			if (dto.isUserTypeIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserTypeId() );
			}
		
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setUserId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the users table.
	 */
	public void update(UsersPk pk, Users dto) throws UsersDaoException
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
			stmt.setInt( index++, dto.getUserId() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPssword() );
			stmt.setString( index++, dto.getEmail() );
			stmt.setString( index++, dto.getSeed() );
			if (dto.isUserTypeIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserTypeId() );
			}
		
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			stmt.setInt( 8, pk.getUserId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the users table.
	 */
	public void delete(UsersPk pk) throws UsersDaoException
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
			stmt.setInt( 1, pk.getUserId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the users table that matches the specified primary-key value.
	 */
	public Users findByPrimaryKey(UsersPk pk) throws UsersDaoException
	{
		return findByPrimaryKey( pk.getUserId() );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'user_id = :userId'.
	 */
	public Users findByPrimaryKey(int userId) throws UsersDaoException
	{
		Users ret[] = findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the users table that match the criteria ''.
	 */
	public Users[] findAll() throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY user_id", null );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'event_id = :eventId'.
	 */
	public Users[] findByEvents(int eventId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public Users[] findByUsersTypes(int userTypeId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_type_id = ?", new Object[] {  new Integer(userTypeId) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'user_id = :userId'.
	 */
	public Users[] findWhereUserIdEquals(int userId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'username = :username'.
	 */
	public Users[] findWhereUsernameEquals(String username) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE username = ? ORDER BY username", new Object[] { username } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'pssword = :pssword'.
	 */
	public Users[] findWherePsswordEquals(String pssword) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pssword = ? ORDER BY pssword", new Object[] { pssword } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'email = :email'.
	 */
	public Users[] findWhereEmailEquals(String email) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE email = ? ORDER BY email", new Object[] { email } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'seed = :seed'.
	 */
	public Users[] findWhereSeedEquals(String seed) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seed = ? ORDER BY seed", new Object[] { seed } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public Users[] findWhereUserTypeIdEquals(int userTypeId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_type_id = ? ORDER BY user_type_id", new Object[] {  new Integer(userTypeId) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'event_id = :eventId'.
	 */
	public Users[] findWhereEventIdEquals(int eventId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/**
	 * Method 'UsersDaoImpl'
	 * 
	 */
	public UsersDaoImpl()
	{
	}

	/**
	 * Method 'UsersDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsersDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.users";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Users fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Users dto = new Users();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Users[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Users dto = new Users();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Users ret[] = new Users[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Users dto, ResultSet rs) throws SQLException
	{
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		dto.setUsername( rs.getString( COLUMN_USERNAME ) );
		dto.setPssword( rs.getString( COLUMN_PSSWORD ) );
		dto.setEmail( rs.getString( COLUMN_EMAIL ) );
		dto.setSeed( rs.getString( COLUMN_SEED ) );
		dto.setUserTypeId( rs.getInt( COLUMN_USER_TYPE_ID ) );
		if (rs.wasNull()) {
			dto.setUserTypeIdNull( true );
		}
		
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Users dto)
	{
	}

	/** 
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersDaoException
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
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersDaoException
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
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
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
