/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface SeccionDao
{
	/** 
	 * Inserts a new row in the seccion table.
	 */
	public SeccionPk insert(Seccion dto) throws SeccionDaoException;

	/** 
	 * Updates a single row in the seccion table.
	 */
	public void update(SeccionPk pk, Seccion dto) throws SeccionDaoException;

	/** 
	 * Deletes a single row in the seccion table.
	 */
	public void delete(SeccionPk pk) throws SeccionDaoException;

	/** 
	 * Returns the rows from the seccion table that matches the specified primary-key value.
	 */
	public Seccion findByPrimaryKey(SeccionPk pk) throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the criteria 'seccion_id = :seccionId'.
	 */
	public Seccion findByPrimaryKey(int seccionId) throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the criteria ''.
	 */
	public Seccion[] findAll() throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the criteria 'seccion_id = :seccionId'.
	 */
	public Seccion[] findWhereSeccionIdEquals(int seccionId) throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Seccion[] findWhereDescripcionEquals(String descripcion) throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the criteria 'Activa = :activa'.
	 */
	public Seccion[] findWhereActivaEquals(short activa) throws SeccionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the seccion table that match the specified arbitrary SQL statement
	 */
	public Seccion[] findByDynamicSelect(String sql, Object[] sqlParams) throws SeccionDaoException;

	/** 
	 * Returns all rows from the seccion table that match the specified arbitrary SQL statement
	 */
	public Seccion[] findByDynamicWhere(String sql, Object[] sqlParams) throws SeccionDaoException;

}
