/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface CanchaDao
{
	/** 
	 * Inserts a new row in the cancha table.
	 */
	public CanchaPk insert(Cancha dto) throws CanchaDaoException;

	/** 
	 * Updates a single row in the cancha table.
	 */
	public void update(CanchaPk pk, Cancha dto) throws CanchaDaoException;

	/** 
	 * Deletes a single row in the cancha table.
	 */
	public void delete(CanchaPk pk) throws CanchaDaoException;

	/** 
	 * Returns the rows from the cancha table that matches the specified primary-key value.
	 */
	public Cancha findByPrimaryKey(CanchaPk pk) throws CanchaDaoException;

	/** 
	 * Returns all rows from the cancha table that match the criteria 'cancha_id = :canchaId'.
	 */
	public Cancha findByPrimaryKey(int canchaId) throws CanchaDaoException;

	/** 
	 * Returns all rows from the cancha table that match the criteria ''.
	 */
	public Cancha[] findAll() throws CanchaDaoException;

	/** 
	 * Returns all rows from the cancha table that match the criteria 'cancha_id = :canchaId'.
	 */
	public Cancha[] findWhereCanchaIdEquals(int canchaId) throws CanchaDaoException;

	/** 
	 * Returns all rows from the cancha table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Cancha[] findWhereDescripcionEquals(String descripcion) throws CanchaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cancha table that match the specified arbitrary SQL statement
	 */
	public Cancha[] findByDynamicSelect(String sql, Object[] sqlParams) throws CanchaDaoException;

	/** 
	 * Returns all rows from the cancha table that match the specified arbitrary SQL statement
	 */
	public Cancha[] findByDynamicWhere(String sql, Object[] sqlParams) throws CanchaDaoException;

}
