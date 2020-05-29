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

public class VwPorristas implements Serializable
{
	/** 
	 * This attribute maps to the column equipo_id in the vw_porristas table.
	 */
	protected int equipoId;

	/** 
	 * This attribute maps to the column delegaciones_id in the vw_porristas table.
	 */
	protected int delegacionesId;

	/** 
	 * This attribute maps to the column deporte_id in the vw_porristas table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column puntos in the vw_porristas table.
	 */
	protected int puntos;

	/** 
	 * This attribute maps to the column nombre in the vw_porristas table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column codigo in the vw_porristas table.
	 */
	protected String codigo;

	/** 
	 * This attribute maps to the column deporte in the vw_porristas table.
	 */
	protected String deporte;

	/**
	 * Method 'VwPorristas'
	 * 
	 */
	public VwPorristas()
	{
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
	 * Method 'getDelegacionesId'
	 * 
	 * @return int
	 */
	public int getDelegacionesId()
	{
		return delegacionesId;
	}

	/**
	 * Method 'setDelegacionesId'
	 * 
	 * @param delegacionesId
	 */
	public void setDelegacionesId(int delegacionesId)
	{
		this.delegacionesId = delegacionesId;
	}

	/**
	 * Method 'getDeporteId'
	 * 
	 * @return int
	 */
	public int getDeporteId()
	{
		return deporteId;
	}

	/**
	 * Method 'setDeporteId'
	 * 
	 * @param deporteId
	 */
	public void setDeporteId(int deporteId)
	{
		this.deporteId = deporteId;
	}

	/**
	 * Method 'getPuntos'
	 * 
	 * @return int
	 */
	public int getPuntos()
	{
		return puntos;
	}

	/**
	 * Method 'setPuntos'
	 * 
	 * @param puntos
	 */
	public void setPuntos(int puntos)
	{
		this.puntos = puntos;
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
	 * Method 'getCodigo'
	 * 
	 * @return String
	 */
	public String getCodigo()
	{
		return codigo;
	}

	/**
	 * Method 'setCodigo'
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	/**
	 * Method 'getDeporte'
	 * 
	 * @return String
	 */
	public String getDeporte()
	{
		return deporte;
	}

	/**
	 * Method 'setDeporte'
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte)
	{
		this.deporte = deporte;
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
		
		if (!(_other instanceof VwPorristas)) {
			return false;
		}
		
		final VwPorristas _cast = (VwPorristas) _other;
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (delegacionesId != _cast.delegacionesId) {
			return false;
		}
		
		if (deporteId != _cast.deporteId) {
			return false;
		}
		
		if (puntos != _cast.puntos) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (codigo == null ? _cast.codigo != codigo : !codigo.equals( _cast.codigo )) {
			return false;
		}
		
		if (deporte == null ? _cast.deporte != deporte : !deporte.equals( _cast.deporte )) {
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
		_hashCode = 29 * _hashCode + equipoId;
		_hashCode = 29 * _hashCode + delegacionesId;
		_hashCode = 29 * _hashCode + deporteId;
		_hashCode = 29 * _hashCode + puntos;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (codigo != null) {
			_hashCode = 29 * _hashCode + codigo.hashCode();
		}
		
		if (deporte != null) {
			_hashCode = 29 * _hashCode + deporte.hashCode();
		}
		
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwPorristas: " );
		ret.append( "equipoId=" + equipoId );
		ret.append( ", delegacionesId=" + delegacionesId );
		ret.append( ", deporteId=" + deporteId );
		ret.append( ", puntos=" + puntos );
		ret.append( ", nombre=" + nombre );
		ret.append( ", codigo=" + codigo );
		ret.append( ", deporte=" + deporte );
		return ret.toString();
	}

}
