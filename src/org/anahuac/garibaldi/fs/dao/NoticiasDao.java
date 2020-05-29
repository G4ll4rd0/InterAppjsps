/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface NoticiasDao
{
	/** 
	 * Inserts a new row in the noticias table.
	 */
	public NoticiasPk insert(Noticias dto) throws NoticiasDaoException;

	/** 
	 * Updates a single row in the noticias table.
	 */
	public void update(NoticiasPk pk, Noticias dto) throws NoticiasDaoException;

	/** 
	 * Deletes a single row in the noticias table.
	 */
	public void delete(NoticiasPk pk) throws NoticiasDaoException;

	/** 
	 * Returns the rows from the noticias table that matches the specified primary-key value.
	 */
	public Noticias findByPrimaryKey(NoticiasPk pk) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria 'noticias_ID = :noticiasId'.
	 */
	public Noticias findByPrimaryKey(int noticiasId) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria ''.
	 */
	public Noticias[] findAll() throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria 'noticias_ID = :noticiasId'.
	 */
	public Noticias[] findWhereNoticiasIdEquals(int noticiasId) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria 'Titulo = :titulo'.
	 */
	public Noticias[] findWhereTituloEquals(String titulo) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria 'Descripcion = :descripcion'.
	 */
	public Noticias[] findWhereDescripcionEquals(String descripcion) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the criteria 'desc_larga = :descLarga'.
	 */
	public Noticias[] findWhereDescLargaEquals(String descLarga) throws NoticiasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the noticias table that match the specified arbitrary SQL statement
	 */
	public Noticias[] findByDynamicSelect(String sql, Object[] sqlParams) throws NoticiasDaoException;

	/** 
	 * Returns all rows from the noticias table that match the specified arbitrary SQL statement
	 */
	public Noticias[] findByDynamicWhere(String sql, Object[] sqlParams) throws NoticiasDaoException;

}
