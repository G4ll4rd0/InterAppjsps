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

public class VwStatsPerGameDaoImpl extends AbstractDAO implements VwStatsPerGameDao
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
	protected final String SQL_SELECT = "SELECT player_id, team_id, game_id, player_name, first_lastname, second_lastname, player_number, points, yellow_cards, red_cards FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 1;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 2;

	/** 
	 * Index of column game_id
	 */
	protected static final int COLUMN_GAME_ID = 3;

	/** 
	 * Index of column player_name
	 */
	protected static final int COLUMN_PLAYER_NAME = 4;

	/** 
	 * Index of column first_lastname
	 */
	protected static final int COLUMN_FIRST_LASTNAME = 5;

	/** 
	 * Index of column second_lastname
	 */
	protected static final int COLUMN_SECOND_LASTNAME = 6;

	/** 
	 * Index of column player_number
	 */
	protected static final int COLUMN_PLAYER_NUMBER = 7;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 8;

	/** 
	 * Index of column yellow_cards
	 */
	protected static final int COLUMN_YELLOW_CARDS = 9;

	/** 
	 * Index of column red_cards
	 */
	protected static final int COLUMN_RED_CARDS = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria ''.
	 */
	public VwStatsPerGame[] findAll() throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_id = :playerId'.
	 */
	public VwStatsPerGame[] findWherePlayerIdEquals(int playerId) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'team_id = :teamId'.
	 */
	public VwStatsPerGame[] findWhereTeamIdEquals(int teamId) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'game_id = :gameId'.
	 */
	public VwStatsPerGame[] findWhereGameIdEquals(int gameId) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ? ORDER BY game_id", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_name = :playerName'.
	 */
	public VwStatsPerGame[] findWherePlayerNameEquals(String playerName) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_name = ? ORDER BY player_name", new Object[] { playerName } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwStatsPerGame[] findWhereFirstLastnameEquals(String firstLastname) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE first_lastname = ? ORDER BY first_lastname", new Object[] { firstLastname } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwStatsPerGame[] findWhereSecondLastnameEquals(String secondLastname) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE second_lastname = ? ORDER BY second_lastname", new Object[] { secondLastname } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_number = :playerNumber'.
	 */
	public VwStatsPerGame[] findWherePlayerNumberEquals(int playerNumber) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_number = ? ORDER BY player_number", new Object[] {  new Integer(playerNumber) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'points = :points'.
	 */
	public VwStatsPerGame[] findWherePointsEquals(int points) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Integer(points) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public VwStatsPerGame[] findWhereYellowCardsEquals(int yellowCards) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE yellow_cards = ? ORDER BY yellow_cards", new Object[] {  new Integer(yellowCards) } );
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'red_cards = :redCards'.
	 */
	public VwStatsPerGame[] findWhereRedCardsEquals(int redCards) throws VwStatsPerGameDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE red_cards = ? ORDER BY red_cards", new Object[] {  new Integer(redCards) } );
	}

	/**
	 * Method 'VwStatsPerGameDaoImpl'
	 * 
	 */
	public VwStatsPerGameDaoImpl()
	{
	}

	/**
	 * Method 'VwStatsPerGameDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwStatsPerGameDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_stats_per_game";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwStatsPerGame fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwStatsPerGame dto = new VwStatsPerGame();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwStatsPerGame[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwStatsPerGame dto = new VwStatsPerGame();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwStatsPerGame ret[] = new VwStatsPerGame[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwStatsPerGame dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		if (rs.wasNull()) {
			dto.setTeamIdNull( true );
		}
		
		dto.setGameId( rs.getInt( COLUMN_GAME_ID ) );
		if (rs.wasNull()) {
			dto.setGameIdNull( true );
		}
		
		dto.setPlayerName( rs.getString( COLUMN_PLAYER_NAME ) );
		dto.setFirstLastname( rs.getString( COLUMN_FIRST_LASTNAME ) );
		dto.setSecondLastname( rs.getString( COLUMN_SECOND_LASTNAME ) );
		dto.setPlayerNumber( rs.getInt( COLUMN_PLAYER_NUMBER ) );
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
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwStatsPerGame dto)
	{
	}

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the specified arbitrary SQL statement
	 */
	public VwStatsPerGame[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwStatsPerGameDaoException
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
			throw new VwStatsPerGameDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_stats_per_game table that match the specified arbitrary SQL statement
	 */
	public VwStatsPerGame[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwStatsPerGameDaoException
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
			throw new VwStatsPerGameDaoException( "Exception: " + _e.getMessage(), _e );
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
