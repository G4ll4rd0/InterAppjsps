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

public class VwHostsDaoImpl extends AbstractDAO implements VwHostsDao
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
	protected final String SQL_SELECT = "SELECT player_id, parent_id, parent_seed, host_id, host_name, host_adress, host_phone, player_name FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column player_id
	 */
	protected static final int COLUMN_PLAYER_ID = 1;

	/** 
	 * Index of column parent_id
	 */
	protected static final int COLUMN_PARENT_ID = 2;

	/** 
	 * Index of column parent_seed
	 */
	protected static final int COLUMN_PARENT_SEED = 3;

	/** 
	 * Index of column host_id
	 */
	protected static final int COLUMN_HOST_ID = 4;

	/** 
	 * Index of column host_name
	 */
	protected static final int COLUMN_HOST_NAME = 5;

	/** 
	 * Index of column host_adress
	 */
	protected static final int COLUMN_HOST_ADRESS = 6;

	/** 
	 * Index of column host_phone
	 */
	protected static final int COLUMN_HOST_PHONE = 7;

	/** 
	 * Index of column player_name
	 */
	protected static final int COLUMN_PLAYER_NAME = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria ''.
	 */
	public VwHosts[] findAll() throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'player_id = :playerId'.
	 */
	public VwHosts[] findWherePlayerIdEquals(int playerId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_id = ? ORDER BY player_id", new Object[] {  new Integer(playerId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'parent_id = :parentId'.
	 */
	public VwHosts[] findWhereParentIdEquals(int parentId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE parent_id = ? ORDER BY parent_id", new Object[] {  new Integer(parentId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'parent_seed = :parentSeed'.
	 */
	public VwHosts[] findWhereParentSeedEquals(String parentSeed) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE parent_seed = ? ORDER BY parent_seed", new Object[] { parentSeed } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_id = :hostId'.
	 */
	public VwHosts[] findWhereHostIdEquals(int hostId) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_id = ? ORDER BY host_id", new Object[] {  new Integer(hostId) } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_name = :hostName'.
	 */
	public VwHosts[] findWhereHostNameEquals(String hostName) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_name = ? ORDER BY host_name", new Object[] { hostName } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_adress = :hostAdress'.
	 */
	public VwHosts[] findWhereHostAdressEquals(String hostAdress) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_adress = ? ORDER BY host_adress", new Object[] { hostAdress } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_phone = :hostPhone'.
	 */
	public VwHosts[] findWhereHostPhoneEquals(String hostPhone) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE host_phone = ? ORDER BY host_phone", new Object[] { hostPhone } );
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'player_name = :playerName'.
	 */
	public VwHosts[] findWherePlayerNameEquals(String playerName) throws VwHostsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE player_name = ? ORDER BY player_name", new Object[] { playerName } );
	}

	/**
	 * Method 'VwHostsDaoImpl'
	 * 
	 */
	public VwHostsDaoImpl()
	{
	}

	/**
	 * Method 'VwHostsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwHostsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_hosts";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwHosts fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwHosts dto = new VwHosts();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwHosts[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwHosts dto = new VwHosts();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwHosts ret[] = new VwHosts[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwHosts dto, ResultSet rs) throws SQLException
	{
		dto.setPlayerId( rs.getInt( COLUMN_PLAYER_ID ) );
		if (rs.wasNull()) {
			dto.setPlayerIdNull( true );
		}
		
		dto.setParentId( rs.getInt( COLUMN_PARENT_ID ) );
		if (rs.wasNull()) {
			dto.setParentIdNull( true );
		}
		
		dto.setParentSeed( rs.getString( COLUMN_PARENT_SEED ) );
		dto.setHostId( rs.getInt( COLUMN_HOST_ID ) );
		if (rs.wasNull()) {
			dto.setHostIdNull( true );
		}
		
		dto.setHostName( rs.getString( COLUMN_HOST_NAME ) );
		dto.setHostAdress( rs.getString( COLUMN_HOST_ADRESS ) );
		dto.setHostPhone( rs.getString( COLUMN_HOST_PHONE ) );
		dto.setPlayerName( rs.getString( COLUMN_PLAYER_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwHosts dto)
	{
	}

	/** 
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwHostsDaoException
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
			throw new VwHostsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwHostsDaoException
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
			throw new VwHostsDaoException( "Exception: " + _e.getMessage(), _e );
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
