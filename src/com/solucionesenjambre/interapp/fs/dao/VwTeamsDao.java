/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwTeamsDao
{
	/** 
	 * Returns all rows from the vw_teams table that match the criteria ''.
	 */
	public VwTeams[] findAll() throws VwTeamsDaoException;

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'team_id = :teamId'.
	 */
	public VwTeams[] findWhereTeamIdEquals(int teamId) throws VwTeamsDaoException;

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'event_id = :eventId'.
	 */
	public VwTeams[] findWhereEventIdEquals(int eventId) throws VwTeamsDaoException;

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'description = :description'.
	 */
	public VwTeams[] findWhereDescriptionEquals(String description) throws VwTeamsDaoException;

	/** 
	 * Returns all rows from the vw_teams table that match the criteria 'team_name = :teamName'.
	 */
	public VwTeams[] findWhereTeamNameEquals(String teamName) throws VwTeamsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_teams table that match the specified arbitrary SQL statement
	 */
	public VwTeams[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwTeamsDaoException;

	/** 
	 * Returns all rows from the vw_teams table that match the specified arbitrary SQL statement
	 */
	public VwTeams[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwTeamsDaoException;

}
