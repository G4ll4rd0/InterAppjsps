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

public class ActiveSchoolsDaoImpl extends AbstractDAO implements ActiveSchoolsDao
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
	protected final String SQL_SELECT = "SELECT active_school_id, school_id, event_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( active_school_id, school_id, event_id ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET active_school_id = ?, school_id = ?, event_id = ? WHERE active_school_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE active_school_id = ?";

	/** 
	 * Index of column active_school_id
	 */
	protected static final int COLUMN_ACTIVE_SCHOOL_ID = 1;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 2;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column active_school_id
	 */
	protected static final int PK_COLUMN_ACTIVE_SCHOOL_ID = 1;

	/** 
	 * Inserts a new row in the active_schools table.
	 */
	public ActiveSchoolsPk insert(ActiveSchools dto) throws ActiveSchoolsDaoException
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
			stmt.setInt( index++, dto.getActiveSchoolId() );
			if (dto.isSchoolIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSchoolId() );
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
				dto.setActiveSchoolId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActiveSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the active_schools table.
	 */
	public void update(ActiveSchoolsPk pk, ActiveSchools dto) throws ActiveSchoolsDaoException
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
			stmt.setInt( index++, dto.getActiveSchoolId() );
			if (dto.isSchoolIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSchoolId() );
			}
		
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			stmt.setInt( 4, pk.getActiveSchoolId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActiveSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the active_schools table.
	 */
	public void delete(ActiveSchoolsPk pk) throws ActiveSchoolsDaoException
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
			stmt.setInt( 1, pk.getActiveSchoolId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActiveSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the active_schools table that matches the specified primary-key value.
	 */
	public ActiveSchools findByPrimaryKey(ActiveSchoolsPk pk) throws ActiveSchoolsDaoException
	{
		return findByPrimaryKey( pk.getActiveSchoolId() );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public ActiveSchools findByPrimaryKey(int activeSchoolId) throws ActiveSchoolsDaoException
	{
		ActiveSchools ret[] = findByDynamicSelect( SQL_SELECT + " WHERE active_school_id = ?", new Object[] {  new Integer(activeSchoolId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria ''.
	 */
	public ActiveSchools[] findAll() throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY active_school_id", null );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSchools[] findByEvents(int eventId) throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public ActiveSchools[] findBySchools(int schoolId) throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ?", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public ActiveSchools[] findWhereActiveSchoolIdEquals(int activeSchoolId) throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE active_school_id = ? ORDER BY active_school_id", new Object[] {  new Integer(activeSchoolId) } );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public ActiveSchools[] findWhereSchoolIdEquals(int schoolId) throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSchools[] findWhereEventIdEquals(int eventId) throws ActiveSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/**
	 * Method 'ActiveSchoolsDaoImpl'
	 * 
	 */
	public ActiveSchoolsDaoImpl()
	{
	}

	/**
	 * Method 'ActiveSchoolsDaoImpl'
	 * 
	 * @param userConn
	 */
	public ActiveSchoolsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.active_schools";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ActiveSchools fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ActiveSchools dto = new ActiveSchools();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ActiveSchools[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ActiveSchools dto = new ActiveSchools();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ActiveSchools ret[] = new ActiveSchools[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ActiveSchools dto, ResultSet rs) throws SQLException
	{
		dto.setActiveSchoolId( rs.getInt( COLUMN_ACTIVE_SCHOOL_ID ) );
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		if (rs.wasNull()) {
			dto.setSchoolIdNull( true );
		}
		
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ActiveSchools dto)
	{
	}

	/** 
	 * Returns all rows from the active_schools table that match the specified arbitrary SQL statement
	 */
	public ActiveSchools[] findByDynamicSelect(String sql, Object[] sqlParams) throws ActiveSchoolsDaoException
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
			throw new ActiveSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the active_schools table that match the specified arbitrary SQL statement
	 */
	public ActiveSchools[] findByDynamicWhere(String sql, Object[] sqlParams) throws ActiveSchoolsDaoException
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
			throw new ActiveSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
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
