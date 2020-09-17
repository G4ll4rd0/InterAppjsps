/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface ActiveSportsDao
{
	/** 
	 * Inserts a new row in the active_sports table.
	 */
	public ActiveSportsPk insert(ActiveSports dto) throws ActiveSportsDaoException;

	/** 
	 * Updates a single row in the active_sports table.
	 */
	public void update(ActiveSportsPk pk, ActiveSports dto) throws ActiveSportsDaoException;

	/** 
	 * Deletes a single row in the active_sports table.
	 */
	public void delete(ActiveSportsPk pk) throws ActiveSportsDaoException;

	/** 
	 * Returns the rows from the active_sports table that matches the specified primary-key value.
	 */
	public ActiveSports findByPrimaryKey(ActiveSportsPk pk) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'active_sport_id = :activeSportId'.
	 */
	public ActiveSports findByPrimaryKey(int activeSportId) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria ''.
	 */
	public ActiveSports[] findAll() throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSports[] findByEvents(int eventId) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'sport_id = :sportId'.
	 */
	public ActiveSports[] findBySports(int sportId) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'active_sport_id = :activeSportId'.
	 */
	public ActiveSports[] findWhereActiveSportIdEquals(int activeSportId) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'sport_id = :sportId'.
	 */
	public ActiveSports[] findWhereSportIdEquals(int sportId) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSports[] findWhereEventIdEquals(int eventId) throws ActiveSportsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the active_sports table that match the specified arbitrary SQL statement
	 */
	public ActiveSports[] findByDynamicSelect(String sql, Object[] sqlParams) throws ActiveSportsDaoException;

	/** 
	 * Returns all rows from the active_sports table that match the specified arbitrary SQL statement
	 */
	public ActiveSports[] findByDynamicWhere(String sql, Object[] sqlParams) throws ActiveSportsDaoException;

}
