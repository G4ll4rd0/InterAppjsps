/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import java.util.Date;
import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface PartidoDao
{
	/** 
	 * Inserts a new row in the partido table.
	 */
	public PartidoPk insert(Partido dto) throws PartidoDaoException;

	/** 
	 * Updates a single row in the partido table.
	 */
	public void update(PartidoPk pk, Partido dto) throws PartidoDaoException;

	/** 
	 * Deletes a single row in the partido table.
	 */
	public void delete(PartidoPk pk) throws PartidoDaoException;

	/** 
	 * Returns the rows from the partido table that matches the specified primary-key value.
	 */
	public Partido findByPrimaryKey(PartidoPk pk) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'partido_id = :partidoId'.
	 */
	public Partido findByPrimaryKey(int partidoId) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria ''.
	 */
	public Partido[] findAll() throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_C = :idC'.
	 */
	public Partido[] findByCancha(int idC) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq2 = :idEq2'.
	 */
	public Partido[] findByEquipo(int idEq2) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Partido[] findByEquipo2(int idEq) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public Partido[] findByRondaPartido(int rondaId) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'partido_id = :partidoId'.
	 */
	public Partido[] findWherePartidoIdEquals(int partidoId) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'Fecha = :fecha'.
	 */
	public Partido[] findWhereFechaEquals(Date fecha) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'Hora = :hora'.
	 */
	public Partido[] findWhereHoraEquals(Date hora) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_C = :idC'.
	 */
	public Partido[] findWhereIdCEquals(int idC) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq = :idEq'.
	 */
	public Partido[] findWhereIdEqEquals(int idEq) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'Res_E1 = :resE1'.
	 */
	public Partido[] findWhereResE1Equals(int resE1) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'Res_E2 = :resE2'.
	 */
	public Partido[] findWhereResE2Equals(int resE2) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ID_Eq2 = :idEq2'.
	 */
	public Partido[] findWhereIdEq2Equals(int idEq2) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'YaJugado = :yaJugado'.
	 */
	public Partido[] findWhereYaJugadoEquals(int yaJugado) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the criteria 'ronda_id = :rondaId'.
	 */
	public Partido[] findWhereRondaIdEquals(int rondaId) throws PartidoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the partido table that match the specified arbitrary SQL statement
	 */
	public Partido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PartidoDaoException;

	/** 
	 * Returns all rows from the partido table that match the specified arbitrary SQL statement
	 */
	public Partido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PartidoDaoException;

}
