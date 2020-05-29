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
 * This class represents the primary key of the cancha table.
 */
public class CanchaPk implements Serializable
{
	protected int canchaId;

	/** 
	 * This attribute represents whether the primitive attribute canchaId is null.
	 */
	protected boolean canchaIdNull;

	/** 
	 * Sets the value of canchaId
	 */
	public void setCanchaId(int canchaId)
	{
		this.canchaId = canchaId;
	}

	/** 
	 * Gets the value of canchaId
	 */
	public int getCanchaId()
	{
		return canchaId;
	}

	/**
	 * Method 'CanchaPk'
	 * 
	 */
	public CanchaPk()
	{
	}

	/**
	 * Method 'CanchaPk'
	 * 
	 * @param canchaId
	 */
	public CanchaPk(final int canchaId)
	{
		this.canchaId = canchaId;
	}

	/** 
	 * Sets the value of canchaIdNull
	 */
	public void setCanchaIdNull(boolean canchaIdNull)
	{
		this.canchaIdNull = canchaIdNull;
	}

	/** 
	 * Gets the value of canchaIdNull
	 */
	public boolean isCanchaIdNull()
	{
		return canchaIdNull;
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
		
		if (!(_other instanceof CanchaPk)) {
			return false;
		}
		
		final CanchaPk _cast = (CanchaPk) _other;
		if (canchaId != _cast.canchaId) {
			return false;
		}
		
		if (canchaIdNull != _cast.canchaIdNull) {
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
		_hashCode = 29 * _hashCode + (canchaIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.CanchaPk: " );
		ret.append( "canchaId=" + canchaId );
		return ret.toString();
	}

}
