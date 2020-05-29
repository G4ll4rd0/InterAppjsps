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

public class TipoDeJugadorDaoImpl extends AbstractDAO implements TipoDeJugadorDao
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
	protected final String SQL_SELECT = "SELECT tipo_de_jugador_id, Descripcion FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( tipo_de_jugador_id, Descripcion ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET tipo_de_jugador_id = ?, Descripcion = ? WHERE tipo_de_jugador_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE tipo_de_jugador_id = ?";

	/** 
	 * Index of column tipo_de_jugador_id
	 */
	protected static final int COLUMN_TIPO_DE_JUGADOR_ID = 1;

	/** 
	 * Index of column Descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column tipo_de_jugador_id
	 */
	protected static final int PK_COLUMN_TIPO_DE_JUGADOR_ID = 1;

	/** 
	 * Inserts a new row in the tipo_de_jugador table.
	 */
	public TipoDeJugadorPk insert(TipoDeJugador dto) throws TipoDeJugadorDaoException
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
			stmt.setInt( index++, dto.getTipoDeJugadorId() );
			stmt.setString( index++, dto.getDescripcion() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setTipoDeJugadorId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeJugadorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the tipo_de_jugador table.
	 */
	public void update(TipoDeJugadorPk pk, TipoDeJugador dto) throws TipoDeJugadorDaoException
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
			stmt.setInt( index++, dto.getTipoDeJugadorId() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setInt( 3, pk.getTipoDeJugadorId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeJugadorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the tipo_de_jugador table.
	 */
	public void delete(TipoDeJugadorPk pk) throws TipoDeJugadorDaoException
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
			stmt.setInt( 1, pk.getTipoDeJugadorId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeJugadorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the tipo_de_jugador table that matches the specified primary-key value.
	 */
	public TipoDeJugador findByPrimaryKey(TipoDeJugadorPk pk) throws TipoDeJugadorDaoException
	{
		return findByPrimaryKey( pk.getTipoDeJugadorId() );
	}

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public TipoDeJugador findByPrimaryKey(int tipoDeJugadorId) throws TipoDeJugadorDaoException
	{
		TipoDeJugador ret[] = findByDynamicSelect( SQL_SELECT + " WHERE tipo_de_jugador_id = ?", new Object[] {  new Integer(tipoDeJugadorId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria ''.
	 */
	public TipoDeJugador[] findAll() throws TipoDeJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY tipo_de_jugador_id", null );
	}

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public TipoDeJugador[] findWhereTipoDeJugadorIdEquals(int tipoDeJugadorId) throws TipoDeJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo_de_jugador_id = ? ORDER BY tipo_de_jugador_id", new Object[] {  new Integer(tipoDeJugadorId) } );
	}

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'Descripcion = :descripcion'.
	 */
	public TipoDeJugador[] findWhereDescripcionEquals(String descripcion) throws TipoDeJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Descripcion = ? ORDER BY Descripcion", new Object[] { descripcion } );
	}

	/**
	 * Method 'TipoDeJugadorDaoImpl'
	 * 
	 */
	public TipoDeJugadorDaoImpl()
	{
	}

	/**
	 * Method 'TipoDeJugadorDaoImpl'
	 * 
	 * @param userConn
	 */
	public TipoDeJugadorDaoImpl(final java.sql.Connection userConn)
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
		return "tipo_de_jugador";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected TipoDeJugador fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			TipoDeJugador dto = new TipoDeJugador();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected TipoDeJugador[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			TipoDeJugador dto = new TipoDeJugador();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		TipoDeJugador ret[] = new TipoDeJugador[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(TipoDeJugador dto, ResultSet rs) throws SQLException
	{
		dto.setTipoDeJugadorId( rs.getInt( COLUMN_TIPO_DE_JUGADOR_ID ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(TipoDeJugador dto)
	{
	}

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the specified arbitrary SQL statement
	 */
	public TipoDeJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoDeJugadorDaoException
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
			throw new TipoDeJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the tipo_de_jugador table that match the specified arbitrary SQL statement
	 */
	public TipoDeJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoDeJugadorDaoException
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
			throw new TipoDeJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
