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

public class VwBPlayersDaoImpl extends AbstractDAO implements VwBPlayersDao
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
	protected final String SQL_SELECT = "SELECT player_id, player_type_id, team_id, sport_id, event_id, branch_id, school_id, name, first_lastname, second_lastname, number, player_type, sport, EVENT, branch, school_code, school_name FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 1;

	/** 
	 * Index of column player_type_id
	 */
	protected static final int COLUMN_PLAYER_TYPE_ID = 2;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 3;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 4;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 5;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 6;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 7;

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
	 * Index of column number
	 */
	protected static final int COLUMN_NUMBER = 11;

	/** 
	 * Index of column player_type
	 */
	protected static final int COLUMN_PLAYER_TYPE = 12;

	/** 
	 * Index of column sport
	 */
	protected static final int COLUMN_SPORT = 13;

	/** 
	 * Index of column EVENT
	 */
	protected static final int COLUMN_EVENT = 14;

	/** 
	 * Index of column branch
	 */
	protected static final int COLUMN_BRANCH = 15;

	/** 
	 * Index of column school_code
	 */
	protected static final int COLUMN_SCHOOL_CODE = 16;

	/** 
	 * Index of column school_name
	 */
	protected static final int COLUMN_SCHOOL_NAME = 17;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 17;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria ''.
	 */
	public VwBPlayers[] findAll() throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_id = :playerId'.
	 */
	public VwBPlayers[] findWherePlayerIdEquals(int playerId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public VwBPlayers[] findWherePlayerTypeIdEquals(int playerTypeId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_type_id = ? ORDER BY player_type_id", new Object[] {  new Integer(playerTypeId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'team_id = :teamId'.
	 */
	public VwBPlayers[] findWhereTeamIdEquals(int teamId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'sport_id = :sportId'.
	 */
	public VwBPlayers[] findWhereSportIdEquals(int sportId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'event_id = :eventId'.
	 */
	public VwBPlayers[] findWhereEventIdEquals(int eventId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'branch_id = :branchId'.
	 */
	public VwBPlayers[] findWhereBranchIdEquals(int branchId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_id = :schoolId'.
	 */
	public VwBPlayers[] findWhereSchoolIdEquals(int schoolId) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'name = :name'.
	 */
	public VwBPlayers[] findWhereNameEquals(String name) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwBPlayers[] findWhereFirstLastnameEquals(String firstLastname) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE first_lastname = ? ORDER BY first_lastname", new Object[] { firstLastname } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwBPlayers[] findWhereSecondLastnameEquals(String secondLastname) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE second_lastname = ? ORDER BY second_lastname", new Object[] { secondLastname } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'number = :number'.
	 */
	public VwBPlayers[] findWhereNumberEquals(int number) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE number = ? ORDER BY number", new Object[] {  new Integer(number) } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_type = :playerType'.
	 */
	public VwBPlayers[] findWherePlayerTypeEquals(String playerType) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_type = ? ORDER BY player_type", new Object[] { playerType } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'sport = :sport'.
	 */
	public VwBPlayers[] findWhereSportEquals(String sport) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport = ? ORDER BY sport", new Object[] { sport } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'EVENT = :event'.
	 */
	public VwBPlayers[] findWhereEventEquals(String event) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EVENT = ? ORDER BY EVENT", new Object[] { event } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'branch = :branch'.
	 */
	public VwBPlayers[] findWhereBranchEquals(String branch) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch = ? ORDER BY branch", new Object[] { branch } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_code = :schoolCode'.
	 */
	public VwBPlayers[] findWhereSchoolCodeEquals(String schoolCode) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_code = ? ORDER BY school_code", new Object[] { schoolCode } );
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_name = :schoolName'.
	 */
	public VwBPlayers[] findWhereSchoolNameEquals(String schoolName) throws VwBPlayersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_name = ? ORDER BY school_name", new Object[] { schoolName } );
	}

	/**
	 * Method 'VwBPlayersDaoImpl'
	 * 
	 */
	public VwBPlayersDaoImpl()
	{
	}

	/**
	 * Method 'VwBPlayersDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwBPlayersDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_b_players";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwBPlayers fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwBPlayers dto = new VwBPlayers();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwBPlayers[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwBPlayers dto = new VwBPlayers();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwBPlayers ret[] = new VwBPlayers[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwBPlayers dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		dto.setPlayerTypeId( rs.getInt( COLUMN_PLAYER_TYPE_ID ) );
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setFirstLastname( rs.getString( COLUMN_FIRST_LASTNAME ) );
		dto.setSecondLastname( rs.getString( COLUMN_SECOND_LASTNAME ) );
		dto.setNumber( rs.getInt( COLUMN_NUMBER ) );
		dto.setPlayerType( rs.getString( COLUMN_PLAYER_TYPE ) );
		dto.setSport( rs.getString( COLUMN_SPORT ) );
		dto.setEvent( rs.getString( COLUMN_EVENT ) );
		dto.setBranch( rs.getString( COLUMN_BRANCH ) );
		dto.setSchoolCode( rs.getString( COLUMN_SCHOOL_CODE ) );
		dto.setSchoolName( rs.getString( COLUMN_SCHOOL_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwBPlayers dto)
	{
	}

	/** 
	 * Returns all rows from the vw_b_players table that match the specified arbitrary SQL statement
	 */
	public VwBPlayers[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwBPlayersDaoException
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
			throw new VwBPlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_b_players table that match the specified arbitrary SQL statement
	 */
	public VwBPlayers[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwBPlayersDaoException
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
			throw new VwBPlayersDaoException( "Exception: " + _e.getMessage(), _e );
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
