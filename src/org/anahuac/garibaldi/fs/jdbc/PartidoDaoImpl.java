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

public class PartidoDaoImpl extends AbstractDAO implements PartidoDao
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
	protected final String SQL_SELECT = "SELECT partido_id, Fecha, ID_Eq2, Res_E1, Res_E2, ID_C, ID_Eq, YaJugado, Hora, ronda_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( partido_id, Fecha, ID_Eq2, Res_E1, Res_E2, ID_C, ID_Eq, YaJugado, Hora, ronda_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET partido_id = ?, Fecha = ?, ID_Eq2 = ?, Res_E1 = ?, Res_E2 = ?, ID_C = ?, ID_Eq = ?, YaJugado = ?, Hora = ?, ronda_id = ? WHERE partido_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE partido_id = ?";

	/** 
	 * Index of column partido_id
	 */
	protected static final int COLUMN_PARTIDO_ID = 1;

	/** 
	 * Index of column Fecha
	 */
	protected static final int COLUMN_FECHA = 2;

	/** 
	 * Index of column ID_Eq2
	 */
	protected static final int COLUMN_ID_EQ2 = 3;

	/** 
	 * Index of column Res_E1
	 */
	protected static final int COLUMN_RES_E1 = 4;

	/** 
	 * Index of column Res_E2
	 */
	protected static final int COLUMN_RES_E2 = 5;

	/** 
	 * Index of column ID_C
	 */
	protected static final int COLUMN_ID_C = 6;

	/** 
	 * Index of column ID_Eq
	 */
	protected static final int COLUMN_ID_EQ = 7;

	/** 
	 * Index of column YaJugado
	 */
	protected static final int COLUMN_YA_JUGADO = 8;

	/** 
	 * Index of column Hora
	 */
	protected static final int COLUMN_HORA = 9;

	/** 
	 * Index of column ronda_id
	 */
	protected static final int COLUMN_RONDA_ID = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column partido_id
	 */
	protected static final int PK_COLUMN_PARTIDO_ID = 1;

	/** 
	 * Inserts a new row in the partido table.
	 */
	public PartidoPk insert(Partido dto) throws PartidoDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getPartidoId() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setInt( index++, dto.getIdEq2() );
			if (dto.isResE1Null()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getResE1() );
			}
		
			stmt.setString( index++, dto.getResE2() );
			stmt.setInt( index++, dto.getIdC() );
			stmt.setInt( index++, dto.getIdEq() );
			stmt.setInt( index++, dto.getYaJugado() );
			stmt.setTime(index++, dto.getHora()==null ? null : new java.sql.Time( dto.getHora().getTime() ) );
			stmt.setInt( index++, dto.getRondaId() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setPartidoId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the partido table.
	 */
	public void update(PartidoPk pk, Partido dto) throws PartidoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getPartidoId() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setInt( index++, dto.getIdEq2() );
			if (dto.isResE1Null()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getResE1() );
			}
		
			stmt.setString( index++, dto.getResE2() );
			stmt.setInt( index++, dto.getIdC() );
			stmt.setInt( index++, dto.getIdEq() );
			stmt.setInt( index++, dto.getYaJugado() );
			stmt.setTime(index++, dto.getHora()==null ? null : new java.sql.Time( dto.getHora().getTime() ) );
			stmt.setInt( index++, dto.getRondaId() );
			stmt.setInt( 11, pk.getPartidoId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the partido table.
	 */
	public void delete(PartidoPk pk) throws PartidoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getPartidoId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PartidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the partido table that matches the specified primary-key value.
	 */
	public Partido findByPrimaryKey(PartidoPk pk) throws PartidoDaoException
	{
		return findByPrimaryKey( pk.getPartidoId() );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'partido_id = :partidoId'.
	 */
	public Partido findByPrimaryKey(int partidoId) throws PartidoDaoException
	{
		Partido ret[] = findByDynamicSelect( SQL_SELECT + " WHERE partido_id = ?", new Object[] {  new Integer(partidoId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the partido table that match the criteria ''.
	 */
	public Partido[] findAll() throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY partido_id", null );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_C = :idC'.
	 */
	public Partido[] findByCancha(int idC) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_C = ?", new Object[] {  new Integer(idC) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq2 = :idEq2'.
	 */
	public Partido[] findByEquipo(int idEq2) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq2 = ?", new Object[] {  new Integer(idEq2) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Partido[] findByEquipo2(int idEq) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ?", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public Partido[] findByRondaPartido(int rondaId) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ?", new Object[] {  new Integer(rondaId) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'partido_id = :partidoId'.
	 */
	public Partido[] findWherePartidoIdEquals(int partidoId) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE partido_id = ? ORDER BY partido_id", new Object[] {  new Integer(partidoId) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'Fecha = :fecha'.
	 */
	public Partido[] findWhereFechaEquals(Date fecha) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Fecha = ? ORDER BY Fecha", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'Hora = :hora'.
	 */
	public Partido[] findWhereHoraEquals(Date hora) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Hora = ? ORDER BY Hora", new Object[] { hora==null ? null : new java.sql.Time( hora.getTime() ) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_C = :idC'.
	 */
	public Partido[] findWhereIdCEquals(int idC) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_C = ? ORDER BY ID_C", new Object[] {  new Integer(idC) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Partido[] findWhereIdEqEquals(int idEq) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ? ORDER BY ID_Eq", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'Res_E1 = :resE1'.
	 */
	public Partido[] findWhereResE1Equals(int resE1) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Res_E1 = ? ORDER BY Res_E1", new Object[] {  new Integer(resE1) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'Res_E2 = :resE2'.
	 */
	public Partido[] findWhereResE2Equals(int resE2) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Res_E2 = ? ORDER BY Res_E2", new Object[] {  new Integer(resE2) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq2 = :idEq2'.
	 */
	public Partido[] findWhereIdEq2Equals(int idEq2) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq2 = ? ORDER BY ID_Eq2", new Object[] {  new Integer(idEq2) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'YaJugado = :yaJugado'.
	 */
	public Partido[] findWhereYaJugadoEquals(int yaJugado) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE YaJugado = ? ORDER BY YaJugado", new Object[] {  new Integer(yaJugado) } );
	}

	/** 
	 * Returns all rows from the partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public Partido[] findWhereRondaIdEquals(int rondaId) throws PartidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ronda_id = ? ORDER BY ronda_id", new Object[] {  new Integer(rondaId) } );
	}

	/**
	 * Method 'PartidoDaoImpl'
	 * 
	 */
	public PartidoDaoImpl()
	{
	}

	/**
	 * Method 'PartidoDaoImpl'
	 * 
	 * @param userConn
	 */
	public PartidoDaoImpl(final java.sql.Connection userConn)
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
		return "partido";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Partido fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Partido dto = new Partido();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Partido[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Partido dto = new Partido();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Partido ret[] = new Partido[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Partido dto, ResultSet rs) throws SQLException
	{
		dto.setPartidoId( rs.getInt( COLUMN_PARTIDO_ID ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setIdEq2( rs.getInt( COLUMN_ID_EQ2 ) );
		dto.setResE1( rs.getInt( COLUMN_RES_E1 ) );
		if (rs.wasNull()) {
			dto.setResE1Null( true );
		}
		
		dto.setResE2( rs.getString( COLUMN_RES_E2 ) );
		dto.setIdC( rs.getInt( COLUMN_ID_C ) );
		dto.setIdEq( rs.getInt( COLUMN_ID_EQ ) );
		dto.setYaJugado( rs.getInt( COLUMN_YA_JUGADO ) );
		dto.setHora( rs.getTime(COLUMN_HORA ) );
		dto.setRondaId( rs.getInt( COLUMN_RONDA_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Partido dto)
	{
	}

	/** 
	 * Returns all rows from the partido table that match the specified arbitrary SQL statement
	 */
	public Partido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PartidoDaoException
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
			throw new PartidoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the partido table that match the specified arbitrary SQL statement
	 */
	public Partido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PartidoDaoException
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
			throw new PartidoDaoException( "Exception: " + _e.getMessage(), _e );
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
