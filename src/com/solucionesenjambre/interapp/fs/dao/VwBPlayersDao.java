/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwBPlayersDao
{
	/** 
	 * Returns all rows from the vw_b_players table that match the criteria ''.
	 */
	public VwBPlayers[] findAll() throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_id = :playerId'.
	 */
	public VwBPlayers[] findWherePlayerIdEquals(int playerId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public VwBPlayers[] findWherePlayerTypeIdEquals(int playerTypeId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'team_id = :teamId'.
	 */
	public VwBPlayers[] findWhereTeamIdEquals(int teamId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'sport_id = :sportId'.
	 */
	public VwBPlayers[] findWhereSportIdEquals(int sportId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'event_id = :eventId'.
	 */
	public VwBPlayers[] findWhereEventIdEquals(int eventId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'branch_id = :branchId'.
	 */
	public VwBPlayers[] findWhereBranchIdEquals(int branchId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_id = :schoolId'.
	 */
	public VwBPlayers[] findWhereSchoolIdEquals(int schoolId) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'name = :name'.
	 */
	public VwBPlayers[] findWhereNameEquals(String name) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwBPlayers[] findWhereFirstLastnameEquals(String firstLastname) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwBPlayers[] findWhereSecondLastnameEquals(String secondLastname) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'number = :number'.
	 */
	public VwBPlayers[] findWhereNumberEquals(int number) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'player_type = :playerType'.
	 */
	public VwBPlayers[] findWherePlayerTypeEquals(String playerType) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'sport = :sport'.
	 */
	public VwBPlayers[] findWhereSportEquals(String sport) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'EVENT = :event'.
	 */
	public VwBPlayers[] findWhereEventEquals(String event) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'branch = :branch'.
	 */
	public VwBPlayers[] findWhereBranchEquals(String branch) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_code = :schoolCode'.
	 */
	public VwBPlayers[] findWhereSchoolCodeEquals(String schoolCode) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the criteria 'school_name = :schoolName'.
	 */
	public VwBPlayers[] findWhereSchoolNameEquals(String schoolName) throws VwBPlayersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_b_players table that match the specified arbitrary SQL statement
	 */
	public VwBPlayers[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwBPlayersDaoException;

	/** 
	 * Returns all rows from the vw_b_players table that match the specified arbitrary SQL statement
	 */
	public VwBPlayers[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwBPlayersDaoException;

}
