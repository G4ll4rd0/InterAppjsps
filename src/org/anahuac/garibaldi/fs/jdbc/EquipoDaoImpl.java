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

public class EquipoDaoImpl extends AbstractDAO implements EquipoDao
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
	protected final String SQL_SELECT = "SELECT equipo_id, ID_D, ID_S, ID_De, ID_R FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( equipo_id, ID_D, ID_S, ID_De, ID_R ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET equipo_id = ?, ID_D = ?, ID_S = ?, ID_De = ?, ID_R = ? WHERE equipo_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE equipo_id = ?";

	/** 
	 * Index of column equipo_id
	 */
	protected static final int COLUMN_EQUIPO_ID = 1;

	/** 
	 * Index of column ID_D
	 */
	protected static final int COLUMN_ID_D = 2;

	/** 
	 * Index of column ID_S
	 */
	protected static final int COLUMN_ID_S = 3;

	/** 
	 * Index of column ID_De
	 */
	protected static final int COLUMN_ID_DE = 4;

	/** 
	 * Index of column ID_R
	 */
	protected static final int COLUMN_ID_R = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column equipo_id
	 */
	protected static final int PK_COLUMN_EQUIPO_ID = 1;

	/** 
	 * Inserts a new row in the equipo table.
	 */
	public EquipoPk insert(Equipo dto) throws EquipoDaoException
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
			stmt.setInt( index++, dto.getEquipoId() );
			if (dto.isIdDNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdD() );
			}
		
			if (dto.isIdSNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdS() );
			}
		
			if (dto.isIdDeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdDe() );
			}
		
			if (dto.isIdRNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdR() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setEquipoId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EquipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the equipo table.
	 */
	public void update(EquipoPk pk, Equipo dto) throws EquipoDaoException
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
			stmt.setInt( index++, dto.getEquipoId() );
			if (dto.isIdDNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdD() );
			}
		
			if (dto.isIdSNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdS() );
			}
		
			if (dto.isIdDeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdDe() );
			}
		
			if (dto.isIdRNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdR() );
			}
		
			stmt.setInt( 6, pk.getEquipoId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EquipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the equipo table.
	 */
	public void delete(EquipoPk pk) throws EquipoDaoException
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
			stmt.setInt( 1, pk.getEquipoId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EquipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the equipo table that matches the specified primary-key value.
	 */
	public Equipo findByPrimaryKey(EquipoPk pk) throws EquipoDaoException
	{
		return findByPrimaryKey( pk.getEquipoId() );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'equipo_id = :equipoId'.
	 */
	public Equipo findByPrimaryKey(int equipoId) throws EquipoDaoException
	{
		Equipo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ?", new Object[] {  new Integer(equipoId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria ''.
	 */
	public Equipo[] findAll() throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY equipo_id", null );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_D = :idD'.
	 */
	public Equipo[] findByDelegaciones(int idD) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ?", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_De = :idDe'.
	 */
	public Equipo[] findByDeporte(int idDe) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ?", new Object[] {  new Integer(idDe) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_R = :idR'.
	 */
	public Equipo[] findByRama(int idR) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_R = ?", new Object[] {  new Integer(idR) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_S = :idS'.
	 */
	public Equipo[] findBySeccion(int idS) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_S = ?", new Object[] {  new Integer(idS) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'equipo_id = :equipoId'.
	 */
	public Equipo[] findWhereEquipoIdEquals(int equipoId) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE equipo_id = ? ORDER BY equipo_id", new Object[] {  new Integer(equipoId) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_D = :idD'.
	 */
	public Equipo[] findWhereIdDEquals(int idD) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ? ORDER BY ID_D", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_S = :idS'.
	 */
	public Equipo[] findWhereIdSEquals(int idS) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_S = ? ORDER BY ID_S", new Object[] {  new Integer(idS) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_De = :idDe'.
	 */
	public Equipo[] findWhereIdDeEquals(int idDe) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ? ORDER BY ID_De", new Object[] {  new Integer(idDe) } );
	}

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_R = :idR'.
	 */
	public Equipo[] findWhereIdREquals(int idR) throws EquipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_R = ? ORDER BY ID_R", new Object[] {  new Integer(idR) } );
	}

	/**
	 * Method 'EquipoDaoImpl'
	 * 
	 */
	public EquipoDaoImpl()
	{
	}

	/**
	 * Method 'EquipoDaoImpl'
	 * 
	 * @param userConn
	 */
	public EquipoDaoImpl(final java.sql.Connection userConn)
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
		return "equipo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Equipo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Equipo dto = new Equipo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Equipo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Equipo dto = new Equipo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Equipo ret[] = new Equipo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Equipo dto, ResultSet rs) throws SQLException
	{
		dto.setEquipoId( rs.getInt( COLUMN_EQUIPO_ID ) );
		dto.setIdD( rs.getInt( COLUMN_ID_D ) );
		if (rs.wasNull()) {
			dto.setIdDNull( true );
		}
		
		dto.setIdS( rs.getInt( COLUMN_ID_S ) );
		if (rs.wasNull()) {
			dto.setIdSNull( true );
		}
		
		dto.setIdDe( rs.getInt( COLUMN_ID_DE ) );
		if (rs.wasNull()) {
			dto.setIdDeNull( true );
		}
		
		dto.setIdR( rs.getInt( COLUMN_ID_R ) );
		if (rs.wasNull()) {
			dto.setIdRNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Equipo dto)
	{
	}

	/** 
	 * Returns all rows from the equipo table that match the specified arbitrary SQL statement
	 */
	public Equipo[] findByDynamicSelect(String sql, Object[] sqlParams) throws EquipoDaoException
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
			throw new EquipoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the equipo table that match the specified arbitrary SQL statement
	 */
	public Equipo[] findByDynamicWhere(String sql, Object[] sqlParams) throws EquipoDaoException
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
			throw new EquipoDaoException( "Exception: " + _e.getMessage(), _e );
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
