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

public class VwStatsDaoImpl extends AbstractDAO implements VwStatsDao
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
	protected final String SQL_SELECT = "SELECT player_id, team_id, school_id, sport_id, branch_id, event_id, number, name, first_lastname, second_lastname, points, yellow_cards, red_cards, code, school, sport, event, branch, team_name FROM " + getTableName() + "";

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
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 3;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 4;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 5;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 6;

	/** 
	 * Index of column number
	 */
	protected static final int COLUMN_NUMBER = 7;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 8;

	/** 
	 * Index of column first_lastname
	 */
	protected static final int COLUMN_FIRST_LASTNAME = 9;

	/** 
	 * Index of column second_lastname
	 */
	protected static final int COLUMN_SECOND_LASTNAME = 10;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 11;

	/** 
	 * Index of column yellow_cards
	 */
	protected static final int COLUMN_YELLOW_CARDS = 12;

	/** 
	 * Index of column red_cards
	 */
	protected static final int COLUMN_RED_CARDS = 13;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 14;

	/** 
	 * Index of column school
	 */
	protected static final int COLUMN_SCHOOL = 15;

	/** 
	 * Index of column sport
	 */
	protected static final int COLUMN_SPORT = 16;

	/** 
	 * Index of column event
	 */
	protected static final int COLUMN_EVENT = 17;

	/** 
	 * Index of column branch
	 */
	protected static final int COLUMN_BRANCH = 18;

	/** 
	 * Index of column team_name
	 */
	protected static final int COLUMN_TEAM_NAME = 19;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 19;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria ''.
	 */
	public VwStats[] findAll() throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'player_id = :playerId'.
	 */
	public VwStats[] findWherePlayerIdEquals(int playerId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'team_id = :teamId'.
	 */
	public VwStats[] findWhereTeamIdEquals(int teamId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'school_id = :schoolId'.
	 */
	public VwStats[] findWhereSchoolIdEquals(int schoolId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'sport_id = :sportId'.
	 */
	public VwStats[] findWhereSportIdEquals(int sportId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'branch_id = :branchId'.
	 */
	public VwStats[] findWhereBranchIdEquals(int branchId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'event_id = :eventId'.
	 */
	public VwStats[] findWhereEventIdEquals(int eventId) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'number = :number'.
	 */
	public VwStats[] findWhereNumberEquals(int number) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE number = ? ORDER BY number", new Object[] {  new Integer(number) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'name = :name'.
	 */
	public VwStats[] findWhereNameEquals(String name) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwStats[] findWhereFirstLastnameEquals(String firstLastname) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE first_lastname = ? ORDER BY first_lastname", new Object[] { firstLastname } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwStats[] findWhereSecondLastnameEquals(String secondLastname) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE second_lastname = ? ORDER BY second_lastname", new Object[] { secondLastname } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'points = :points'.
	 */
	public VwStats[] findWherePointsEquals(long points) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Long(points) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public VwStats[] findWhereYellowCardsEquals(long yellowCards) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE yellow_cards = ? ORDER BY yellow_cards", new Object[] {  new Long(yellowCards) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'red_cards = :redCards'.
	 */
	public VwStats[] findWhereRedCardsEquals(long redCards) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE red_cards = ? ORDER BY red_cards", new Object[] {  new Long(redCards) } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'code = :code'.
	 */
	public VwStats[] findWhereCodeEquals(String code) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'school = :school'.
	 */
	public VwStats[] findWhereSchoolEquals(String school) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school = ? ORDER BY school", new Object[] { school } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'sport = :sport'.
	 */
	public VwStats[] findWhereSportEquals(String sport) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport = ? ORDER BY sport", new Object[] { sport } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'event = :event'.
	 */
	public VwStats[] findWhereEventEquals(String event) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event = ? ORDER BY event", new Object[] { event } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'branch = :branch'.
	 */
	public VwStats[] findWhereBranchEquals(String branch) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch = ? ORDER BY branch", new Object[] { branch } );
	}

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'team_name = :teamName'.
	 */
	public VwStats[] findWhereTeamNameEquals(String teamName) throws VwStatsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_name = ? ORDER BY team_name", new Object[] { teamName } );
	}

	/**
	 * Method 'VwStatsDaoImpl'
	 * 
	 */
	public VwStatsDaoImpl()
	{
	}

	/**
	 * Method 'VwStatsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwStatsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_stats";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwStats fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwStats dto = new VwStats();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwStats[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwStats dto = new VwStats();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwStats ret[] = new VwStats[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwStats dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		if (rs.wasNull()) {
			dto.setPlayerIdNull( true );
		}
		
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setNumber( rs.getInt( COLUMN_NUMBER ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setFirstLastname( rs.getString( COLUMN_FIRST_LASTNAME ) );
		dto.setSecondLastname( rs.getString( COLUMN_SECOND_LASTNAME ) );
		dto.setPoints( rs.getLong( COLUMN_POINTS ) );
		if (rs.wasNull()) {
			dto.setPointsNull( true );
		}
		
		dto.setYellowCards( rs.getLong( COLUMN_YELLOW_CARDS ) );
		if (rs.wasNull()) {
			dto.setYellowCardsNull( true );
		}
		
		dto.setRedCards( rs.getLong( COLUMN_RED_CARDS ) );
		if (rs.wasNull()) {
			dto.setRedCardsNull( true );
		}
		
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setSchool( rs.getString( COLUMN_SCHOOL ) );
		dto.setSport( rs.getString( COLUMN_SPORT ) );
		dto.setEvent( rs.getString( COLUMN_EVENT ) );
		dto.setBranch( rs.getString( COLUMN_BRANCH ) );
		dto.setTeamName( rs.getString( COLUMN_TEAM_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwStats dto)
	{
	}

	/** 
	 * Returns all rows from the vw_stats table that match the specified arbitrary SQL statement
	 */
	public VwStats[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwStatsDaoException
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
			throw new VwStatsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_stats table that match the specified arbitrary SQL statement
	 */
	public VwStats[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwStatsDaoException
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
			throw new VwStatsDaoException( "Exception: " + _e.getMessage(), _e );
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
