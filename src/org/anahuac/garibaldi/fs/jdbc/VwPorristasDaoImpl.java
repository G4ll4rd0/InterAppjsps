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

public class VwPorristasDaoImpl extends AbstractDAO implements VwPorristasDao
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
	protected final String SQL_SELECT = "SELECT equipo_id, delegaciones_id, deporte_id, puntos, nombre, codigo, deporte FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column equipo_id
	 */
	protected static final int COLUMN_EQUIPO_ID = 1;

	/** 
	 * Index of column delegaciones_id
	 */
	protected static final int COLUMN_DELEGACIONES_ID = 2;

	/** 
	 * Index of column deporte_id
	 */
	protected static final int COLUMN_DEPORTE_ID = 3;

	/** 
	 * Index of column puntos
	 */
	protected static final int COLUMN_PUNTOS = 4;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 5;

	/** 
	 * Index of column codigo
	 */
	protected static final int COLUMN_CODIGO = 6;

	/** 
	 * Index of column deporte
	 */
	protected static final int COLUMN_DEPORTE = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria ''.
	 */
	public VwPorristas[] findAll() throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwPorristas[] findWhereEquipoIdEquals(int equipoId) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwPorristas[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE delegaciones_id = ? ORDER BY delegaciones_id", new Object[] {  new Integer(delegacionesId) } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPorristas[] findWhereDeporteIdEquals(int deporteId) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte_id = ? ORDER BY deporte_id", new Object[] {  new Integer(deporteId) } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'puntos = :puntos'.
	 */
	public VwPorristas[] findWherePuntosEquals(int puntos) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE puntos = ? ORDER BY puntos", new Object[] {  new Integer(puntos) } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'nombre = :nombre'.
	 */
	public VwPorristas[] findWhereNombreEquals(String nombre) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'codigo = :codigo'.
	 */
	public VwPorristas[] findWhereCodigoEquals(String codigo) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE codigo = ? ORDER BY codigo", new Object[] { codigo } );
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'deporte = :deporte'.
	 */
	public VwPorristas[] findWhereDeporteEquals(String deporte) throws VwPorristasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte = ? ORDER BY deporte", new Object[] { deporte } );
	}

	/**
	 * Method 'VwPorristasDaoImpl'
	 * 
	 */
	public VwPorristasDaoImpl()
	{
	}

	/**
	 * Method 'VwPorristasDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwPorristasDaoImpl(final java.sql.Connection userConn)
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
		return "vw_porristas";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwPorristas fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwPorristas dto = new VwPorristas();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwPorristas[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwPorristas dto = new VwPorristas();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwPorristas ret[] = new VwPorristas[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwPorristas dto, ResultSet rs) throws SQLException
	{
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
		dto.setDelegacionesId( rs.getInt( COLUMN_DELEGACIONES_ID ) );
		dto.setDeporteId( rs.getInt( COLUMN_DEPORTE_ID ) );
		dto.setPuntos( rs.getInt( COLUMN_PUNTOS ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setCodigo( rs.getString( COLUMN_CODIGO ) );
		dto.setDeporte( rs.getString( COLUMN_DEPORTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwPorristas dto)
	{
	}

	/** 
	 * Returns all rows from the vw_porristas table that match the specified arbitrary SQL statement
	 */
	public VwPorristas[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPorristasDaoException
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
			throw new VwPorristasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_porristas table that match the specified arbitrary SQL statement
	 */
	public VwPorristas[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPorristasDaoException
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
			throw new VwPorristasDaoException( "Exception: " + _e.getMessage(), _e );
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
