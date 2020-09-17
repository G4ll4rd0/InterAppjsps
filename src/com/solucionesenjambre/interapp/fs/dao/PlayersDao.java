/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface PlayersDao
{
	/** 
	 * Inserts a new row in the players table.
	 */
	public PlayersPk insert(Players dto) throws PlayersDaoException;

	/** 
	 * Updates a single row in the players table.
	 */
	public void update(PlayersPk pk, Players dto) throws PlayersDaoException;

	/** 
	 * Deletes a single row in the players table.
	 */
	public void delete(PlayersPk pk) throws PlayersDaoException;

	/** 
	 * Returns the rows from the players table that matches the specified primary-key value.
	 */
	public Players findByPrimaryKey(PlayersPk pk) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_id = :playerId'.
	 */
	public Players findByPrimaryKey(int playerId) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria ''.
	 */
	public Players[] findAll() throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public Players[] findByPlayersTypes(int playerTypeId) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'team_id = :teamId'.
	 */
	public Players[] findByTeams(int teamId) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_id = :playerId'.
	 */
	public Players[] findWherePlayerIdEquals(int playerId) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_name = :playerName'.
	 */
	public Players[] findWherePlayerNameEquals(String playerName) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'first_lastname = :firstLastname'.
	 */
	public Players[] findWhereFirstLastnameEquals(String firstLastname) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'second_lastname = :secondLastname'.
	 */
	public Players[] findWhereSecondLastnameEquals(String secondLastname) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_number = :playerNumber'.
	 */
	public Players[] findWherePlayerNumberEquals(int playerNumber) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'team_id = :teamId'.
	 */
	public Players[] findWhereTeamIdEquals(int teamId) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public Players[] findWherePlayerTypeIdEquals(int playerTypeId) throws PlayersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the players table that match the specified arbitrary SQL statement
	 */
	public Players[] findByDynamicSelect(String sql, Object[] sqlParams) throws PlayersDaoException;

	/** 
	 * Returns all rows from the players table that match the specified arbitrary SQL statement
	 */
	public Players[] findByDynamicWhere(String sql, Object[] sqlParams) throws PlayersDaoException;

}
