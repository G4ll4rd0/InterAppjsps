/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwCheerDao
{
	/** 
	 * Returns all rows from the vw_cheer table that match the criteria ''.
	 */
	public VwCheer[] findAll() throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'team_id = :teamId'.
	 */
	public VwCheer[] findWhereTeamIdEquals(int teamId) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'school_id = :schoolId'.
	 */
	public VwCheer[] findWhereSchoolIdEquals(int schoolId) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'sport_id = :sportId'.
	 */
	public VwCheer[] findWhereSportIdEquals(int sportId) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'event_id = :eventId'.
	 */
	public VwCheer[] findWhereEventIdEquals(int eventId) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'points = :points'.
	 */
	public VwCheer[] findWherePointsEquals(int points) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'school = :school'.
	 */
	public VwCheer[] findWhereSchoolEquals(String school) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'code = :code'.
	 */
	public VwCheer[] findWhereCodeEquals(String code) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the criteria 'sport = :sport'.
	 */
	public VwCheer[] findWhereSportEquals(String sport) throws VwCheerDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_cheer table that match the specified arbitrary SQL statement
	 */
	public VwCheer[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwCheerDaoException;

	/** 
	 * Returns all rows from the vw_cheer table that match the specified arbitrary SQL statement
	 */
	public VwCheer[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwCheerDaoException;

}
