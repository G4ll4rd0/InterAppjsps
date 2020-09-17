/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface VwHostsDao
{
	/** 
	 * Returns all rows from the vw_hosts table that match the criteria ''.
	 */
	public VwHosts[] findAll() throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'player_id = :playerId'.
	 */
	public VwHosts[] findWherePlayerIdEquals(int playerId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'parent_id = :parentId'.
	 */
	public VwHosts[] findWhereParentIdEquals(int parentId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'parent_seed = :parentSeed'.
	 */
	public VwHosts[] findWhereParentSeedEquals(String parentSeed) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_id = :hostId'.
	 */
	public VwHosts[] findWhereHostIdEquals(int hostId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_name = :hostName'.
	 */
	public VwHosts[] findWhereHostNameEquals(String hostName) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_adress = :hostAdress'.
	 */
	public VwHosts[] findWhereHostAdressEquals(String hostAdress) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_phone = :hostPhone'.
	 */
	public VwHosts[] findWhereHostPhoneEquals(String hostPhone) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'player_name = :playerName'.
	 */
	public VwHosts[] findWherePlayerNameEquals(String playerName) throws VwHostsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the specified arbitrary SQL statement
	 */
	public VwHosts[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwHostsDaoException;

}
