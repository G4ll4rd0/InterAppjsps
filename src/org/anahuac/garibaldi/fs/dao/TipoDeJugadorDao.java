/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface TipoDeJugadorDao
{
	/** 
	 * Inserts a new row in the tipo_de_jugador table.
	 */
	public TipoDeJugadorPk insert(TipoDeJugador dto) throws TipoDeJugadorDaoException;

	/** 
	 * Updates a single row in the tipo_de_jugador table.
	 */
	public void update(TipoDeJugadorPk pk, TipoDeJugador dto) throws TipoDeJugadorDaoException;

	/** 
	 * Deletes a single row in the tipo_de_jugador table.
	 */
	public void delete(TipoDeJugadorPk pk) throws TipoDeJugadorDaoException;

	/** 
	 * Returns the rows from the tipo_de_jugador table that matches the specified primary-key value.
	 */
	public TipoDeJugador findByPrimaryKey(TipoDeJugadorPk pk) throws TipoDeJugadorDaoException;

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public TipoDeJugador findByPrimaryKey(int tipoDeJugadorId) throws TipoDeJugadorDaoException;

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria ''.
	 */
	public TipoDeJugador[] findAll() throws TipoDeJugadorDaoException;

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public TipoDeJugador[] findWhereTipoDeJugadorIdEquals(int tipoDeJugadorId) throws TipoDeJugadorDaoException;

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the criteria 'Descripcion = :descripcion'.
	 */
	public TipoDeJugador[] findWhereDescripcionEquals(String descripcion) throws TipoDeJugadorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the specified arbitrary SQL statement
	 */
	public TipoDeJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoDeJugadorDaoException;

	/** 
	 * Returns all rows from the tipo_de_jugador table that match the specified arbitrary SQL statement
	 */
	public TipoDeJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoDeJugadorDaoException;

}
