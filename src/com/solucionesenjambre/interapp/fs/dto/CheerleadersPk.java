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
 * This class represents the primary key of the cheerleaders table.
 */
public class CheerleadersPk implements Serializable
{
	protected int cheerleaderId;

	/** 
	 * This attribute represents whether the primitive attribute cheerleaderId is null.
	 */
	protected boolean cheerleaderIdNull;

	/** 
	 * Sets the value of cheerleaderId
	 */
	public void setCheerleaderId(int cheerleaderId)
	{
		this.cheerleaderId = cheerleaderId;
	}

	/** 
	 * Gets the value of cheerleaderId
	 */
	public int getCheerleaderId()
	{
		return cheerleaderId;
	}

	/**
	 * Method 'CheerleadersPk'
	 * 
	 */
	public CheerleadersPk()
	{
	}

	/**
	 * Method 'CheerleadersPk'
	 * 
	 * @param cheerleaderId
	 */
	public CheerleadersPk(final int cheerleaderId)
	{
		this.cheerleaderId = cheerleaderId;
	}

	/** 
	 * Sets the value of cheerleaderIdNull
	 */
	public void setCheerleaderIdNull(boolean cheerleaderIdNull)
	{
		this.cheerleaderIdNull = cheerleaderIdNull;
	}

	/** 
	 * Gets the value of cheerleaderIdNull
	 */
	public boolean isCheerleaderIdNull()
	{
		return cheerleaderIdNull;
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
		
		if (!(_other instanceof CheerleadersPk)) {
			return false;
		}
		
		final CheerleadersPk _cast = (CheerleadersPk) _other;
		if (cheerleaderId != _cast.cheerleaderId) {
			return false;
		}
		
		if (cheerleaderIdNull != _cast.cheerleaderIdNull) {
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
		_hashCode = 29 * _hashCode + cheerleaderId;
		_hashCode = 29 * _hashCode + (cheerleaderIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.CheerleadersPk: " );
		ret.append( "cheerleaderId=" + cheerleaderId );
		return ret.toString();
	}

}
