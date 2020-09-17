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

public class TeamsDaoImpl extends AbstractDAO implements TeamsDao
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
	protected final String SQL_SELECT = "SELECT team_id, priority_points, branch_id, school_id, sport_id, event_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( team_id, priority_points, branch_id, school_id, sport_id, event_id ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET team_id = ?, priority_points = ?, branch_id = ?, school_id = ?, sport_id = ?, event_id = ? WHERE team_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE team_id = ?";

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 1;

	/** 
	 * Index of column priority_points
	 */
	protected static final int COLUMN_PRIORITY_POINTS = 2;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 3;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 4;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 5;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column team_id
	 */
	protected static final int PK_COLUMN_TEAM_ID = 1;

	/** 
	 * Inserts a new row in the teams table.
	 */
	public TeamsPk insert(Teams dto) throws TeamsDaoException
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
			stmt.setInt( index++, dto.getTeamId() );
			if (dto.isPriorityPointsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPriorityPoints() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
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
				dto.setTeamId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TeamsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the teams table.
	 */
	public void update(TeamsPk pk, Teams dto) throws TeamsDaoException
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
			stmt.setInt( index++, dto.getTeamId() );
			if (dto.isPriorityPointsNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPriorityPoints() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
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
		
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			stmt.setInt( 7, pk.getTeamId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TeamsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the teams table.
	 */
	public void delete(TeamsPk pk) throws TeamsDaoException
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
			stmt.setInt( 1, pk.getTeamId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TeamsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the teams table that matches the specified primary-key value.
	 */
	public Teams findByPrimaryKey(TeamsPk pk) throws TeamsDaoException
	{
		return findByPrimaryKey( pk.getTeamId() );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'team_id = :teamId'.
	 */
	public Teams findByPrimaryKey(int teamId) throws TeamsDaoException
	{
		Teams ret[] = findByDynamicSelect( SQL_SELECT + " WHERE team_id = ?", new Object[] {  new Integer(teamId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the teams table that match the criteria ''.
	 */
	public Teams[] findAll() throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY team_id", null );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'branch_id = :branchId'.
	 */
	public Teams[] findByBranches(int branchId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ?", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'event_id = :eventId'.
	 */
	public Teams[] findByEvents(int eventId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'school_id = :schoolId'.
	 */
	public Teams[] findBySchools(int schoolId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ?", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'sport_id = :sportId'.
	 */
	public Teams[] findBySports(int sportId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ?", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'team_id = :teamId'.
	 */
	public Teams[] findWhereTeamIdEquals(int teamId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'priority_points = :priorityPoints'.
	 */
	public Teams[] findWherePriorityPointsEquals(int priorityPoints) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE priority_points = ? ORDER BY priority_points", new Object[] {  new Integer(priorityPoints) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'branch_id = :branchId'.
	 */
	public Teams[] findWhereBranchIdEquals(int branchId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'school_id = :schoolId'.
	 */
	public Teams[] findWhereSchoolIdEquals(int schoolId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'sport_id = :sportId'.
	 */
	public Teams[] findWhereSportIdEquals(int sportId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the teams table that match the criteria 'event_id = :eventId'.
	 */
	public Teams[] findWhereEventIdEquals(int eventId) throws TeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/**
	 * Method 'TeamsDaoImpl'
	 * 
	 */
	public TeamsDaoImpl()
	{
	}

	/**
	 * Method 'TeamsDaoImpl'
	 * 
	 * @param userConn
	 */
	public TeamsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.teams";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Teams fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Teams dto = new Teams();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Teams[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Teams dto = new Teams();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Teams ret[] = new Teams[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Teams dto, ResultSet rs) throws SQLException
	{
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		dto.setPriorityPoints( rs.getInt( COLUMN_PRIORITY_POINTS ) );
		if (rs.wasNull()) {
			dto.setPriorityPointsNull( true );
		}
		
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		if (rs.wasNull()) {
			dto.setBranchIdNull( true );
		}
		
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		if (rs.wasNull()) {
			dto.setSchoolIdNull( true );
		}
		
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		if (rs.wasNull()) {
			dto.setSportIdNull( true );
		}
		
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Teams dto)
	{
	}

	/** 
	 * Returns all rows from the teams table that match the specified arbitrary SQL statement
	 */
	public Teams[] findByDynamicSelect(String sql, Object[] sqlParams) throws TeamsDaoException
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
			throw new TeamsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the teams table that match the specified arbitrary SQL statement
	 */
	public Teams[] findByDynamicWhere(String sql, Object[] sqlParams) throws TeamsDaoException
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
			throw new TeamsDaoException( "Exception: " + _e.getMessage(), _e );
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
