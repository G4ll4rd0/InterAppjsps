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

public class VwSportsDaoImpl extends AbstractDAO implements VwSportsDao
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
	protected final String SQL_SELECT = "SELECT sport_id, active_sport_id, event_id, code, description FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column sport_id
	 */
	protected static final int COLUMN_SPORT_ID = 1;

	/** 
	 * Index of column active_sport_id
	 */
	protected static final int COLUMN_ACTIVE_SPORT_ID = 2;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 3;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 4;

	/** 
	 * Index of column description
	 */
	protected static final int COLUMN_DESCRIPTION = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria ''.
	 */
	public VwSports[] findAll() throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'sport_id = :sportId'.
	 */
	public VwSports[] findWhereSportIdEquals(int sportId) throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sport_id = ? ORDER BY sport_id", new Object[] {  new Integer(sportId) } );
	}

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'active_sport_id = :activeSportId'.
	 */
	public VwSports[] findWhereActiveSportIdEquals(int activeSportId) throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE active_sport_id = ? ORDER BY active_sport_id", new Object[] {  new Integer(activeSportId) } );
	}

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'event_id = :eventId'.
	 */
	public VwSports[] findWhereEventIdEquals(int eventId) throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'code = :code'.
	 */
	public VwSports[] findWhereCodeEquals(String code) throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'description = :description'.
	 */
	public VwSports[] findWhereDescriptionEquals(String description) throws VwSportsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/**
	 * Method 'VwSportsDaoImpl'
	 * 
	 */
	public VwSportsDaoImpl()
	{
	}

	/**
	 * Method 'VwSportsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwSportsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_sports";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwSports fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwSports dto = new VwSports();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwSports[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwSports dto = new VwSports();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwSports ret[] = new VwSports[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwSports dto, ResultSet rs) throws SQLException
	{
		dto.setSportId( rs.getInt( COLUMN_SPORT_ID ) );
		dto.setActiveSportId( rs.getInt( COLUMN_ACTIVE_SPORT_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwSports dto)
	{
	}

	/** 
	 * Returns all rows from the vw_sports table that match the specified arbitrary SQL statement
	 */
	public VwSports[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwSportsDaoException
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
			throw new VwSportsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_sports table that match the specified arbitrary SQL statement
	 */
	public VwSports[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwSportsDaoException
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
			throw new VwSportsDaoException( "Exception: " + _e.getMessage(), _e );
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
