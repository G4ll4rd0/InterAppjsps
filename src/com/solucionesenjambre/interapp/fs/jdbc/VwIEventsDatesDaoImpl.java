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

public class VwIEventsDatesDaoImpl extends AbstractDAO implements VwIEventsDatesDao
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
	protected final String SQL_SELECT = "SELECT event_id, event_name, date FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 1;

	/** 
	 * Index of column event_name
	 */
	protected static final int COLUMN_EVENT_NAME = 2;

	/** 
	 * Index of column date
	 */
	protected static final int COLUMN_DATE = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria ''.
	 */
	public VwIEventsDates[] findAll() throws VwIEventsDatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'event_id = :eventId'.
	 */
	public VwIEventsDates[] findWhereEventIdEquals(int eventId) throws VwIEventsDatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'event_name = :eventName'.
	 */
	public VwIEventsDates[] findWhereEventNameEquals(String eventName) throws VwIEventsDatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_name = ? ORDER BY event_name", new Object[] { eventName } );
	}

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'date = :date'.
	 */
	public VwIEventsDates[] findWhereDateEquals(Date date) throws VwIEventsDatesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date = ? ORDER BY date", new Object[] { date==null ? null : new java.sql.Date( date.getTime() ) } );
	}

	/**
	 * Method 'VwIEventsDatesDaoImpl'
	 * 
	 */
	public VwIEventsDatesDaoImpl()
	{
	}

	/**
	 * Method 'VwIEventsDatesDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwIEventsDatesDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_i_events_dates";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwIEventsDates fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwIEventsDates dto = new VwIEventsDates();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwIEventsDates[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwIEventsDates dto = new VwIEventsDates();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwIEventsDates ret[] = new VwIEventsDates[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwIEventsDates dto, ResultSet rs) throws SQLException
	{
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setEventName( rs.getString( COLUMN_EVENT_NAME ) );
		dto.setDate( rs.getDate(COLUMN_DATE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwIEventsDates dto)
	{
	}

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDates[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwIEventsDatesDaoException
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
			throw new VwIEventsDatesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_i_events_dates table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDates[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwIEventsDatesDaoException
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
			throw new VwIEventsDatesDaoException( "Exception: " + _e.getMessage(), _e );
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
