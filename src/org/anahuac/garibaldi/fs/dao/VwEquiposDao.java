/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwEquiposDao
{
	/** 
	 * Returns all rows from the vw_equipos table that match the criteria ''.
	 */
	public VwEquipos[] findAll() throws VwEquiposDaoException;

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'Nombre = :nombre'.
	 */
	public VwEquipos[] findWhereNombreEquals(String nombre) throws VwEquiposDaoException;

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'nombre_equipo = :nombreEquipo'.
	 */
	public VwEquipos[] findWhereNombreEquipoEquals(String nombreEquipo) throws VwEquiposDaoException;

	/** 
	 * Returns all rows from the vw_equipos table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwEquipos[] findWhereEquipoIdEquals(int equipoId) throws VwEquiposDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_equipos table that match the specified arbitrary SQL statement
	 */
	public VwEquipos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwEquiposDaoException;

	/** 
	 * Returns all rows from the vw_equipos table that match the specified arbitrary SQL statement
	 */
	public VwEquipos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwEquiposDaoException;

}
