/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwSportsDao
{
	/** 
	 * Returns all rows from the vw_sports table that match the criteria ''.
	 */
	public VwSports[] findAll() throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'sport_id = :sportId'.
	 */
	public VwSports[] findWhereSportIdEquals(int sportId) throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'active_sport_id = :activeSportId'.
	 */
	public VwSports[] findWhereActiveSportIdEquals(int activeSportId) throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'event_id = :eventId'.
	 */
	public VwSports[] findWhereEventIdEquals(int eventId) throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'code = :code'.
	 */
	public VwSports[] findWhereCodeEquals(String code) throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the criteria 'description = :description'.
	 */
	public VwSports[] findWhereDescriptionEquals(String description) throws VwSportsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_sports table that match the specified arbitrary SQL statement
	 */
	public VwSports[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwSportsDaoException;

	/** 
	 * Returns all rows from the vw_sports table that match the specified arbitrary SQL statement
	 */
	public VwSports[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwSportsDaoException;

}
