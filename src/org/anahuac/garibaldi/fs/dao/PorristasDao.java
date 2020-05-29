/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface PorristasDao
{
	/** 
	 * Inserts a new row in the porristas table.
	 */
	public void insert(Porristas dto) throws PorristasDaoException;

	/** 
	 * Returns all rows from the porristas table that match the criteria ''.
	 */
	public Porristas[] findAll() throws PorristasDaoException;

	/** 
	 * Returns all rows from the porristas table that match the criteria 'ID_E = :idE'.
	 */
	public Porristas[] findByEquipo(int idE) throws PorristasDaoException;

	/** 
	 * Returns all rows from the porristas table that match the criteria 'ID_E = :idE'.
	 */
	public Porristas[] findWhereIdEEquals(int idE) throws PorristasDaoException;

	/** 
	 * Returns all rows from the porristas table that match the criteria 'puntos = :puntos'.
	 */
	public Porristas[] findWherePuntosEquals(int puntos) throws PorristasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the porristas table that match the specified arbitrary SQL statement
	 */
	public Porristas[] findByDynamicSelect(String sql, Object[] sqlParams) throws PorristasDaoException;

	/** 
	 * Returns all rows from the porristas table that match the specified arbitrary SQL statement
	 */
	public Porristas[] findByDynamicWhere(String sql, Object[] sqlParams) throws PorristasDaoException;

}
