/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface CheerleadersDao
{
	/** 
	 * Inserts a new row in the cheerleaders table.
	 */
	public CheerleadersPk insert(Cheerleaders dto) throws CheerleadersDaoException;

	/** 
	 * Updates a single row in the cheerleaders table.
	 */
	public void update(CheerleadersPk pk, Cheerleaders dto) throws CheerleadersDaoException;

	/** 
	 * Deletes a single row in the cheerleaders table.
	 */
	public void delete(CheerleadersPk pk) throws CheerleadersDaoException;

	/** 
	 * Returns the rows from the cheerleaders table that matches the specified primary-key value.
	 */
	public Cheerleaders findByPrimaryKey(CheerleadersPk pk) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'cheerleader_id = :cheerleaderId'.
	 */
	public Cheerleaders findByPrimaryKey(int cheerleaderId) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria ''.
	 */
	public Cheerleaders[] findAll() throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'team_id = :teamId'.
	 */
	public Cheerleaders[] findByTeams(int teamId) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'cheerleader_id = :cheerleaderId'.
	 */
	public Cheerleaders[] findWhereCheerleaderIdEquals(int cheerleaderId) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'points = :points'.
	 */
	public Cheerleaders[] findWherePointsEquals(int points) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the criteria 'team_id = :teamId'.
	 */
	public Cheerleaders[] findWhereTeamIdEquals(int teamId) throws CheerleadersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cheerleaders table that match the specified arbitrary SQL statement
	 */
	public Cheerleaders[] findByDynamicSelect(String sql, Object[] sqlParams) throws CheerleadersDaoException;

	/** 
	 * Returns all rows from the cheerleaders table that match the specified arbitrary SQL statement
	 */
	public Cheerleaders[] findByDynamicWhere(String sql, Object[] sqlParams) throws CheerleadersDaoException;

}
