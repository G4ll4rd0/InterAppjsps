/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface HostsDao
{
	/** 
	 * Inserts a new row in the hosts table.
	 */
	public HostsPk insert(Hosts dto) throws HostsDaoException;

	/** 
	 * Updates a single row in the hosts table.
	 */
	public void update(HostsPk pk, Hosts dto) throws HostsDaoException;

	/** 
	 * Deletes a single row in the hosts table.
	 */
	public void delete(HostsPk pk) throws HostsDaoException;

	/** 
	 * Returns the rows from the hosts table that matches the specified primary-key value.
	 */
	public Hosts findByPrimaryKey(HostsPk pk) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts findByPrimaryKey(int hostId) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria ''.
	 */
	public Hosts[] findAll() throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts[] findWhereHostIdEquals(int hostId) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'nombre = :nombre'.
	 */
	public Hosts[] findWhereNombreEquals(String nombre) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'direccion = :direccion'.
	 */
	public Hosts[] findWhereDireccionEquals(String direccion) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'telefono = :telefono'.
	 */
	public Hosts[] findWhereTelefonoEquals(String telefono) throws HostsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the hosts table that match the specified arbitrary SQL statement
	 */
	public Hosts[] findByDynamicSelect(String sql, Object[] sqlParams) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the specified arbitrary SQL statement
	 */
	public Hosts[] findByDynamicWhere(String sql, Object[] sqlParams) throws HostsDaoException;

}
