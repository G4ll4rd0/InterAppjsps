/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwPorristasDao
{
	/** 
	 * Returns all rows from the vw_porristas table that match the criteria ''.
	 */
	public VwPorristas[] findAll() throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwPorristas[] findWhereEquipoIdEquals(int equipoId) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwPorristas[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPorristas[] findWhereDeporteIdEquals(int deporteId) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'puntos = :puntos'.
	 */
	public VwPorristas[] findWherePuntosEquals(int puntos) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'nombre = :nombre'.
	 */
	public VwPorristas[] findWhereNombreEquals(String nombre) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'codigo = :codigo'.
	 */
	public VwPorristas[] findWhereCodigoEquals(String codigo) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the criteria 'deporte = :deporte'.
	 */
	public VwPorristas[] findWhereDeporteEquals(String deporte) throws VwPorristasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_porristas table that match the specified arbitrary SQL statement
	 */
	public VwPorristas[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPorristasDaoException;

	/** 
	 * Returns all rows from the vw_porristas table that match the specified arbitrary SQL statement
	 */
	public VwPorristas[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPorristasDaoException;

}
