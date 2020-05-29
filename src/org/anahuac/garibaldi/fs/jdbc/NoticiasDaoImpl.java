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

public class NoticiasDaoImpl extends AbstractDAO implements NoticiasDao
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
	protected final String SQL_SELECT = "SELECT noticias_ID, Titulo, Descripcion, desc_larga FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( noticias_ID, Titulo, Descripcion, desc_larga ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET noticias_ID = ?, Titulo = ?, Descripcion = ?, desc_larga = ? WHERE noticias_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE noticias_ID = ?";

	/** 
	 * Index of column noticias_ID
	 */
	protected static final int COLUMN_NOTICIAS_ID = 1;

	/** 
	 * Index of column Titulo
	 */
	protected static final int COLUMN_TITULO = 2;

	/** 
	 * Index of column Descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Index of column desc_larga
	 */
	protected static final int COLUMN_DESC_LARGA = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column noticias_ID
	 */
	protected static final int PK_COLUMN_NOTICIAS_ID = 1;

	/** 
	 * Inserts a new row in the noticias table.
	 */
	public NoticiasPk insert(Noticias dto) throws NoticiasDaoException
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
			stmt.setInt( index++, dto.getNoticiasId() );
			stmt.setString( index++, dto.getTitulo() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setString( index++, dto.getDescLarga() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setNoticiasId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NoticiasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the noticias table.
	 */
	public void update(NoticiasPk pk, Noticias dto) throws NoticiasDaoException
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
			stmt.setInt( index++, dto.getNoticiasId() );
			stmt.setString( index++, dto.getTitulo() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setString( index++, dto.getDescLarga() );
			stmt.setInt( 5, pk.getNoticiasId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NoticiasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the noticias table.
	 */
	public void delete(NoticiasPk pk) throws NoticiasDaoException
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
			stmt.setInt( 1, pk.getNoticiasId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NoticiasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the noticias table that matches the specified primary-key value.
	 */
	public Noticias findByPrimaryKey(NoticiasPk pk) throws NoticiasDaoException
	{
		return findByPrimaryKey( pk.getNoticiasId() );
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria 'noticias_ID = :noticiasId'.
	 */
	public Noticias findByPrimaryKey(int noticiasId) throws NoticiasDaoException
	{
		Noticias ret[] = findByDynamicSelect( SQL_SELECT + " WHERE noticias_ID = ?", new Object[] {  new Integer(noticiasId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria ''.
	 */
	public Noticias[] findAll() throws NoticiasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY noticias_ID", null );
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria 'noticias_ID = :noticiasId'.
	 */
	public Noticias[] findWhereNoticiasIdEquals(int noticiasId) throws NoticiasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE noticias_ID = ? ORDER BY noticias_ID", new Object[] {  new Integer(noticiasId) } );
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria 'Titulo = :titulo'.
	 */
	public Noticias[] findWhereTituloEquals(String titulo) throws NoticiasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Titulo = ? ORDER BY Titulo", new Object[] { titulo } );
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Noticias[] findWhereDescripcionEquals(String descripcion) throws NoticiasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Descripcion = ? ORDER BY Descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the noticias table that match the criteria 'desc_larga = :descLarga'.
	 */
	public Noticias[] findWhereDescLargaEquals(String descLarga) throws NoticiasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE desc_larga = ? ORDER BY desc_larga", new Object[] { descLarga } );
	}

	/**
	 * Method 'NoticiasDaoImpl'
	 * 
	 */
	public NoticiasDaoImpl()
	{
	}

	/**
	 * Method 'NoticiasDaoImpl'
	 * 
	 * @param userConn
	 */
	public NoticiasDaoImpl(final java.sql.Connection userConn)
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
		return "noticias";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Noticias fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Noticias dto = new Noticias();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Noticias[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Noticias dto = new Noticias();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Noticias ret[] = new Noticias[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Noticias dto, ResultSet rs) throws SQLException
	{
		dto.setNoticiasId( rs.getInt( COLUMN_NOTICIAS_ID ) );
		dto.setTitulo( rs.getString( COLUMN_TITULO ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setDescLarga( rs.getString( COLUMN_DESC_LARGA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Noticias dto)
	{
	}

	/** 
	 * Returns all rows from the noticias table that match the specified arbitrary SQL statement
	 */
	public Noticias[] findByDynamicSelect(String sql, Object[] sqlParams) throws NoticiasDaoException
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
			throw new NoticiasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the noticias table that match the specified arbitrary SQL statement
	 */
	public Noticias[] findByDynamicWhere(String sql, Object[] sqlParams) throws NoticiasDaoException
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
			throw new NoticiasDaoException( "Exception: " + _e.getMessage(), _e );
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
