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

public class DeporteActivoDaoImpl extends AbstractDAO implements DeporteActivoDao
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
	protected final String SQL_SELECT = "SELECT ID_De, ID_S FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_De, ID_S ) VALUES ( ?, ? )";

	/** 
	 * Index of column ID_De
	 */
	protected static final int COLUMN_ID_DE = 1;

	/** 
	 * Index of column ID_S
	 */
	protected static final int COLUMN_ID_S = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Inserts a new row in the deporte_activo table.
	 */
	public void insert(DeporteActivo dto) throws DeporteActivoDaoException
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
			if (dto.isIdDeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdDe() );
			}
		
			if (dto.isIdSNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdS() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DeporteActivoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria ''.
	 */
	public DeporteActivo[] findAll() throws DeporteActivoDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_De = :idDe'.
	 */
	public DeporteActivo[] findByDeporte(int idDe) throws DeporteActivoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ?", new Object[] {  new Integer(idDe) } );
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_S = :idS'.
	 */
	public DeporteActivo[] findBySeccion(int idS) throws DeporteActivoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_S = ?", new Object[] {  new Integer(idS) } );
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_De = :idDe'.
	 */
	public DeporteActivo[] findWhereIdDeEquals(int idDe) throws DeporteActivoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ? ORDER BY ID_De", new Object[] {  new Integer(idDe) } );
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_S = :idS'.
	 */
	public DeporteActivo[] findWhereIdSEquals(int idS) throws DeporteActivoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_S = ? ORDER BY ID_S", new Object[] {  new Integer(idS) } );
	}

	/**
	 * Method 'DeporteActivoDaoImpl'
	 * 
	 */
	public DeporteActivoDaoImpl()
	{
	}

	/**
	 * Method 'DeporteActivoDaoImpl'
	 * 
	 * @param userConn
	 */
	public DeporteActivoDaoImpl(final java.sql.Connection userConn)
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
		return "deporte_activo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DeporteActivo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DeporteActivo dto = new DeporteActivo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DeporteActivo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DeporteActivo dto = new DeporteActivo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DeporteActivo ret[] = new DeporteActivo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DeporteActivo dto, ResultSet rs) throws SQLException
	{
		dto.setIdDe( rs.getInt( COLUMN_ID_DE ) );
		if (rs.wasNull()) {
			dto.setIdDeNull( true );
		}
		
		dto.setIdS( rs.getInt( COLUMN_ID_S ) );
		if (rs.wasNull()) {
			dto.setIdSNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DeporteActivo dto)
	{
	}

	/** 
	 * Returns all rows from the deporte_activo table that match the specified arbitrary SQL statement
	 */
	public DeporteActivo[] findByDynamicSelect(String sql, Object[] sqlParams) throws DeporteActivoDaoException
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
			throw new DeporteActivoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the deporte_activo table that match the specified arbitrary SQL statement
	 */
	public DeporteActivo[] findByDynamicWhere(String sql, Object[] sqlParams) throws DeporteActivoDaoException
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
			throw new DeporteActivoDaoException( "Exception: " + _e.getMessage(), _e );
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
