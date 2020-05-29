/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface DelegacionesDao
{
	/** 
	 * Inserts a new row in the delegaciones table.
	 */
	public DelegacionesPk insert(Delegaciones dto) throws DelegacionesDaoException;

	/** 
	 * Updates a single row in the delegaciones table.
	 */
	public void update(DelegacionesPk pk, Delegaciones dto) throws DelegacionesDaoException;

	/** 
	 * Deletes a single row in the delegaciones table.
	 */
	public void delete(DelegacionesPk pk) throws DelegacionesDaoException;

	/** 
	 * Returns the rows from the delegaciones table that matches the specified primary-key value.
	 */
	public Delegaciones findByPrimaryKey(DelegacionesPk pk) throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public Delegaciones findByPrimaryKey(int delegacionesId) throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the criteria ''.
	 */
	public Delegaciones[] findAll() throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public Delegaciones[] findWhereDelegacionesIdEquals(int delegacionesId) throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'Nombre = :nombre'.
	 */
	public Delegaciones[] findWhereNombreEquals(String nombre) throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the criteria 'Codigo = :codigo'.
	 */
	public Delegaciones[] findWhereCodigoEquals(String codigo) throws DelegacionesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the delegaciones table that match the specified arbitrary SQL statement
	 */
	public Delegaciones[] findByDynamicSelect(String sql, Object[] sqlParams) throws DelegacionesDaoException;

	/** 
	 * Returns all rows from the delegaciones table that match the specified arbitrary SQL statement
	 */
	public Delegaciones[] findByDynamicWhere(String sql, Object[] sqlParams) throws DelegacionesDaoException;

}
