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
 * This class represents the primary key of the rounds table.
 */
public class RoundsPk implements Serializable
{
	protected int roundId;

	/** 
	 * This attribute represents whether the primitive attribute roundId is null.
	 */
	protected boolean roundIdNull;

	/** 
	 * Sets the value of roundId
	 */
	public void setRoundId(int roundId)
	{
		this.roundId = roundId;
	}

	/** 
	 * Gets the value of roundId
	 */
	public int getRoundId()
	{
		return roundId;
	}

	/**
	 * Method 'RoundsPk'
	 * 
	 */
	public RoundsPk()
	{
	}

	/**
	 * Method 'RoundsPk'
	 * 
	 * @param roundId
	 */
	public RoundsPk(final int roundId)
	{
		this.roundId = roundId;
	}

	/** 
	 * Sets the value of roundIdNull
	 */
	public void setRoundIdNull(boolean roundIdNull)
	{
		this.roundIdNull = roundIdNull;
	}

	/** 
	 * Gets the value of roundIdNull
	 */
	public boolean isRoundIdNull()
	{
		return roundIdNull;
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
		
		if (!(_other instanceof RoundsPk)) {
			return false;
		}
		
		final RoundsPk _cast = (RoundsPk) _other;
		if (roundId != _cast.roundId) {
			return false;
		}
		
		if (roundIdNull != _cast.roundIdNull) {
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
		_hashCode = 29 * _hashCode + roundId;
		_hashCode = 29 * _hashCode + (roundIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.RoundsPk: " );
		ret.append( "roundId=" + roundId );
		return ret.toString();
	}

}
