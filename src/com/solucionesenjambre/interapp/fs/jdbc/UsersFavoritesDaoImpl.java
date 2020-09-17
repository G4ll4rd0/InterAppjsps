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

public class UsersFavoritesDaoImpl extends AbstractDAO implements UsersFavoritesDao
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
	protected final String SQL_SELECT = "SELECT user_favorite_id, user_id, team_id, school_id, sport_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( user_favorite_id, user_id, team_id, school_id, sport_id ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET user_favorite_id = ?, user_id = ?, team_id = ?, school_id = ?, sport_id = ? WHERE user_favorite_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE user_favorite_id = ?";

	/** 
	 * Index of column user_favorite_id
	 */
	protected static final int COLUMN_USER_FAVORITE_ID = 1;

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 2;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 3;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 4;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column user_favorite_id
	 */
	protected static final int PK_COLUMN_USER_FAVORITE_ID = 1;

	/** 
	 * Inserts a new row in the users_favorites table.
	 */
	public UsersFavoritesPk insert(UsersFavorites dto) throws UsersFavoritesDaoException
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
			stmt.setInt( index++, dto.getUserFavoriteId() );
			if (dto.isUserIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			if (dto.isSchoolIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSchoolId() );
			}
		
			if (dto.isSportIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSportId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setUserFavoriteId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersFavoritesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the users_favorites table.
	 */
	public void update(UsersFavoritesPk pk, UsersFavorites dto) throws UsersFavoritesDaoException
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
			stmt.setInt( index++, dto.getUserFavoriteId() );
			if (dto.isUserIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			if (dto.isSchoolIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSchoolId() );
			}
		
			if (dto.isSportIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSportId() );
			}
		
			stmt.setInt( 6, pk.getUserFavoriteId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersFavoritesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the users_favorites table.
	 */
	public void delete(UsersFavoritesPk pk) throws UsersFavoritesDaoException
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
			stmt.setInt( 1, pk.getUserFavoriteId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersFavoritesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the users_favorites table that matches the specified primary-key value.
	 */
	public UsersFavorites findByPrimaryKey(UsersFavoritesPk pk) throws UsersFavoritesDaoException
	{
		return findByPrimaryKey( pk.getUserFavoriteId() );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_favorite_id = :userFavoriteId'.
	 */
	public UsersFavorites findByPrimaryKey(int userFavoriteId) throws UsersFavoritesDaoException
	{
		UsersFavorites ret[] = findByDynamicSelect( SQL_SELECT + " WHERE user_favorite_id = ?", new Object[] {  new Integer(userFavoriteId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria ''.
	 */
	public UsersFavorites[] findAll() throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY user_favorite_id", null );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'school_id = :schoolId'.
	 */
	public UsersFavorites[] findBySchools(int schoolId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ?", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'sport_id = :sportId'.
	 */
	public UsersFavorites[] findBySports(int sportId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ?", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'team_id = :teamId'.
	 */
	public UsersFavorites[] findByTeams(int teamId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ?", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_id = :userId'.
	 */
	public UsersFavorites[] findByUsers(int userId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_favorite_id = :userFavoriteId'.
	 */
	public UsersFavorites[] findWhereUserFavoriteIdEquals(int userFavoriteId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_favorite_id = ? ORDER BY user_favorite_id", new Object[] {  new Integer(userFavoriteId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_id = :userId'.
	 */
	public UsersFavorites[] findWhereUserIdEquals(int userId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'team_id = :teamId'.
	 */
	public UsersFavorites[] findWhereTeamIdEquals(int teamId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'school_id = :schoolId'.
	 */
	public UsersFavorites[] findWhereSchoolIdEquals(int schoolId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'sport_id = :sportId'.
	 */
	public UsersFavorites[] findWhereSportIdEquals(int sportId) throws UsersFavoritesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/**
	 * Method 'UsersFavoritesDaoImpl'
	 * 
	 */
	public UsersFavoritesDaoImpl()
	{
	}

	/**
	 * Method 'UsersFavoritesDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsersFavoritesDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.users_favorites";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected UsersFavorites fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			UsersFavorites dto = new UsersFavorites();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected UsersFavorites[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			UsersFavorites dto = new UsersFavorites();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		UsersFavorites ret[] = new UsersFavorites[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(UsersFavorites dto, ResultSet rs) throws SQLException
	{
		dto.setUserFavoriteId( rs.getInt( COLUMN_USER_FAVORITE_ID ) );
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		if (rs.wasNull()) {
			dto.setUserIdNull( true );
		}
		
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		if (rs.wasNull()) {
			dto.setTeamIdNull( true );
		}
		
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		if (rs.wasNull()) {
			dto.setSchoolIdNull( true );
		}
		
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		if (rs.wasNull()) {
			dto.setSportIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(UsersFavorites dto)
	{
	}

	/** 
	 * Returns all rows from the users_favorites table that match the specified arbitrary SQL statement
	 */
	public UsersFavorites[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersFavoritesDaoException
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
			throw new UsersFavoritesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the users_favorites table that match the specified arbitrary SQL statement
	 */
	public UsersFavorites[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersFavoritesDaoException
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
			throw new UsersFavoritesDaoException( "Exception: " + _e.getMessage(), _e );
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
