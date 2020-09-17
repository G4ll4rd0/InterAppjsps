/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface ActiveSchoolsDao
{
	/** 
	 * Inserts a new row in the active_schools table.
	 */
	public ActiveSchoolsPk insert(ActiveSchools dto) throws ActiveSchoolsDaoException;

	/** 
	 * Updates a single row in the active_schools table.
	 */
	public void update(ActiveSchoolsPk pk, ActiveSchools dto) throws ActiveSchoolsDaoException;

	/** 
	 * Deletes a single row in the active_schools table.
	 */
	public void delete(ActiveSchoolsPk pk) throws ActiveSchoolsDaoException;

	/** 
	 * Returns the rows from the active_schools table that matches the specified primary-key value.
	 */
	public ActiveSchools findByPrimaryKey(ActiveSchoolsPk pk) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public ActiveSchools findByPrimaryKey(int activeSchoolId) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria ''.
	 */
	public ActiveSchools[] findAll() throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSchools[] findByEvents(int eventId) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public ActiveSchools[] findBySchools(int schoolId) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public ActiveSchools[] findWhereActiveSchoolIdEquals(int activeSchoolId) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public ActiveSchools[] findWhereSchoolIdEquals(int schoolId) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the criteria 'event_id = :eventId'.
	 */
	public ActiveSchools[] findWhereEventIdEquals(int eventId) throws ActiveSchoolsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the active_schools table that match the specified arbitrary SQL statement
	 */
	public ActiveSchools[] findByDynamicSelect(String sql, Object[] sqlParams) throws ActiveSchoolsDaoException;

	/** 
	 * Returns all rows from the active_schools table that match the specified arbitrary SQL statement
	 */
	public ActiveSchools[] findByDynamicWhere(String sql, Object[] sqlParams) throws ActiveSchoolsDaoException;

}
