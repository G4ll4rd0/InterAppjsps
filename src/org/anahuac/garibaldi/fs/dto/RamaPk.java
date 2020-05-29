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
 * This class represents the primary key of the rama table.
 */
public class RamaPk implements Serializable
{
	protected int ramaId;

	/** 
	 * This attribute represents whether the primitive attribute ramaId is null.
	 */
	protected boolean ramaIdNull;

	/** 
	 * Sets the value of ramaId
	 */
	public void setRamaId(int ramaId)
	{
		this.ramaId = ramaId;
	}

	/** 
	 * Gets the value of ramaId
	 */
	public int getRamaId()
	{
		return ramaId;
	}

	/**
	 * Method 'RamaPk'
	 * 
	 */
	public RamaPk()
	{
	}

	/**
	 * Method 'RamaPk'
	 * 
	 * @param ramaId
	 */
	public RamaPk(final int ramaId)
	{
		this.ramaId = ramaId;
	}

	/** 
	 * Sets the value of ramaIdNull
	 */
	public void setRamaIdNull(boolean ramaIdNull)
	{
		this.ramaIdNull = ramaIdNull;
	}

	/** 
	 * Gets the value of ramaIdNull
	 */
	public boolean isRamaIdNull()
	{
		return ramaIdNull;
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
		
		if (!(_other instanceof RamaPk)) {
			return false;
		}
		
		final RamaPk _cast = (RamaPk) _other;
		if (ramaId != _cast.ramaId) {
			return false;
		}
		
		if (ramaIdNull != _cast.ramaIdNull) {
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
		_hashCode = 29 * _hashCode + (ramaIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.RamaPk: " );
		ret.append( "ramaId=" + ramaId );
		return ret.toString();
	}

}
