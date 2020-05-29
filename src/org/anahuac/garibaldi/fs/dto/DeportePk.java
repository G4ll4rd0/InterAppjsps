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
 * This class represents the primary key of the deporte table.
 */
public class DeportePk implements Serializable
{
	protected int deporteId;

	/** 
	 * This attribute represents whether the primitive attribute deporteId is null.
	 */
	protected boolean deporteIdNull;

	/** 
	 * Sets the value of deporteId
	 */
	public void setDeporteId(int deporteId)
	{
		this.deporteId = deporteId;
	}

	/** 
	 * Gets the value of deporteId
	 */
	public int getDeporteId()
	{
		return deporteId;
	}

	/**
	 * Method 'DeportePk'
	 * 
	 */
	public DeportePk()
	{
	}

	/**
	 * Method 'DeportePk'
	 * 
	 * @param deporteId
	 */
	public DeportePk(final int deporteId)
	{
		this.deporteId = deporteId;
	}

	/** 
	 * Sets the value of deporteIdNull
	 */
	public void setDeporteIdNull(boolean deporteIdNull)
	{
		this.deporteIdNull = deporteIdNull;
	}

	/** 
	 * Gets the value of deporteIdNull
	 */
	public boolean isDeporteIdNull()
	{
		return deporteIdNull;
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
		
		if (!(_other instanceof DeportePk)) {
			return false;
		}
		
		final DeportePk _cast = (DeportePk) _other;
		if (deporteId != _cast.deporteId) {
			return false;
		}
		
		if (deporteIdNull != _cast.deporteIdNull) {
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
		_hashCode = 29 * _hashCode + (deporteIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.DeportePk: " );
		ret.append( "deporteId=" + deporteId );
		return ret.toString();
	}

}
