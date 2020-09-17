/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwStatsPerGameDao
{
	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria ''.
	 */
	public VwStatsPerGame[] findAll() throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_id = :playerId'.
	 */
	public VwStatsPerGame[] findWherePlayerIdEquals(int playerId) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'team_id = :teamId'.
	 */
	public VwStatsPerGame[] findWhereTeamIdEquals(int teamId) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'game_id = :gameId'.
	 */
	public VwStatsPerGame[] findWhereGameIdEquals(int gameId) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_name = :playerName'.
	 */
	public VwStatsPerGame[] findWherePlayerNameEquals(String playerName) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public VwStatsPerGame[] findWhereFirstLastnameEquals(String firstLastname) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public VwStatsPerGame[] findWhereSecondLastnameEquals(String secondLastname) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'player_number = :playerNumber'.
	 */
	public VwStatsPerGame[] findWherePlayerNumberEquals(int playerNumber) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'points = :points'.
	 */
	public VwStatsPerGame[] findWherePointsEquals(int points) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public VwStatsPerGame[] findWhereYellowCardsEquals(int yellowCards) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the criteria 'red_cards = :redCards'.
	 */
	public VwStatsPerGame[] findWhereRedCardsEquals(int redCards) throws VwStatsPerGameDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the specified arbitrary SQL statement
	 */
	public VwStatsPerGame[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwStatsPerGameDaoException;

	/** 
	 * Returns all rows from the vw_stats_per_game table that match the specified arbitrary SQL statement
	 */
	public VwStatsPerGame[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwStatsPerGameDaoException;

}
