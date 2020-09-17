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

public class PlayersDaoImpl extends AbstractDAO implements PlayersDao
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
	protected final String SQL_SELECT = "SELECT player_id, player_name, first_lastname, second_lastname, player_number, team_id, player_type_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( player_id, player_name, first_lastname, second_lastname, player_number, team_id, player_type_id ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET player_id = ?, player_name = ?, first_lastname = ?, second_lastname = ?, player_number = ?, team_id = ?, player_type_id = ? WHERE player_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE player_id = ?";

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 1;

	/** 
	 * Index of column player_name
	 */
	protected static final int COLUMN_PLAYER_NAME = 2;

	/** 
	 * Index of column first_lastname
	 */
	protected static final int COLUMN_FIRST_LASTNAME = 3;

	/** 
	 * Index of column second_lastname
	 */
	protected static final int COLUMN_SECOND_LASTNAME = 4;

	/** 
	 * Index of column player_number
	 */
	protected static final int COLUMN_PLAYER_NUMBER = 5;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 6;

	/** 
	 * Index of column player_type_id
	 */
	protected static final int COLUMN_PLAYER_TYPE_ID = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column player_id
	 */
	protected static final int PK_COLUMN_PLAYER_ID = 1;

	/** 
	 * Inserts a new row in the players table.
	 */
	public PlayersPk insert(Players dto) throws PlayersDaoException
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
			stmt.setInt( index++, dto.getPlayerId() );
			stmt.setString( index++, dto.getPlayerName() );
			stmt.setString( index++, dto.getFirstLastname() );
			stmt.setString( index++, dto.getSecondLastname() );
			stmt.setInt( index++, dto.getPlayerNumber() );
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			if (dto.isPlayerTypeIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerTypeId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setPlayerId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the players table.
	 */
	public void update(PlayersPk pk, Players dto) throws PlayersDaoException
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
			stmt.setInt( index++, dto.getPlayerId() );
			stmt.setString( index++, dto.getPlayerName() );
			stmt.setString( index++, dto.getFirstLastname() );
			stmt.setString( index++, dto.getSecondLastname() );
			stmt.setInt( index++, dto.getPlayerNumber() );
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			if (dto.isPlayerTypeIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerTypeId() );
			}
		
			stmt.setInt( 8, pk.getPlayerId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the players table.
	 */
	public void delete(PlayersPk pk) throws PlayersDaoException
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
			stmt.setInt( 1, pk.getPlayerId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the players table that matches the specified primary-key value.
	 */
	public Players findByPrimaryKey(PlayersPk pk) throws PlayersDaoException
	{
		return findByPrimaryKey( pk.getPlayerId() );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_id = :playerId'.
	 */
	public Players findByPrimaryKey(int playerId) throws PlayersDaoException
	{
		Players ret[] = findByDynamicSelect( SQL_SELECT + " WHERE player_id = ?", new Object[] {  new Integer(playerId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the players table that match the criteria ''.
	 */
	public Players[] findAll() throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY player_id", null );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public Players[] findByPlayersTypes(int playerTypeId) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_type_id = ?", new Object[] {  new Integer(playerTypeId) } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'team_id = :teamId'.
	 */
	public Players[] findByTeams(int teamId) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ?", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_id = :playerId'.
	 */
	public Players[] findWherePlayerIdEquals(int playerId) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_name = :playerName'.
	 */
	public Players[] findWherePlayerNameEquals(String playerName) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_name = ? ORDER BY player_name", new Object[] { playerName } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public Players[] findWhereFirstLastnameEquals(String firstLastname) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE first_lastname = ? ORDER BY first_lastname", new Object[] { firstLastname } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public Players[] findWhereSecondLastnameEquals(String secondLastname) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE second_lastname = ? ORDER BY second_lastname", new Object[] { secondLastname } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_number = :playerNumber'.
	 */
	public Players[] findWherePlayerNumberEquals(int playerNumber) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_number = ? ORDER BY player_number", new Object[] {  new Integer(playerNumber) } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'team_id = :teamId'.
	 */
	public Players[] findWhereTeamIdEquals(int teamId) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public Players[] findWherePlayerTypeIdEquals(int playerTypeId) throws PlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_type_id = ? ORDER BY player_type_id", new Object[] {  new Integer(playerTypeId) } );
	}

	/**
	 * Method 'PlayersDaoImpl'
	 * 
	 */
	public PlayersDaoImpl()
	{
	}

	/**
	 * Method 'PlayersDaoImpl'
	 * 
	 * @param userConn
	 */
	public PlayersDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.players";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Players fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Players dto = new Players();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Players[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Players dto = new Players();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Players ret[] = new Players[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Players dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		dto.setPlayerName( rs.getString( COLUMN_PLAYER_NAME ) );
		dto.setFirstLastname( rs.getString( COLUMN_FIRST_LASTNAME ) );
		dto.setSecondLastname( rs.getString( COLUMN_SECOND_LASTNAME ) );
		dto.setPlayerNumber( rs.getInt( COLUMN_PLAYER_NUMBER ) );
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		if (rs.wasNull()) {
			dto.setTeamIdNull( true );
		}
		
		dto.setPlayerTypeId( rs.getInt( COLUMN_PLAYER_TYPE_ID ) );
		if (rs.wasNull()) {
			dto.setPlayerTypeIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Players dto)
	{
	}

	/** 
	 * Returns all rows from the players table that match the specified arbitrary SQL statement
	 */
	public Players[] findByDynamicSelect(String sql, Object[] sqlParams) throws PlayersDaoException
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
			throw new PlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the players table that match the specified arbitrary SQL statement
	 */
	public Players[] findByDynamicWhere(String sql, Object[] sqlParams) throws PlayersDaoException
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
			throw new PlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
