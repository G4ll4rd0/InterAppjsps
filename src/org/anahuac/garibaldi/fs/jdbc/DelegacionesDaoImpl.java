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

public class DelegacionesDaoImpl extends AbstractDAO implements DelegacionesDao
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
	protected final String SQL_SELECT = "SELECT delegaciones_id, Nombre, Codigo FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( delegaciones_id, Nombre, Codigo ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET delegaciones_id = ?, Nombre = ?, Codigo = ? WHERE delegaciones_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE delegaciones_id = ?";

	/** 
	 * Index of column delegaciones_id
	 */
	protected static final int COLUMN_DELEGACIONES_ID = 1;

	/** 
	 * Index of column Nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column Codigo
	 */
	protected static final int COLUMN_CODIGO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column delegaciones_id
	 */
	protected static final int PK_COLUMN_DELEGACIONES_ID = 1;

	/** 
	 * Inserts a new row in the delegaciones table.
	 */
	public DelegacionesPk insert(Delegaciones dto) throws DelegacionesDaoException
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
			stmt.setInt( index++, dto.getDelegacionesId() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getCodigo() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setDelegacionesId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DelegacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the delegaciones table.
	 */
	public void update(DelegacionesPk pk, Delegaciones dto) throws DelegacionesDaoException
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
			stmt.setInt( index++, dto.getDelegacionesId() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getCodigo() );
			stmt.setInt( 4, pk.getDelegacionesId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DelegacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the delegaciones table.
	 */
	public void delete(DelegacionesPk pk) throws DelegacionesDaoException
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
			stmt.setInt( 1, pk.getDelegacionesId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DelegacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the delegaciones table that matches the specified primary-key value.
	 */
	public Delegaciones findByPrimaryKey(DelegacionesPk pk) throws DelegacionesDaoException
	{
		return findByPrimaryKey( pk.getDelegacionesId() );
	}

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public Delegaciones findByPrimaryKey(int delegacionesId) throws DelegacionesDaoException
	{
		Delegaciones ret[] = findByDynamicSelect( SQL_SELECT + " WHERE delegaciones_id = ?", new Object[] {  new Integer(delegacionesId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the delegaciones table that match the criteria ''.
	 */
	public Delegaciones[] findAll() throws DelegacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY delegaciones_id", null );
	}

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public Delegaciones[] findWhereDelegacionesIdEquals(int delegacionesId) throws DelegacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE delegaciones_id = ? ORDER BY delegaciones_id", new Object[] {  new Integer(delegacionesId) } );
	}

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'Nombre = :nombre'.
	 */
	public Delegaciones[] findWhereNombreEquals(String nombre) throws DelegacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre = ? ORDER BY Nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'Codigo = :codigo'.
	 */
	public Delegaciones[] findWhereCodigoEquals(String codigo) throws DelegacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Codigo = ? ORDER BY Codigo", new Object[] { codigo } );
	}

	/**
	 * Method 'DelegacionesDaoImpl'
	 * 
	 */
	public DelegacionesDaoImpl()
	{
	}

	/**
	 * Method 'DelegacionesDaoImpl'
	 * 
	 * @param userConn
	 */
	public DelegacionesDaoImpl(final java.sql.Connection userConn)
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
		return "delegaciones";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Delegaciones fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Delegaciones dto = new Delegaciones();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Delegaciones[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Delegaciones dto = new Delegaciones();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Delegaciones ret[] = new Delegaciones[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Delegaciones dto, ResultSet rs) throws SQLException
	{
		dto.setDelegacionesId( rs.getInt( COLUMN_DELEGACIONES_ID ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setCodigo( rs.getString( COLUMN_CODIGO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Delegaciones dto)
	{
	}

	/** 
	 * Returns all rows from the delegaciones table that match the specified arbitrary SQL statement
	 */
	public Delegaciones[] findByDynamicSelect(String sql, Object[] sqlParams) throws DelegacionesDaoException
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
			throw new DelegacionesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the delegaciones table that match the specified arbitrary SQL statement
	 */
	public Delegaciones[] findByDynamicWhere(String sql, Object[] sqlParams) throws DelegacionesDaoException
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
			throw new DelegacionesDaoException( "Exception: " + _e.getMessage(), _e );
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
