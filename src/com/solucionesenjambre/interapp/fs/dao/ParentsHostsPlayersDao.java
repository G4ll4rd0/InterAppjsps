/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface ParentsHostsPlayersDao
{
	/** 
	 * Inserts a new row in the parents_hosts_players table.
	 */
	public ParentsHostsPlayersPk insert(ParentsHostsPlayers dto) throws ParentsHostsPlayersDaoException;

	/** 
	 * Updates a single row in the parents_hosts_players table.
	 */
	public void update(ParentsHostsPlayersPk pk, ParentsHostsPlayers dto) throws ParentsHostsPlayersDaoException;

	/** 
	 * Deletes a single row in the parents_hosts_players table.
	 */
	public void delete(ParentsHostsPlayersPk pk) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns the rows from the parents_hosts_players table that matches the specified primary-key value.
	 */
	public ParentsHostsPlayers findByPrimaryKey(ParentsHostsPlayersPk pk) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'parent_host_player_id = :parentHostPlayerId'.
	 */
	public ParentsHostsPlayers findByPrimaryKey(int parentHostPlayerId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria ''.
	 */
	public ParentsHostsPlayers[] findAll() throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'host_id = :hostId'.
	 */
	public ParentsHostsPlayers[] findByHosts(int hostId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'player_id = :playerId'.
	 */
	public ParentsHostsPlayers[] findByPlayers(int playerId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'user_id = :userId'.
	 */
	public ParentsHostsPlayers[] findByUsers(int userId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'parent_host_player_id = :parentHostPlayerId'.
	 */
	public ParentsHostsPlayers[] findWhereParentHostPlayerIdEquals(int parentHostPlayerId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'host_id = :hostId'.
	 */
	public ParentsHostsPlayers[] findWhereHostIdEquals(int hostId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'player_id = :playerId'.
	 */
	public ParentsHostsPlayers[] findWherePlayerIdEquals(int playerId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the criteria 'user_id = :userId'.
	 */
	public ParentsHostsPlayers[] findWhereUserIdEquals(int userId) throws ParentsHostsPlayersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the parents_hosts_players table that match the specified arbitrary SQL statement
	 */
	public ParentsHostsPlayers[] findByDynamicSelect(String sql, Object[] sqlParams) throws ParentsHostsPlayersDaoException;

	/** 
	 * Returns all rows from the parents_hosts_players table that match the specified arbitrary SQL statement
	 */
	public ParentsHostsPlayers[] findByDynamicWhere(String sql, Object[] sqlParams) throws ParentsHostsPlayersDaoException;

}
