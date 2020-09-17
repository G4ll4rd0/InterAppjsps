/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.jdbc;

import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.factory.*;
import java.util.Date;
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

public class GamesDaoImpl extends AbstractDAO implements GamesDao
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
	protected final String SQL_SELECT = "SELECT game_id, date, time, already_played, team1_id, team2_id, team1_result, team2_result, court_id, round_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( game_id, date, time, already_played, team1_id, team2_id, team1_result, team2_result, court_id, round_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET game_id = ?, date = ?, time = ?, already_played = ?, team1_id = ?, team2_id = ?, team1_result = ?, team2_result = ?, court_id = ?, round_id = ? WHERE game_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE game_id = ?";

	/** 
	 * Index of column game_id
	 */
	protected static final int COLUMN_GAME_ID = 1;

	/** 
	 * Index of column date
	 */
	protected static final int COLUMN_DATE = 2;

	/** 
	 * Index of column time
	 */
	protected static final int COLUMN_TIME = 3;

	/** 
	 * Index of column already_played
	 */
	protected static final int COLUMN_ALREADY_PLAYED = 4;

	/** 
	 * Index of column team1_id
	 */
	protected static final int COLUMN_TEAM1_ID = 5;

	/** 
	 * Index of column team2_id
	 */
	protected static final int COLUMN_TEAM2_ID = 6;

	/** 
	 * Index of column team1_result
	 */
	protected static final int COLUMN_TEAM1_RESULT = 7;

	/** 
	 * Index of column team2_result
	 */
	protected static final int COLUMN_TEAM2_RESULT = 8;

	/** 
	 * Index of column court_id
	 */
	protected static final int COLUMN_COURT_ID = 9;

	/** 
	 * Index of column round_id
	 */
	protected static final int COLUMN_ROUND_ID = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column game_id
	 */
	protected static final int PK_COLUMN_GAME_ID = 1;

	/** 
	 * Inserts a new row in the games table.
	 */
	public GamesPk insert(Games dto) throws GamesDaoException
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
			stmt.setInt( index++, dto.getGameId() );
			stmt.setDate(index++, dto.getDate()==null ? null : new java.sql.Date( dto.getDate().getTime() ) );
			stmt.setTime(index++, dto.getTime()==null ? null : new java.sql.Time( dto.getTime().getTime() ) );
			stmt.setInt( index++, dto.getAlreadyPlayed() );
			if (dto.isTeam1IdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam1Id() );
			}
		
			if (dto.isTeam2IdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam2Id() );
			}
		
			if (dto.isTeam1ResultNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam1Result() );
			}
		
			if (dto.isTeam2ResultNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam2Result() );
			}
		
			if (dto.isCourtIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCourtId() );
			}
		
			if (dto.isRoundIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getRoundId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setGameId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GamesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the games table.
	 */
	public void update(GamesPk pk, Games dto) throws GamesDaoException
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
			stmt.setInt( index++, dto.getGameId() );
			stmt.setDate(index++, dto.getDate()==null ? null : new java.sql.Date( dto.getDate().getTime() ) );
			stmt.setTime(index++, dto.getTime()==null ? null : new java.sql.Time( dto.getTime().getTime() ) );
			stmt.setInt( index++, dto.getAlreadyPlayed() );
			if (dto.isTeam1IdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam1Id() );
			}
		
			if (dto.isTeam2IdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam2Id() );
			}
		
			if (dto.isTeam1ResultNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam1Result() );
			}
		
			if (dto.isTeam2ResultNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeam2Result() );
			}
		
			if (dto.isCourtIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCourtId() );
			}
		
			if (dto.isRoundIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getRoundId() );
			}
		
			stmt.setInt( 11, pk.getGameId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GamesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the games table.
	 */
	public void delete(GamesPk pk) throws GamesDaoException
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
			stmt.setInt( 1, pk.getGameId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GamesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the games table that matches the specified primary-key value.
	 */
	public Games findByPrimaryKey(GamesPk pk) throws GamesDaoException
	{
		return findByPrimaryKey( pk.getGameId() );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'game_id = :gameId'.
	 */
	public Games findByPrimaryKey(int gameId) throws GamesDaoException
	{
		Games ret[] = findByDynamicSelect( SQL_SELECT + " WHERE game_id = ?", new Object[] {  new Integer(gameId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the games table that match the criteria ''.
	 */
	public Games[] findAll() throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY game_id", null );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'court_id = :courtId'.
	 */
	public Games[] findByCourts(int courtId) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE court_id = ?", new Object[] {  new Integer(courtId) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'round_id = :roundId'.
	 */
	public Games[] findByRounds(int roundId) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE round_id = ?", new Object[] {  new Integer(roundId) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_id = :team1Id'.
	 */
	public Games[] findByTeams(int team1Id) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_id = ?", new Object[] {  new Integer(team1Id) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_id = :team2Id'.
	 */
	public Games[] findByTeams2(int team2Id) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team2_id = ?", new Object[] {  new Integer(team2Id) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'game_id = :gameId'.
	 */
	public Games[] findWhereGameIdEquals(int gameId) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ? ORDER BY game_id", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'date = :date'.
	 */
	public Games[] findWhereDateEquals(Date date) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date = ? ORDER BY date", new Object[] { date==null ? null : new java.sql.Date( date.getTime() ) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'time = :time'.
	 */
	public Games[] findWhereTimeEquals(Date time) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE time = ? ORDER BY time", new Object[] { time==null ? null : new java.sql.Time( time.getTime() ) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'already_played = :alreadyPlayed'.
	 */
	public Games[] findWhereAlreadyPlayedEquals(int alreadyPlayed) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE already_played = ? ORDER BY already_played", new Object[] {  new Integer(alreadyPlayed) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_id = :team1Id'.
	 */
	public Games[] findWhereTeam1IdEquals(int team1Id) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_id = ? ORDER BY team1_id", new Object[] {  new Integer(team1Id) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_id = :team2Id'.
	 */
	public Games[] findWhereTeam2IdEquals(int team2Id) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team2_id = ? ORDER BY team2_id", new Object[] {  new Integer(team2Id) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_result = :team1Result'.
	 */
	public Games[] findWhereTeam1ResultEquals(int team1Result) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_result = ? ORDER BY team1_result", new Object[] {  new Integer(team1Result) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_result = :team2Result'.
	 */
	public Games[] findWhereTeam2ResultEquals(int team2Result) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team2_result = ? ORDER BY team2_result", new Object[] {  new Integer(team2Result) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'court_id = :courtId'.
	 */
	public Games[] findWhereCourtIdEquals(int courtId) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE court_id = ? ORDER BY court_id", new Object[] {  new Integer(courtId) } );
	}

	/** 
	 * Returns all rows from the games table that match the criteria 'round_id = :roundId'.
	 */
	public Games[] findWhereRoundIdEquals(int roundId) throws GamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE round_id = ? ORDER BY round_id", new Object[] {  new Integer(roundId) } );
	}

	/**
	 * Method 'GamesDaoImpl'
	 * 
	 */
	public GamesDaoImpl()
	{
	}

	/**
	 * Method 'GamesDaoImpl'
	 * 
	 * @param userConn
	 */
	public GamesDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.games";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Games fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Games dto = new Games();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Games[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Games dto = new Games();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Games ret[] = new Games[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Games dto, ResultSet rs) throws SQLException
	{
		dto.setGameId( rs.getInt( COLUMN_GAME_ID ) );
		dto.setDate( rs.getDate(COLUMN_DATE ) );
		dto.setTime( rs.getTime(COLUMN_TIME ) );
		dto.setAlreadyPlayed( rs.getInt( COLUMN_ALREADY_PLAYED ) );
		dto.setTeam1Id( rs.getInt( COLUMN_TEAM1_ID ) );
		if (rs.wasNull()) {
			dto.setTeam1IdNull( true );
		}
		
		dto.setTeam2Id( rs.getInt( COLUMN_TEAM2_ID ) );
		if (rs.wasNull()) {
			dto.setTeam2IdNull( true );
		}
		
		dto.setTeam1Result( rs.getInt( COLUMN_TEAM1_RESULT ) );
		if (rs.wasNull()) {
			dto.setTeam1ResultNull( true );
		}
		
		dto.setTeam2Result( rs.getInt( COLUMN_TEAM2_RESULT ) );
		if (rs.wasNull()) {
			dto.setTeam2ResultNull( true );
		}
		
		dto.setCourtId( rs.getInt( COLUMN_COURT_ID ) );
		if (rs.wasNull()) {
			dto.setCourtIdNull( true );
		}
		
		dto.setRoundId( rs.getInt( COLUMN_ROUND_ID ) );
		if (rs.wasNull()) {
			dto.setRoundIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Games dto)
	{
	}

	/** 
	 * Returns all rows from the games table that match the specified arbitrary SQL statement
	 */
	public Games[] findByDynamicSelect(String sql, Object[] sqlParams) throws GamesDaoException
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
			throw new GamesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the games table that match the specified arbitrary SQL statement
	 */
	public Games[] findByDynamicWhere(String sql, Object[] sqlParams) throws GamesDaoException
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
			throw new GamesDaoException( "Exception: " + _e.getMessage(), _e );
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
