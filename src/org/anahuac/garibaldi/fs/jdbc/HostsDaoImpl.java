/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.jdbc;

import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.factory.*;
import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;
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
	protected final String SQL_SELECT = "SELECT host_id, nombre, direccion, telefono FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( host_id, nombre, direccion, telefono ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET host_id = ?, nombre = ?, direccion = ?, telefono = ? WHERE host_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE host_id = ?";

	/** 
	 * Index of column host_id
	 */
	protected static final int COLUMN_HOST_ID = 1;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column direccion
	 */
	protected static final int COLUMN_DIRECCION = 3;

	/** 
	 * Index of column telefono
	 */
	protected static final int COLUMN_TELEFONO = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

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
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
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
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
			stmt.setInt( 5, pk.getHostId() );
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
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts[] findWhereHostIdEquals(int hostId) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ? ORDER BY host_id", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'nombre = :nombre'.
	 */
	public Hosts[] findWhereNombreEquals(String nombre) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'direccion = :direccion'.
	 */
	public Hosts[] findWhereDireccionEquals(String direccion) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE direccion = ? ORDER BY direccion", new Object[] { direccion } );
	}

	/** 
	 * Returns all rows from the hosts table that match the criteria 'telefono = :telefono'.
	 */
	public Hosts[] findWhereTelefonoEquals(String telefono) throws HostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE telefono = ? ORDER BY telefono", new Object[] { telefono } );
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
		return "hosts";
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
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDireccion( rs.getString( COLUMN_DIRECCION ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
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
