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

public class VwPointsDaoImpl extends AbstractDAO implements VwPointsDao
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
	protected final String SQL_SELECT = "SELECT team1_id, school_id, sport_id, event_id, branch_id, code, name, sport, event, branch, points, pj, pg, pe, pp, gf, gc, diff, priority_points FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column team1_id
	 */
	protected static final int COLUMN_TEAM1_ID = 1;

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
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 5;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 6;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 7;

	/** 
	 * Index of column sport
	 */
	protected static final int COLUMN_SPORT = 8;

	/** 
	 * Index of column event
	 */
	protected static final int COLUMN_EVENT = 9;

	/** 
	 * Index of column branch
	 */
	protected static final int COLUMN_BRANCH = 10;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 11;

	/** 
	 * Index of column pj
	 */
	protected static final int COLUMN_PJ = 12;

	/** 
	 * Index of column pg
	 */
	protected static final int COLUMN_PG = 13;

	/** 
	 * Index of column pe
	 */
	protected static final int COLUMN_PE = 14;

	/** 
	 * Index of column pp
	 */
	protected static final int COLUMN_PP = 15;

	/** 
	 * Index of column gf
	 */
	protected static final int COLUMN_GF = 16;

	/** 
	 * Index of column gc
	 */
	protected static final int COLUMN_GC = 17;

	/** 
	 * Index of column diff
	 */
	protected static final int COLUMN_DIFF = 18;

	/** 
	 * Index of column priority_points
	 */
	protected static final int COLUMN_PRIORITY_POINTS = 19;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 19;

	/** 
	 * Returns all rows from the vw_points table that match the criteria ''.
	 */
	public VwPoints[] findAll() throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'team1_id = :team1Id'.
	 */
	public VwPoints[] findWhereTeam1IdEquals(int team1Id) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_id = ? ORDER BY team1_id", new Object[] {  new Integer(team1Id) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'school_id = :schoolId'.
	 */
	public VwPoints[] findWhereSchoolIdEquals(int schoolId) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'sport_id = :sportId'.
	 */
	public VwPoints[] findWhereSportIdEquals(int sportId) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'event_id = :eventId'.
	 */
	public VwPoints[] findWhereEventIdEquals(int eventId) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'branch_id = :branchId'.
	 */
	public VwPoints[] findWhereBranchIdEquals(int branchId) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'code = :code'.
	 */
	public VwPoints[] findWhereCodeEquals(String code) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'name = :name'.
	 */
	public VwPoints[] findWhereNameEquals(String name) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'sport = :sport'.
	 */
	public VwPoints[] findWhereSportEquals(String sport) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport = ? ORDER BY sport", new Object[] { sport } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'event = :event'.
	 */
	public VwPoints[] findWhereEventEquals(String event) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event = ? ORDER BY event", new Object[] { event } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'branch = :branch'.
	 */
	public VwPoints[] findWhereBranchEquals(String branch) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch = ? ORDER BY branch", new Object[] { branch } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'points = :points'.
	 */
	public VwPoints[] findWherePointsEquals(long points) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Long(points) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pj = :pj'.
	 */
	public VwPoints[] findWherePjEquals(long pj) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pj = ? ORDER BY pj", new Object[] {  new Long(pj) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pg = :pg'.
	 */
	public VwPoints[] findWherePgEquals(long pg) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pg = ? ORDER BY pg", new Object[] {  new Long(pg) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pe = :pe'.
	 */
	public VwPoints[] findWherePeEquals(long pe) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pe = ? ORDER BY pe", new Object[] {  new Long(pe) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pp = :pp'.
	 */
	public VwPoints[] findWherePpEquals(long pp) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pp = ? ORDER BY pp", new Object[] {  new Long(pp) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'gf = :gf'.
	 */
	public VwPoints[] findWhereGfEquals(long gf) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE gf = ? ORDER BY gf", new Object[] {  new Long(gf) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'gc = :gc'.
	 */
	public VwPoints[] findWhereGcEquals(long gc) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE gc = ? ORDER BY gc", new Object[] {  new Long(gc) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'diff = :diff'.
	 */
	public VwPoints[] findWhereDiffEquals(long diff) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE diff = ? ORDER BY diff", new Object[] {  new Long(diff) } );
	}

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'priority_points = :priorityPoints'.
	 */
	public VwPoints[] findWherePriorityPointsEquals(int priorityPoints) throws VwPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE priority_points = ? ORDER BY priority_points", new Object[] {  new Integer(priorityPoints) } );
	}

	/**
	 * Method 'VwPointsDaoImpl'
	 * 
	 */
	public VwPointsDaoImpl()
	{
	}

	/**
	 * Method 'VwPointsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwPointsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_points";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwPoints fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwPoints dto = new VwPoints();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwPoints[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwPoints dto = new VwPoints();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwPoints ret[] = new VwPoints[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwPoints dto, ResultSet rs) throws SQLException
	{
		dto.setTeam1Id( rs.getInt( COLUMN_TEAM1_ID ) );
		if (rs.wasNull()) {
			dto.setTeam1IdNull( true );
		}
		
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setSport( rs.getString( COLUMN_SPORT ) );
		dto.setEvent( rs.getString( COLUMN_EVENT ) );
		dto.setBranch( rs.getString( COLUMN_BRANCH ) );
		dto.setPoints( rs.getLong( COLUMN_POINTS ) );
		if (rs.wasNull()) {
			dto.setPointsNull( true );
		}
		
		dto.setPj( rs.getLong( COLUMN_PJ ) );
		if (rs.wasNull()) {
			dto.setPjNull( true );
		}
		
		dto.setPg( rs.getLong( COLUMN_PG ) );
		if (rs.wasNull()) {
			dto.setPgNull( true );
		}
		
		dto.setPe( rs.getLong( COLUMN_PE ) );
		if (rs.wasNull()) {
			dto.setPeNull( true );
		}
		
		dto.setPp( rs.getLong( COLUMN_PP ) );
		if (rs.wasNull()) {
			dto.setPpNull( true );
		}
		
		dto.setGf( rs.getLong( COLUMN_GF ) );
		if (rs.wasNull()) {
			dto.setGfNull( true );
		}
		
		dto.setGc( rs.getLong( COLUMN_GC ) );
		if (rs.wasNull()) {
			dto.setGcNull( true );
		}
		
		dto.setDiff( rs.getLong( COLUMN_DIFF ) );
		if (rs.wasNull()) {
			dto.setDiffNull( true );
		}
		
		dto.setPriorityPoints( rs.getInt( COLUMN_PRIORITY_POINTS ) );
		if (rs.wasNull()) {
			dto.setPriorityPointsNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwPoints dto)
	{
	}

	/** 
	 * Returns all rows from the vw_points table that match the specified arbitrary SQL statement
	 */
	public VwPoints[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPointsDaoException
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
			throw new VwPointsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_points table that match the specified arbitrary SQL statement
	 */
	public VwPoints[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPointsDaoException
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
			throw new VwPointsDaoException( "Exception: " + _e.getMessage(), _e );
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
