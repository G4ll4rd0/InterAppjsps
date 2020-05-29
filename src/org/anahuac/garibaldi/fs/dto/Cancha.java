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

public class Cancha implements Serializable
{
	/** 
	 * This attribute maps to the column cancha_id in the cancha table.
	 */
	protected int canchaId;

	/** 
	 * This attribute maps to the column Descripcion in the cancha table.
	 */
	protected String descripcion;

	/**
	 * Method 'Cancha'
	 * 
	 */
	public Cancha()
	{
	}

	/**
	 * Method 'getCanchaId'
	 * 
	 * @return int
	 */
	public int getCanchaId()
	{
		return canchaId;
	}

	/**
	 * Method 'setCanchaId'
	 * 
	 * @param canchaId
	 */
	public void setCanchaId(int canchaId)
	{
		this.canchaId = canchaId;
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
		
		if (!(_other instanceof Cancha)) {
			return false;
		}
		
		final Cancha _cast = (Cancha) _other;
		if (canchaId != _cast.canchaId) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
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
		_hashCode = 29 * _hashCode + canchaId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CanchaPk
	 */
	public CanchaPk createPk()
	{
		return new CanchaPk(canchaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Cancha: " );
		ret.append( "canchaId=" + canchaId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
