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

public class Rama implements Serializable
{
	/** 
	 * This attribute maps to the column rama_id in the rama table.
	 */
	protected int ramaId;

	/** 
	 * This attribute maps to the column Descripcion in the rama table.
	 */
	protected String descripcion;

	/**
	 * Method 'Rama'
	 * 
	 */
	public Rama()
	{
	}

	/**
	 * Method 'getRamaId'
	 * 
	 * @return int
	 */
	public int getRamaId()
	{
		return ramaId;
	}

	/**
	 * Method 'setRamaId'
	 * 
	 * @param ramaId
	 */
	public void setRamaId(int ramaId)
	{
		this.ramaId = ramaId;
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
		
		if (!(_other instanceof Rama)) {
			return false;
		}
		
		final Rama _cast = (Rama) _other;
		if (ramaId != _cast.ramaId) {
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
		_hashCode = 29 * _hashCode + ramaId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RamaPk
	 */
	public RamaPk createPk()
	{
		return new RamaPk(ramaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Rama: " );
		ret.append( "ramaId=" + ramaId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
