/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the seccion table.
 */
public class SeccionPk implements Serializable
{
	protected int seccionId;

	/** 
	 * This attribute represents whether the primitive attribute seccionId is null.
	 */
	protected boolean seccionIdNull;

	/** 
	 * Sets the value of seccionId
	 */
	public void setSeccionId(int seccionId)
	{
		this.seccionId = seccionId;
	}

	/** 
	 * Gets the value of seccionId
	 */
	public int getSeccionId()
	{
		return seccionId;
	}

	/**
	 * Method 'SeccionPk'
	 * 
	 */
	public SeccionPk()
	{
	}

	/**
	 * Method 'SeccionPk'
	 * 
	 * @param seccionId
	 */
	public SeccionPk(final int seccionId)
	{
		this.seccionId = seccionId;
	}

	/** 
	 * Sets the value of seccionIdNull
	 */
	public void setSeccionIdNull(boolean seccionIdNull)
	{
		this.seccionIdNull = seccionIdNull;
	}

	/** 
	 * Gets the value of seccionIdNull
	 */
	public boolean isSeccionIdNull()
	{
		return seccionIdNull;
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
		
		if (!(_other instanceof SeccionPk)) {
			return false;
		}
		
		final SeccionPk _cast = (SeccionPk) _other;
		if (seccionId != _cast.seccionId) {
			return false;
		}
		
		if (seccionIdNull != _cast.seccionIdNull) {
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
		_hashCode = 29 * _hashCode + (seccionIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.SeccionPk: " );
		ret.append( "seccionId=" + seccionId );
		return ret.toString();
	}

}
