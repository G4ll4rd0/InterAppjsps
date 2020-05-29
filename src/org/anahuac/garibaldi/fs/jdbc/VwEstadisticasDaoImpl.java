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

public class VwEstadisticasDaoImpl extends AbstractDAO implements VwEstadisticasDao
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
	protected final String SQL_SELECT = "SELECT id_j, equipo_id, delegaciones_id, deporte_id, rama_id, seccion_id, numero, nombre, primer_apellido, segundo_apellido, goles, tarjetas_amarillas, tarjetas_rojas, codigo, delegacion, deporte, seccion, rama, nombre_equipo FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column id_j
	 */
	protected static final int COLUMN_ID_J = 1;

	/** 
	 * Index of column equipo_id
	 */
	protected static final int COLUMN_EQUIPO_ID = 2;

	/** 
	 * Index of column delegaciones_id
	 */
	protected static final int COLUMN_DELEGACIONES_ID = 3;

	/** 
	 * Index of column deporte_id
	 */
	protected static final int COLUMN_DEPORTE_ID = 4;

	/** 
	 * Index of column rama_id
	 */
	protected static final int COLUMN_RAMA_ID = 5;

	/** 
	 * Index of column seccion_id
	 */
	protected static final int COLUMN_SECCION_ID = 6;

	/** 
	 * Index of column numero
	 */
	protected static final int COLUMN_NUMERO = 7;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 8;

	/** 
	 * Index of column primer_apellido
	 */
	protected static final int COLUMN_PRIMER_APELLIDO = 9;

	/** 
	 * Index of column segundo_apellido
	 */
	protected static final int COLUMN_SEGUNDO_APELLIDO = 10;

	/** 
	 * Index of column goles
	 */
	protected static final int COLUMN_GOLES = 11;

	/** 
	 * Index of column tarjetas_amarillas
	 */
	protected static final int COLUMN_TARJETAS_AMARILLAS = 12;

	/** 
	 * Index of column tarjetas_rojas
	 */
	protected static final int COLUMN_TARJETAS_ROJAS = 13;

	/** 
	 * Index of column codigo
	 */
	protected static final int COLUMN_CODIGO = 14;

	/** 
	 * Index of column delegacion
	 */
	protected static final int COLUMN_DELEGACION = 15;

	/** 
	 * Index of column deporte
	 */
	protected static final int COLUMN_DEPORTE = 16;

	/** 
	 * Index of column seccion
	 */
	protected static final int COLUMN_SECCION = 17;

	/** 
	 * Index of column rama
	 */
	protected static final int COLUMN_RAMA = 18;

	/** 
	 * Index of column nombre_equipo
	 */
	protected static final int COLUMN_NOMBRE_EQUIPO = 19;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 19;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria ''.
	 */
	public VwEstadisticas[] findAll() throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'id_j = :idJ'.
	 */
	public VwEstadisticas[] findWhereIdJEquals(int idJ) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_j = ? ORDER BY id_j", new Object[] {  new Integer(idJ) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwEstadisticas[] findWhereEquipoIdEquals(int equipoId) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwEstadisticas[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE delegaciones_id = ? ORDER BY delegaciones_id", new Object[] {  new Integer(delegacionesId) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwEstadisticas[] findWhereDeporteIdEquals(int deporteId) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte_id = ? ORDER BY deporte_id", new Object[] {  new Integer(deporteId) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwEstadisticas[] findWhereRamaIdEquals(int ramaId) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama_id = ? ORDER BY rama_id", new Object[] {  new Integer(ramaId) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwEstadisticas[] findWhereSeccionIdEquals(int seccionId) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion_id = ? ORDER BY seccion_id", new Object[] {  new Integer(seccionId) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'numero = :numero'.
	 */
	public VwEstadisticas[] findWhereNumeroEquals(int numero) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE numero = ? ORDER BY numero", new Object[] {  new Integer(numero) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'nombre = :nombre'.
	 */
	public VwEstadisticas[] findWhereNombreEquals(String nombre) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'primer_apellido = :primerApellido'.
	 */
	public VwEstadisticas[] findWherePrimerApellidoEquals(String primerApellido) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE primer_apellido = ? ORDER BY primer_apellido", new Object[] { primerApellido } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'segundo_apellido = :segundoApellido'.
	 */
	public VwEstadisticas[] findWhereSegundoApellidoEquals(String segundoApellido) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE segundo_apellido = ? ORDER BY segundo_apellido", new Object[] { segundoApellido } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'goles = :goles'.
	 */
	public VwEstadisticas[] findWhereGolesEquals(long goles) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE goles = ? ORDER BY goles", new Object[] {  new Long(goles) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'tarjetas_amarillas = :tarjetasAmarillas'.
	 */
	public VwEstadisticas[] findWhereTarjetasAmarillasEquals(long tarjetasAmarillas) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tarjetas_amarillas = ? ORDER BY tarjetas_amarillas", new Object[] {  new Long(tarjetasAmarillas) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'tarjetas_rojas = :tarjetasRojas'.
	 */
	public VwEstadisticas[] findWhereTarjetasRojasEquals(long tarjetasRojas) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tarjetas_rojas = ? ORDER BY tarjetas_rojas", new Object[] {  new Long(tarjetasRojas) } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'codigo = :codigo'.
	 */
	public VwEstadisticas[] findWhereCodigoEquals(String codigo) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE codigo = ? ORDER BY codigo", new Object[] { codigo } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'delegacion = :delegacion'.
	 */
	public VwEstadisticas[] findWhereDelegacionEquals(String delegacion) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE delegacion = ? ORDER BY delegacion", new Object[] { delegacion } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'deporte = :deporte'.
	 */
	public VwEstadisticas[] findWhereDeporteEquals(String deporte) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte = ? ORDER BY deporte", new Object[] { deporte } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'seccion = :seccion'.
	 */
	public VwEstadisticas[] findWhereSeccionEquals(String seccion) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion = ? ORDER BY seccion", new Object[] { seccion } );
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'rama = :rama'.
	 */
	public VwEstadisticas[] findWhereRamaEquals(String rama) throws VwEstadisticasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama = ? ORDER BY rama", new Object[] { rama } );
	}

	/**
	 * Method 'VwEstadisticasDaoImpl'
	 * 
	 */
	public VwEstadisticasDaoImpl()
	{
	}

	/**
	 * Method 'VwEstadisticasDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwEstadisticasDaoImpl(final java.sql.Connection userConn)
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
		return "vw_estadisticas";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwEstadisticas fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwEstadisticas dto = new VwEstadisticas();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwEstadisticas[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwEstadisticas dto = new VwEstadisticas();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwEstadisticas ret[] = new VwEstadisticas[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwEstadisticas dto, ResultSet rs) throws SQLException
	{
		dto.setIdJ( rs.getInt( COLUMN_ID_J ) );
		if (rs.wasNull()) {
			dto.setIdJNull( true );
		}
		
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
		dto.setDelegacionesId( rs.getInt( COLUMN_DELEGACIONES_ID ) );
		dto.setDeporteId( rs.getInt( COLUMN_DEPORTE_ID ) );
		dto.setRamaId( rs.getInt( COLUMN_RAMA_ID ) );
		dto.setSeccionId( rs.getInt( COLUMN_SECCION_ID ) );
		dto.setNumero( rs.getInt( COLUMN_NUMERO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setPrimerApellido( rs.getString( COLUMN_PRIMER_APELLIDO ) );
		dto.setSegundoApellido( rs.getString( COLUMN_SEGUNDO_APELLIDO ) );
		dto.setGoles( rs.getLong( COLUMN_GOLES ) );
		if (rs.wasNull()) {
			dto.setGolesNull( true );
		}
		
		dto.setTarjetasAmarillas( rs.getLong( COLUMN_TARJETAS_AMARILLAS ) );
		if (rs.wasNull()) {
			dto.setTarjetasAmarillasNull( true );
		}
		
		dto.setTarjetasRojas( rs.getLong( COLUMN_TARJETAS_ROJAS ) );
		if (rs.wasNull()) {
			dto.setTarjetasRojasNull( true );
		}
		
		dto.setCodigo( rs.getString( COLUMN_CODIGO ) );
		dto.setDelegacion( rs.getString( COLUMN_DELEGACION ) );
		dto.setDeporte( rs.getString( COLUMN_DEPORTE ) );
		dto.setSeccion( rs.getString( COLUMN_SECCION ) );
		dto.setRama( rs.getString( COLUMN_RAMA ) );
		dto.setNombreEquipo( rs.getString( COLUMN_NOMBRE_EQUIPO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwEstadisticas dto)
	{
	}

	/** 
	 * Returns all rows from the vw_estadisticas table that match the specified arbitrary SQL statement
	 */
	public VwEstadisticas[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwEstadisticasDaoException
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
			throw new VwEstadisticasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_estadisticas table that match the specified arbitrary SQL statement
	 */
	public VwEstadisticas[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwEstadisticasDaoException
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
			throw new VwEstadisticasDaoException( "Exception: " + _e.getMessage(), _e );
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
