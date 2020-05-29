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

public class VwEquiposDaoImpl extends AbstractDAO implements VwEquiposDao
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
	protected final String SQL_SELECT = "SELECT Nombre, nombre_equipo, equipo_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column Nombre
	 */
	protected static final int COLUMN_NOMBRE = 1;

	/** 
	 * Index of column nombre_equipo
	 */
	protected static final int COLUMN_NOMBRE_EQUIPO = 2;

	/** 
	 * Index of column equipo_id
	 */
	protected static final int COLUMN_EQUIPO_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria ''.
	 */
	public VwEquipos[] findAll() throws VwEquiposDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'Nombre = :nombre'.
	 */
	public VwEquipos[] findWhereNombreEquals(String nombre) throws VwEquiposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre = ? ORDER BY Nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'nombre_equipo = :nombreEquipo'.
	 */
	public VwEquipos[] findWhereNombreEquipoEquals(String nombreEquipo) throws VwEquiposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre_equipo = ? ORDER BY nombre_equipo", new Object[] { nombreEquipo } );
	}

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwEquipos[] findWhereEquipoIdEquals(int equipoId) throws VwEquiposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/**
	 * Method 'VwEquiposDaoImpl'
	 * 
	 */
	public VwEquiposDaoImpl()
	{
	}

	/**
	 * Method 'VwEquiposDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwEquiposDaoImpl(final java.sql.Connection userConn)
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
		return "vw_equipos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwEquipos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwEquipos dto = new VwEquipos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwEquipos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwEquipos dto = new VwEquipos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwEquipos ret[] = new VwEquipos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwEquipos dto, ResultSet rs) throws SQLException
	{
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setNombreEquipo( rs.getString( COLUMN_NOMBRE_EQUIPO ) );
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwEquipos dto)
	{
	}

	/** 
	 * Returns all rows from the vw_equipos table that match the specified arbitrary SQL statement
	 */
	public VwEquipos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwEquiposDaoException
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
			throw new VwEquiposDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_equipos table that match the specified arbitrary SQL statement
	 */
	public VwEquipos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwEquiposDaoException
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
			throw new VwEquiposDaoException( "Exception: " + _e.getMessage(), _e );
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
