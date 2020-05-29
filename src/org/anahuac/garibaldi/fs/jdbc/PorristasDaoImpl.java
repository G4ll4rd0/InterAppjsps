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

public class PorristasDaoImpl extends AbstractDAO implements PorristasDao
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
	protected final String SQL_SELECT = "SELECT ID_E, puntos FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_E, puntos ) VALUES ( ?, ? )";

	/** 
	 * Index of column ID_E
	 */
	protected static final int COLUMN_ID_E = 1;

	/** 
	 * Index of column puntos
	 */
	protected static final int COLUMN_PUNTOS = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Inserts a new row in the porristas table.
	 */
	public void insert(Porristas dto) throws PorristasDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdE() );
			stmt.setInt( index++, dto.getPuntos() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PorristasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the porristas table that match the criteria ''.
	 */
	public Porristas[] findAll() throws PorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the porristas table that match the criteria 'ID_E = :idE'.
	 */
	public Porristas[] findByEquipo(int idE) throws PorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_E = ?", new Object[] {  new Integer(idE) } );
	}

	/** 
	 * Returns all rows from the porristas table that match the criteria 'ID_E = :idE'.
	 */
	public Porristas[] findWhereIdEEquals(int idE) throws PorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_E = ? ORDER BY ID_E", new Object[] {  new Integer(idE) } );
	}

	/** 
	 * Returns all rows from the porristas table that match the criteria 'puntos = :puntos'.
	 */
	public Porristas[] findWherePuntosEquals(int puntos) throws PorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE puntos = ? ORDER BY puntos", new Object[] {  new Integer(puntos) } );
	}

	/**
	 * Method 'PorristasDaoImpl'
	 * 
	 */
	public PorristasDaoImpl()
	{
	}

	/**
	 * Method 'PorristasDaoImpl'
	 * 
	 * @param userConn
	 */
	public PorristasDaoImpl(final java.sql.Connection userConn)
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
		return "porristas";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Porristas fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Porristas dto = new Porristas();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Porristas[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Porristas dto = new Porristas();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Porristas ret[] = new Porristas[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Porristas dto, ResultSet rs) throws SQLException
	{
		dto.setIdE( rs.getInt( COLUMN_ID_E ) );
		dto.setPuntos( rs.getInt( COLUMN_PUNTOS ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Porristas dto)
	{
	}

	/** 
	 * Returns all rows from the porristas table that match the specified arbitrary SQL statement
	 */
	public Porristas[] findByDynamicSelect(String sql, Object[] sqlParams) throws PorristasDaoException
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
			throw new PorristasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the porristas table that match the specified arbitrary SQL statement
	 */
	public Porristas[] findByDynamicWhere(String sql, Object[] sqlParams) throws PorristasDaoException
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
			throw new PorristasDaoException( "Exception: " + _e.getMessage(), _e );
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
