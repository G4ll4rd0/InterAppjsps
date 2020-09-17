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

public class VwCheerDaoImpl extends AbstractDAO implements VwCheerDao
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
	protected final String SQL_SELECT = "SELECT team_id, school_id, sport_id, event_id, points, school, code, sport FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 1;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 2;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 3;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 4;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 5;

	/** 
	 * Index of column school
	 */
	protected static final int COLUMN_SCHOOL = 6;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 7;

	/** 
	 * Index of column sport
	 */
	protected static final int COLUMN_SPORT = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria ''.
	 */
	public VwCheer[] findAll() throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'team_id = :teamId'.
	 */
	public VwCheer[] findWhereTeamIdEquals(int teamId) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'school_id = :schoolId'.
	 */
	public VwCheer[] findWhereSchoolIdEquals(int schoolId) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'sport_id = :sportId'.
	 */
	public VwCheer[] findWhereSportIdEquals(int sportId) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'event_id = :eventId'.
	 */
	public VwCheer[] findWhereEventIdEquals(int eventId) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'points = :points'.
	 */
	public VwCheer[] findWherePointsEquals(int points) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Integer(points) } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'school = :school'.
	 */
	public VwCheer[] findWhereSchoolEquals(String school) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school = ? ORDER BY school", new Object[] { school } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'code = :code'.
	 */
	public VwCheer[] findWhereCodeEquals(String code) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'sport = :sport'.
	 */
	public VwCheer[] findWhereSportEquals(String sport) throws VwCheerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport = ? ORDER BY sport", new Object[] { sport } );
	}

	/**
	 * Method 'VwCheerDaoImpl'
	 * 
	 */
	public VwCheerDaoImpl()
	{
	}

	/**
	 * Method 'VwCheerDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwCheerDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_cheer";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwCheer fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwCheer dto = new VwCheer();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwCheer[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwCheer dto = new VwCheer();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwCheer ret[] = new VwCheer[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwCheer dto, ResultSet rs) throws SQLException
	{
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
		dto.setPoints( rs.getInt( COLUMN_POINTS ) );
		dto.setSchool( rs.getString( COLUMN_SCHOOL ) );
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setSport( rs.getString( COLUMN_SPORT ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwCheer dto)
	{
	}

	/** 
	 * Returns all rows from the vw_cheer table that match the specified arbitrary SQL statement
	 */
	public VwCheer[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwCheerDaoException
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
			throw new VwCheerDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_cheer table that match the specified arbitrary SQL statement
	 */
	public VwCheer[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwCheerDaoException
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
			throw new VwCheerDaoException( "Exception: " + _e.getMessage(), _e );
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
