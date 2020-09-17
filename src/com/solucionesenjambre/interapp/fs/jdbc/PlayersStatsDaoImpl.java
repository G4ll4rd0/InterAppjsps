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

public class PlayersStatsDaoImpl extends AbstractDAO implements PlayersStatsDao
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
	protected final String SQL_SELECT = "SELECT player_stat_id, points, yellow_cards, red_cards, game_id, player_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( player_stat_id, points, yellow_cards, red_cards, game_id, player_id ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET player_stat_id = ?, points = ?, yellow_cards = ?, red_cards = ?, game_id = ?, player_id = ? WHERE player_stat_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE player_stat_id = ?";

	/** 
	 * Index of column player_stat_id
	 */
	protected static final int COLUMN_PLAYER_STAT_ID = 1;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 2;

	/** 
	 * Index of column yellow_cards
	 */
	protected static final int COLUMN_YELLOW_CARDS = 3;

	/** 
	 * Index of column red_cards
	 */
	protected static final int COLUMN_RED_CARDS = 4;

	/** 
	 * Index of column game_id
	 */
	protected static final int COLUMN_GAME_ID = 5;

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column player_stat_id
	 */
	protected static final int PK_COLUMN_PLAYER_STAT_ID = 1;

	/** 
	 * Inserts a new row in the players_stats table.
	 */
	public PlayersStatsPk insert(PlayersStats dto) throws PlayersStatsDaoException
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
			stmt.setInt( index++, dto.getPlayerStatId() );
			if (dto.isPointsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPoints() );
			}
		
			if (dto.isYellowCardsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getYellowCards() );
			}
		
			if (dto.isRedCardsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getRedCards() );
			}
		
			if (dto.isGameIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getGameId() );
			}
		
			if (dto.isPlayerIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setPlayerStatId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersStatsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the players_stats table.
	 */
	public void update(PlayersStatsPk pk, PlayersStats dto) throws PlayersStatsDaoException
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
			stmt.setInt( index++, dto.getPlayerStatId() );
			if (dto.isPointsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPoints() );
			}
		
			if (dto.isYellowCardsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getYellowCards() );
			}
		
			if (dto.isRedCardsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getRedCards() );
			}
		
			if (dto.isGameIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getGameId() );
			}
		
			if (dto.isPlayerIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPlayerId() );
			}
		
			stmt.setInt( 7, pk.getPlayerStatId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersStatsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the players_stats table.
	 */
	public void delete(PlayersStatsPk pk) throws PlayersStatsDaoException
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
			stmt.setInt( 1, pk.getPlayerStatId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PlayersStatsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the players_stats table that matches the specified primary-key value.
	 */
	public PlayersStats findByPrimaryKey(PlayersStatsPk pk) throws PlayersStatsDaoException
	{
		return findByPrimaryKey( pk.getPlayerStatId() );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_stat_id = :playerStatId'.
	 */
	public PlayersStats findByPrimaryKey(int playerStatId) throws PlayersStatsDaoException
	{
		PlayersStats ret[] = findByDynamicSelect( SQL_SELECT + " WHERE player_stat_id = ?", new Object[] {  new Integer(playerStatId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria ''.
	 */
	public PlayersStats[] findAll() throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY player_stat_id", null );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'game_id = :gameId'.
	 */
	public PlayersStats[] findByGames(int gameId) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ?", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_id = :playerId'.
	 */
	public PlayersStats[] findByPlayers(int playerId) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ?", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_stat_id = :playerStatId'.
	 */
	public PlayersStats[] findWherePlayerStatIdEquals(int playerStatId) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_stat_id = ? ORDER BY player_stat_id", new Object[] {  new Integer(playerStatId) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'points = :points'.
	 */
	public PlayersStats[] findWherePointsEquals(int points) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Integer(points) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public PlayersStats[] findWhereYellowCardsEquals(int yellowCards) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE yellow_cards = ? ORDER BY yellow_cards", new Object[] {  new Integer(yellowCards) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'red_cards = :redCards'.
	 */
	public PlayersStats[] findWhereRedCardsEquals(int redCards) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE red_cards = ? ORDER BY red_cards", new Object[] {  new Integer(redCards) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'game_id = :gameId'.
	 */
	public PlayersStats[] findWhereGameIdEquals(int gameId) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ? ORDER BY game_id", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_id = :playerId'.
	 */
	public PlayersStats[] findWherePlayerIdEquals(int playerId) throws PlayersStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/**
	 * Method 'PlayersStatsDaoImpl'
	 * 
	 */
	public PlayersStatsDaoImpl()
	{
	}

	/**
	 * Method 'PlayersStatsDaoImpl'
	 * 
	 * @param userConn
	 */
	public PlayersStatsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.players_stats";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected PlayersStats fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			PlayersStats dto = new PlayersStats();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected PlayersStats[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			PlayersStats dto = new PlayersStats();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		PlayersStats ret[] = new PlayersStats[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(PlayersStats dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerStatId( rs.getInt( COLUMN_PLAYER_STAT_ID ) );
		dto.setPoints( rs.getInt( COLUMN_POINTS ) );
		if (rs.wasNull()) {
			dto.setPointsNull( true );
		}
		
		dto.setYellowCards( rs.getInt( COLUMN_YELLOW_CARDS ) );
		if (rs.wasNull()) {
			dto.setYellowCardsNull( true );
		}
		
		dto.setRedCards( rs.getInt( COLUMN_RED_CARDS ) );
		if (rs.wasNull()) {
			dto.setRedCardsNull( true );
		}
		
		dto.setGameId( rs.getInt( COLUMN_GAME_ID ) );
		if (rs.wasNull()) {
			dto.setGameIdNull( true );
		}
		
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		if (rs.wasNull()) {
			dto.setPlayerIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(PlayersStats dto)
	{
	}

	/** 
	 * Returns all rows from the players_stats table that match the specified arbitrary SQL statement
	 */
	public PlayersStats[] findByDynamicSelect(String sql, Object[] sqlParams) throws PlayersStatsDaoException
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
			throw new PlayersStatsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the players_stats table that match the specified arbitrary SQL statement
	 */
	public PlayersStats[] findByDynamicWhere(String sql, Object[] sqlParams) throws PlayersStatsDaoException
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
			throw new PlayersStatsDaoException( "Exception: " + _e.getMessage(), _e );
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
