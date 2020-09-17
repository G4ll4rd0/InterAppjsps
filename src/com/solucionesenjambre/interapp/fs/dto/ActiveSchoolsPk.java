/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the active_schools table.
 */
public class ActiveSchoolsPk implements Serializable
{
	protected int activeSchoolId;

	/** 
	 * This attribute represents whether the primitive attribute activeSchoolId is null.
	 */
	protected boolean activeSchoolIdNull;

	/** 
	 * Sets the value of activeSchoolId
	 */
	public void setActiveSchoolId(int activeSchoolId)
	{
		this.activeSchoolId = activeSchoolId;
	}

	/** 
	 * Gets the value of activeSchoolId
	 */
	public int getActiveSchoolId()
	{
		return activeSchoolId;
	}

	/**
	 * Method 'ActiveSchoolsPk'
	 * 
	 */
	public ActiveSchoolsPk()
	{
	}

	/**
	 * Method 'ActiveSchoolsPk'
	 * 
	 * @param activeSchoolId
	 */
	public ActiveSchoolsPk(final int activeSchoolId)
	{
		this.activeSchoolId = activeSchoolId;
	}

	/** 
	 * Sets the value of activeSchoolIdNull
	 */
	public void setActiveSchoolIdNull(boolean activeSchoolIdNull)
	{
		this.activeSchoolIdNull = activeSchoolIdNull;
	}

	/** 
	 * Gets the value of activeSchoolIdNull
	 */
	public boolean isActiveSchoolIdNull()
	{
		return activeSchoolIdNull;
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
		
		if (!(_other instanceof ActiveSchoolsPk)) {
			return false;
		}
		
		final ActiveSchoolsPk _cast = (ActiveSchoolsPk) _other;
		if (activeSchoolId != _cast.activeSchoolId) {
			return false;
		}
		
		if (activeSchoolIdNull != _cast.activeSchoolIdNull) {
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
		_hashCode = 29 * _hashCode + activeSchoolId;
		_hashCode = 29 * _hashCode + (activeSchoolIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ActiveSchoolsPk: " );
		ret.append( "activeSchoolId=" + activeSchoolId );
		return ret.toString();
	}

}
