/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface UsuarioDao
{
	/** 
	 * Inserts a new row in the usuario table.
	 */
	public UsuarioPk insert(Usuario dto) throws UsuarioDaoException;

	/** 
	 * Updates a single row in the usuario table.
	 */
	public void update(UsuarioPk pk, Usuario dto) throws UsuarioDaoException;

	/** 
	 * Deletes a single row in the usuario table.
	 */
	public void delete(UsuarioPk pk) throws UsuarioDaoException;

	/** 
	 * Returns the rows from the usuario table that matches the specified primary-key value.
	 */
	public Usuario findByPrimaryKey(UsuarioPk pk) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'usuario_id = :usuarioId'.
	 */
	public Usuario findByPrimaryKey(int usuarioId) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria ''.
	 */
	public Usuario[] findAll() throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_D = :idD'.
	 */
	public Usuario[] findByDelegaciones(int idD) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_TdU = :idTdu'.
	 */
	public Usuario[] findByTipoDeUsuario(int idTdu) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'usuario_id = :usuarioId'.
	 */
	public Usuario[] findWhereUsuarioIdEquals(int usuarioId) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Username = :username'.
	 */
	public Usuario[] findWhereUsernameEquals(String username) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Pssword = :pssword'.
	 */
	public Usuario[] findWherePsswordEquals(String pssword) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Correo = :correo'.
	 */
	public Usuario[] findWhereCorreoEquals(String correo) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_TdU = :idTdu'.
	 */
	public Usuario[] findWhereIdTduEquals(int idTdu) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'ID_D = :idD'.
	 */
	public Usuario[] findWhereIdDEquals(int idD) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the criteria 'Seed = :seed'.
	 */
	public Usuario[] findWhereSeedEquals(String seed) throws UsuarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the usuario table that match the specified arbitrary SQL statement
	 */
	public Usuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsuarioDaoException;

	/** 
	 * Returns all rows from the usuario table that match the specified arbitrary SQL statement
	 */
	public Usuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsuarioDaoException;

}
