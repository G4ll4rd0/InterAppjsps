/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface JugadoresDao
{
	/** 
	 * Inserts a new row in the jugadores table.
	 */
	public JugadoresPk insert(Jugadores dto) throws JugadoresDaoException;

	/** 
	 * Updates a single row in the jugadores table.
	 */
	public void update(JugadoresPk pk, Jugadores dto) throws JugadoresDaoException;

	/** 
	 * Deletes a single row in the jugadores table.
	 */
	public void delete(JugadoresPk pk) throws JugadoresDaoException;

	/** 
	 * Returns the rows from the jugadores table that matches the specified primary-key value.
	 */
	public Jugadores findByPrimaryKey(JugadoresPk pk) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public Jugadores findByPrimaryKey(int jugadoresId) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria ''.
	 */
	public Jugadores[] findAll() throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Jugadores[] findByEquipo(int idEq) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_TdJ = :idTdj'.
	 */
	public Jugadores[] findByTipoDeJugador(int idTdj) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public Jugadores[] findWhereJugadoresIdEquals(int jugadoresId) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'Nombre = :nombre'.
	 */
	public Jugadores[] findWhereNombreEquals(String nombre) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'primer_apellido = :primerApellido'.
	 */
	public Jugadores[] findWherePrimerApellidoEquals(String primerApellido) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'segundo_apellido = :segundoApellido'.
	 */
	public Jugadores[] findWhereSegundoApellidoEquals(String segundoApellido) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'Numero = :numero'.
	 */
	public Jugadores[] findWhereNumeroEquals(int numero) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Jugadores[] findWhereIdEqEquals(int idEq) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the criteria 'ID_TdJ = :idTdj'.
	 */
	public Jugadores[] findWhereIdTdjEquals(int idTdj) throws JugadoresDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the jugadores table that match the specified arbitrary SQL statement
	 */
	public Jugadores[] findByDynamicSelect(String sql, Object[] sqlParams) throws JugadoresDaoException;

	/** 
	 * Returns all rows from the jugadores table that match the specified arbitrary SQL statement
	 */
	public Jugadores[] findByDynamicWhere(String sql, Object[] sqlParams) throws JugadoresDaoException;

}
