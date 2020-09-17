/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwPointsDao
{
	/** 
	 * Returns all rows from the vw_points table that match the criteria ''.
	 */
	public VwPoints[] findAll() throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'team1_id = :team1Id'.
	 */
	public VwPoints[] findWhereTeam1IdEquals(int team1Id) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'school_id = :schoolId'.
	 */
	public VwPoints[] findWhereSchoolIdEquals(int schoolId) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'sport_id = :sportId'.
	 */
	public VwPoints[] findWhereSportIdEquals(int sportId) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'event_id = :eventId'.
	 */
	public VwPoints[] findWhereEventIdEquals(int eventId) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'branch_id = :branchId'.
	 */
	public VwPoints[] findWhereBranchIdEquals(int branchId) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'code = :code'.
	 */
	public VwPoints[] findWhereCodeEquals(String code) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'name = :name'.
	 */
	public VwPoints[] findWhereNameEquals(String name) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'sport = :sport'.
	 */
	public VwPoints[] findWhereSportEquals(String sport) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'event = :event'.
	 */
	public VwPoints[] findWhereEventEquals(String event) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'branch = :branch'.
	 */
	public VwPoints[] findWhereBranchEquals(String branch) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'points = :points'.
	 */
	public VwPoints[] findWherePointsEquals(long points) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pj = :pj'.
	 */
	public VwPoints[] findWherePjEquals(long pj) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pg = :pg'.
	 */
	public VwPoints[] findWherePgEquals(long pg) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pe = :pe'.
	 */
	public VwPoints[] findWherePeEquals(long pe) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'pp = :pp'.
	 */
	public VwPoints[] findWherePpEquals(long pp) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'gf = :gf'.
	 */
	public VwPoints[] findWhereGfEquals(long gf) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'gc = :gc'.
	 */
	public VwPoints[] findWhereGcEquals(long gc) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'diff = :diff'.
	 */
	public VwPoints[] findWhereDiffEquals(long diff) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the criteria 'priority_points = :priorityPoints'.
	 */
	public VwPoints[] findWherePriorityPointsEquals(int priorityPoints) throws VwPointsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_points table that match the specified arbitrary SQL statement
	 */
	public VwPoints[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPointsDaoException;

	/** 
	 * Returns all rows from the vw_points table that match the specified arbitrary SQL statement
	 */
	public VwPoints[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPointsDaoException;

}
