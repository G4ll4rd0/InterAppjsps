/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface UsersDao
{
	/** 
	 * Inserts a new row in the users table.
	 */
	public UsersPk insert(Users dto) throws UsersDaoException;

	/** 
	 * Updates a single row in the users table.
	 */
	public void update(UsersPk pk, Users dto) throws UsersDaoException;

	/** 
	 * Deletes a single row in the users table.
	 */
	public void delete(UsersPk pk) throws UsersDaoException;

	/** 
	 * Returns the rows from the users table that matches the specified primary-key value.
	 */
	public Users findByPrimaryKey(UsersPk pk) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'user_id = :userId'.
	 */
	public Users findByPrimaryKey(int userId) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria ''.
	 */
	public Users[] findAll() throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'event_id = :eventId'.
	 */
	public Users[] findByEvents(int eventId) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public Users[] findByUsersTypes(int userTypeId) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'user_id = :userId'.
	 */
	public Users[] findWhereUserIdEquals(int userId) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'username = :username'.
	 */
	public Users[] findWhereUsernameEquals(String username) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'pssword = :pssword'.
	 */
	public Users[] findWherePsswordEquals(String pssword) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'email = :email'.
	 */
	public Users[] findWhereEmailEquals(String email) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'seed = :seed'.
	 */
	public Users[] findWhereSeedEquals(String seed) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'user_type_id = :userTypeId'.
	 */
	public Users[] findWhereUserTypeIdEquals(int userTypeId) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the criteria 'event_id = :eventId'.
	 */
	public Users[] findWhereEventIdEquals(int eventId) throws UsersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersDaoException;

	/** 
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersDaoException;

}
