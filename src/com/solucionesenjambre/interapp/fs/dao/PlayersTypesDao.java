/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface PlayersTypesDao
{
	/** 
	 * Inserts a new row in the players_types table.
	 */
	public PlayersTypesPk insert(PlayersTypes dto) throws PlayersTypesDaoException;

	/** 
	 * Updates a single row in the players_types table.
	 */
	public void update(PlayersTypesPk pk, PlayersTypes dto) throws PlayersTypesDaoException;

	/** 
	 * Deletes a single row in the players_types table.
	 */
	public void delete(PlayersTypesPk pk) throws PlayersTypesDaoException;

	/** 
	 * Returns the rows from the players_types table that matches the specified primary-key value.
	 */
	public PlayersTypes findByPrimaryKey(PlayersTypesPk pk) throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public PlayersTypes findByPrimaryKey(int playerTypeId) throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the criteria ''.
	 */
	public PlayersTypes[] findAll() throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the criteria 'player_type_id = :playerTypeId'.
	 */
	public PlayersTypes[] findWherePlayerTypeIdEquals(int playerTypeId) throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the criteria 'code = :code'.
	 */
	public PlayersTypes[] findWhereCodeEquals(String code) throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the criteria 'description = :description'.
	 */
	public PlayersTypes[] findWhereDescriptionEquals(String description) throws PlayersTypesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the players_types table that match the specified arbitrary SQL statement
	 */
	public PlayersTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws PlayersTypesDaoException;

	/** 
	 * Returns all rows from the players_types table that match the specified arbitrary SQL statement
	 */
	public PlayersTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws PlayersTypesDaoException;

}
