/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface EquipoDao
{
	/** 
	 * Inserts a new row in the equipo table.
	 */
	public EquipoPk insert(Equipo dto) throws EquipoDaoException;

	/** 
	 * Updates a single row in the equipo table.
	 */
	public void update(EquipoPk pk, Equipo dto) throws EquipoDaoException;

	/** 
	 * Deletes a single row in the equipo table.
	 */
	public void delete(EquipoPk pk) throws EquipoDaoException;

	/** 
	 * Returns the rows from the equipo table that matches the specified primary-key value.
	 */
	public Equipo findByPrimaryKey(EquipoPk pk) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'equipo_id = :equipoId'.
	 */
	public Equipo findByPrimaryKey(int equipoId) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria ''.
	 */
	public Equipo[] findAll() throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_D = :idD'.
	 */
	public Equipo[] findByDelegaciones(int idD) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_De = :idDe'.
	 */
	public Equipo[] findByDeporte(int idDe) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_R = :idR'.
	 */
	public Equipo[] findByRama(int idR) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_S = :idS'.
	 */
	public Equipo[] findBySeccion(int idS) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'equipo_id = :equipoId'.
	 */
	public Equipo[] findWhereEquipoIdEquals(int equipoId) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_D = :idD'.
	 */
	public Equipo[] findWhereIdDEquals(int idD) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_S = :idS'.
	 */
	public Equipo[] findWhereIdSEquals(int idS) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_De = :idDe'.
	 */
	public Equipo[] findWhereIdDeEquals(int idDe) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the criteria 'ID_R = :idR'.
	 */
	public Equipo[] findWhereIdREquals(int idR) throws EquipoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the equipo table that match the specified arbitrary SQL statement
	 */
	public Equipo[] findByDynamicSelect(String sql, Object[] sqlParams) throws EquipoDaoException;

	/** 
	 * Returns all rows from the equipo table that match the specified arbitrary SQL statement
	 */
	public Equipo[] findByDynamicWhere(String sql, Object[] sqlParams) throws EquipoDaoException;

}
