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

public class VwBJugadoresDaoImpl extends AbstractDAO implements VwBJugadoresDao
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
	protected final String SQL_SELECT = "SELECT jugadores_id, tipo_de_jugador_id, equipo_id, deporte_id, seccion_id, rama_id, Nombre, Primer_Apellido, Segundo_Apellido, Numero, tipo_jugador, deporte, seccion, rama, delegaciones_id, Delegacion_Codigo, Delegacion_Nombre FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column jugadores_id
	 */
	protected static final int COLUMN_JUGADORES_ID = 1;

	/** 
	 * Index of column tipo_de_jugador_id
	 */
	protected static final int COLUMN_TIPO_DE_JUGADOR_ID = 2;

	/** 
	 * Index of column equipo_id
	 */
	protected static final int COLUMN_EQUIPO_ID = 3;

	/** 
	 * Index of column deporte_id
	 */
	protected static final int COLUMN_DEPORTE_ID = 4;

	/** 
	 * Index of column seccion_id
	 */
	protected static final int COLUMN_SECCION_ID = 5;

	/** 
	 * Index of column rama_id
	 */
	protected static final int COLUMN_RAMA_ID = 6;

	/** 
	 * Index of column Nombre
	 */
	protected static final int COLUMN_NOMBRE = 7;

	/** 
	 * Index of column Primer_Apellido
	 */
	protected static final int COLUMN_PRIMER_APELLIDO = 8;

	/** 
	 * Index of column Segundo_Apellido
	 */
	protected static final int COLUMN_SEGUNDO_APELLIDO = 9;

	/** 
	 * Index of column Numero
	 */
	protected static final int COLUMN_NUMERO = 10;

	/** 
	 * Index of column tipo_jugador
	 */
	protected static final int COLUMN_TIPO_JUGADOR = 11;

	/** 
	 * Index of column deporte
	 */
	protected static final int COLUMN_DEPORTE = 12;

	/** 
	 * Index of column seccion
	 */
	protected static final int COLUMN_SECCION = 13;

	/** 
	 * Index of column rama
	 */
	protected static final int COLUMN_RAMA = 14;

	/** 
	 * Index of column delegaciones_id
	 */
	protected static final int COLUMN_DELEGACIONES_ID = 15;

	/** 
	 * Index of column Delegacion_Codigo
	 */
	protected static final int COLUMN_DELEGACION_CODIGO = 16;

	/** 
	 * Index of column Delegacion_Nombre
	 */
	protected static final int COLUMN_DELEGACION_NOMBRE = 17;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 17;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria ''.
	 */
	public VwBJugadores[] findAll() throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public VwBJugadores[] findWhereJugadoresIdEquals(int jugadoresId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE jugadores_id = ? ORDER BY jugadores_id", new Object[] {  new Integer(jugadoresId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public VwBJugadores[] findWhereTipoDeJugadorIdEquals(int tipoDeJugadorId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo_de_jugador_id = ? ORDER BY tipo_de_jugador_id", new Object[] {  new Integer(tipoDeJugadorId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwBJugadores[] findWhereEquipoIdEquals(int equipoId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwBJugadores[] findWhereDeporteIdEquals(int deporteId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte_id = ? ORDER BY deporte_id", new Object[] {  new Integer(deporteId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwBJugadores[] findWhereSeccionIdEquals(int seccionId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion_id = ? ORDER BY seccion_id", new Object[] {  new Integer(seccionId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwBJugadores[] findWhereRamaIdEquals(int ramaId) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama_id = ? ORDER BY rama_id", new Object[] {  new Integer(ramaId) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Nombre = :nombre'.
	 */
	public VwBJugadores[] findWhereNombreEquals(String nombre) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre = ? ORDER BY Nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Primer_Apellido = :primerApellido'.
	 */
	public VwBJugadores[] findWherePrimerApellidoEquals(String primerApellido) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Primer_Apellido = ? ORDER BY Primer_Apellido", new Object[] { primerApellido } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Segundo_Apellido = :segundoApellido'.
	 */
	public VwBJugadores[] findWhereSegundoApellidoEquals(String segundoApellido) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Segundo_Apellido = ? ORDER BY Segundo_Apellido", new Object[] { segundoApellido } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Numero = :numero'.
	 */
	public VwBJugadores[] findWhereNumeroEquals(int numero) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Numero = ? ORDER BY Numero", new Object[] {  new Integer(numero) } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'tipo_jugador = :tipoJugador'.
	 */
	public VwBJugadores[] findWhereTipoJugadorEquals(String tipoJugador) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo_jugador = ? ORDER BY tipo_jugador", new Object[] { tipoJugador } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'deporte = :deporte'.
	 */
	public VwBJugadores[] findWhereDeporteEquals(String deporte) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE deporte = ? ORDER BY deporte", new Object[] { deporte } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'seccion = :seccion'.
	 */
	public VwBJugadores[] findWhereSeccionEquals(String seccion) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE seccion = ? ORDER BY seccion", new Object[] { seccion } );
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'rama = :rama'.
	 */
	public VwBJugadores[] findWhereRamaEquals(String rama) throws VwBJugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rama = ? ORDER BY rama", new Object[] { rama } );
	}

	/**
	 * Method 'VwBJugadoresDaoImpl'
	 * 
	 */
	public VwBJugadoresDaoImpl()
	{
	}

	/**
	 * Method 'VwBJugadoresDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwBJugadoresDaoImpl(final java.sql.Connection userConn)
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
		return "vw_b_jugadores";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwBJugadores fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwBJugadores dto = new VwBJugadores();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwBJugadores[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwBJugadores dto = new VwBJugadores();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwBJugadores ret[] = new VwBJugadores[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwBJugadores dto, ResultSet rs) throws SQLException
	{
		dto.setJugadoresId( rs.getInt( COLUMN_JUGADORES_ID ) );
		dto.setTipoDeJugadorId( rs.getInt( COLUMN_TIPO_DE_JUGADOR_ID ) );
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
		dto.setDeporteId( rs.getInt( COLUMN_DEPORTE_ID ) );
		dto.setSeccionId( rs.getInt( COLUMN_SECCION_ID ) );
		dto.setRamaId( rs.getInt( COLUMN_RAMA_ID ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setPrimerApellido( rs.getString( COLUMN_PRIMER_APELLIDO ) );
		dto.setSegundoApellido( rs.getString( COLUMN_SEGUNDO_APELLIDO ) );
		dto.setNumero( rs.getInt( COLUMN_NUMERO ) );
		dto.setTipoJugador( rs.getString( COLUMN_TIPO_JUGADOR ) );
		dto.setDeporte( rs.getString( COLUMN_DEPORTE ) );
		dto.setSeccion( rs.getString( COLUMN_SECCION ) );
		dto.setRama( rs.getString( COLUMN_RAMA ) );
		dto.setDelegacionesId( rs.getInt( COLUMN_DELEGACIONES_ID ) );
		dto.setDelegacionCodigo( rs.getString( COLUMN_DELEGACION_CODIGO ) );
		dto.setDelegacionNombre( rs.getString( COLUMN_DELEGACION_NOMBRE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwBJugadores dto)
	{
	}

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the specified arbitrary SQL statement
	 */
	public VwBJugadores[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwBJugadoresDaoException
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
			throw new VwBJugadoresDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_b_jugadores table that match the specified arbitrary SQL statement
	 */
	public VwBJugadores[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwBJugadoresDaoException
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
			throw new VwBJugadoresDaoException( "Exception: " + _e.getMessage(), _e );
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
