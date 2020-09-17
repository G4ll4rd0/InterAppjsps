/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface NewsDao
{
	/** 
	 * Inserts a new row in the news table.
	 */
	public NewsPk insert(News dto) throws NewsDaoException;

	/** 
	 * Updates a single row in the news table.
	 */
	public void update(NewsPk pk, News dto) throws NewsDaoException;

	/** 
	 * Deletes a single row in the news table.
	 */
	public void delete(NewsPk pk) throws NewsDaoException;

	/** 
	 * Returns the rows from the news table that matches the specified primary-key value.
	 */
	public News findByPrimaryKey(NewsPk pk) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'new_id = :newId'.
	 */
	public News findByPrimaryKey(int newId) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria ''.
	 */
	public News[] findAll() throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'event_id = :eventId'.
	 */
	public News[] findByEvents(int eventId) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'new_id = :newId'.
	 */
	public News[] findWhereNewIdEquals(int newId) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'title = :title'.
	 */
	public News[] findWhereTitleEquals(String title) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'image = :image'.
	 */
	public News[] findWhereImageEquals(String image) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'description = :description'.
	 */
	public News[] findWhereDescriptionEquals(String description) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the criteria 'event_id = :eventId'.
	 */
	public News[] findWhereEventIdEquals(int eventId) throws NewsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the news table that match the specified arbitrary SQL statement
	 */
	public News[] findByDynamicSelect(String sql, Object[] sqlParams) throws NewsDaoException;

	/** 
	 * Returns all rows from the news table that match the specified arbitrary SQL statement
	 */
	public News[] findByDynamicWhere(String sql, Object[] sqlParams) throws NewsDaoException;

}
