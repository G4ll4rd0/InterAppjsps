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
 * This class represents the primary key of the delegaciones table.
 */
public class DelegacionesPk implements Serializable
{
	protected int delegacionesId;

	/** 
	 * This attribute represents whether the primitive attribute delegacionesId is null.
	 */
	protected boolean delegacionesIdNull;

	/** 
	 * Sets the value of delegacionesId
	 */
	public void setDelegacionesId(int delegacionesId)
	{
		this.delegacionesId = delegacionesId;
	}

	/** 
	 * Gets the value of delegacionesId
	 */
	public int getDelegacionesId()
	{
		return delegacionesId;
	}

	/**
	 * Method 'DelegacionesPk'
	 * 
	 */
	public DelegacionesPk()
	{
	}

	/**
	 * Method 'DelegacionesPk'
	 * 
	 * @param delegacionesId
	 */
	public DelegacionesPk(final int delegacionesId)
	{
		this.delegacionesId = delegacionesId;
	}

	/** 
	 * Sets the value of delegacionesIdNull
	 */
	public void setDelegacionesIdNull(boolean delegacionesIdNull)
	{
		this.delegacionesIdNull = delegacionesIdNull;
	}

	/** 
	 * Gets the value of delegacionesIdNull
	 */
	public boolean isDelegacionesIdNull()
	{
		return delegacionesIdNull;
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
		
		if (!(_other instanceof DelegacionesPk)) {
			return false;
		}
		
		final DelegacionesPk _cast = (DelegacionesPk) _other;
		if (delegacionesId != _cast.delegacionesId) {
			return false;
		}
		
		if (delegacionesIdNull != _cast.delegacionesIdNull) {
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
		_hashCode = 29 * _hashCode + (delegacionesIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.DelegacionesPk: " );
		ret.append( "delegacionesId=" + delegacionesId );
		return ret.toString();
	}

}
