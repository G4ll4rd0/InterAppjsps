/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.jdbc;

import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.factory.*;
import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;
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

public class CheerleadersDaoImpl extends AbstractDAO implements CheerleadersDao
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
	protected final String SQL_SELECT = "SELECT cheerleader_id, points, team_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( cheerleader_id, points, team_id ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET cheerleader_id = ?, points = ?, team_id = ? WHERE cheerleader_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE cheerleader_id = ?";

	/** 
	 * Index of column cheerleader_id
	 */
	protected static final int COLUMN_CHEERLEADER_ID = 1;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 2;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column cheerleader_id
	 */
	protected static final int PK_COLUMN_CHEERLEADER_ID = 1;

	/** 
	 * Inserts a new row in the cheerleaders table.
	 */
	public CheerleadersPk insert(Cheerleaders dto) throws CheerleadersDaoException
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
			stmt.setInt( index++, dto.getCheerleaderId() );
			stmt.setInt( index++, dto.getPoints() );
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setCheerleaderId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CheerleadersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cheerleaders table.
	 */
	public void update(CheerleadersPk pk, Cheerleaders dto) throws CheerleadersDaoException
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
			stmt.setInt( index++, dto.getCheerleaderId() );
			stmt.setInt( index++, dto.getPoints() );
			if (dto.isTeamIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getTeamId() );
			}
		
			stmt.setInt( 4, pk.getCheerleaderId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CheerleadersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cheerleaders table.
	 */
	public void delete(CheerleadersPk pk) throws CheerleadersDaoException
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
			stmt.setInt( 1, pk.getCheerleaderId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CheerleadersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cheerleaders table that matches the specified primary-key value.
	 */
	public Cheerleaders findByPrimaryKey(CheerleadersPk pk) throws CheerleadersDaoException
	{
		return findByPrimaryKey( pk.getCheerleaderId() );
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'cheerleader_id = :cheerleaderId'.
	 */
	public Cheerleaders findByPrimaryKey(int cheerleaderId) throws CheerleadersDaoException
	{
		Cheerleaders ret[] = findByDynamicSelect( SQL_SELECT + " WHERE cheerleader_id = ?", new Object[] {  new Integer(cheerleaderId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria ''.
	 */
	public Cheerleaders[] findAll() throws CheerleadersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY cheerleader_id", null );
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'team_id = :teamId'.
	 */
	public Cheerleaders[] findByTeams(int teamId) throws CheerleadersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ?", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'cheerleader_id = :cheerleaderId'.
	 */
	public Cheerleaders[] findWhereCheerleaderIdEquals(int cheerleaderId) throws CheerleadersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE cheerleader_id = ? ORDER BY cheerleader_id", new Object[] {  new Integer(cheerleaderId) } );
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'points = :points'.
	 */
	public Cheerleaders[] findWherePointsEquals(int points) throws CheerleadersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Integer(points) } );
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'team_id = :teamId'.
	 */
	public Cheerleaders[] findWhereTeamIdEquals(int teamId) throws CheerleadersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/**
	 * Method 'CheerleadersDaoImpl'
	 * 
	 */
	public CheerleadersDaoImpl()
	{
	}

	/**
	 * Method 'CheerleadersDaoImpl'
	 * 
	 * @param userConn
	 */
	public CheerleadersDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.cheerleaders";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Cheerleaders fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Cheerleaders dto = new Cheerleaders();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Cheerleaders[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Cheerleaders dto = new Cheerleaders();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Cheerleaders ret[] = new Cheerleaders[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Cheerleaders dto, ResultSet rs) throws SQLException
	{
		dto.setCheerleaderId( rs.getInt( COLUMN_CHEERLEADER_ID ) );
		dto.setPoints( rs.getInt( COLUMN_POINTS ) );
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		if (rs.wasNull()) {
			dto.setTeamIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Cheerleaders dto)
	{
	}

	/** 
	 * Returns all rows from the cheerleaders table that match the specified arbitrary SQL statement
	 */
	public Cheerleaders[] findByDynamicSelect(String sql, Object[] sqlParams) throws CheerleadersDaoException
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
			throw new CheerleadersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cheerleaders table that match the specified arbitrary SQL statement
	 */
	public Cheerleaders[] findByDynamicWhere(String sql, Object[] sqlParams) throws CheerleadersDaoException
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
			throw new CheerleadersDaoException( "Exception: " + _e.getMessage(), _e );
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
