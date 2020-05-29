/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface TipoDeUsuarioDao
{
	/** 
	 * Inserts a new row in the tipo_de_usuario table.
	 */
	public TipoDeUsuarioPk insert(TipoDeUsuario dto) throws TipoDeUsuarioDaoException;

	/** 
	 * Updates a single row in the tipo_de_usuario table.
	 */
	public void update(TipoDeUsuarioPk pk, TipoDeUsuario dto) throws TipoDeUsuarioDaoException;

	/** 
	 * Deletes a single row in the tipo_de_usuario table.
	 */
	public void delete(TipoDeUsuarioPk pk) throws TipoDeUsuarioDaoException;

	/** 
	 * Returns the rows from the tipo_de_usuario table that matches the specified primary-key value.
	 */
	public TipoDeUsuario findByPrimaryKey(TipoDeUsuarioPk pk) throws TipoDeUsuarioDaoException;

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'tipo_de_usuario_id = :tipoDeUsuarioId'.
	 */
	public TipoDeUsuario findByPrimaryKey(int tipoDeUsuarioId) throws TipoDeUsuarioDaoException;

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria ''.
	 */
	public TipoDeUsuario[] findAll() throws TipoDeUsuarioDaoException;

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'tipo_de_usuario_id = :tipoDeUsuarioId'.
	 */
	public TipoDeUsuario[] findWhereTipoDeUsuarioIdEquals(int tipoDeUsuarioId) throws TipoDeUsuarioDaoException;

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the criteria 'Descripcion = :descripcion'.
	 */
	public TipoDeUsuario[] findWhereDescripcionEquals(String descripcion) throws TipoDeUsuarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the specified arbitrary SQL statement
	 */
	public TipoDeUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoDeUsuarioDaoException;

	/** 
	 * Returns all rows from the tipo_de_usuario table that match the specified arbitrary SQL statement
	 */
	public TipoDeUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoDeUsuarioDaoException;

}
