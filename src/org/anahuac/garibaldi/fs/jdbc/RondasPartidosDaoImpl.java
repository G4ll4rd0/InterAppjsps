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

public class RondasPartidosDaoImpl extends AbstractDAO implements RondasPartidosDao
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
	 * Inserts a new row in the rondas_partidos table.
	 */
	public RondasPartidosPk insert(RondasPartidos dto) throws RondasPartidosDaoException
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
			throw new RondasPartidosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the rondas_partidos table.
	 */
	public void update(RondasPartidosPk pk, RondasPartidos dto) throws RondasPartidosDaoException
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
			throw new RondasPartidosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the rondas_partidos table.
	 */
	public void delete(RondasPartidosPk pk) throws RondasPartidosDaoException
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
			throw new RondasPartidosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the rondas_partidos table that matches the specified primary-key value.
	 */
	public RondasPartidos findByPrimaryKey(RondasPartidosPk pk) throws RondasPartidosDaoException
	{
		return findByPrimaryKey( pk.getRondaId() );
	}

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasPartidos findByPrimaryKey(int rondaId) throws RondasPartidosDaoException
	{
		RondasPartidos ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ?", new Object[] {  new Integer(rondaId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria ''.
	 */
	public RondasPartidos[] findAll() throws RondasPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ronda_id", null );
	}

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasPartidos[] findWhereRondaIdEquals(int rondaId) throws RondasPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ? ORDER BY ronda_id", new Object[] {  new Integer(rondaId) } );
	}

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'Descripción = :descripción'.
	 */
	public RondasPartidos[] findWhereDescripciónEquals(String descripción) throws RondasPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Descripción = ? ORDER BY Descripción", new Object[] { descripción } );
	}

	/**
	 * Method 'RondasPartidosDaoImpl'
	 * 
	 */
	public RondasPartidosDaoImpl()
	{
	}

	/**
	 * Method 'RondasPartidosDaoImpl'
	 * 
	 * @param userConn
	 */
	public RondasPartidosDaoImpl(final java.sql.Connection userConn)
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
		return "rondas_partidos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected RondasPartidos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			RondasPartidos dto = new RondasPartidos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected RondasPartidos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			RondasPartidos dto = new RondasPartidos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		RondasPartidos ret[] = new RondasPartidos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(RondasPartidos dto, ResultSet rs) throws SQLException
	{
		dto.setRondaId( rs.getInt( COLUMN_RONDA_ID ) );
		dto.setDescripción( rs.getString( COLUMN_DESCRIPCIÓN ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(RondasPartidos dto)
	{
	}

	/** 
	 * Returns all rows from the rondas_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasPartidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws RondasPartidosDaoException
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
			throw new RondasPartidosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the rondas_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasPartidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws RondasPartidosDaoException
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
			throw new RondasPartidosDaoException( "Exception: " + _e.getMessage(), _e );
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
