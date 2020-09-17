/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface UsersFavoritesDao
{
	/** 
	 * Inserts a new row in the users_favorites table.
	 */
	public UsersFavoritesPk insert(UsersFavorites dto) throws UsersFavoritesDaoException;

	/** 
	 * Updates a single row in the users_favorites table.
	 */
	public void update(UsersFavoritesPk pk, UsersFavorites dto) throws UsersFavoritesDaoException;

	/** 
	 * Deletes a single row in the users_favorites table.
	 */
	public void delete(UsersFavoritesPk pk) throws UsersFavoritesDaoException;

	/** 
	 * Returns the rows from the users_favorites table that matches the specified primary-key value.
	 */
	public UsersFavorites findByPrimaryKey(UsersFavoritesPk pk) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_favorite_id = :userFavoriteId'.
	 */
	public UsersFavorites findByPrimaryKey(int userFavoriteId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria ''.
	 */
	public UsersFavorites[] findAll() throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'school_id = :schoolId'.
	 */
	public UsersFavorites[] findBySchools(int schoolId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'sport_id = :sportId'.
	 */
	public UsersFavorites[] findBySports(int sportId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'team_id = :teamId'.
	 */
	public UsersFavorites[] findByTeams(int teamId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_id = :userId'.
	 */
	public UsersFavorites[] findByUsers(int userId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_favorite_id = :userFavoriteId'.
	 */
	public UsersFavorites[] findWhereUserFavoriteIdEquals(int userFavoriteId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'user_id = :userId'.
	 */
	public UsersFavorites[] findWhereUserIdEquals(int userId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'team_id = :teamId'.
	 */
	public UsersFavorites[] findWhereTeamIdEquals(int teamId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'school_id = :schoolId'.
	 */
	public UsersFavorites[] findWhereSchoolIdEquals(int schoolId) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the criteria 'sport_id = :sportId'.
	 */
	public UsersFavorites[] findWhereSportIdEquals(int sportId) throws UsersFavoritesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the users_favorites table that match the specified arbitrary SQL statement
	 */
	public UsersFavorites[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersFavoritesDaoException;

	/** 
	 * Returns all rows from the users_favorites table that match the specified arbitrary SQL statement
	 */
	public UsersFavorites[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersFavoritesDaoException;

}
