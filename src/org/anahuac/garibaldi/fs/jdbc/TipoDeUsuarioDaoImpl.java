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

public class TipoDeUsuarioDaoImpl extends AbstractDAO implements TipoDeUsuarioDao
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
	protected final String SQL_SELECT = "SELECT tipo_de_usuario_id, Descripcion FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( tipo_de_usuario_id, Descripcion ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET tipo_de_usuario_id = ?, Descripcion = ? WHERE tipo_de_usuario_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE tipo_de_usuario_id = ?";

	/** 
	 * Index of column tipo_de_usuario_id
	 */
	protected static final int COLUMN_TIPO_DE_USUARIO_ID = 1;

	/** 
	 * Index of column Descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column tipo_de_usuario_id
	 */
	protected static final int PK_COLUMN_TIPO_DE_USUARIO_ID = 1;

	/** 
	 * Inserts a new row in the tipo_de_usuario table.
	 */
	public TipoDeUsuarioPk insert(TipoDeUsuario dto) throws TipoDeUsuarioDaoException
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
			stmt.setInt( index++, dto.getTipoDeUsuarioId() );
			stmt.setString( index++, dto.getDescripcion() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setTipoDeUsuarioId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the tipo_de_usuario table.
	 */
	public void update(TipoDeUsuarioPk pk, TipoDeUsuario dto) throws TipoDeUsuarioDaoException
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
			stmt.setInt( index++, dto.getTipoDeUsuarioId() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setInt( 3, pk.getTipoDeUsuarioId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the tipo_de_usuario table.
	 */
	public void delete(TipoDeUsuarioPk pk) throws TipoDeUsuarioDaoException
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
			stmt.setInt( 1, pk.getTipoDeUsuarioId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoDeUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the tipo_de_usuario table that matches the specified primary-key value.
	 */
	public TipoDeUsuario findByPrimaryKey(TipoDeUsuarioPk pk) throws TipoDeUsuarioDaoException
	{
		return findByPrimaryKey( pk.getTipoDeUsuarioId() );
	}

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'tipo_de_usuario_id = :tipoDeUsuarioId'.
	 */
	public TipoDeUsuario findByPrimaryKey(int tipoDeUsuarioId) throws TipoDeUsuarioDaoException
	{
		TipoDeUsuario ret[] = findByDynamicSelect( SQL_SELECT + " WHERE tipo_de_usuario_id = ?", new Object[] {  new Integer(tipoDeUsuarioId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria ''.
	 */
	public TipoDeUsuario[] findAll() throws TipoDeUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY tipo_de_usuario_id", null );
	}

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'tipo_de_usuario_id = :tipoDeUsuarioId'.
	 */
	public TipoDeUsuario[] findWhereTipoDeUsuarioIdEquals(int tipoDeUsuarioId) throws TipoDeUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo_de_usuario_id = ? ORDER BY tipo_de_usuario_id", new Object[] {  new Integer(tipoDeUsuarioId) } );
	}

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'Descripcion = :descripcion'.
	 */
	public TipoDeUsuario[] findWhereDescripcionEquals(String descripcion) throws TipoDeUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Descripcion = ? ORDER BY Descripcion", new Object[] { descripcion } );
	}

	/**
	 * Method 'TipoDeUsuarioDaoImpl'
	 * 
	 */
	public TipoDeUsuarioDaoImpl()
	{
	}

	/**
	 * Method 'TipoDeUsuarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public TipoDeUsuarioDaoImpl(final java.sql.Connection userConn)
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
		return "tipo_de_usuario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected TipoDeUsuario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			TipoDeUsuario dto = new TipoDeUsuario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected TipoDeUsuario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			TipoDeUsuario dto = new TipoDeUsuario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		TipoDeUsuario ret[] = new TipoDeUsuario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(TipoDeUsuario dto, ResultSet rs) throws SQLException
	{
		dto.setTipoDeUsuarioId( rs.getInt( COLUMN_TIPO_DE_USUARIO_ID ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(TipoDeUsuario dto)
	{
	}

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the specified arbitrary SQL statement
	 */
	public TipoDeUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoDeUsuarioDaoException
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
			throw new TipoDeUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the tipo_de_usuario table that match the specified arbitrary SQL statement
	 */
	public TipoDeUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoDeUsuarioDaoException
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
			throw new TipoDeUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
