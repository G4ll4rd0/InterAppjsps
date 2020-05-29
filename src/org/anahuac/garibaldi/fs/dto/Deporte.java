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

public class Deporte implements Serializable
{
	/** 
	 * This attribute maps to the column deporte_id in the deporte table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column Descripcion in the deporte table.
	 */
	protected String descripcion;

	/**
	 * Method 'Deporte'
	 * 
	 */
	public Deporte()
	{
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
		
		if (!(_other instanceof Deporte)) {
			return false;
		}
		
		final Deporte _cast = (Deporte) _other;
		if (deporteId != _cast.deporteId) {
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
		_hashCode = 29 * _hashCode + deporteId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DeportePk
	 */
	public DeportePk createPk()
	{
		return new DeportePk(deporteId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Deporte: " );
		ret.append( "deporteId=" + deporteId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
