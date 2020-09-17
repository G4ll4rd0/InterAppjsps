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

public interface VwDatesDao
{
	/** 
	 * Returns all rows from the vw_dates table that match the criteria ''.
	 */
	public VwDates[] findAll() throws VwDatesDaoException;

	/** 
	 * Returns all rows from the vw_dates table that match the criteria 'event_id = :eventId'.
	 */
	public VwDates[] findWhereEventIdEquals(int eventId) throws VwDatesDaoException;

	/** 
	 * Returns all rows from the vw_dates table that match the criteria 'event_name = :eventName'.
	 */
	public VwDates[] findWhereEventNameEquals(String eventName) throws VwDatesDaoException;

	/** 
	 * Returns all rows from the vw_dates table that match the criteria 'date = :date'.
	 */
	public VwDates[] findWhereDateEquals(Date date) throws VwDatesDaoException;

	/** 
	 * Returns all rows from the vw_dates table that match the criteria 'num = :num'.
	 */
	public VwDates[] findWhereNumEquals(long num) throws VwDatesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_dates table that match the specified arbitrary SQL statement
	 */
	public VwDates[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwDatesDaoException;

	/** 
	 * Returns all rows from the vw_dates table that match the specified arbitrary SQL statement
	 */
	public VwDates[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwDatesDaoException;

}
