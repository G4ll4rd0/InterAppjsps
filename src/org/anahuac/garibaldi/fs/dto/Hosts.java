/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dto;

import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.factory.*;
import org.anahuac.garibaldi.fs.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Hosts implements Serializable
{
	/** 
	 * This attribute maps to the column host_id in the hosts table.
	 */
	protected int hostId;

	/** 
	 * This attribute maps to the column nombre in the hosts table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column direccion in the hosts table.
	 */
	protected String direccion;

	/** 
	 * This attribute maps to the column telefono in the hosts table.
	 */
	protected String telefono;

	/**
	 * Method 'Hosts'
	 * 
	 */
	public Hosts()
	{
	}

	/**
	 * Method 'getHostId'
	 * 
	 * @return int
	 */
	public int getHostId()
	{
		return hostId;
	}

	/**
	 * Method 'setHostId'
	 * 
	 * @param hostId
	 */
	public void setHostId(int hostId)
	{
		this.hostId = hostId;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Hosts)) {
			return false;
		}
		
		final Hosts _cast = (Hosts) _other;
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + hostId;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return HostsPk
	 */
	public HostsPk createPk()
	{
		return new HostsPk(hostId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Hosts: " );
		ret.append( "hostId=" + hostId );
		ret.append( ", nombre=" + nombre );
		ret.append( ", direccion=" + direccion );
		ret.append( ", telefono=" + telefono );
		return ret.toString();
	}

}
