/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface TeamsDao
{
	/** 
	 * Inserts a new row in the teams table.
	 */
	public TeamsPk insert(Teams dto) throws TeamsDaoException;

	/** 
	 * Updates a single row in the teams table.
	 */
	public void update(TeamsPk pk, Teams dto) throws TeamsDaoException;

	/** 
	 * Deletes a single row in the teams table.
	 */
	public void delete(TeamsPk pk) throws TeamsDaoException;

	/** 
	 * Returns the rows from the teams table that matches the specified primary-key value.
	 */
	public Teams findByPrimaryKey(TeamsPk pk) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'team_id = :teamId'.
	 */
	public Teams findByPrimaryKey(int teamId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria ''.
	 */
	public Teams[] findAll() throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'branch_id = :branchId'.
	 */
	public Teams[] findByBranches(int branchId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'event_id = :eventId'.
	 */
	public Teams[] findByEvents(int eventId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'school_id = :schoolId'.
	 */
	public Teams[] findBySchools(int schoolId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'sport_id = :sportId'.
	 */
	public Teams[] findBySports(int sportId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'team_id = :teamId'.
	 */
	public Teams[] findWhereTeamIdEquals(int teamId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'priority_points = :priorityPoints'.
	 */
	public Teams[] findWherePriorityPointsEquals(int priorityPoints) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'branch_id = :branchId'.
	 */
	public Teams[] findWhereBranchIdEquals(int branchId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'school_id = :schoolId'.
	 */
	public Teams[] findWhereSchoolIdEquals(int schoolId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'sport_id = :sportId'.
	 */
	public Teams[] findWhereSportIdEquals(int sportId) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the criteria 'event_id = :eventId'.
	 */
	public Teams[] findWhereEventIdEquals(int eventId) throws TeamsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the teams table that match the specified arbitrary SQL statement
	 */
	public Teams[] findByDynamicSelect(String sql, Object[] sqlParams) throws TeamsDaoException;

	/** 
	 * Returns all rows from the teams table that match the specified arbitrary SQL statement
	 */
	public Teams[] findByDynamicWhere(String sql, Object[] sqlParams) throws TeamsDaoException;

}
