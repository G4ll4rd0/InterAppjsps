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

public class ParentsHostsPlayersDaoImpl extends AbstractDAO implements ParentsHostsPlayersDao
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
	protected final String SQL_SELECT = "SELECT parent_host_player_id, host_id, player_id, user_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( parent_host_player_id, host_id, player_id, user_id ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET parent_host_player_id = ?, host_id = ?, player_id = ?, user_id = ? WHERE parent_host_player_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE parent_host_player_id = ?";

	/** 
	 * Index of column parent_host_player_id
	 */
	protected static final int COLUMN_PARENT_HOST_PLAYER_ID = 1;

	/** 
	 * Index of column host_id
	 */
	protected static final int COLUMN_HOST_ID = 2;

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 3;

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column parent_host_player_id
	 */
	protected static final int PK_COLUMN_PARENT_HOST_PLAYER_ID = 1;

	/** 
	 * Inserts a new row in the parents_hosts_players table.
	 */
	public ParentsHostsPlayersPk insert(ParentsHostsPlayers dto) throws ParentsHostsPlayersDaoException
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
			stmt.setInt( index++, dto.getParentHostPlayerId() );
			if (dto.isHostIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getHostId() );
			}
		
			if (dto.isPlayerIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerId() );
			}
		
			if (dto.isUserIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setParentHostPlayerId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ParentsHostsPlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the parents_hosts_players table.
	 */
	public void update(ParentsHostsPlayersPk pk, ParentsHostsPlayers dto) throws ParentsHostsPlayersDaoException
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
			stmt.setInt( index++, dto.getParentHostPlayerId() );
			if (dto.isHostIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getHostId() );
			}
		
			if (dto.isPlayerIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerId() );
			}
		
			if (dto.isUserIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			stmt.setInt( 5, pk.getParentHostPlayerId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ParentsHostsPlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the parents_hosts_players table.
	 */
	public void delete(ParentsHostsPlayersPk pk) throws ParentsHostsPlayersDaoException
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
			stmt.setInt( 1, pk.getParentHostPlayerId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ParentsHostsPlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the parents_hosts_players table that matches the specified primary-key value.
	 */
	public ParentsHostsPlayers findByPrimaryKey(ParentsHostsPlayersPk pk) throws ParentsHostsPlayersDaoException
	{
		return findByPrimaryKey( pk.getParentHostPlayerId() );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'parent_host_player_id = :parentHostPlayerId'.
	 */
	public ParentsHostsPlayers findByPrimaryKey(int parentHostPlayerId) throws ParentsHostsPlayersDaoException
	{
		ParentsHostsPlayers ret[] = findByDynamicSelect( SQL_SELECT + " WHERE parent_host_player_id = ?", new Object[] {  new Integer(parentHostPlayerId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria ''.
	 */
	public ParentsHostsPlayers[] findAll() throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY parent_host_player_id", null );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'host_id = :hostId'.
	 */
	public ParentsHostsPlayers[] findByHosts(int hostId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ?", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'player_id = :playerId'.
	 */
	public ParentsHostsPlayers[] findByPlayers(int playerId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ?", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'user_id = :userId'.
	 */
	public ParentsHostsPlayers[] findByUsers(int userId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'parent_host_player_id = :parentHostPlayerId'.
	 */
	public ParentsHostsPlayers[] findWhereParentHostPlayerIdEquals(int parentHostPlayerId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE parent_host_player_id = ? ORDER BY parent_host_player_id", new Object[] {  new Integer(parentHostPlayerId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'host_id = :hostId'.
	 */
	public ParentsHostsPlayers[] findWhereHostIdEquals(int hostId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ? ORDER BY host_id", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'player_id = :playerId'.
	 */
	public ParentsHostsPlayers[] findWherePlayerIdEquals(int playerId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'user_id = :userId'.
	 */
	public ParentsHostsPlayers[] findWhereUserIdEquals(int userId) throws ParentsHostsPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/**
	 * Method 'ParentsHostsPlayersDaoImpl'
	 * 
	 */
	public ParentsHostsPlayersDaoImpl()
	{
	}

	/**
	 * Method 'ParentsHostsPlayersDaoImpl'
	 * 
	 * @param userConn
	 */
	public ParentsHostsPlayersDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.parents_hosts_players";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ParentsHostsPlayers fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ParentsHostsPlayers dto = new ParentsHostsPlayers();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ParentsHostsPlayers[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ParentsHostsPlayers dto = new ParentsHostsPlayers();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ParentsHostsPlayers ret[] = new ParentsHostsPlayers[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ParentsHostsPlayers dto, ResultSet rs) throws SQLException
	{
		dto.setParentHostPlayerId( rs.getInt( COLUMN_PARENT_HOST_PLAYER_ID ) );
		dto.setHostId( rs.getInt( COLUMN_HOST_ID ) );
		if (rs.wasNull()) {
			dto.setHostIdNull( true );
		}
		
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		if (rs.wasNull()) {
			dto.setPlayerIdNull( true );
		}
		
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		if (rs.wasNull()) {
			dto.setUserIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ParentsHostsPlayers dto)
	{
	}

	/** 
	 * Returns all rows from the parents_hosts_players table that match the specified arbitrary SQL statement
	 */
	public ParentsHostsPlayers[] findByDynamicSelect(String sql, Object[] sqlParams) throws ParentsHostsPlayersDaoException
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
			throw new ParentsHostsPlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the parents_hosts_players table that match the specified arbitrary SQL statement
	 */
	public ParentsHostsPlayers[] findByDynamicWhere(String sql, Object[] sqlParams) throws ParentsHostsPlayersDaoException
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
			throw new ParentsHostsPlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
