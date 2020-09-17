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

public class VwIPointsDaoImpl extends AbstractDAO implements VwIPointsDao
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
	protected final String SQL_SELECT = "SELECT game_id, team1_id, points, PJ, PG, PP, PE, GF, GC FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column game_id
	 */
	protected static final int COLUMN_GAME_ID = 1;

	/** 
	 * Index of column team1_id
	 */
	protected static final int COLUMN_TEAM1_ID = 2;

	/** 
	 * Index of column points
	 */
	protected static final int COLUMN_POINTS = 3;

	/** 
	 * Index of column PJ
	 */
	protected static final int COLUMN_PJ = 4;

	/** 
	 * Index of column PG
	 */
	protected static final int COLUMN_PG = 5;

	/** 
	 * Index of column PP
	 */
	protected static final int COLUMN_PP = 6;

	/** 
	 * Index of column PE
	 */
	protected static final int COLUMN_PE = 7;

	/** 
	 * Index of column GF
	 */
	protected static final int COLUMN_GF = 8;

	/** 
	 * Index of column GC
	 */
	protected static final int COLUMN_GC = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria ''.
	 */
	public VwIPoints[] findAll() throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'game_id = :gameId'.
	 */
	public VwIPoints[] findWhereGameIdEquals(int gameId) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE game_id = ? ORDER BY game_id", new Object[] {  new Integer(gameId) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'team1_id = :team1Id'.
	 */
	public VwIPoints[] findWhereTeam1IdEquals(int team1Id) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team1_id = ? ORDER BY team1_id", new Object[] {  new Integer(team1Id) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'points = :points'.
	 */
	public VwIPoints[] findWherePointsEquals(long points) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE points = ? ORDER BY points", new Object[] {  new Long(points) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PJ = :pj'.
	 */
	public VwIPoints[] findWherePjEquals(long pj) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PJ = ? ORDER BY PJ", new Object[] {  new Long(pj) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PG = :pg'.
	 */
	public VwIPoints[] findWherePgEquals(long pg) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PG = ? ORDER BY PG", new Object[] {  new Long(pg) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PP = :pp'.
	 */
	public VwIPoints[] findWherePpEquals(long pp) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PP = ? ORDER BY PP", new Object[] {  new Long(pp) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PE = :pe'.
	 */
	public VwIPoints[] findWherePeEquals(long pe) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PE = ? ORDER BY PE", new Object[] {  new Long(pe) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'GF = :gf'.
	 */
	public VwIPoints[] findWhereGfEquals(int gf) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE GF = ? ORDER BY GF", new Object[] {  new Integer(gf) } );
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'GC = :gc'.
	 */
	public VwIPoints[] findWhereGcEquals(int gc) throws VwIPointsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE GC = ? ORDER BY GC", new Object[] {  new Integer(gc) } );
	}

	/**
	 * Method 'VwIPointsDaoImpl'
	 * 
	 */
	public VwIPointsDaoImpl()
	{
	}

	/**
	 * Method 'VwIPointsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwIPointsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_i_points";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwIPoints fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwIPoints dto = new VwIPoints();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwIPoints[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwIPoints dto = new VwIPoints();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwIPoints ret[] = new VwIPoints[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwIPoints dto, ResultSet rs) throws SQLException
	{
		dto.setGameId( rs.getInt( COLUMN_GAME_ID ) );
		dto.setTeam1Id( rs.getInt( COLUMN_TEAM1_ID ) );
		if (rs.wasNull()) {
			dto.setTeam1IdNull( true );
		}
		
		dto.setPoints( rs.getLong( COLUMN_POINTS ) );
		if (rs.wasNull()) {
			dto.setPointsNull( true );
		}
		
		dto.setPj( rs.getLong( COLUMN_PJ ) );
		dto.setPg( rs.getLong( COLUMN_PG ) );
		if (rs.wasNull()) {
			dto.setPgNull( true );
		}
		
		dto.setPp( rs.getLong( COLUMN_PP ) );
		if (rs.wasNull()) {
			dto.setPpNull( true );
		}
		
		dto.setPe( rs.getLong( COLUMN_PE ) );
		if (rs.wasNull()) {
			dto.setPeNull( true );
		}
		
		dto.setGf( rs.getInt( COLUMN_GF ) );
		if (rs.wasNull()) {
			dto.setGfNull( true );
		}
		
		dto.setGc( rs.getInt( COLUMN_GC ) );
		if (rs.wasNull()) {
			dto.setGcNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwIPoints dto)
	{
	}

	/** 
	 * Returns all rows from the vw_i_points table that match the specified arbitrary SQL statement
	 */
	public VwIPoints[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwIPointsDaoException
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
			throw new VwIPointsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_i_points table that match the specified arbitrary SQL statement
	 */
	public VwIPoints[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwIPointsDaoException
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
			throw new VwIPointsDaoException( "Exception: " + _e.getMessage(), _e );
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
