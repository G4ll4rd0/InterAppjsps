/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import java.util.Date;
import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwIEventsDatesDao
{
	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria ''.
	 */
	public VwIEventsDates[] findAll() throws VwIEventsDatesDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'event_id = :eventId'.
	 */
	public VwIEventsDates[] findWhereEventIdEquals(int eventId) throws VwIEventsDatesDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'event_name = :eventName'.
	 */
	public VwIEventsDates[] findWhereEventNameEquals(String eventName) throws VwIEventsDatesDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the criteria 'date = :date'.
	 */
	public VwIEventsDates[] findWhereDateEquals(Date date) throws VwIEventsDatesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDates[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwIEventsDatesDaoException;

	/** 
	 * Returns all rows from the vw_i_events_dates table that match the specified arbitrary SQL statement
	 */
	public VwIEventsDates[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwIEventsDatesDaoException;

}
