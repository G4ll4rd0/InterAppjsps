/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface SchoolsDao
{
	/** 
	 * Inserts a new row in the schools table.
	 */
	public SchoolsPk insert(Schools dto) throws SchoolsDaoException;

	/** 
	 * Updates a single row in the schools table.
	 */
	public void update(SchoolsPk pk, Schools dto) throws SchoolsDaoException;

	/** 
	 * Deletes a single row in the schools table.
	 */
	public void delete(SchoolsPk pk) throws SchoolsDaoException;

	/** 
	 * Returns the rows from the schools table that matches the specified primary-key value.
	 */
	public Schools findByPrimaryKey(SchoolsPk pk) throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the criteria 'school_id = :schoolId'.
	 */
	public Schools findByPrimaryKey(int schoolId) throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the criteria ''.
	 */
	public Schools[] findAll() throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the criteria 'school_id = :schoolId'.
	 */
	public Schools[] findWhereSchoolIdEquals(int schoolId) throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the criteria 'code = :code'.
	 */
	public Schools[] findWhereCodeEquals(String code) throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the criteria 'description = :description'.
	 */
	public Schools[] findWhereDescriptionEquals(String description) throws SchoolsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the schools table that match the specified arbitrary SQL statement
	 */
	public Schools[] findByDynamicSelect(String sql, Object[] sqlParams) throws SchoolsDaoException;

	/** 
	 * Returns all rows from the schools table that match the specified arbitrary SQL statement
	 */
	public Schools[] findByDynamicWhere(String sql, Object[] sqlParams) throws SchoolsDaoException;

}
