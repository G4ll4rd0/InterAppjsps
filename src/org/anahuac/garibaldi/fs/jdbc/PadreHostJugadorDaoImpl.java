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

public class PadreHostJugadorDaoImpl extends AbstractDAO implements PadreHostJugadorDao
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
	protected final String SQL_SELECT = "SELECT ID_J, ID_U, ID_H FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_J, ID_U, ID_H ) VALUES ( ?, ?, ? )";

	/** 
	 * Index of column ID_J
	 */
	protected static final int COLUMN_ID_J = 1;

	/** 
	 * Index of column ID_U
	 */
	protected static final int COLUMN_ID_U = 2;

	/** 
	 * Index of column ID_H
	 */
	protected static final int COLUMN_ID_H = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Inserts a new row in the padre_host_jugador table.
	 */
	public void insert(PadreHostJugador dto) throws PadreHostJugadorDaoException
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
			if (dto.isIdJNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdJ() );
			}
		
			if (dto.isIdUNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdU() );
			}
		
			if (dto.isIdHNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdH() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PadreHostJugadorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria ''.
	 */
	public PadreHostJugador[] findAll() throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_H = :idH'.
	 */
	public PadreHostJugador[] findByHosts(int idH) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_H = ?", new Object[] {  new Integer(idH) } );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public PadreHostJugador[] findByJugadores(int idJ) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_J = ?", new Object[] {  new Integer(idJ) } );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_U = :idU'.
	 */
	public PadreHostJugador[] findByUsuario(int idU) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_U = ?", new Object[] {  new Integer(idU) } );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public PadreHostJugador[] findWhereIdJEquals(int idJ) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_J = ? ORDER BY ID_J", new Object[] {  new Integer(idJ) } );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_U = :idU'.
	 */
	public PadreHostJugador[] findWhereIdUEquals(int idU) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_U = ? ORDER BY ID_U", new Object[] {  new Integer(idU) } );
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_H = :idH'.
	 */
	public PadreHostJugador[] findWhereIdHEquals(int idH) throws PadreHostJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_H = ? ORDER BY ID_H", new Object[] {  new Integer(idH) } );
	}

	/**
	 * Method 'PadreHostJugadorDaoImpl'
	 * 
	 */
	public PadreHostJugadorDaoImpl()
	{
	}

	/**
	 * Method 'PadreHostJugadorDaoImpl'
	 * 
	 * @param userConn
	 */
	public PadreHostJugadorDaoImpl(final java.sql.Connection userConn)
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
		return "padre_host_jugador";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected PadreHostJugador fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			PadreHostJugador dto = new PadreHostJugador();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected PadreHostJugador[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			PadreHostJugador dto = new PadreHostJugador();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		PadreHostJugador ret[] = new PadreHostJugador[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(PadreHostJugador dto, ResultSet rs) throws SQLException
	{
		dto.setIdJ( rs.getInt( COLUMN_ID_J ) );
		if (rs.wasNull()) {
			dto.setIdJNull( true );
		}
		
		dto.setIdU( rs.getInt( COLUMN_ID_U ) );
		if (rs.wasNull()) {
			dto.setIdUNull( true );
		}
		
		dto.setIdH( rs.getInt( COLUMN_ID_H ) );
		if (rs.wasNull()) {
			dto.setIdHNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(PadreHostJugador dto)
	{
	}

	/** 
	 * Returns all rows from the padre_host_jugador table that match the specified arbitrary SQL statement
	 */
	public PadreHostJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws PadreHostJugadorDaoException
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
			throw new PadreHostJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the padre_host_jugador table that match the specified arbitrary SQL statement
	 */
	public PadreHostJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws PadreHostJugadorDaoException
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
			throw new PadreHostJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
