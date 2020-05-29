/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwPuntosDao
{
	/** 
	 * Returns all rows from the vw_puntos table that match the criteria ''.
	 */
	public VwPuntos[] findAll() throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwPuntos[] findWhereEquipoIdEquals(int equipoId) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwPuntos[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPuntos[] findWhereDeporteIdEquals(int deporteId) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwPuntos[] findWhereSeccionIdEquals(int seccionId) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwPuntos[] findWhereRamaIdEquals(int ramaId) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'codigo = :codigo'.
	 */
	public VwPuntos[] findWhereCodigoEquals(String codigo) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'nombre = :nombre'.
	 */
	public VwPuntos[] findWhereNombreEquals(String nombre) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'deporte = :deporte'.
	 */
	public VwPuntos[] findWhereDeporteEquals(String deporte) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'seccion = :seccion'.
	 */
	public VwPuntos[] findWhereSeccionEquals(String seccion) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'rama = :rama'.
	 */
	public VwPuntos[] findWhereRamaEquals(String rama) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'puntos = :puntos'.
	 */
	public VwPuntos[] findWherePuntosEquals(long puntos) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pj = :pj'.
	 */
	public VwPuntos[] findWherePjEquals(long pj) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pg = :pg'.
	 */
	public VwPuntos[] findWherePgEquals(long pg) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pe = :pe'.
	 */
	public VwPuntos[] findWherePeEquals(long pe) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'pp = :pp'.
	 */
	public VwPuntos[] findWherePpEquals(long pp) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'gf = :gf'.
	 */
	public VwPuntos[] findWhereGfEquals(long gf) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'gc = :gc'.
	 */
	public VwPuntos[] findWhereGcEquals(long gc) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the criteria 'diff = :diff'.
	 */
	public VwPuntos[] findWhereDiffEquals(long diff) throws VwPuntosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_puntos table that match the specified arbitrary SQL statement
	 */
	public VwPuntos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPuntosDaoException;

	/** 
	 * Returns all rows from the vw_puntos table that match the specified arbitrary SQL statement
	 */
	public VwPuntos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPuntosDaoException;

}
