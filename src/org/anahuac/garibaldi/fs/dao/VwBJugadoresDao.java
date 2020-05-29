/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwBJugadoresDao
{
	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria ''.
	 */
	public VwBJugadores[] findAll() throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'jugadores_id = :jugadoresId'.
	 */
	public VwBJugadores[] findWhereJugadoresIdEquals(int jugadoresId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'tipo_de_jugador_id = :tipoDeJugadorId'.
	 */
	public VwBJugadores[] findWhereTipoDeJugadorIdEquals(int tipoDeJugadorId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwBJugadores[] findWhereEquipoIdEquals(int equipoId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwBJugadores[] findWhereDeporteIdEquals(int deporteId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwBJugadores[] findWhereSeccionIdEquals(int seccionId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwBJugadores[] findWhereRamaIdEquals(int ramaId) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Nombre = :nombre'.
	 */
	public VwBJugadores[] findWhereNombreEquals(String nombre) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Primer_Apellido = :primerApellido'.
	 */
	public VwBJugadores[] findWherePrimerApellidoEquals(String primerApellido) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Segundo_Apellido = :segundoApellido'.
	 */
	public VwBJugadores[] findWhereSegundoApellidoEquals(String segundoApellido) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'Numero = :numero'.
	 */
	public VwBJugadores[] findWhereNumeroEquals(int numero) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'tipo_jugador = :tipoJugador'.
	 */
	public VwBJugadores[] findWhereTipoJugadorEquals(String tipoJugador) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'deporte = :deporte'.
	 */
	public VwBJugadores[] findWhereDeporteEquals(String deporte) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'seccion = :seccion'.
	 */
	public VwBJugadores[] findWhereSeccionEquals(String seccion) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the criteria 'rama = :rama'.
	 */
	public VwBJugadores[] findWhereRamaEquals(String rama) throws VwBJugadoresDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the specified arbitrary SQL statement
	 */
	public VwBJugadores[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwBJugadoresDaoException;

	/** 
	 * Returns all rows from the vw_b_jugadores table that match the specified arbitrary SQL statement
	 */
	public VwBJugadores[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwBJugadoresDaoException;

}
