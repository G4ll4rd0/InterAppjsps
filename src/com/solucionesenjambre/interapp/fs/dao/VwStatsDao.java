/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwStatsDao
{
	/** 
	 * Returns all rows from the vw_stats table that match the criteria ''.
	 */
	public VwStats[] findAll() throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'player_id = :playerId'.
	 */
	public VwStats[] findWherePlayerIdEquals(int playerId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'team_id = :teamId'.
	 */
	public VwStats[] findWhereTeamIdEquals(int teamId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'school_id = :schoolId'.
	 */
	public VwStats[] findWhereSchoolIdEquals(int schoolId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'sport_id = :sportId'.
	 */
	public VwStats[] findWhereSportIdEquals(int sportId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'branch_id = :branchId'.
	 */
	public VwStats[] findWhereBranchIdEquals(int branchId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'event_id = :eventId'.
	 */
	public VwStats[] findWhereEventIdEquals(int eventId) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'number = :number'.
	 */
	public VwStats[] findWhereNumberEquals(int number) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'name = :name'.
	 */
	public VwStats[] findWhereNameEquals(String name) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwStats[] findWhereFirstLastnameEquals(String firstLastname) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwStats[] findWhereSecondLastnameEquals(String secondLastname) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'points = :points'.
	 */
	public VwStats[] findWherePointsEquals(long points) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public VwStats[] findWhereYellowCardsEquals(long yellowCards) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'red_cards = :redCards'.
	 */
	public VwStats[] findWhereRedCardsEquals(long redCards) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'code = :code'.
	 */
	public VwStats[] findWhereCodeEquals(String code) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'school = :school'.
	 */
	public VwStats[] findWhereSchoolEquals(String school) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'sport = :sport'.
	 */
	public VwStats[] findWhereSportEquals(String sport) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'event = :event'.
	 */
	public VwStats[] findWhereEventEquals(String event) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'branch = :branch'.
	 */
	public VwStats[] findWhereBranchEquals(String branch) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the criteria 'team_name = :teamName'.
	 */
	public VwStats[] findWhereTeamNameEquals(String teamName) throws VwStatsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_stats table that match the specified arbitrary SQL statement
	 */
	public VwStats[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwStatsDaoException;

	/** 
	 * Returns all rows from the vw_stats table that match the specified arbitrary SQL statement
	 */
	public VwStats[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwStatsDaoException;

}
