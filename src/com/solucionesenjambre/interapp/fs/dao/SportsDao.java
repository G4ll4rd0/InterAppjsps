/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface SportsDao
{
	/** 
	 * Inserts a new row in the sports table.
	 */
	public SportsPk insert(Sports dto) throws SportsDaoException;

	/** 
	 * Updates a single row in the sports table.
	 */
	public void update(SportsPk pk, Sports dto) throws SportsDaoException;

	/** 
	 * Deletes a single row in the sports table.
	 */
	public void delete(SportsPk pk) throws SportsDaoException;

	/** 
	 * Returns the rows from the sports table that matches the specified primary-key value.
	 */
	public Sports findByPrimaryKey(SportsPk pk) throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the criteria 'sport_id = :sportId'.
	 */
	public Sports findByPrimaryKey(int sportId) throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the criteria ''.
	 */
	public Sports[] findAll() throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the criteria 'sport_id = :sportId'.
	 */
	public Sports[] findWhereSportIdEquals(int sportId) throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the criteria 'code = :code'.
	 */
	public Sports[] findWhereCodeEquals(String code) throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the criteria 'description = :description'.
	 */
	public Sports[] findWhereDescriptionEquals(String description) throws SportsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sports table that match the specified arbitrary SQL statement
	 */
	public Sports[] findByDynamicSelect(String sql, Object[] sqlParams) throws SportsDaoException;

	/** 
	 * Returns all rows from the sports table that match the specified arbitrary SQL statement
	 */
	public Sports[] findByDynamicWhere(String sql, Object[] sqlParams) throws SportsDaoException;

}
