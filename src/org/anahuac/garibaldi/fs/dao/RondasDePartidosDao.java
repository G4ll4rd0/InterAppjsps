/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface RondasDePartidosDao
{
	/** 
	 * Inserts a new row in the rondas_de_partidos table.
	 */
	public RondasDePartidosPk insert(RondasDePartidos dto) throws RondasDePartidosDaoException;

	/** 
	 * Updates a single row in the rondas_de_partidos table.
	 */
	public void update(RondasDePartidosPk pk, RondasDePartidos dto) throws RondasDePartidosDaoException;

	/** 
	 * Deletes a single row in the rondas_de_partidos table.
	 */
	public void delete(RondasDePartidosPk pk) throws RondasDePartidosDaoException;

	/** 
	 * Returns the rows from the rondas_de_partidos table that matches the specified primary-key value.
	 */
	public RondasDePartidos findByPrimaryKey(RondasDePartidosPk pk) throws RondasDePartidosDaoException;

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasDePartidos findByPrimaryKey(int rondaId) throws RondasDePartidosDaoException;

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the criteria ''.
	 */
	public RondasDePartidos[] findAll() throws RondasDePartidosDaoException;

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the criteria 'ronda_id = :rondaId'.
	 */
	public RondasDePartidos[] findWhereRondaIdEquals(int rondaId) throws RondasDePartidosDaoException;

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the criteria 'descripcion = :descripcion'.
	 */
	public RondasDePartidos[] findWhereDescripcionEquals(String descripcion) throws RondasDePartidosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasDePartidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws RondasDePartidosDaoException;

	/** 
	 * Returns all rows from the rondas_de_partidos table that match the specified arbitrary SQL statement
	 */
	public RondasDePartidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws RondasDePartidosDaoException;

}
