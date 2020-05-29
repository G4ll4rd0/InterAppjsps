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

public class UsuarioDaoImpl extends AbstractDAO implements UsuarioDao
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
	protected final String SQL_SELECT = "SELECT usuario_id, Username, Pssword, Correo, ID_TdU, ID_D, Seed FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( usuario_id, Username, Pssword, Correo, ID_TdU, ID_D, Seed ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET usuario_id = ?, Username = ?, Pssword = ?, Correo = ?, ID_TdU = ?, ID_D = ?, Seed = ? WHERE usuario_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE usuario_id = ?";

	/** 
	 * Index of column usuario_id
	 */
	protected static final int COLUMN_USUARIO_ID = 1;

	/** 
	 * Index of column Username
	 */
	protected static final int COLUMN_USERNAME = 2;

	/** 
	 * Index of column Pssword
	 */
	protected static final int COLUMN_PSSWORD = 3;

	/** 
	 * Index of column Correo
	 */
	protected static final int COLUMN_CORREO = 4;

	/** 
	 * Index of column ID_TdU
	 */
	protected static final int COLUMN_ID_TDU = 5;

	/** 
	 * Index of column ID_D
	 */
	protected static final int COLUMN_ID_D = 6;

	/** 
	 * Index of column Seed
	 */
	protected static final int COLUMN_SEED = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column usuario_id
	 */
	protected static final int PK_COLUMN_USUARIO_ID = 1;

	/** 
	 * Inserts a new row in the usuario table.
	 */
	public UsuarioPk insert(Usuario dto) throws UsuarioDaoException
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
			stmt.setInt( index++, dto.getUsuarioId() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPssword() );
			stmt.setString( index++, dto.getCorreo() );
			stmt.setInt( index++, dto.getIdTdu() );
			stmt.setInt( index++, dto.getIdD() );
			stmt.setString( index++, dto.getSeed() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setUsuarioId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the usuario table.
	 */
	public void update(UsuarioPk pk, Usuario dto) throws UsuarioDaoException
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
			stmt.setInt( index++, dto.getUsuarioId() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPssword() );
			stmt.setString( index++, dto.getCorreo() );
			stmt.setInt( index++, dto.getIdTdu() );
			stmt.setInt( index++, dto.getIdD() );
			stmt.setString( index++, dto.getSeed() );
			stmt.setInt( 8, pk.getUsuarioId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the usuario table.
	 */
	public void delete(UsuarioPk pk) throws UsuarioDaoException
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
			stmt.setInt( 1, pk.getUsuarioId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the usuario table that matches the specified primary-key value.
	 */
	public Usuario findByPrimaryKey(UsuarioPk pk) throws UsuarioDaoException
	{
		return findByPrimaryKey( pk.getUsuarioId() );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'usuario_id = :usuarioId'.
	 */
	public Usuario findByPrimaryKey(int usuarioId) throws UsuarioDaoException
	{
		Usuario ret[] = findByDynamicSelect( SQL_SELECT + " WHERE usuario_id = ?", new Object[] {  new Integer(usuarioId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria ''.
	 */
	public Usuario[] findAll() throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY usuario_id", null );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_D = :idD'.
	 */
	public Usuario[] findByDelegaciones(int idD) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ?", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_TdU = :idTdu'.
	 */
	public Usuario[] findByTipoDeUsuario(int idTdu) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TdU = ?", new Object[] {  new Integer(idTdu) } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'usuario_id = :usuarioId'.
	 */
	public Usuario[] findWhereUsuarioIdEquals(int usuarioId) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE usuario_id = ? ORDER BY usuario_id", new Object[] {  new Integer(usuarioId) } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Username = :username'.
	 */
	public Usuario[] findWhereUsernameEquals(String username) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Username = ? ORDER BY Username", new Object[] { username } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Pssword = :pssword'.
	 */
	public Usuario[] findWherePsswordEquals(String pssword) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Pssword = ? ORDER BY Pssword", new Object[] { pssword } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Correo = :correo'.
	 */
	public Usuario[] findWhereCorreoEquals(String correo) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Correo = ? ORDER BY Correo", new Object[] { correo } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_TdU = :idTdu'.
	 */
	public Usuario[] findWhereIdTduEquals(int idTdu) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TdU = ? ORDER BY ID_TdU", new Object[] {  new Integer(idTdu) } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_D = :idD'.
	 */
	public Usuario[] findWhereIdDEquals(int idD) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ? ORDER BY ID_D", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Seed = :seed'.
	 */
	public Usuario[] findWhereSeedEquals(String seed) throws UsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Seed = ? ORDER BY Seed", new Object[] { seed } );
	}

	/**
	 * Method 'UsuarioDaoImpl'
	 * 
	 */
	public UsuarioDaoImpl()
	{
	}

	/**
	 * Method 'UsuarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsuarioDaoImpl(final java.sql.Connection userConn)
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
		return "usuario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Usuario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Usuario dto = new Usuario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Usuario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Usuario dto = new Usuario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Usuario ret[] = new Usuario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Usuario dto, ResultSet rs) throws SQLException
	{
		dto.setUsuarioId( rs.getInt( COLUMN_USUARIO_ID ) );
		dto.setUsername( rs.getString( COLUMN_USERNAME ) );
		dto.setPssword( rs.getString( COLUMN_PSSWORD ) );
		dto.setCorreo( rs.getString( COLUMN_CORREO ) );
		dto.setIdTdu( rs.getInt( COLUMN_ID_TDU ) );
		dto.setIdD( rs.getInt( COLUMN_ID_D ) );
		dto.setSeed( rs.getString( COLUMN_SEED ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Usuario dto)
	{
	}

	/** 
	 * Returns all rows from the usuario table that match the specified arbitrary SQL statement
	 */
	public Usuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsuarioDaoException
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
			throw new UsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the usuario table that match the specified arbitrary SQL statement
	 */
	public Usuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsuarioDaoException
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
			throw new UsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
