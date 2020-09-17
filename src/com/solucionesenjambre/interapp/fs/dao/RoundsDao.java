/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface RoundsDao
{
	/** 
	 * Inserts a new row in the rounds table.
	 */
	public RoundsPk insert(Rounds dto) throws RoundsDaoException;

	/** 
	 * Updates a single row in the rounds table.
	 */
	public void update(RoundsPk pk, Rounds dto) throws RoundsDaoException;

	/** 
	 * Deletes a single row in the rounds table.
	 */
	public void delete(RoundsPk pk) throws RoundsDaoException;

	/** 
	 * Returns the rows from the rounds table that matches the specified primary-key value.
	 */
	public Rounds findByPrimaryKey(RoundsPk pk) throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the criteria 'round_id = :roundId'.
	 */
	public Rounds findByPrimaryKey(int roundId) throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the criteria ''.
	 */
	public Rounds[] findAll() throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the criteria 'round_id = :roundId'.
	 */
	public Rounds[] findWhereRoundIdEquals(int roundId) throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the criteria 'code = :code'.
	 */
	public Rounds[] findWhereCodeEquals(String code) throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the criteria 'description = :description'.
	 */
	public Rounds[] findWhereDescriptionEquals(String description) throws RoundsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the rounds table that match the specified arbitrary SQL statement
	 */
	public Rounds[] findByDynamicSelect(String sql, Object[] sqlParams) throws RoundsDaoException;

	/** 
	 * Returns all rows from the rounds table that match the specified arbitrary SQL statement
	 */
	public Rounds[] findByDynamicWhere(String sql, Object[] sqlParams) throws RoundsDaoException;

}
