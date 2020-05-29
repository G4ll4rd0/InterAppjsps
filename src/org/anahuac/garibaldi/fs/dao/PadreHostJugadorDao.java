/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface PadreHostJugadorDao
{
	/** 
	 * Inserts a new row in the padre_host_jugador table.
	 */
	public void insert(PadreHostJugador dto) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria ''.
	 */
	public PadreHostJugador[] findAll() throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_H = :idH'.
	 */
	public PadreHostJugador[] findByHosts(int idH) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public PadreHostJugador[] findByJugadores(int idJ) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_U = :idU'.
	 */
	public PadreHostJugador[] findByUsuario(int idU) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_J = :idJ'.
	 */
	public PadreHostJugador[] findWhereIdJEquals(int idJ) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_U = :idU'.
	 */
	public PadreHostJugador[] findWhereIdUEquals(int idU) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the criteria 'ID_H = :idH'.
	 */
	public PadreHostJugador[] findWhereIdHEquals(int idH) throws PadreHostJugadorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the padre_host_jugador table that match the specified arbitrary SQL statement
	 */
	public PadreHostJugador[] findByDynamicSelect(String sql, Object[] sqlParams) throws PadreHostJugadorDaoException;

	/** 
	 * Returns all rows from the padre_host_jugador table that match the specified arbitrary SQL statement
	 */
	public PadreHostJugador[] findByDynamicWhere(String sql, Object[] sqlParams) throws PadreHostJugadorDaoException;

}
