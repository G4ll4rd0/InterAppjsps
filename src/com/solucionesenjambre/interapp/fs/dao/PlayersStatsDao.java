/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface PlayersStatsDao
{
	/** 
	 * Inserts a new row in the players_stats table.
	 */
	public PlayersStatsPk insert(PlayersStats dto) throws PlayersStatsDaoException;

	/** 
	 * Updates a single row in the players_stats table.
	 */
	public void update(PlayersStatsPk pk, PlayersStats dto) throws PlayersStatsDaoException;

	/** 
	 * Deletes a single row in the players_stats table.
	 */
	public void delete(PlayersStatsPk pk) throws PlayersStatsDaoException;

	/** 
	 * Returns the rows from the players_stats table that matches the specified primary-key value.
	 */
	public PlayersStats findByPrimaryKey(PlayersStatsPk pk) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_stat_id = :playerStatId'.
	 */
	public PlayersStats findByPrimaryKey(int playerStatId) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria ''.
	 */
	public PlayersStats[] findAll() throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'game_id = :gameId'.
	 */
	public PlayersStats[] findByGames(int gameId) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_id = :playerId'.
	 */
	public PlayersStats[] findByPlayers(int playerId) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_stat_id = :playerStatId'.
	 */
	public PlayersStats[] findWherePlayerStatIdEquals(int playerStatId) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'points = :points'.
	 */
	public PlayersStats[] findWherePointsEquals(int points) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'yellow_cards = :yellowCards'.
	 */
	public PlayersStats[] findWhereYellowCardsEquals(int yellowCards) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'red_cards = :redCards'.
	 */
	public PlayersStats[] findWhereRedCardsEquals(int redCards) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'game_id = :gameId'.
	 */
	public PlayersStats[] findWhereGameIdEquals(int gameId) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the criteria 'player_id = :playerId'.
	 */
	public PlayersStats[] findWherePlayerIdEquals(int playerId) throws PlayersStatsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the players_stats table that match the specified arbitrary SQL statement
	 */
	public PlayersStats[] findByDynamicSelect(String sql, Object[] sqlParams) throws PlayersStatsDaoException;

	/** 
	 * Returns all rows from the players_stats table that match the specified arbitrary SQL statement
	 */
	public PlayersStats[] findByDynamicWhere(String sql, Object[] sqlParams) throws PlayersStatsDaoException;

}
