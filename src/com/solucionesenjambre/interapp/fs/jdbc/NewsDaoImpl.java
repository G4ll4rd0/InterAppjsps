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

public class NewsDaoImpl extends AbstractDAO implements NewsDao
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
	protected final String SQL_SELECT = "SELECT new_id, title, image, description, event_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( new_id, title, image, description, event_id ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET new_id = ?, title = ?, image = ?, description = ?, event_id = ? WHERE new_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE new_id = ?";

	/** 
	 * Index of column new_id
	 */
	protected static final int COLUMN_NEW_ID = 1;

	/** 
	 * Index of column title
	 */
	protected static final int COLUMN_TITLE = 2;

	/** 
	 * Index of column image
	 */
	protected static final int COLUMN_IMAGE = 3;

	/** 
	 * Index of column description
	 */
	protected static final int COLUMN_DESCRIPTION = 4;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column new_id
	 */
	protected static final int PK_COLUMN_NEW_ID = 1;

	/** 
	 * Inserts a new row in the news table.
	 */
	public NewsPk insert(News dto) throws NewsDaoException
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
			stmt.setInt( index++, dto.getNewId() );
			stmt.setString( index++, dto.getTitle() );
			stmt.setString( index++, dto.getImage() );
			stmt.setString( index++, dto.getDescription() );
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
				dto.setNewId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NewsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the news table.
	 */
	public void update(NewsPk pk, News dto) throws NewsDaoException
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
			stmt.setInt( index++, dto.getNewId() );
			stmt.setString( index++, dto.getTitle() );
			stmt.setString( index++, dto.getImage() );
			stmt.setString( index++, dto.getDescription() );
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			stmt.setInt( 6, pk.getNewId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NewsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the news table.
	 */
	public void delete(NewsPk pk) throws NewsDaoException
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
			stmt.setInt( 1, pk.getNewId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NewsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the news table that matches the specified primary-key value.
	 */
	public News findByPrimaryKey(NewsPk pk) throws NewsDaoException
	{
		return findByPrimaryKey( pk.getNewId() );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'new_id = :newId'.
	 */
	public News findByPrimaryKey(int newId) throws NewsDaoException
	{
		News ret[] = findByDynamicSelect( SQL_SELECT + " WHERE new_id = ?", new Object[] {  new Integer(newId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the news table that match the criteria ''.
	 */
	public News[] findAll() throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY new_id", null );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'event_id = :eventId'.
	 */
	public News[] findByEvents(int eventId) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'new_id = :newId'.
	 */
	public News[] findWhereNewIdEquals(int newId) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE new_id = ? ORDER BY new_id", new Object[] {  new Integer(newId) } );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'title = :title'.
	 */
	public News[] findWhereTitleEquals(String title) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE title = ? ORDER BY title", new Object[] { title } );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'image = :image'.
	 */
	public News[] findWhereImageEquals(String image) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE image = ? ORDER BY image", new Object[] { image } );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'description = :description'.
	 */
	public News[] findWhereDescriptionEquals(String description) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/** 
	 * Returns all rows from the news table that match the criteria 'event_id = :eventId'.
	 */
	public News[] findWhereEventIdEquals(int eventId) throws NewsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/**
	 * Method 'NewsDaoImpl'
	 * 
	 */
	public NewsDaoImpl()
	{
	}

	/**
	 * Method 'NewsDaoImpl'
	 * 
	 * @param userConn
	 */
	public NewsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.news";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected News fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			News dto = new News();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected News[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			News dto = new News();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		News ret[] = new News[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(News dto, ResultSet rs) throws SQLException
	{
		dto.setNewId( rs.getInt( COLUMN_NEW_ID ) );
		dto.setTitle( rs.getString( COLUMN_TITLE ) );
		dto.setImage( rs.getString( COLUMN_IMAGE ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(News dto)
	{
	}

	/** 
	 * Returns all rows from the news table that match the specified arbitrary SQL statement
	 */
	public News[] findByDynamicSelect(String sql, Object[] sqlParams) throws NewsDaoException
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
			throw new NewsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the news table that match the specified arbitrary SQL statement
	 */
	public News[] findByDynamicWhere(String sql, Object[] sqlParams) throws NewsDaoException
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
			throw new NewsDaoException( "Exception: " + _e.getMessage(), _e );
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
