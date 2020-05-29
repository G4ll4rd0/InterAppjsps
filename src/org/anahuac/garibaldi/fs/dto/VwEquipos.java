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

public class VwEquipos implements Serializable
{
	/** 
	 * This attribute maps to the column Nombre in the vw_equipos table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column nombre_equipo in the vw_equipos table.
	 */
	protected String nombreEquipo;

	/** 
	 * This attribute maps to the column equipo_id in the vw_equipos table.
	 */
	protected int equipoId;

	/**
	 * Method 'VwEquipos'
	 * 
	 */
	public VwEquipos()
	{
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
	 * Method 'getNombreEquipo'
	 * 
	 * @return String
	 */
	public String getNombreEquipo()
	{
		return nombreEquipo;
	}

	/**
	 * Method 'setNombreEquipo'
	 * 
	 * @param nombreEquipo
	 */
	public void setNombreEquipo(String nombreEquipo)
	{
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * Method 'getEquipoId'
	 * 
	 * @return int
	 */
	public int getEquipoId()
	{
		return equipoId;
	}

	/**
	 * Method 'setEquipoId'
	 * 
	 * @param equipoId
	 */
	public void setEquipoId(int equipoId)
	{
		this.equipoId = equipoId;
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
		
		if (!(_other instanceof VwEquipos)) {
			return false;
		}
		
		final VwEquipos _cast = (VwEquipos) _other;
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreEquipo == null ? _cast.nombreEquipo != nombreEquipo : !nombreEquipo.equals( _cast.nombreEquipo )) {
			return false;
		}
		
		if (equipoId != _cast.equipoId) {
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
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (nombreEquipo != null) {
			_hashCode = 29 * _hashCode + nombreEquipo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + equipoId;
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.VwEquipos: " );
		ret.append( "nombre=" + nombre );
		ret.append( ", nombreEquipo=" + nombreEquipo );
		ret.append( ", equipoId=" + equipoId );
		return ret.toString();
	}

}
