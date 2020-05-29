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

public class FavoritoDelUsuarioDaoImpl extends AbstractDAO implements FavoritoDelUsuarioDao
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
	protected final String SQL_SELECT = "SELECT ID_U, ID_D, ID_Eq, ID_De FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_U, ID_D, ID_Eq, ID_De ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * Index of column ID_U
	 */
	protected static final int COLUMN_ID_U = 1;

	/** 
	 * Index of column ID_D
	 */
	protected static final int COLUMN_ID_D = 2;

	/** 
	 * Index of column ID_Eq
	 */
	protected static final int COLUMN_ID_EQ = 3;

	/** 
	 * Index of column ID_De
	 */
	protected static final int COLUMN_ID_DE = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Inserts a new row in the favorito_del_usuario table.
	 */
	public void insert(FavoritoDelUsuario dto) throws FavoritoDelUsuarioDaoException
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
			if (dto.isIdUNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdU() );
			}
		
			if (dto.isIdDNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdD() );
			}
		
			if (dto.isIdEqNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdEq() );
			}
		
			if (dto.isIdDeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdDe() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FavoritoDelUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_D = :idD'.
	 */
	public FavoritoDelUsuario[] findByDelegaciones(int idD) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ?", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria ''.
	 */
	public FavoritoDelUsuario[] findAll() throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_De = :idDe'.
	 */
	public FavoritoDelUsuario[] findByDeporte(int idDe) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ?", new Object[] {  new Integer(idDe) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_Eq = :idEq'.
	 */
	public FavoritoDelUsuario[] findByEquipo(int idEq) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ?", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_U = :idU'.
	 */
	public FavoritoDelUsuario[] findByUsuario(int idU) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_U = ?", new Object[] {  new Integer(idU) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_U = :idU'.
	 */
	public FavoritoDelUsuario[] findWhereIdUEquals(int idU) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_U = ? ORDER BY ID_U", new Object[] {  new Integer(idU) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_D = :idD'.
	 */
	public FavoritoDelUsuario[] findWhereIdDEquals(int idD) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_D = ? ORDER BY ID_D", new Object[] {  new Integer(idD) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_Eq = :idEq'.
	 */
	public FavoritoDelUsuario[] findWhereIdEqEquals(int idEq) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_Eq = ? ORDER BY ID_Eq", new Object[] {  new Integer(idEq) } );
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_De = :idDe'.
	 */
	public FavoritoDelUsuario[] findWhereIdDeEquals(int idDe) throws FavoritoDelUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_De = ? ORDER BY ID_De", new Object[] {  new Integer(idDe) } );
	}

	/**
	 * Method 'FavoritoDelUsuarioDaoImpl'
	 * 
	 */
	public FavoritoDelUsuarioDaoImpl()
	{
	}

	/**
	 * Method 'FavoritoDelUsuarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public FavoritoDelUsuarioDaoImpl(final java.sql.Connection userConn)
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
		return "favorito_del_usuario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected FavoritoDelUsuario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			FavoritoDelUsuario dto = new FavoritoDelUsuario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected FavoritoDelUsuario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			FavoritoDelUsuario dto = new FavoritoDelUsuario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		FavoritoDelUsuario ret[] = new FavoritoDelUsuario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(FavoritoDelUsuario dto, ResultSet rs) throws SQLException
	{
		dto.setIdU( rs.getInt( COLUMN_ID_U ) );
		if (rs.wasNull()) {
			dto.setIdUNull( true );
		}
		
		dto.setIdD( rs.getInt( COLUMN_ID_D ) );
		if (rs.wasNull()) {
			dto.setIdDNull( true );
		}
		
		dto.setIdEq( rs.getInt( COLUMN_ID_EQ ) );
		if (rs.wasNull()) {
			dto.setIdEqNull( true );
		}
		
		dto.setIdDe( rs.getInt( COLUMN_ID_DE ) );
		if (rs.wasNull()) {
			dto.setIdDeNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(FavoritoDelUsuario dto)
	{
	}

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the specified arbitrary SQL statement
	 */
	public FavoritoDelUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws FavoritoDelUsuarioDaoException
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
			throw new FavoritoDelUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the favorito_del_usuario table that match the specified arbitrary SQL statement
	 */
	public FavoritoDelUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws FavoritoDelUsuarioDaoException
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
			throw new FavoritoDelUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
