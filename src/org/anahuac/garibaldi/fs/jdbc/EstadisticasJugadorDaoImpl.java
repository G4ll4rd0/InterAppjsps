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

public class EstadisticasJugadorDaoImpl extends AbstractDAO implements EstadisticasJugadorDao
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
	protected final String SQL_SELECT = "SELECT Goles, Puntos, Tarjetas_Am, Tarjetas_Ro, ID_J, partido_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Goles, Puntos, Tarjetas_Am, Tarjetas_Ro, ID_J, partido_id ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * Index of column Goles
	 */
	protected static final int COLUMN_GOLES = 1;

	/** 
	 * Index of column Puntos
	 */
	protected static final int COLUMN_PUNTOS = 2;

	/** 
	 * Index of column Tarjetas_Am
	 */
	protected static final int COLUMN_TARJETAS_AM = 3;

	/** 
	 * Index of column Tarjetas_Ro
	 */
	protected static final int COLUMN_TARJETAS_RO = 4;

	/** 
	 * Index of column ID_J
	 */
	protected static final int COLUMN_ID_J = 5;

	/** 
	 * Index of column partido_id
	 */
	protected static final int COLUMN_PARTIDO_ID = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Inserts a new row in the estadisticas_jugador table.
	 */
	public void insert(EstadisticasJugador dto) throws EstadisticasJugadorDaoException
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
			if (dto.isGolesNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getGoles() );
			}
		
			if (dto.isPuntosNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPuntos() );
			}
		
			if (dto.isTarjetasAmNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTarjetasAm() );
			}
		
			if (dto.isTarjetasRoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTarjetasRo() );
			}
		
			if (dto.isIdJNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdJ() );
			}
		
			if (dto.isPartidoIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getPartidoId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EstadisticasJugadorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria ''.
	 */
	public EstadisticasJugador[] findAll() throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public EstadisticasJugador[] findByJugadores(int idJ) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_J = ?", new Object[] {  new Integer(idJ) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'partido_id = :partidoId'.
	 */
	public EstadisticasJugador[] findByPartido(int partidoId) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE partido_id = ?", new Object[] {  new Integer(partidoId) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Goles = :goles'.
	 */
	public EstadisticasJugador[] findWhereGolesEquals(int goles) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Goles = ? ORDER BY Goles", new Object[] {  new Integer(goles) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Puntos = :puntos'.
	 */
	public EstadisticasJugador[] findWherePuntosEquals(int puntos) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Puntos = ? ORDER BY Puntos", new Object[] {  new Integer(puntos) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Tarjetas_Am = :tarjetasAm'.
	 */
	public EstadisticasJugador[] findWhereTarjetasAmEquals(int tarjetasAm) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Tarjetas_Am = ? ORDER BY Tarjetas_Am", new Object[] {  new Integer(tarjetasAm) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Tarjetas_Ro = :tarjetasRo'.
	 */
	public EstadisticasJugador[] findWhereTarjetasRoEquals(int tarjetasRo) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Tarjetas_Ro = ? ORDER BY Tarjetas_Ro", new Object[] {  new Integer(tarjetasRo) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public EstadisticasJugador[] findWhereIdJEquals(int idJ) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_J = ? ORDER BY ID_J", new Object[] {  new Integer(idJ) } );
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'partido_id = :partidoId'.
	 */
	public EstadisticasJugador[] findWherePartidoIdEquals(int partidoId) throws EstadisticasJugadorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE partido_id = ? ORDER BY partido_id", new Object[] {  new Integer(partidoId) } );
	}

	/**
	 * Method 'EstadisticasJugadorDaoImpl'
	 * 
	 */
	public EstadisticasJugadorDaoImpl()
	{
	}

	/**
	 * Method 'EstadisticasJugadorDaoImpl'
	 * 
	 * @param userConn
	 */
	public EstadisticasJugadorDaoImpl(final java.sql.Connection userConn)
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
		return "estadisticas_jugador";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EstadisticasJugador fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EstadisticasJugador dto = new EstadisticasJugador();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EstadisticasJugador[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EstadisticasJugador dto = new EstadisticasJugador();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EstadisticasJugador ret[] = new EstadisticasJugador[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EstadisticasJugador dto, ResultSet rs) throws SQLException
	{
		dto.setGoles( rs.getInt( COLUMN_GOLES ) );
		if (rs.wasNull()) {
			dto.setGolesNull( true );
		}
		
		dto.setPuntos( rs.getInt( COLUMN_PUNTOS ) );
		if (rs.wasNull()) {
			dto.setPuntosNull( true );
		}
		
		dto.setTarjetasAm( rs.getInt( COLUMN_TARJETAS_AM ) );
		if (rs.wasNull()) {
			dto.setTarjetasAmNull( true );
		}
		
		dto.setTarjetasRo( rs.getInt( COLUMN_TARJETAS_RO ) );
		if (rs.wasNull()) {
			dto.setTarjetasRoNull( true );
		}
		
		dto.setIdJ( rs.getInt( COLUMN_ID_J ) );
		if (rs.wasNull()) {
			dto.setIdJNull( true );
		}
		
		dto.setPartidoId( rs.getInt( COLUMN_PARTIDO_ID ) );
		if (rs.wasNull()) {
			dto.setPartidoIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EstadisticasJugador dto)
	{
	}

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the specified arbitrary SQL statement
	 */
	public EstadisticasJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws EstadisticasJugadorDaoException
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
			throw new EstadisticasJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the estadisticas_jugador table that match the specified arbitrary SQL statement
	 */
	public EstadisticasJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws EstadisticasJugadorDaoException
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
			throw new EstadisticasJugadorDaoException( "Exception: " + _e.getMessage(), _e );
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
