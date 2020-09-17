/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwIPointsDao
{
	/** 
	 * Returns all rows from the vw_i_points table that match the criteria ''.
	 */
	public VwIPoints[] findAll() throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'game_id = :gameId'.
	 */
	public VwIPoints[] findWhereGameIdEquals(int gameId) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'team1_id = :team1Id'.
	 */
	public VwIPoints[] findWhereTeam1IdEquals(int team1Id) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'points = :points'.
	 */
	public VwIPoints[] findWherePointsEquals(long points) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PJ = :pj'.
	 */
	public VwIPoints[] findWherePjEquals(long pj) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PG = :pg'.
	 */
	public VwIPoints[] findWherePgEquals(long pg) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PP = :pp'.
	 */
	public VwIPoints[] findWherePpEquals(long pp) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'PE = :pe'.
	 */
	public VwIPoints[] findWherePeEquals(long pe) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'GF = :gf'.
	 */
	public VwIPoints[] findWhereGfEquals(int gf) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the criteria 'GC = :gc'.
	 */
	public VwIPoints[] findWhereGcEquals(int gc) throws VwIPointsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_i_points table that match the specified arbitrary SQL statement
	 */
	public VwIPoints[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwIPointsDaoException;

	/** 
	 * Returns all rows from the vw_i_points table that match the specified arbitrary SQL statement
	 */
	public VwIPoints[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwIPointsDaoException;

}
