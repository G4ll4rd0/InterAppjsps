/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.jdbc;

import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.factory.*;
import java.util.Date;
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

public class VwPartidosDaoImpl extends AbstractDAO implements VwPartidosDao
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
	protected final String SQL_SELECT = "SELECT partido_id, cancha_id, local_equipo_id, local_delegacion_id, visitante_equipo_id, visitante_delegacion_id, deporte_id, seccion_id, rama_id, fecha, hora, local_codigo_delegacion, local_nombre_delegacion, visitante_codigo_delegacion, visitante_nombre_delegacion, res_e1, res_e2, descripcion_cancha, descripcion_deporte, descripcion_seccion, descripcion_rama, ya_jugado FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column partido_id
	 */
	protected static final int COLUMN_PARTIDO_ID = 1;

	/** 
	 * Index of column cancha_id
	 */
	protected static final int COLUMN_CANCHA_ID = 2;

	/** 
	 * Index of column local_equipo_id
	 */
	protected static final int COLUMN_LOCAL_EQUIPO_ID = 3;

	/** 
	 * Index of column local_delegacion_id
	 */
	protected static final int COLUMN_LOCAL_DELEGACION_ID = 4;

	/** 
	 * Index of column visitante_equipo_id
	 */
	protected static final int COLUMN_VISITANTE_EQUIPO_ID = 5;

	/** 
	 * Index of column visitante_delegacion_id
	 */
	protected static final int COLUMN_VISITANTE_DELEGACION_ID = 6;

	/** 
	 * Index of column deporte_id
	 */
	protected static final int COLUMN_DEPORTE_ID = 7;

	/** 
	 * Index of column seccion_id
	 */
	protected static final int COLUMN_SECCION_ID = 8;

	/** 
	 * Index of column rama_id
	 */
	protected static final int COLUMN_RAMA_ID = 9;

	/** 
	 * Index of column fecha
	 */
	protected static final int COLUMN_FECHA = 10;

	/** 
	 * Index of column hora
	 */
	protected static final int COLUMN_HORA = 11;

	/** 
	 * Index of column local_codigo_delegacion
	 */
	protected static final int COLUMN_LOCAL_CODIGO_DELEGACION = 12;

	/** 
	 * Index of column local_nombre_delegacion
	 */
	protected static final int COLUMN_LOCAL_NOMBRE_DELEGACION = 13;

	/** 
	 * Index of column visitante_codigo_delegacion
	 */
	protected static final int COLUMN_VISITANTE_CODIGO_DELEGACION = 14;

	/** 
	 * Index of column visitante_nombre_delegacion
	 */
	protected static final int COLUMN_VISITANTE_NOMBRE_DELEGACION = 15;

	/** 
	 * Index of column res_e1
	 */
	protected static final int COLUMN_RES_E1 = 16;

	/** 
	 * Index of column res_e2
	 */
	protected static final int COLUMN_RES_E2 = 17;

	/** 
	 * Index of column descripcion_cancha
	 */
	protected static final int COLUMN_DESCRIPCION_CANCHA = 18;

	/** 
	 * Index of column descripcion_deporte
	 */
	protected static final int COLUMN_DESCRIPCION_DEPORTE = 19;

	/** 
	 * Index of column descripcion_seccion
	 */
	protected static final int COLUMN_DESCRIPCION_SECCION = 20;

	/** 
	 * Index of column descripcion_rama
	 */
	protected static final int COLUMN_DESCRIPCION_RAMA = 21;

	/** 
	 * Index of column ya_jugado
	 */
	protected static final int COLUMN_YA_JUGADO = 22;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 22;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria ''.
	 */
	public VwPartidos[] findAll() throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'partido_id = :partidoId'.
	 */
	public VwPartidos[] findWherePartidoIdEquals(int partidoId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE partido_id = ? ORDER BY partido_id", new Object[] {  new Integer(partidoId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'cancha_id = :canchaId'.
	 */
	public VwPartidos[] findWhereCanchaIdEquals(int canchaId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE cancha_id = ? ORDER BY cancha_id", new Object[] {  new Integer(canchaId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_equipo_id = :localEquipoId'.
	 */
	public VwPartidos[] findWhereLocalEquipoIdEquals(int localEquipoId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_equipo_id = ? ORDER BY local_equipo_id", new Object[] {  new Integer(localEquipoId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_delegacion_id = :localDelegacionId'.
	 */
	public VwPartidos[] findWhereLocalDelegacionIdEquals(int localDelegacionId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_delegacion_id = ? ORDER BY local_delegacion_id", new Object[] {  new Integer(localDelegacionId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_equipo_id = :visitanteEquipoId'.
	 */
	public VwPartidos[] findWhereVisitanteEquipoIdEquals(int visitanteEquipoId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_equipo_id = ? ORDER BY visitante_equipo_id", new Object[] {  new Integer(visitanteEquipoId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_delegacion_id = :visitanteDelegacionId'.
	 */
	public VwPartidos[] findWhereVisitanteDelegacionIdEquals(int visitanteDelegacionId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_delegacion_id = ? ORDER BY visitante_delegacion_id", new Object[] {  new Integer(visitanteDelegacionId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPartidos[] findWhereDeporteIdEquals(int deporteId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte_id = ? ORDER BY deporte_id", new Object[] {  new Integer(deporteId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwPartidos[] findWhereSeccionIdEquals(int seccionId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion_id = ? ORDER BY seccion_id", new Object[] {  new Integer(seccionId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwPartidos[] findWhereRamaIdEquals(int ramaId) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama_id = ? ORDER BY rama_id", new Object[] {  new Integer(ramaId) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'fecha = :fecha'.
	 */
	public VwPartidos[] findWhereFechaEquals(Date fecha) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha = ? ORDER BY fecha", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'hora = :hora'.
	 */
	public VwPartidos[] findWhereHoraEquals(Date hora) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE hora = ? ORDER BY hora", new Object[] { hora==null ? null : new java.sql.Time( hora.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_codigo_delegacion = :localCodigoDelegacion'.
	 */
	public VwPartidos[] findWhereLocalCodigoDelegacionEquals(String localCodigoDelegacion) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_codigo_delegacion = ? ORDER BY local_codigo_delegacion", new Object[] { localCodigoDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_nombre_delegacion = :localNombreDelegacion'.
	 */
	public VwPartidos[] findWhereLocalNombreDelegacionEquals(String localNombreDelegacion) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE local_nombre_delegacion = ? ORDER BY local_nombre_delegacion", new Object[] { localNombreDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_codigo_delegacion = :visitanteCodigoDelegacion'.
	 */
	public VwPartidos[] findWhereVisitanteCodigoDelegacionEquals(String visitanteCodigoDelegacion) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_codigo_delegacion = ? ORDER BY visitante_codigo_delegacion", new Object[] { visitanteCodigoDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_nombre_delegacion = :visitanteNombreDelegacion'.
	 */
	public VwPartidos[] findWhereVisitanteNombreDelegacionEquals(String visitanteNombreDelegacion) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE visitante_nombre_delegacion = ? ORDER BY visitante_nombre_delegacion", new Object[] { visitanteNombreDelegacion } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'res_e1 = :resE1'.
	 */
	public VwPartidos[] findWhereResE1Equals(int resE1) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE res_e1 = ? ORDER BY res_e1", new Object[] {  new Integer(resE1) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'res_e2 = :resE2'.
	 */
	public VwPartidos[] findWhereResE2Equals(int resE2) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE res_e2 = ? ORDER BY res_e2", new Object[] {  new Integer(resE2) } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_cancha = :descripcionCancha'.
	 */
	public VwPartidos[] findWhereDescripcionCanchaEquals(String descripcionCancha) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion_cancha = ? ORDER BY descripcion_cancha", new Object[] { descripcionCancha } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_deporte = :descripcionDeporte'.
	 */
	public VwPartidos[] findWhereDescripcionDeporteEquals(String descripcionDeporte) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion_deporte = ? ORDER BY descripcion_deporte", new Object[] { descripcionDeporte } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_seccion = :descripcionSeccion'.
	 */
	public VwPartidos[] findWhereDescripcionSeccionEquals(String descripcionSeccion) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion_seccion = ? ORDER BY descripcion_seccion", new Object[] { descripcionSeccion } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_rama = :descripcionRama'.
	 */
	public VwPartidos[] findWhereDescripcionRamaEquals(String descripcionRama) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion_rama = ? ORDER BY descripcion_rama", new Object[] { descripcionRama } );
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'ya_jugado = :yaJugado'.
	 */
	public VwPartidos[] findWhereYaJugadoEquals(int yaJugado) throws VwPartidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ya_jugado = ? ORDER BY ya_jugado", new Object[] {  new Integer(yaJugado) } );
	}

	/**
	 * Method 'VwPartidosDaoImpl'
	 * 
	 */
	public VwPartidosDaoImpl()
	{
	}

	/**
	 * Method 'VwPartidosDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwPartidosDaoImpl(final java.sql.Connection userConn)
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
		return "vw_partidos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwPartidos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwPartidos dto = new VwPartidos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwPartidos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwPartidos dto = new VwPartidos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwPartidos ret[] = new VwPartidos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwPartidos dto, ResultSet rs) throws SQLException
	{
		dto.setPartidoId( rs.getInt( COLUMN_PARTIDO_ID ) );
		dto.setCanchaId( rs.getInt( COLUMN_CANCHA_ID ) );
		dto.setLocalEquipoId( rs.getInt( COLUMN_LOCAL_EQUIPO_ID ) );
		dto.setLocalDelegacionId( rs.getInt( COLUMN_LOCAL_DELEGACION_ID ) );
		dto.setVisitanteEquipoId( rs.getInt( COLUMN_VISITANTE_EQUIPO_ID ) );
		dto.setVisitanteDelegacionId( rs.getInt( COLUMN_VISITANTE_DELEGACION_ID ) );
		dto.setDeporteId( rs.getInt( COLUMN_DEPORTE_ID ) );
		dto.setSeccionId( rs.getInt( COLUMN_SECCION_ID ) );
		dto.setRamaId( rs.getInt( COLUMN_RAMA_ID ) );
		dto.setFecha( rs.getDate(COLUMN_FECHA ) );
		dto.setHora( rs.getTime(COLUMN_HORA ) );
		dto.setLocalCodigoDelegacion( rs.getString( COLUMN_LOCAL_CODIGO_DELEGACION ) );
		dto.setLocalNombreDelegacion( rs.getString( COLUMN_LOCAL_NOMBRE_DELEGACION ) );
		dto.setVisitanteCodigoDelegacion( rs.getString( COLUMN_VISITANTE_CODIGO_DELEGACION ) );
		dto.setVisitanteNombreDelegacion( rs.getString( COLUMN_VISITANTE_NOMBRE_DELEGACION ) );
		dto.setResE1( rs.getInt( COLUMN_RES_E1 ) );
		if (rs.wasNull()) {
			dto.setResE1Null( true );
		}
		
		dto.setResE2( rs.getInt( COLUMN_RES_E2 ) );
		if (rs.wasNull()) {
			dto.setResE2Null( true );
		}
		
		dto.setDescripcionCancha( rs.getString( COLUMN_DESCRIPCION_CANCHA ) );
		dto.setDescripcionDeporte( rs.getString( COLUMN_DESCRIPCION_DEPORTE ) );
		dto.setDescripcionSeccion( rs.getString( COLUMN_DESCRIPCION_SECCION ) );
		dto.setDescripcionRama( rs.getString( COLUMN_DESCRIPCION_RAMA ) );
		dto.setYaJugado( rs.getInt( COLUMN_YA_JUGADO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwPartidos dto)
	{
	}

	/** 
	 * Returns all rows from the vw_partidos table that match the specified arbitrary SQL statement
	 */
	public VwPartidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPartidosDaoException
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
			throw new VwPartidosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_partidos table that match the specified arbitrary SQL statement
	 */
	public VwPartidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPartidosDaoException
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
			throw new VwPartidosDaoException( "Exception: " + _e.getMessage(), _e );
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
