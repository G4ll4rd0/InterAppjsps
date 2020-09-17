/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface UsersTypesDao
{
	/** 
	 * Inserts a new row in the users_types table.
	 */
	public UsersTypesPk insert(UsersTypes dto) throws UsersTypesDaoException;

	/** 
	 * Updates a single row in the users_types table.
	 */
	public void update(UsersTypesPk pk, UsersTypes dto) throws UsersTypesDaoException;

	/** 
	 * Deletes a single row in the users_types table.
	 */
	public void delete(UsersTypesPk pk) throws UsersTypesDaoException;

	/** 
	 * Returns the rows from the users_types table that matches the specified primary-key value.
	 */
	public UsersTypes findByPrimaryKey(UsersTypesPk pk) throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public UsersTypes findByPrimaryKey(int userTypeId) throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the criteria ''.
	 */
	public UsersTypes[] findAll() throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public UsersTypes[] findWhereUserTypeIdEquals(int userTypeId) throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the criteria 'code = :code'.
	 */
	public UsersTypes[] findWhereCodeEquals(String code) throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the criteria 'description = :description'.
	 */
	public UsersTypes[] findWhereDescriptionEquals(String description) throws UsersTypesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the users_types table that match the specified arbitrary SQL statement
	 */
	public UsersTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersTypesDaoException;

	/** 
	 * Returns all rows from the users_types table that match the specified arbitrary SQL statement
	 */
	public UsersTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersTypesDaoException;

}
