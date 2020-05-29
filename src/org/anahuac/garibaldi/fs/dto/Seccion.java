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

public class Seccion implements Serializable
{
	/** 
	 * This attribute maps to the column seccion_id in the seccion table.
	 */
	protected int seccionId;

	/** 
	 * This attribute maps to the column Descripcion in the seccion table.
	 */
	protected String descripcion;

	/** 
	 * This attribute maps to the column Activa in the seccion table.
	 */
	protected short activa;

	/**
	 * Method 'Seccion'
	 * 
	 */
	public Seccion()
	{
	}

	/**
	 * Method 'getSeccionId'
	 * 
	 * @return int
	 */
	public int getSeccionId()
	{
		return seccionId;
	}

	/**
	 * Method 'setSeccionId'
	 * 
	 * @param seccionId
	 */
	public void setSeccionId(int seccionId)
	{
		this.seccionId = seccionId;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	/**
	 * Method 'getActiva'
	 * 
	 * @return short
	 */
	public short getActiva()
	{
		return activa;
	}

	/**
	 * Method 'setActiva'
	 * 
	 * @param activa
	 */
	public void setActiva(short activa)
	{
		this.activa = activa;
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
		
		if (!(_other instanceof Seccion)) {
			return false;
		}
		
		final Seccion _cast = (Seccion) _other;
		if (seccionId != _cast.seccionId) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (activa != _cast.activa) {
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
		_hashCode = 29 * _hashCode + seccionId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) activa;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SeccionPk
	 */
	public SeccionPk createPk()
	{
		return new SeccionPk(seccionId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Seccion: " );
		ret.append( "seccionId=" + seccionId );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", activa=" + activa );
		return ret.toString();
	}

}
