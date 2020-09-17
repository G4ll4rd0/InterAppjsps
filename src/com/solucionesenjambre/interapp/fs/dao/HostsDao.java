/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

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
	 * Returns all rows from the hosts table that match the criteria 'event_id = :eventId'.
	 */
	public Hosts[] findByEvents(int eventId) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_id = :hostId'.
	 */
	public Hosts[] findWhereHostIdEquals(int hostId) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_name = :hostName'.
	 */
	public Hosts[] findWhereHostNameEquals(String hostName) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_adress = :hostAdress'.
	 */
	public Hosts[] findWhereHostAdressEquals(String hostAdress) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'host_phone = :hostPhone'.
	 */
	public Hosts[] findWhereHostPhoneEquals(String hostPhone) throws HostsDaoException;

	/** 
	 * Returns all rows from the hosts table that match the criteria 'event_id = :eventId'.
	 */
	public Hosts[] findWhereEventIdEquals(int eventId) throws HostsDaoException;

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
