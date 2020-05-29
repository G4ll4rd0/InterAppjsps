/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface DeporteDao
{
	/** 
	 * Inserts a new row in the deporte table.
	 */
	public DeportePk insert(Deporte dto) throws DeporteDaoException;

	/** 
	 * Updates a single row in the deporte table.
	 */
	public void update(DeportePk pk, Deporte dto) throws DeporteDaoException;

	/** 
	 * Deletes a single row in the deporte table.
	 */
	public void delete(DeportePk pk) throws DeporteDaoException;

	/** 
	 * Returns the rows from the deporte table that matches the specified primary-key value.
	 */
	public Deporte findByPrimaryKey(DeportePk pk) throws DeporteDaoException;

	/** 
	 * Returns all rows from the deporte table that match the criteria 'deporte_id = :deporteId'.
	 */
	public Deporte findByPrimaryKey(int deporteId) throws DeporteDaoException;

	/** 
	 * Returns all rows from the deporte table that match the criteria ''.
	 */
	public Deporte[] findAll() throws DeporteDaoException;

	/** 
	 * Returns all rows from the deporte table that match the criteria 'deporte_id = :deporteId'.
	 */
	public Deporte[] findWhereDeporteIdEquals(int deporteId) throws DeporteDaoException;

	/** 
	 * Returns all rows from the deporte table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Deporte[] findWhereDescripcionEquals(String descripcion) throws DeporteDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the deporte table that match the specified arbitrary SQL statement
	 */
	public Deporte[] findByDynamicSelect(String sql, Object[] sqlParams) throws DeporteDaoException;

	/** 
	 * Returns all rows from the deporte table that match the specified arbitrary SQL statement
	 */
	public Deporte[] findByDynamicWhere(String sql, Object[] sqlParams) throws DeporteDaoException;

}
