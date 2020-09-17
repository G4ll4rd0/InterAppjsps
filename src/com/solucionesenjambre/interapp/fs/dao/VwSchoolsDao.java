/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwSchoolsDao
{
	/** 
	 * Returns all rows from the vw_schools table that match the criteria ''.
	 */
	public VwSchools[] findAll() throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'school_id = :schoolId'.
	 */
	public VwSchools[] findWhereSchoolIdEquals(int schoolId) throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'active_school_id = :activeSchoolId'.
	 */
	public VwSchools[] findWhereActiveSchoolIdEquals(int activeSchoolId) throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'event_id = :eventId'.
	 */
	public VwSchools[] findWhereEventIdEquals(int eventId) throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'code = :code'.
	 */
	public VwSchools[] findWhereCodeEquals(String code) throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the criteria 'description = :description'.
	 */
	public VwSchools[] findWhereDescriptionEquals(String description) throws VwSchoolsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_schools table that match the specified arbitrary SQL statement
	 */
	public VwSchools[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwSchoolsDaoException;

	/** 
	 * Returns all rows from the vw_schools table that match the specified arbitrary SQL statement
	 */
	public VwSchools[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwSchoolsDaoException;

}
