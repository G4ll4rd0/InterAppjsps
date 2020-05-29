/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface FavoritoDelUsuarioDao
{
	/** 
	 * Inserts a new row in the favorito_del_usuario table.
	 */
	public void insert(FavoritoDelUsuario dto) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_D = :idD'.
	 */
	public FavoritoDelUsuario[] findByDelegaciones(int idD) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria ''.
	 */
	public FavoritoDelUsuario[] findAll() throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_De = :idDe'.
	 */
	public FavoritoDelUsuario[] findByDeporte(int idDe) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_Eq = :idEq'.
	 */
	public FavoritoDelUsuario[] findByEquipo(int idEq) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_U = :idU'.
	 */
	public FavoritoDelUsuario[] findByUsuario(int idU) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_U = :idU'.
	 */
	public FavoritoDelUsuario[] findWhereIdUEquals(int idU) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_D = :idD'.
	 */
	public FavoritoDelUsuario[] findWhereIdDEquals(int idD) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_Eq = :idEq'.
	 */
	public FavoritoDelUsuario[] findWhereIdEqEquals(int idEq) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the criteria 'ID_De = :idDe'.
	 */
	public FavoritoDelUsuario[] findWhereIdDeEquals(int idDe) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the specified arbitrary SQL statement
	 */
	public FavoritoDelUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws FavoritoDelUsuarioDaoException;

	/** 
	 * Returns all rows from the favorito_del_usuario table that match the specified arbitrary SQL statement
	 */
	public FavoritoDelUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws FavoritoDelUsuarioDaoException;

}
