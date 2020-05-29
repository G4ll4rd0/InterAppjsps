/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface RondaPartidoDao
{
	/** 
	 * Inserts a new row in the ronda_partido table.
	 */
	public RondaPartidoPk insert(RondaPartido dto) throws RondaPartidoDaoException;

	/** 
	 * Updates a single row in the ronda_partido table.
	 */
	public void update(RondaPartidoPk pk, RondaPartido dto) throws RondaPartidoDaoException;

	/** 
	 * Deletes a single row in the ronda_partido table.
	 */
	public void delete(RondaPartidoPk pk) throws RondaPartidoDaoException;

	/** 
	 * Returns the rows from the ronda_partido table that matches the specified primary-key value.
	 */
	public RondaPartido findByPrimaryKey(RondaPartidoPk pk) throws RondaPartidoDaoException;

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondaPartido findByPrimaryKey(int rondaId) throws RondaPartidoDaoException;

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria ''.
	 */
	public RondaPartido[] findAll() throws RondaPartidoDaoException;

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondaPartido[] findWhereRondaIdEquals(int rondaId) throws RondaPartidoDaoException;

	/** 
	 * Returns all rows from the ronda_partido table that match the criteria 'Descripción = :descripción'.
	 */
	public RondaPartido[] findWhereDescripciónEquals(String descripción) throws RondaPartidoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ronda_partido table that match the specified arbitrary SQL statement
	 */
	public RondaPartido[] findByDynamicSelect(String sql, Object[] sqlParams) throws RondaPartidoDaoException;

	/** 
	 * Returns all rows from the ronda_partido table that match the specified arbitrary SQL statement
	 */
	public RondaPartido[] findByDynamicWhere(String sql, Object[] sqlParams) throws RondaPartidoDaoException;

}
