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

public class HostsDaoImpl extends AbstractDAO implements HostsDao
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
	protected final String SQL_SELECT = "SELECT host_id, host_name, host_adress, host_phone, event_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( host_id, host_name, host_adress, host_phone, event_id ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET host_id = ?, host_name = ?, host_adress = ?, host_phone = ?, event_id = ? WHERE host_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE host_id = ?";

	/** 
	 * Index of column host_id
	 */
	protected static final int COLUMN_HOST_ID = 1;

	/** 
	 * Index of column host_name
	 */
	protected static final int COLUMN_HOST_NAME = 2;

	/** 
	 * Index of column host_adress
	 */
	protected static final int COLUMN_HOST_ADRESS = 3;

	/** 
	 * Index of column host_phone
	 */
	protected static final int COLUMN_HOST_PHONE = 4;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column host_id
	 */
	protected static final int PK_COLUMN_HOST_ID = 1;

	/** 
	 * Inserts a new row in the hosts table.
	 */
	public HostsPk insert(Hosts dto) throws HostsDaoException
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
			stmt.setInt( index++, dto.getHostId() );
			stmt.setString( index++, dto.getHostName() );
			stmt.setString( index++, dto.getHostAdress() );
			stmt.setString( index++, dto.getHostPhone() );
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
				dto.setHostId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HostsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the hosts table.
	 */
	public void update(HostsPk pk, Hosts dto) throws HostsDaoException
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
			stmt.setInt( index++, dto.getHostId() );
			stmt.setString( index++, dto.getHostName() );
			stmt.setString( index++, dto.getHostAdress() );
			stmt.setString( index++, dto.getHostPhone() );
			if (dto.isEventIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getEventId() );
			}
		
			stmt.setInt( 6, pk.getHostId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HostsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the hosts table.
	 */
	public void delete(HostsPk pk) throws HostsDaoException
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
			stmt.setInt( 1, pk.getHostId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HostsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the hosts table that matches the specified primary-key value.
	 */
	public Hosts findByPrimaryKey(HostsPk pk) throws HostsDaoException
	{
		return findByPrimaryKey( pk.getHostId() );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts findByPrimaryKey(int hostId) throws HostsDaoException
	{
		Hosts ret[] = findByDynamicSelect( SQL_SELECT + " WHERE host_id = ?", new Object[] {  new Integer(hostId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria ''.
	 */
	public Hosts[] findAll() throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY host_id", null );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'event_id = :eventId'.
	 */
	public Hosts[] findByEvents(int eventId) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ?", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts[] findWhereHostIdEquals(int hostId) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ? ORDER BY host_id", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_name = :hostName'.
	 */
	public Hosts[] findWhereHostNameEquals(String hostName) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_name = ? ORDER BY host_name", new Object[] { hostName } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_adress = :hostAdress'.
	 */
	public Hosts[] findWhereHostAdressEquals(String hostAdress) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_adress = ? ORDER BY host_adress", new Object[] { hostAdress } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_phone = :hostPhone'.
	 */
	public Hosts[] findWhereHostPhoneEquals(String hostPhone) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_phone = ? ORDER BY host_phone", new Object[] { hostPhone } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'event_id = :eventId'.
	 */
	public Hosts[] findWhereEventIdEquals(int eventId) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/**
	 * Method 'HostsDaoImpl'
	 * 
	 */
	public HostsDaoImpl()
	{
	}

	/**
	 * Method 'HostsDaoImpl'
	 * 
	 * @param userConn
	 */
	public HostsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.hosts";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Hosts fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Hosts dto = new Hosts();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Hosts[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Hosts dto = new Hosts();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Hosts ret[] = new Hosts[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Hosts dto, ResultSet rs) throws SQLException
	{
		dto.setHostId( rs.getInt( COLUMN_HOST_ID ) );
		dto.setHostName( rs.getString( COLUMN_HOST_NAME ) );
		dto.setHostAdress( rs.getString( COLUMN_HOST_ADRESS ) );
		dto.setHostPhone( rs.getString( COLUMN_HOST_PHONE ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		if (rs.wasNull()) {
			dto.setEventIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Hosts dto)
	{
	}

	/** 
	 * Returns all rows from the hosts table that match the specified arbitrary SQL statement
	 */
	public Hosts[] findByDynamicSelect(String sql, Object[] sqlParams) throws HostsDaoException
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
			throw new HostsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the hosts table that match the specified arbitrary SQL statement
	 */
	public Hosts[] findByDynamicWhere(String sql, Object[] sqlParams) throws HostsDaoException
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
			throw new HostsDaoException( "Exception: " + _e.getMessage(), _e );
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
