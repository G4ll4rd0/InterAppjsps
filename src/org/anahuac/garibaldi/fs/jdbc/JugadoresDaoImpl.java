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

public class JugadoresDaoImpl extends AbstractDAO implements JugadoresDao
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
	protected final String SQL_SELECT = "SELECT jugadores_id, Nombre, Numero, ID_Eq, ID_TdJ, primer_apellido, segundo_apellido FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( jugadores_id, Nombre, Numero, ID_Eq, ID_TdJ, primer_apellido, segundo_apellido ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET jugadores_id = ?, Nombre = ?, Numero = ?, ID_Eq = ?, ID_TdJ = ?, primer_apellido = ?, segundo_apellido = ? WHERE jugadores_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE jugadores_id = ?";

	/** 
	 * Index of column jugadores_id
	 */
	protected static final int COLUMN_JUGADORES_ID = 1;

	/** 
	 * Index of column Nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column Numero
	 */
	protected static final int COLUMN_NUMERO = 3;

	/** 
	 * Index of column ID_Eq
	 */
	protected static final int COLUMN_ID_EQ = 4;

	/** 
	 * Index of column ID_TdJ
	 */
	protected static final int COLUMN_ID_TDJ = 5;

	/** 
	 * Index of column primer_apellido
	 */
	protected static final int COLUMN_PRIMER_APELLIDO = 6;

	/** 
	 * Index of column segundo_apellido
	 */
	protected static final int COLUMN_SEGUNDO_APELLIDO = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column jugadores_id
	 */
	protected static final int PK_COLUMN_JUGADORES_ID = 1;

	/** 
	 * Inserts a new row in the jugadores table.
	 */
	public JugadoresPk insert(Jugadores dto) throws JugadoresDaoException
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
			stmt.setInt( index++, dto.getJugadoresId() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setInt( index++, dto.getNumero() );
			if (dto.isIdEqNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdEq() );
			}
		
			if (dto.isIdTdjNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdTdj() );
			}
		
			stmt.setString( index++, dto.getPrimerApellido() );
			stmt.setString( index++, dto.getSegundoApellido() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setJugadoresId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new JugadoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the jugadores table.
	 */
	public void update(JugadoresPk pk, Jugadores dto) throws JugadoresDaoException
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
			stmt.setInt( index++, dto.getJugadoresId() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setInt( index++, dto.getNumero() );
			if (dto.isIdEqNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdEq() );
			}
		
			if (dto.isIdTdjNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdTdj() );
			}
		
			stmt.setString( index++, dto.getPrimerApellido() );
			stmt.setString( index++, dto.getSegundoApellido() );
			stmt.setInt( 8, pk.getJugadoresId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new JugadoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the jugadores table.
	 */
	public void delete(JugadoresPk pk) throws JugadoresDaoException
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
			stmt.setInt( 1, pk.getJugadoresId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new JugadoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the jugadores table that matches the specified primary-key value.
	 */
	public Jugadores findByPrimaryKey(JugadoresPk pk) throws JugadoresDaoException
	{
		return findByPrimaryKey( pk.getJugadoresId() );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public Jugadores findByPrimaryKey(int jugadoresId) throws JugadoresDaoException
	{
		Jugadores ret[] = findByDynamicSelect( SQL_SELECT + " WHERE jugadores_id = ?", new Object[] {  new Integer(jugadoresId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria ''.
	 */
	public Jugadores[] findAll() throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY jugadores_id", null );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Jugadores[] findByEquipo(int idEq) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ?", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_TdJ = :idTdj'.
	 */
	public Jugadores[] findByTipoDeJugador(int idTdj) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TdJ = ?", new Object[] {  new Integer(idTdj) } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public Jugadores[] findWhereJugadoresIdEquals(int jugadoresId) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE jugadores_id = ? ORDER BY jugadores_id", new Object[] {  new Integer(jugadoresId) } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'Nombre = :nombre'.
	 */
	public Jugadores[] findWhereNombreEquals(String nombre) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Nombre = ? ORDER BY Nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'primer_apellido = :primerApellido'.
	 */
	public Jugadores[] findWherePrimerApellidoEquals(String primerApellido) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE primer_apellido = ? ORDER BY primer_apellido", new Object[] { primerApellido } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'segundo_apellido = :segundoApellido'.
	 */
	public Jugadores[] findWhereSegundoApellidoEquals(String segundoApellido) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE segundo_apellido = ? ORDER BY segundo_apellido", new Object[] { segundoApellido } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'Numero = :numero'.
	 */
	public Jugadores[] findWhereNumeroEquals(int numero) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Numero = ? ORDER BY Numero", new Object[] {  new Integer(numero) } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Jugadores[] findWhereIdEqEquals(int idEq) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ? ORDER BY ID_Eq", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_TdJ = :idTdj'.
	 */
	public Jugadores[] findWhereIdTdjEquals(int idTdj) throws JugadoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TdJ = ? ORDER BY ID_TdJ", new Object[] {  new Integer(idTdj) } );
	}

	/**
	 * Method 'JugadoresDaoImpl'
	 * 
	 */
	public JugadoresDaoImpl()
	{
	}

	/**
	 * Method 'JugadoresDaoImpl'
	 * 
	 * @param userConn
	 */
	public JugadoresDaoImpl(final java.sql.Connection userConn)
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
		return "jugadores";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Jugadores fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Jugadores dto = new Jugadores();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Jugadores[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Jugadores dto = new Jugadores();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Jugadores ret[] = new Jugadores[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Jugadores dto, ResultSet rs) throws SQLException
	{
		dto.setJugadoresId( rs.getInt( COLUMN_JUGADORES_ID ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setNumero( rs.getInt( COLUMN_NUMERO ) );
		dto.setIdEq( rs.getInt( COLUMN_ID_EQ ) );
		if (rs.wasNull()) {
			dto.setIdEqNull( true );
		}
		
		dto.setIdTdj( rs.getInt( COLUMN_ID_TDJ ) );
		if (rs.wasNull()) {
			dto.setIdTdjNull( true );
		}
		
		dto.setPrimerApellido( rs.getString( COLUMN_PRIMER_APELLIDO ) );
		dto.setSegundoApellido( rs.getString( COLUMN_SEGUNDO_APELLIDO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Jugadores dto)
	{
	}

	/** 
	 * Returns all rows from the jugadores table that match the specified arbitrary SQL statement
	 */
	public Jugadores[] findByDynamicSelect(String sql, Object[] sqlParams) throws JugadoresDaoException
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
			throw new JugadoresDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the jugadores table that match the specified arbitrary SQL statement
	 */
	public Jugadores[] findByDynamicWhere(String sql, Object[] sqlParams) throws JugadoresDaoException
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
			throw new JugadoresDaoException( "Exception: " + _e.getMessage(), _e );
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
