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
 * This class represents the primary key of the parents_hosts_players table.
 */
public class ParentsHostsPlayersPk implements Serializable
{
	protected int parentHostPlayerId;

	/** 
	 * This attribute represents whether the primitive attribute parentHostPlayerId is null.
	 */
	protected boolean parentHostPlayerIdNull;

	/** 
	 * Sets the value of parentHostPlayerId
	 */
	public void setParentHostPlayerId(int parentHostPlayerId)
	{
		this.parentHostPlayerId = parentHostPlayerId;
	}

	/** 
	 * Gets the value of parentHostPlayerId
	 */
	public int getParentHostPlayerId()
	{
		return parentHostPlayerId;
	}

	/**
	 * Method 'ParentsHostsPlayersPk'
	 * 
	 */
	public ParentsHostsPlayersPk()
	{
	}

	/**
	 * Method 'ParentsHostsPlayersPk'
	 * 
	 * @param parentHostPlayerId
	 */
	public ParentsHostsPlayersPk(final int parentHostPlayerId)
	{
		this.parentHostPlayerId = parentHostPlayerId;
	}

	/** 
	 * Sets the value of parentHostPlayerIdNull
	 */
	public void setParentHostPlayerIdNull(boolean parentHostPlayerIdNull)
	{
		this.parentHostPlayerIdNull = parentHostPlayerIdNull;
	}

	/** 
	 * Gets the value of parentHostPlayerIdNull
	 */
	public boolean isParentHostPlayerIdNull()
	{
		return parentHostPlayerIdNull;
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
		
		if (!(_other instanceof ParentsHostsPlayersPk)) {
			return false;
		}
		
		final ParentsHostsPlayersPk _cast = (ParentsHostsPlayersPk) _other;
		if (parentHostPlayerId != _cast.parentHostPlayerId) {
			return false;
		}
		
		if (parentHostPlayerIdNull != _cast.parentHostPlayerIdNull) {
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
		_hashCode = 29 * _hashCode + parentHostPlayerId;
		_hashCode = 29 * _hashCode + (parentHostPlayerIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ParentsHostsPlayersPk: " );
		ret.append( "parentHostPlayerId=" + parentHostPlayerId );
		return ret.toString();
	}

}
