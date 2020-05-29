/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface DeporteActivoDao
{
	/** 
	 * Inserts a new row in the deporte_activo table.
	 */
	public void insert(DeporteActivo dto) throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria ''.
	 */
	public DeporteActivo[] findAll() throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_De = :idDe'.
	 */
	public DeporteActivo[] findByDeporte(int idDe) throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_S = :idS'.
	 */
	public DeporteActivo[] findBySeccion(int idS) throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_De = :idDe'.
	 */
	public DeporteActivo[] findWhereIdDeEquals(int idDe) throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the criteria 'ID_S = :idS'.
	 */
	public DeporteActivo[] findWhereIdSEquals(int idS) throws DeporteActivoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the deporte_activo table that match the specified arbitrary SQL statement
	 */
	public DeporteActivo[] findByDynamicSelect(String sql, Object[] sqlParams) throws DeporteActivoDaoException;

	/** 
	 * Returns all rows from the deporte_activo table that match the specified arbitrary SQL statement
	 */
	public DeporteActivo[] findByDynamicWhere(String sql, Object[] sqlParams) throws DeporteActivoDaoException;

}
