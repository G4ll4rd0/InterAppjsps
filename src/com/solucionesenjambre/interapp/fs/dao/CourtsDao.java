/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface CourtsDao
{
	/** 
	 * Inserts a new row in the courts table.
	 */
	public CourtsPk insert(Courts dto) throws CourtsDaoException;

	/** 
	 * Updates a single row in the courts table.
	 */
	public void update(CourtsPk pk, Courts dto) throws CourtsDaoException;

	/** 
	 * Deletes a single row in the courts table.
	 */
	public void delete(CourtsPk pk) throws CourtsDaoException;

	/** 
	 * Returns the rows from the courts table that matches the specified primary-key value.
	 */
	public Courts findByPrimaryKey(CourtsPk pk) throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the criteria 'court_id = :courtId'.
	 */
	public Courts findByPrimaryKey(int courtId) throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the criteria ''.
	 */
	public Courts[] findAll() throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the criteria 'court_id = :courtId'.
	 */
	public Courts[] findWhereCourtIdEquals(int courtId) throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the criteria 'code = :code'.
	 */
	public Courts[] findWhereCodeEquals(String code) throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the criteria 'description = :description'.
	 */
	public Courts[] findWhereDescriptionEquals(String description) throws CourtsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the courts table that match the specified arbitrary SQL statement
	 */
	public Courts[] findByDynamicSelect(String sql, Object[] sqlParams) throws CourtsDaoException;

	/** 
	 * Returns all rows from the courts table that match the specified arbitrary SQL statement
	 */
	public Courts[] findByDynamicWhere(String sql, Object[] sqlParams) throws CourtsDaoException;

}
