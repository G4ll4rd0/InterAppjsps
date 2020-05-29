/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface RondasPartidosDao
{
	/** 
	 * Inserts a new row in the rondas_partidos table.
	 */
	public RondasPartidosPk insert(RondasPartidos dto) throws RondasPartidosDaoException;

	/** 
	 * Updates a single row in the rondas_partidos table.
	 */
	public void update(RondasPartidosPk pk, RondasPartidos dto) throws RondasPartidosDaoException;

	/** 
	 * Deletes a single row in the rondas_partidos table.
	 */
	public void delete(RondasPartidosPk pk) throws RondasPartidosDaoException;

	/** 
	 * Returns the rows from the rondas_partidos table that matches the specified primary-key value.
	 */
	public RondasPartidos findByPrimaryKey(RondasPartidosPk pk) throws RondasPartidosDaoException;

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasPartidos findByPrimaryKey(int rondaId) throws RondasPartidosDaoException;

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria ''.
	 */
	public RondasPartidos[] findAll() throws RondasPartidosDaoException;

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasPartidos[] findWhereRondaIdEquals(int rondaId) throws RondasPartidosDaoException;

	/** 
	 * Returns all rows from the rondas_partidos table that match the criteria 'Descripción = :descripción'.
	 */
	public RondasPartidos[] findWhereDescripciónEquals(String descripción) throws RondasPartidosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the rondas_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasPartidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws RondasPartidosDaoException;

	/** 
	 * Returns all rows from the rondas_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasPartidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws RondasPartidosDaoException;

}
