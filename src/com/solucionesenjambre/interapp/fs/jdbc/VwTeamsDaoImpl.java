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

public class VwTeamsDaoImpl extends AbstractDAO implements VwTeamsDao
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
	protected final String SQL_SELECT = "SELECT team_id, event_id, description, team_name FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column team_id
	 */
	protected static final int COLUMN_TEAM_ID = 1;

	/** 
	 * Index of column event_id
	 */
	protected static final int COLUMN_EVENT_ID = 2;

	/** 
	 * Index of column description
	 */
	protected static final int COLUMN_DESCRIPTION = 3;

	/** 
	 * Index of column team_name
	 */
	protected static final int COLUMN_TEAM_NAME = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Returns all rows from the vw_teams table that match the criteria ''.
	 */
	public VwTeams[] findAll() throws VwTeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'team_id = :teamId'.
	 */
	public VwTeams[] findWhereTeamIdEquals(int teamId) throws VwTeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_id = ? ORDER BY team_id", new Object[] {  new Integer(teamId) } );
	}

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'event_id = :eventId'.
	 */
	public VwTeams[] findWhereEventIdEquals(int eventId) throws VwTeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE event_id = ? ORDER BY event_id", new Object[] {  new Integer(eventId) } );
	}

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'description = :description'.
	 */
	public VwTeams[] findWhereDescriptionEquals(String description) throws VwTeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'team_name = :teamName'.
	 */
	public VwTeams[] findWhereTeamNameEquals(String teamName) throws VwTeamsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE team_name = ? ORDER BY team_name", new Object[] { teamName } );
	}

	/**
	 * Method 'VwTeamsDaoImpl'
	 * 
	 */
	public VwTeamsDaoImpl()
	{
	}

	/**
	 * Method 'VwTeamsDaoImpl'
	 * 
	 * @param userConn
	 */
	public VwTeamsDaoImpl(final java.sql.Connection userConn)
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
		return "hdnsserv_interap.vw_teams";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VwTeams fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VwTeams dto = new VwTeams();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VwTeams[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VwTeams dto = new VwTeams();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VwTeams ret[] = new VwTeams[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VwTeams dto, ResultSet rs) throws SQLException
	{
		dto.setTeamId( rs.getInt( COLUMN_TEAM_ID ) );
		dto.setEventId( rs.getInt( COLUMN_EVENT_ID ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
		dto.setTeamName( rs.getString( COLUMN_TEAM_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VwTeams dto)
	{
	}

	/** 
	 * Returns all rows from the vw_teams table that match the specified arbitrary SQL statement
	 */
	public VwTeams[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwTeamsDaoException
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
			throw new VwTeamsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vw_teams table that match the specified arbitrary SQL statement
	 */
	public VwTeams[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwTeamsDaoException
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
			throw new VwTeamsDaoException( "Exception: " + _e.getMessage(), _e );
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
