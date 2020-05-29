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
 * This class represents the primary key of the hosts table.
 */
public class HostsPk implements Serializable
{
	protected int hostId;

	/** 
	 * This attribute represents whether the primitive attribute hostId is null.
	 */
	protected boolean hostIdNull;

	/** 
	 * Sets the value of hostId
	 */
	public void setHostId(int hostId)
	{
		this.hostId = hostId;
	}

	/** 
	 * Gets the value of hostId
	 */
	public int getHostId()
	{
		return hostId;
	}

	/**
	 * Method 'HostsPk'
	 * 
	 */
	public HostsPk()
	{
	}

	/**
	 * Method 'HostsPk'
	 * 
	 * @param hostId
	 */
	public HostsPk(final int hostId)
	{
		this.hostId = hostId;
	}

	/** 
	 * Sets the value of hostIdNull
	 */
	public void setHostIdNull(boolean hostIdNull)
	{
		this.hostIdNull = hostIdNull;
	}

	/** 
	 * Gets the value of hostIdNull
	 */
	public boolean isHostIdNull()
	{
		return hostIdNull;
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
		
		if (!(_other instanceof HostsPk)) {
			return false;
		}
		
		final HostsPk _cast = (HostsPk) _other;
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (hostIdNull != _cast.hostIdNull) {
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
		_hashCode = 29 * _hashCode + hostId;
		_hashCode = 29 * _hashCode + (hostIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.HostsPk: " );
		ret.append( "hostId=" + hostId );
		return ret.toString();
	}

}
