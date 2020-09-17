/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import java.util.Date;
import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwGamesDao
{
	/** 
	 * Returns all rows from the vw_games table that match the criteria ''.
	 */
	public VwGames[] findAll() throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'game_id = :gameId'.
	 */
	public VwGames[] findWhereGameIdEquals(int gameId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'court_id = :courtId'.
	 */
	public VwGames[] findWhereCourtIdEquals(int courtId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_team_id = :localTeamId'.
	 */
	public VwGames[] findWhereLocalTeamIdEquals(int localTeamId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_school_id = :localSchoolId'.
	 */
	public VwGames[] findWhereLocalSchoolIdEquals(int localSchoolId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_team_id = :visitanteTeamId'.
	 */
	public VwGames[] findWhereVisitanteTeamIdEquals(int visitanteTeamId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_school_id = :visitanteSchoolId'.
	 */
	public VwGames[] findWhereVisitanteSchoolIdEquals(int visitanteSchoolId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'sport_id = :sportId'.
	 */
	public VwGames[] findWhereSportIdEquals(int sportId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'event_id = :eventId'.
	 */
	public VwGames[] findWhereEventIdEquals(int eventId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'branch_id = :branchId'.
	 */
	public VwGames[] findWhereBranchIdEquals(int branchId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'round_id = :roundId'.
	 */
	public VwGames[] findWhereRoundIdEquals(int roundId) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'date = :date'.
	 */
	public VwGames[] findWhereDateEquals(Date date) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'time = :time'.
	 */
	public VwGames[] findWhereTimeEquals(Date time) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_code_delegacion = :localCodeDelegacion'.
	 */
	public VwGames[] findWhereLocalCodeDelegacionEquals(String localCodeDelegacion) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'local_name_delegacion = :localNameDelegacion'.
	 */
	public VwGames[] findWhereLocalNameDelegacionEquals(String localNameDelegacion) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'team1_result = :team1Result'.
	 */
	public VwGames[] findWhereTeam1ResultEquals(int team1Result) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'team2_result = :team2Result'.
	 */
	public VwGames[] findWhereTeam2ResultEquals(int team2Result) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_code_delegacion = :visitanteCodeDelegacion'.
	 */
	public VwGames[] findWhereVisitanteCodeDelegacionEquals(String visitanteCodeDelegacion) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'visitante_name_delegacion = :visitanteNameDelegacion'.
	 */
	public VwGames[] findWhereVisitanteNameDelegacionEquals(String visitanteNameDelegacion) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'court_name = :courtName'.
	 */
	public VwGames[] findWhereCourtNameEquals(String courtName) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'sport_name = :sportName'.
	 */
	public VwGames[] findWhereSportNameEquals(String sportName) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'event_name = :eventName'.
	 */
	public VwGames[] findWhereEventNameEquals(String eventName) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'branch_name = :branchName'.
	 */
	public VwGames[] findWhereBranchNameEquals(String branchName) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'round_name = :roundName'.
	 */
	public VwGames[] findWhereRoundNameEquals(String roundName) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the criteria 'already_played = :alreadyPlayed'.
	 */
	public VwGames[] findWhereAlreadyPlayedEquals(int alreadyPlayed) throws VwGamesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_games table that match the specified arbitrary SQL statement
	 */
	public VwGames[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwGamesDaoException;

	/** 
	 * Returns all rows from the vw_games table that match the specified arbitrary SQL statement
	 */
	public VwGames[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwGamesDaoException;

}
