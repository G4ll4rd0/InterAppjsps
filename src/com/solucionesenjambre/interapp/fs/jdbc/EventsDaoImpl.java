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

public class EventsDaoImpl extends AbstractDAO implements EventsDao
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
	protected final String SQL_SELECT = "SELECT event_id, event_name, event_code FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( event_id, event_name, event_code ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET event_id = ?, event_name = ?, event_code = ? WHERE event_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE event_id = ?";

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 1;

	/** 
	 * Index of column event_name
	 */
	protected static final int COLUMN_EVENT_NAME = 2;

	/** 
	 * Index of column event_code
	 */
	protected static final int COLUMN_EVENT_CODE = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column event_id
	 */
	protected static final int PK_COLUMN_EVENT_ID = 1;

	/** 
	 * Inserts a new row in the events table.
	 */
	public EventsPk insert(Events dto) throws EventsDaoException
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
			stmt.setInt( index++, dto.getEventId() );
			stmt.setString( index++, dto.getEventName() );
			stmt.setString( index++, dto.getEventCode() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setEventId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EventsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the events table.
	 */
	public void update(EventsPk pk, Events dto) throws EventsDaoException
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
			stmt.setInt( index++, dto.getEventId() );
			stmt.setString( index++, dto.getEventName() );
			stmt.setString( index++, dto.getEventCode() );
			stmt.setInt( 4, pk.getEventId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EventsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the events table.
	 */
	public void delete(EventsPk pk) throws EventsDaoException
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
			stmt.setInt( 1, pk.getEventId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EventsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the events table that matches the specified primary-key value.
	 */
	public Events findByPrimaryKey(EventsPk pk) throws EventsDaoException
	{
		return findByPrimaryKey( pk.getEventId() );
	}

	/** 
	 * Returns all rows from the events table that match the criteria 'event_id = :eventId'.
	 */
	public Events findByPrimaryKey(int eventId) throws EventsDaoException
	{
		Events ret[] = findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the events table that match the criteria ''.
	 */
	public Events[] findAll() throws EventsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY event_id", null );
	}

	/** 
	 * Returns all rows from the events table that match the criteria 'event_id = :eventId'.
	 */
	public Events[] findWhereEventIdEquals(int eventId) throws EventsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the events table that match the criteria 'event_name = :eventName'.
	 */
	public Events[] findWhereEventNameEquals(String eventName) throws EventsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_name = ? ORDER BY event_name", new Object[] { eventName } );
	}

	/** 
	 * Returns all rows from the events table that match the criteria 'event_code = :eventCode'.
	 */
	public Events[] findWhereEventCodeEquals(String eventCode) throws EventsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_code = ? ORDER BY event_code", new Object[] { eventCode } );
	}

	/**
	 * Method 'EventsDaoImpl'
	 * 
	 */
	public EventsDaoImpl()
	{
	}

	/**
	 * Method 'EventsDaoImpl'
	 * 
	 * @param userConn
	 */
	public EventsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.events";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Events fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Events dto = new Events();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Events[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Events dto = new Events();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Events ret[] = new Events[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Events dto, ResultSet rs) throws SQLException
	{
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setEventName( rs.getString( COLUMN_EVENT_NAME ) );
		dto.setEventCode( rs.getString( COLUMN_EVENT_CODE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Events dto)
	{
	}

	/** 
	 * Returns all rows from the events table that match the specified arbitrary SQL statement
	 */
	public Events[] findByDynamicSelect(String sql, Object[] sqlParams) throws EventsDaoException
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
			throw new EventsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the events table that match the specified arbitrary SQL statement
	 */
	public Events[] findByDynamicWhere(String sql, Object[] sqlParams) throws EventsDaoException
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
			throw new EventsDaoException( "Exception: " + _e.getMessage(), _e );
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
