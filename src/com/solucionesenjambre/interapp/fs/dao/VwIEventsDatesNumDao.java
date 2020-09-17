/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwIEventsDatesNumDao
{
	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the criteria ''.
	 */
	public VwIEventsDatesNum[] findAll() throws VwIEventsDatesNumDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the criteria 'event_id = :eventId'.
	 */
	public VwIEventsDatesNum[] findWhereEventIdEquals(int eventId) throws VwIEventsDatesNumDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the criteria 'event_name = :eventName'.
	 */
	public VwIEventsDatesNum[] findWhereEventNameEquals(String eventName) throws VwIEventsDatesNumDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the criteria 'num = :num'.
	 */
	public VwIEventsDatesNum[] findWhereNumEquals(long num) throws VwIEventsDatesNumDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDatesNum[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwIEventsDatesNumDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates_num table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDatesNum[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwIEventsDatesNumDaoException;

}
