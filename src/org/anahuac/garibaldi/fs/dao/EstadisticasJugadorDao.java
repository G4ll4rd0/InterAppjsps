/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface EstadisticasJugadorDao
{
	/** 
	 * Inserts a new row in the estadisticas_jugador table.
	 */
	public void insert(EstadisticasJugador dto) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria ''.
	 */
	public EstadisticasJugador[] findAll() throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public EstadisticasJugador[] findByJugadores(int idJ) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'partido_id = :partidoId'.
	 */
	public EstadisticasJugador[] findByPartido(int partidoId) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Goles = :goles'.
	 */
	public EstadisticasJugador[] findWhereGolesEquals(int goles) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Puntos = :puntos'.
	 */
	public EstadisticasJugador[] findWherePuntosEquals(int puntos) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Tarjetas_Am = :tarjetasAm'.
	 */
	public EstadisticasJugador[] findWhereTarjetasAmEquals(int tarjetasAm) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'Tarjetas_Ro = :tarjetasRo'.
	 */
	public EstadisticasJugador[] findWhereTarjetasRoEquals(int tarjetasRo) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public EstadisticasJugador[] findWhereIdJEquals(int idJ) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the criteria 'partido_id = :partidoId'.
	 */
	public EstadisticasJugador[] findWherePartidoIdEquals(int partidoId) throws EstadisticasJugadorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the specified arbitrary SQL statement
	 */
	public EstadisticasJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws EstadisticasJugadorDaoException;

	/** 
	 * Returns all rows from the estadisticas_jugador table that match the specified arbitrary SQL statement
	 */
	public EstadisticasJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws EstadisticasJugadorDaoException;

}
