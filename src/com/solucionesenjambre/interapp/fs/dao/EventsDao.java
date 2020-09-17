/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface EventsDao
{
	/** 
	 * Inserts a new row in the events table.
	 */
	public EventsPk insert(Events dto) throws EventsDaoException;

	/** 
	 * Updates a single row in the events table.
	 */
	public void update(EventsPk pk, Events dto) throws EventsDaoException;

	/** 
	 * Deletes a single row in the events table.
	 */
	public void delete(EventsPk pk) throws EventsDaoException;

	/** 
	 * Returns the rows from the events table that matches the specified primary-key value.
	 */
	public Events findByPrimaryKey(EventsPk pk) throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the criteria 'event_id = :eventId'.
	 */
	public Events findByPrimaryKey(int eventId) throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the criteria ''.
	 */
	public Events[] findAll() throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the criteria 'event_id = :eventId'.
	 */
	public Events[] findWhereEventIdEquals(int eventId) throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the criteria 'event_name = :eventName'.
	 */
	public Events[] findWhereEventNameEquals(String eventName) throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the criteria 'event_code = :eventCode'.
	 */
	public Events[] findWhereEventCodeEquals(String eventCode) throws EventsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the events table that match the specified arbitrary SQL statement
	 */
	public Events[] findByDynamicSelect(String sql, Object[] sqlParams) throws EventsDaoException;

	/** 
	 * Returns all rows from the events table that match the specified arbitrary SQL statement
	 */
	public Events[] findByDynamicWhere(String sql, Object[] sqlParams) throws EventsDaoException;

}
