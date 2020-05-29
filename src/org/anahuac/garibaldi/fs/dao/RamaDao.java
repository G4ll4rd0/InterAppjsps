/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface RamaDao
{
	/** 
	 * Inserts a new row in the rama table.
	 */
	public RamaPk insert(Rama dto) throws RamaDaoException;

	/** 
	 * Updates a single row in the rama table.
	 */
	public void update(RamaPk pk, Rama dto) throws RamaDaoException;

	/** 
	 * Deletes a single row in the rama table.
	 */
	public void delete(RamaPk pk) throws RamaDaoException;

	/** 
	 * Returns the rows from the rama table that matches the specified primary-key value.
	 */
	public Rama findByPrimaryKey(RamaPk pk) throws RamaDaoException;

	/** 
	 * Returns all rows from the rama table that match the criteria 'rama_id = :ramaId'.
	 */
	public Rama findByPrimaryKey(int ramaId) throws RamaDaoException;

	/** 
	 * Returns all rows from the rama table that match the criteria ''.
	 */
	public Rama[] findAll() throws RamaDaoException;

	/** 
	 * Returns all rows from the rama table that match the criteria 'rama_id = :ramaId'.
	 */
	public Rama[] findWhereRamaIdEquals(int ramaId) throws RamaDaoException;

	/** 
	 * Returns all rows from the rama table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Rama[] findWhereDescripcionEquals(String descripcion) throws RamaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the rama table that match the specified arbitrary SQL statement
	 */
	public Rama[] findByDynamicSelect(String sql, Object[] sqlParams) throws RamaDaoException;

	/** 
	 * Returns all rows from the rama table that match the specified arbitrary SQL statement
	 */
	public Rama[] findByDynamicWhere(String sql, Object[] sqlParams) throws RamaDaoException;

}
