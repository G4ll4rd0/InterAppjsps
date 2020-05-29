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

public class VwPuntosDaoImpl extends AbstractDAO implements VwPuntosDao
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
	protected final String SQL_SELECT = "SELECT equipo_id, delegaciones_id, deporte_id, seccion_id, rama_id, codigo, nombre, deporte, seccion, rama, puntos, pj, pg, pe, pp, gf, gc, diff FROM " + getTableName() + "";

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
	 * Index of column seccion_id
	 */
	protected static final int COLUMN_SECCION_ID = 4;

	/** 
	 * Index of column rama_id
	 */
	protected static final int COLUMN_RAMA_ID = 5;

	/** 
	 * Index of column codigo
	 */
	protected static final int COLUMN_CODIGO = 6;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 7;

	/** 
	 * Index of column deporte
	 */
	protected static final int COLUMN_DEPORTE = 8;

	/** 
	 * Index of column seccion
	 */
	protected static final int COLUMN_SECCION = 9;

	/** 
	 * Index of column rama
	 */
	protected static final int COLUMN_RAMA = 10;

	/** 
	 * Index of column puntos
	 */
	protected static final int COLUMN_PUNTOS = 11;

	/** 
	 * Index of column pj
	 */
	protected static final int COLUMN_PJ = 12;

	/** 
	 * Index of column pg
	 */
	protected static final int COLUMN_PG = 13;

	/** 
	 * Index of column pe
	 */
	protected static final int COLUMN_PE = 14;

	/** 
	 * Index of column pp
	 */
	protected static final int COLUMN_PP = 15;

	/** 
	 * Index of column gf
	 */
	protected static final int COLUMN_GF = 16;

	/** 
	 * Index of column gc
	 */
	protected static final int COLUMN_GC = 17;

	/** 
	 * Index of column diff
	 */
	protected static final int COLUMN_DIFF = 18;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 18;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria ''.
	 */
	public VwPuntos[] findAll() throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwPuntos[] findWhereEquipoIdEquals(int equipoId) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwPuntos[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE delegaciones_id = ? ORDER BY delegaciones_id", new Object[] {  new Integer(delegacionesId) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPuntos[] findWhereDeporteIdEquals(int deporteId) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte_id = ? ORDER BY deporte_id", new Object[] {  new Integer(deporteId) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwPuntos[] findWhereSeccionIdEquals(int seccionId) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion_id = ? ORDER BY seccion_id", new Object[] {  new Integer(seccionId) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwPuntos[] findWhereRamaIdEquals(int ramaId) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama_id = ? ORDER BY rama_id", new Object[] {  new Integer(ramaId) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'codigo = :codigo'.
	 */
	public VwPuntos[] findWhereCodigoEquals(String codigo) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE codigo = ? ORDER BY codigo", new Object[] { codigo } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'nombre = :nombre'.
	 */
	public VwPuntos[] findWhereNombreEquals(String nombre) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'deporte = :deporte'.
	 */
	public VwPuntos[] findWhereDeporteEquals(String deporte) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte = ? ORDER BY deporte", new Object[] { deporte } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'seccion = :seccion'.
	 */
	public VwPuntos[] findWhereSeccionEquals(String seccion) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion = ? ORDER BY seccion", new Object[] { seccion } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'rama = :rama'.
	 */
	public VwPuntos[] findWhereRamaEquals(String rama) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama = ? ORDER BY rama", new Object[] { rama } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'puntos = :puntos'.
	 */
	public VwPuntos[] findWherePuntosEquals(long puntos) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE puntos = ? ORDER BY puntos", new Object[] {  new Long(puntos) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pj = :pj'.
	 */
	public VwPuntos[] findWherePjEquals(long pj) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pj = ? ORDER BY pj", new Object[] {  new Long(pj) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pg = :pg'.
	 */
	public VwPuntos[] findWherePgEquals(long pg) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pg = ? ORDER BY pg", new Object[] {  new Long(pg) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pe = :pe'.
	 */
	public VwPuntos[] findWherePeEquals(long pe) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pe = ? ORDER BY pe", new Object[] {  new Long(pe) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pp = :pp'.
	 */
	public VwPuntos[] findWherePpEquals(long pp) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pp = ? ORDER BY pp", new Object[] {  new Long(pp) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'gf = :gf'.
	 */
	public VwPuntos[] findWhereGfEquals(long gf) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE gf = ? ORDER BY gf", new Object[] {  new Long(gf) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'gc = :gc'.
	 */
	public VwPuntos[] findWhereGcEquals(long gc) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE gc = ? ORDER BY gc", new Object[] {  new Long(gc) } );
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'diff = :diff'.
	 */
	public VwPuntos[] findWhereDiffEquals(long diff) throws VwPuntosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE diff = ? ORDER BY diff", new Object[] {  new Long(diff) } );
	}

	/**
	 * Method 'VwPuntosDaoImpl'
	 * 
	 */
	public VwPuntosDaoImpl()
	{
	}

	/**
	 * Method 'VwPuntosDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwPuntosDaoImpl(final java.sql.Connection userConn)
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
		return "vw_puntos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwPuntos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwPuntos dto = new VwPuntos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwPuntos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwPuntos dto = new VwPuntos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwPuntos ret[] = new VwPuntos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwPuntos dto, ResultSet rs) throws SQLException
	{
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
		if (rs.wasNull()) {
			dto.setEquipoIdNull( true );
		}
		
		dto.setDelegacionesId( rs.getInt( COLUMN_DELEGACIONES_ID ) );
		dto.setDeporteId( rs.getInt( COLUMN_DEPORTE_ID ) );
		dto.setSeccionId( rs.getInt( COLUMN_SECCION_ID ) );
		dto.setRamaId( rs.getInt( COLUMN_RAMA_ID ) );
		dto.setCodigo( rs.getString( COLUMN_CODIGO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDeporte( rs.getString( COLUMN_DEPORTE ) );
		dto.setSeccion( rs.getString( COLUMN_SECCION ) );
		dto.setRama( rs.getString( COLUMN_RAMA ) );
		dto.setPuntos( rs.getLong( COLUMN_PUNTOS ) );
		if (rs.wasNull()) {
			dto.setPuntosNull( true );
		}
		
		dto.setPj( rs.getLong( COLUMN_PJ ) );
		if (rs.wasNull()) {
			dto.setPjNull( true );
		}
		
		dto.setPg( rs.getLong( COLUMN_PG ) );
		if (rs.wasNull()) {
			dto.setPgNull( true );
		}
		
		dto.setPe( rs.getLong( COLUMN_PE ) );
		if (rs.wasNull()) {
			dto.setPeNull( true );
		}
		
		dto.setPp( rs.getLong( COLUMN_PP ) );
		if (rs.wasNull()) {
			dto.setPpNull( true );
		}
		
		dto.setGf( rs.getLong( COLUMN_GF ) );
		if (rs.wasNull()) {
			dto.setGfNull( true );
		}
		
		dto.setGc( rs.getLong( COLUMN_GC ) );
		if (rs.wasNull()) {
			dto.setGcNull( true );
		}
		
		dto.setDiff( rs.getLong( COLUMN_DIFF ) );
		if (rs.wasNull()) {
			dto.setDiffNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwPuntos dto)
	{
	}

	/** 
	 * Returns all rows from the vw_puntos table that match the specified arbitrary SQL statement
	 */
	public VwPuntos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPuntosDaoException
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
			throw new VwPuntosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_puntos table that match the specified arbitrary SQL statement
	 */
	public VwPuntos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPuntosDaoException
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
			throw new VwPuntosDaoException( "Exception: " + _e.getMessage(), _e );
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
