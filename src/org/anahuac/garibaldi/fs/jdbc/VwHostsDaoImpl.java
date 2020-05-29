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

public class VwHostsDaoImpl extends AbstractDAO implements VwHostsDao
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
	protected final String SQL_SELECT = "SELECT jugador_id, padre_id, padre_seed, host_id, host_nombre, host_direccion, host_telefono, nombre_jugador FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column jugador_id
	 */
	protected static final int COLUMN_JUGADOR_ID = 1;

	/** 
	 * Index of column padre_id
	 */
	protected static final int COLUMN_PADRE_ID = 2;

	/** 
	 * Index of column padre_seed
	 */
	protected static final int COLUMN_PADRE_SEED = 3;

	/** 
	 * Index of column host_id
	 */
	protected static final int COLUMN_HOST_ID = 4;

	/** 
	 * Index of column host_nombre
	 */
	protected static final int COLUMN_HOST_NOMBRE = 5;

	/** 
	 * Index of column host_direccion
	 */
	protected static final int COLUMN_HOST_DIRECCION = 6;

	/** 
	 * Index of column host_telefono
	 */
	protected static final int COLUMN_HOST_TELEFONO = 7;

	/** 
	 * Index of column nombre_jugador
	 */
	protected static final int COLUMN_NOMBRE_JUGADOR = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria ''.
	 */
	public VwHosts[] findAll() throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'jugador_id = :jugadorId'.
	 */
	public VwHosts[] findWhereJugadorIdEquals(int jugadorId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE jugador_id = ? ORDER BY jugador_id", new Object[] {  new Integer(jugadorId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'padre_id = :padreId'.
	 */
	public VwHosts[] findWherePadreIdEquals(int padreId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE padre_id = ? ORDER BY padre_id", new Object[] {  new Integer(padreId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'padre_seed = :padreSeed'.
	 */
	public VwHosts[] findWherePadreSeedEquals(String padreSeed) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE padre_seed = ? ORDER BY padre_seed", new Object[] { padreSeed } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_id = :hostId'.
	 */
	public VwHosts[] findWhereHostIdEquals(int hostId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ? ORDER BY host_id", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_nombre = :hostNombre'.
	 */
	public VwHosts[] findWhereHostNombreEquals(String hostNombre) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_nombre = ? ORDER BY host_nombre", new Object[] { hostNombre } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_direccion = :hostDireccion'.
	 */
	public VwHosts[] findWhereHostDireccionEquals(String hostDireccion) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_direccion = ? ORDER BY host_direccion", new Object[] { hostDireccion } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_telefono = :hostTelefono'.
	 */
	public VwHosts[] findWhereHostTelefonoEquals(String hostTelefono) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_telefono = ? ORDER BY host_telefono", new Object[] { hostTelefono } );
	}

	/**
	 * Method 'VwHostsDaoImpl'
	 * 
	 */
	public VwHostsDaoImpl()
	{
	}

	/**
	 * Method 'VwHostsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwHostsDaoImpl(final java.sql.Connection userConn)
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
		return "vw_hosts";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwHosts fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwHosts dto = new VwHosts();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwHosts[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwHosts dto = new VwHosts();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwHosts ret[] = new VwHosts[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwHosts dto, ResultSet rs) throws SQLException
	{
		dto.setJugadorId( rs.getInt( COLUMN_JUGADOR_ID ) );
		if (rs.wasNull()) {
			dto.setJugadorIdNull( true );
		}
		
		dto.setPadreId( rs.getInt( COLUMN_PADRE_ID ) );
		if (rs.wasNull()) {
			dto.setPadreIdNull( true );
		}
		
		dto.setPadreSeed( rs.getString( COLUMN_PADRE_SEED ) );
		dto.setHostId( rs.getInt( COLUMN_HOST_ID ) );
		if (rs.wasNull()) {
			dto.setHostIdNull( true );
		}
		
		dto.setHostNombre( rs.getString( COLUMN_HOST_NOMBRE ) );
		dto.setHostDireccion( rs.getString( COLUMN_HOST_DIRECCION ) );
		dto.setHostTelefono( rs.getString( COLUMN_HOST_TELEFONO ) );
		dto.setNombreJugador( rs.getString( COLUMN_NOMBRE_JUGADOR ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwHosts dto)
	{
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwHostsDaoException
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
			throw new VwHostsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwHostsDaoException
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
			throw new VwHostsDaoException( "Exception: " + _e.getMessage(), _e );
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
