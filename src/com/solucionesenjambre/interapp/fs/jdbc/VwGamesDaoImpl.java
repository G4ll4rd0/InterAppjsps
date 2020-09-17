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

public class VwGamesDaoImpl extends AbstractDAO implements VwGamesDao
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
	protected final String SQL_SELECT = "SELECT game_id, court_id, local_team_id, local_school_id, visitante_team_id, visitante_school_id, sport_id, event_id, branch_id, round_id, date, time, local_code_delegacion, local_name_delegacion, team1_result, team2_result, visitante_code_delegacion, visitante_name_delegacion, court_name, sport_name, event_name, branch_name, round_name, already_played FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column game_id
	 */
	protected static final int COLUMN_GAME_ID = 1;

	/** 
	 * Index of column court_id
	 */
	protected static final int COLUMN_COURT_ID = 2;

	/** 
	 * Index of column local_team_id
	 */
	protected static final int COLUMN_LOCAL_TEAM_ID = 3;

	/** 
	 * Index of column local_school_id
	 */
	protected static final int COLUMN_LOCAL_SCHOOL_ID = 4;

	/** 
	 * Index of column visitante_team_id
	 */
	protected static final int COLUMN_VISITANTE_TEAM_ID = 5;

	/** 
	 * Index of column visitante_school_id
	 */
	protected static final int COLUMN_VISITANTE_SCHOOL_ID = 6;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 7;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 8;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 9;

	/** 
	 * Index of column round_id
	 */
	protected static final int COLUMN_ROUND_ID = 10;

	/** 
	 * Index of column date
	 */
	protected static final int COLUMN_DATE = 11;

	/** 
	 * Index of column time
	 */
	protected static final int COLUMN_TIME = 12;

	/** 
	 * Index of column local_code_delegacion
	 */
	protected static final int COLUMN_LOCAL_CODE_DELEGACION = 13;

	/** 
	 * Index of column local_name_delegacion
	 */
	protected static final int COLUMN_LOCAL_NAME_DELEGACION = 14;

	/** 
	 * Index of column team1_result
	 */
	protected static final int COLUMN_TEAM1_RESULT = 15;

	/** 
	 * Index of column team2_result
	 */
	protected static final int COLUMN_TEAM2_RESULT = 16;

	/** 
	 * Index of column visitante_code_delegacion
	 */
	protected static final int COLUMN_VISITANTE_CODE_DELEGACION = 17;

	/** 
	 * Index of column visitante_name_delegacion
	 */
	protected static final int COLUMN_VISITANTE_NAME_DELEGACION = 18;

	/** 
	 * Index of column court_name
	 */
	protected static final int COLUMN_COURT_NAME = 19;

	/** 
	 * Index of column sport_name
	 */
	protected static final int COLUMN_SPORT_NAME = 20;

	/** 
	 * Index of column event_name
	 */
	protected static final int COLUMN_EVENT_NAME = 21;

	/** 
	 * Index of column branch_name
	 */
	protected static final int COLUMN_BRANCH_NAME = 22;

	/** 
	 * Index of column round_name
	 */
	protected static final int COLUMN_ROUND_NAME = 23;

	/** 
	 * Index of column already_played
	 */
	protected static final int COLUMN_ALREADY_PLAYED = 24;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 24;

	/** 
	 * Returns all rows from the vw_games table that match the criteria ''.
	 */
	public VwGames[] findAll() throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'game_id = :gameId'.
	 */
	public VwGames[] findWhereGameIdEquals(int gameId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ? ORDER BY game_id", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'court_id = :courtId'.
	 */
	public VwGames[] findWhereCourtIdEquals(int courtId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE court_id = ? ORDER BY court_id", new Object[] {  new Integer(courtId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_team_id = :localTeamId'.
	 */
	public VwGames[] findWhereLocalTeamIdEquals(int localTeamId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_team_id = ? ORDER BY local_team_id", new Object[] {  new Integer(localTeamId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_school_id = :localSchoolId'.
	 */
	public VwGames[] findWhereLocalSchoolIdEquals(int localSchoolId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_school_id = ? ORDER BY local_school_id", new Object[] {  new Integer(localSchoolId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_team_id = :visitanteTeamId'.
	 */
	public VwGames[] findWhereVisitanteTeamIdEquals(int visitanteTeamId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_team_id = ? ORDER BY visitante_team_id", new Object[] {  new Integer(visitanteTeamId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_school_id = :visitanteSchoolId'.
	 */
	public VwGames[] findWhereVisitanteSchoolIdEquals(int visitanteSchoolId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_school_id = ? ORDER BY visitante_school_id", new Object[] {  new Integer(visitanteSchoolId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'sport_id = :sportId'.
	 */
	public VwGames[] findWhereSportIdEquals(int sportId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'event_id = :eventId'.
	 */
	public VwGames[] findWhereEventIdEquals(int eventId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'branch_id = :branchId'.
	 */
	public VwGames[] findWhereBranchIdEquals(int branchId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'round_id = :roundId'.
	 */
	public VwGames[] findWhereRoundIdEquals(int roundId) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE round_id = ? ORDER BY round_id", new Object[] {  new Integer(roundId) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'date = :date'.
	 */
	public VwGames[] findWhereDateEquals(Date date) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date = ? ORDER BY date", new Object[] { date==null ? null : new java.sql.Date( date.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'time = :time'.
	 */
	public VwGames[] findWhereTimeEquals(Date time) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE time = ? ORDER BY time", new Object[] { time==null ? null : new java.sql.Time( time.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_code_delegacion = :localCodeDelegacion'.
	 */
	public VwGames[] findWhereLocalCodeDelegacionEquals(String localCodeDelegacion) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_code_delegacion = ? ORDER BY local_code_delegacion", new Object[] { localCodeDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_name_delegacion = :localNameDelegacion'.
	 */
	public VwGames[] findWhereLocalNameDelegacionEquals(String localNameDelegacion) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_name_delegacion = ? ORDER BY local_name_delegacion", new Object[] { localNameDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'team1_result = :team1Result'.
	 */
	public VwGames[] findWhereTeam1ResultEquals(int team1Result) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_result = ? ORDER BY team1_result", new Object[] {  new Integer(team1Result) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'team2_result = :team2Result'.
	 */
	public VwGames[] findWhereTeam2ResultEquals(int team2Result) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team2_result = ? ORDER BY team2_result", new Object[] {  new Integer(team2Result) } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_code_delegacion = :visitanteCodeDelegacion'.
	 */
	public VwGames[] findWhereVisitanteCodeDelegacionEquals(String visitanteCodeDelegacion) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_code_delegacion = ? ORDER BY visitante_code_delegacion", new Object[] { visitanteCodeDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_name_delegacion = :visitanteNameDelegacion'.
	 */
	public VwGames[] findWhereVisitanteNameDelegacionEquals(String visitanteNameDelegacion) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_name_delegacion = ? ORDER BY visitante_name_delegacion", new Object[] { visitanteNameDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'court_name = :courtName'.
	 */
	public VwGames[] findWhereCourtNameEquals(String courtName) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE court_name = ? ORDER BY court_name", new Object[] { courtName } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'sport_name = :sportName'.
	 */
	public VwGames[] findWhereSportNameEquals(String sportName) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_name = ? ORDER BY sport_name", new Object[] { sportName } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'event_name = :eventName'.
	 */
	public VwGames[] findWhereEventNameEquals(String eventName) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_name = ? ORDER BY event_name", new Object[] { eventName } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'branch_name = :branchName'.
	 */
	public VwGames[] findWhereBranchNameEquals(String branchName) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_name = ? ORDER BY branch_name", new Object[] { branchName } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'round_name = :roundName'.
	 */
	public VwGames[] findWhereRoundNameEquals(String roundName) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE round_name = ? ORDER BY round_name", new Object[] { roundName } );
	}

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'already_played = :alreadyPlayed'.
	 */
	public VwGames[] findWhereAlreadyPlayedEquals(int alreadyPlayed) throws VwGamesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE already_played = ? ORDER BY already_played", new Object[] {  new Integer(alreadyPlayed) } );
	}

	/**
	 * Method 'VwGamesDaoImpl'
	 * 
	 */
	public VwGamesDaoImpl()
	{
	}

	/**
	 * Method 'VwGamesDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwGamesDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_games";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwGames fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwGames dto = new VwGames();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwGames[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwGames dto = new VwGames();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwGames ret[] = new VwGames[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwGames dto, ResultSet rs) throws SQLException
	{
		dto.setGameId( rs.getInt( COLUMN_GAME_ID ) );
		dto.setCourtId( rs.getInt( COLUMN_COURT_ID ) );
		dto.setLocalTeamId( rs.getInt( COLUMN_LOCAL_TEAM_ID ) );
		dto.setLocalSchoolId( rs.getInt( COLUMN_LOCAL_SCHOOL_ID ) );
		dto.setVisitanteTeamId( rs.getInt( COLUMN_VISITANTE_TEAM_ID ) );
		dto.setVisitanteSchoolId( rs.getInt( COLUMN_VISITANTE_SCHOOL_ID ) );
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		dto.setRoundId( rs.getInt( COLUMN_ROUND_ID ) );
		if (rs.wasNull()) {
			dto.setRoundIdNull( true );
		}
		
		dto.setDate( rs.getDate(COLUMN_DATE ) );
		dto.setTime( rs.getTime(COLUMN_TIME ) );
		dto.setLocalCodeDelegacion( rs.getString( COLUMN_LOCAL_CODE_DELEGACION ) );
		dto.setLocalNameDelegacion( rs.getString( COLUMN_LOCAL_NAME_DELEGACION ) );
		dto.setTeam1Result( rs.getInt( COLUMN_TEAM1_RESULT ) );
		if (rs.wasNull()) {
			dto.setTeam1ResultNull( true );
		}
		
		dto.setTeam2Result( rs.getInt( COLUMN_TEAM2_RESULT ) );
		if (rs.wasNull()) {
			dto.setTeam2ResultNull( true );
		}
		
		dto.setVisitanteCodeDelegacion( rs.getString( COLUMN_VISITANTE_CODE_DELEGACION ) );
		dto.setVisitanteNameDelegacion( rs.getString( COLUMN_VISITANTE_NAME_DELEGACION ) );
		dto.setCourtName( rs.getString( COLUMN_COURT_NAME ) );
		dto.setSportName( rs.getString( COLUMN_SPORT_NAME ) );
		dto.setEventName( rs.getString( COLUMN_EVENT_NAME ) );
		dto.setBranchName( rs.getString( COLUMN_BRANCH_NAME ) );
		dto.setRoundName( rs.getString( COLUMN_ROUND_NAME ) );
		dto.setAlreadyPlayed( rs.getInt( COLUMN_ALREADY_PLAYED ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwGames dto)
	{
	}

	/** 
	 * Returns all rows from the vw_games table that match the specified arbitrary SQL statement
	 */
	public VwGames[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwGamesDaoException
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
			throw new VwGamesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_games table that match the specified arbitrary SQL statement
	 */
	public VwGames[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwGamesDaoException
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
			throw new VwGamesDaoException( "Exception: " + _e.getMessage(), _e );
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
