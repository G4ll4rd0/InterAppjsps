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

public class VwSchoolsDaoImpl extends AbstractDAO implements VwSchoolsDao
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
	protected final String SQL_SELECT = "SELECT school_id, active_school_id, event_id, code, description FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column school_id
	 */
	protected static final int COLUMN_SCHOOL_ID = 1;

	/** 
	 * Index of column active_school_id
	 */
	protected static final int COLUMN_ACTIVE_SCHOOL_ID = 2;

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
	 * Returns all rows from the vw_schools table that match the criteria ''.
	 */
	public VwSchools[] findAll() throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public VwSchools[] findWhereSchoolIdEquals(int schoolId) throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE school_id = ? ORDER BY school_id", new Object[] {  new Integer(schoolId) } );
	}

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public VwSchools[] findWhereActiveSchoolIdEquals(int activeSchoolId) throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE active_school_id = ? ORDER BY active_school_id", new Object[] {  new Integer(activeSchoolId) } );
	}

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'event_id = :eventId'.
	 */
	public VwSchools[] findWhereEventIdEquals(int eventId) throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'code = :code'.
	 */
	public VwSchools[] findWhereCodeEquals(String code) throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'description = :description'.
	 */
	public VwSchools[] findWhereDescriptionEquals(String description) throws VwSchoolsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/**
	 * Method 'VwSchoolsDaoImpl'
	 * 
	 */
	public VwSchoolsDaoImpl()
	{
	}

	/**
	 * Method 'VwSchoolsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwSchoolsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_schools";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwSchools fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwSchools dto = new VwSchools();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwSchools[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwSchools dto = new VwSchools();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwSchools ret[] = new VwSchools[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwSchools dto, ResultSet rs) throws SQLException
	{
		dto.setSchoolId( rs.getInt( COLUMN_SCHOOL_ID ) );
		dto.setActiveSchoolId( rs.getInt( COLUMN_ACTIVE_SCHOOL_ID ) );
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
	protected void reset(VwSchools dto)
	{
	}

	/** 
	 * Returns all rows from the vw_schools table that match the specified arbitrary SQL statement
	 */
	public VwSchools[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwSchoolsDaoException
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
			throw new VwSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_schools table that match the specified arbitrary SQL statement
	 */
	public VwSchools[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwSchoolsDaoException
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
			throw new VwSchoolsDaoException( "Exception: " + _e.getMessage(), _e );
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
