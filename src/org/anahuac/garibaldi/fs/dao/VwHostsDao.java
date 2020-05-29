/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwHostsDao
{
	/** 
	 * Returns all rows from the vw_hosts table that match the criteria ''.
	 */
	public VwHosts[] findAll() throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'jugador_id = :jugadorId'.
	 */
	public VwHosts[] findWhereJugadorIdEquals(int jugadorId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'padre_id = :padreId'.
	 */
	public VwHosts[] findWherePadreIdEquals(int padreId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'padre_seed = :padreSeed'.
	 */
	public VwHosts[] findWherePadreSeedEquals(String padreSeed) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_id = :hostId'.
	 */
	public VwHosts[] findWhereHostIdEquals(int hostId) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_nombre = :hostNombre'.
	 */
	public VwHosts[] findWhereHostNombreEquals(String hostNombre) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_direccion = :hostDireccion'.
	 */
	public VwHosts[] findWhereHostDireccionEquals(String hostDireccion) throws VwHostsDaoException;

	/** 
	 * Returns all rows from the vw_hosts table that match the criteria 'host_telefono = :hostTelefono'.
	 */
	public VwHosts[] findWhereHostTelefonoEquals(String hostTelefono) throws VwHostsDaoException;

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
