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

public interface GamesDao
{
	/** 
	 * Inserts a new row in the games table.
	 */
	public GamesPk insert(Games dto) throws GamesDaoException;

	/** 
	 * Updates a single row in the games table.
	 */
	public void update(GamesPk pk, Games dto) throws GamesDaoException;

	/** 
	 * Deletes a single row in the games table.
	 */
	public void delete(GamesPk pk) throws GamesDaoException;

	/** 
	 * Returns the rows from the games table that matches the specified primary-key value.
	 */
	public Games findByPrimaryKey(GamesPk pk) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'game_id = :gameId'.
	 */
	public Games findByPrimaryKey(int gameId) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria ''.
	 */
	public Games[] findAll() throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'court_id = :courtId'.
	 */
	public Games[] findByCourts(int courtId) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'round_id = :roundId'.
	 */
	public Games[] findByRounds(int roundId) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_id = :team1Id'.
	 */
	public Games[] findByTeams(int team1Id) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_id = :team2Id'.
	 */
	public Games[] findByTeams2(int team2Id) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'game_id = :gameId'.
	 */
	public Games[] findWhereGameIdEquals(int gameId) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'date = :date'.
	 */
	public Games[] findWhereDateEquals(Date date) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'time = :time'.
	 */
	public Games[] findWhereTimeEquals(Date time) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'already_played = :alreadyPlayed'.
	 */
	public Games[] findWhereAlreadyPlayedEquals(int alreadyPlayed) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_id = :team1Id'.
	 */
	public Games[] findWhereTeam1IdEquals(int team1Id) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_id = :team2Id'.
	 */
	public Games[] findWhereTeam2IdEquals(int team2Id) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team1_result = :team1Result'.
	 */
	public Games[] findWhereTeam1ResultEquals(int team1Result) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'team2_result = :team2Result'.
	 */
	public Games[] findWhereTeam2ResultEquals(int team2Result) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'court_id = :courtId'.
	 */
	public Games[] findWhereCourtIdEquals(int courtId) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the criteria 'round_id = :roundId'.
	 */
	public Games[] findWhereRoundIdEquals(int roundId) throws GamesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the games table that match the specified arbitrary SQL statement
	 */
	public Games[] findByDynamicSelect(String sql, Object[] sqlParams) throws GamesDaoException;

	/** 
	 * Returns all rows from the games table that match the specified arbitrary SQL statement
	 */
	public Games[] findByDynamicWhere(String sql, Object[] sqlParams) throws GamesDaoException;

}
