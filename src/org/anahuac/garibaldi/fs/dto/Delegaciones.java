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

public class Delegaciones implements Serializable
{
	/** 
	 * This attribute maps to the column delegaciones_id in the delegaciones table.
	 */
	protected int delegacionesId;

	/** 
	 * This attribute maps to the column Nombre in the delegaciones table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column Codigo in the delegaciones table.
	 */
	protected String codigo;

	/**
	 * Method 'Delegaciones'
	 * 
	 */
	public Delegaciones()
	{
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
		
		if (!(_other instanceof Delegaciones)) {
			return false;
		}
		
		final Delegaciones _cast = (Delegaciones) _other;
		if (delegacionesId != _cast.delegacionesId) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (codigo == null ? _cast.codigo != codigo : !codigo.equals( _cast.codigo )) {
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
		_hashCode = 29 * _hashCode + delegacionesId;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (codigo != null) {
			_hashCode = 29 * _hashCode + codigo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DelegacionesPk
	 */
	public DelegacionesPk createPk()
	{
		return new DelegacionesPk(delegacionesId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Delegaciones: " );
		ret.append( "delegacionesId=" + delegacionesId );
		ret.append( ", nombre=" + nombre );
		ret.append( ", codigo=" + codigo );
		return ret.toString();
	}

}
