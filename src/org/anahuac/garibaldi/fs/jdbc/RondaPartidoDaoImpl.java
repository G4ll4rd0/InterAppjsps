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

public class RondaPartidoDaoImpl extends AbstractDAO implements RondaPartidoDao
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
	protected final String SQL_SELECT = "SELECT ronda_id, Descripción FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ronda_id, Descripción ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ronda_id = ?, Descripción = ? WHERE ronda_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ronda_id = ?";

	/** 
	 * Index of column ronda_id
	 */
	protected static final int COLUMN_RONDA_ID = 1;

	/** 
	 * Index of column Descripción
	 */
	protected static final int COLUMN_DESCRIPCIÓN = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ronda_id
	 */
	protected static final int PK_COLUMN_RONDA_ID = 1;

	/** 
	 * Inserts a new row in the ronda_partido table.
	 */
	public RondaPartidoPk insert(RondaPartido dto) throws RondaPartidoDaoException
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
			stmt.setInt( index++, dto.getRondaId() );
			stmt.setString( index++, dto.getDescripción() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setRondaId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RondaPartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ronda_partido table.
	 */
	public void update(RondaPartidoPk pk, RondaPartido dto) throws RondaPartidoDaoException
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
			stmt.setInt( index++, dto.getRondaId() );
			stmt.setString( index++, dto.getDescripción() );
			stmt.setInt( 3, pk.getRondaId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RondaPartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ronda_partido table.
	 */
	public void delete(RondaPartidoPk pk) throws RondaPartidoDaoException
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
			stmt.setInt( 1, pk.getRondaId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RondaPartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ronda_partido table that matches the specified primary-key value.
	 */
	public RondaPartido findByPrimaryKey(RondaPartidoPk pk) throws RondaPartidoDaoException
	{
		return findByPrimaryKey( pk.getRondaId() );
	}

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondaPartido findByPrimaryKey(int rondaId) throws RondaPartidoDaoException
	{
		RondaPartido ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ?", new Object[] {  new Integer(rondaId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria ''.
	 */
	public RondaPartido[] findAll() throws RondaPartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ronda_id", null );
	}

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondaPartido[] findWhereRondaIdEquals(int rondaId) throws RondaPartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ? ORDER BY ronda_id", new Object[] {  new Integer(rondaId) } );
	}

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'Descripción = :descripción'.
	 */
	public RondaPartido[] findWhereDescripciónEquals(String descripción) throws RondaPartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Descripción = ? ORDER BY Descripción", new Object[] { descripción } );
	}

	/**
	 * Method 'RondaPartidoDaoImpl'
	 * 
	 */
	public RondaPartidoDaoImpl()
	{
	}

	/**
	 * Method 'RondaPartidoDaoImpl'
	 * 
	 * @param userConn
	 */
	public RondaPartidoDaoImpl(final java.sql.Connection userConn)
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
		return "ronda_partido";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected RondaPartido fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			RondaPartido dto = new RondaPartido();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected RondaPartido[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			RondaPartido dto = new RondaPartido();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		RondaPartido ret[] = new RondaPartido[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(RondaPartido dto, ResultSet rs) throws SQLException
	{
		dto.setRondaId( rs.getInt( COLUMN_RONDA_ID ) );
		dto.setDescripción( rs.getString( COLUMN_DESCRIPCIÓN ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(RondaPartido dto)
	{
	}

	/** 
	 * Returns all rows from the ronda_partido table that match the specified arbitrary SQL statement
	 */
	public RondaPartido[] findByDynamicSelect(String sql, Object[] sqlParams) throws RondaPartidoDaoException
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
			throw new RondaPartidoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ronda_partido table that match the specified arbitrary SQL statement
	 */
	public RondaPartido[] findByDynamicWhere(String sql, Object[] sqlParams) throws RondaPartidoDaoException
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
			throw new RondaPartidoDaoException( "Exception: " + _e.getMessage(), _e );
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
