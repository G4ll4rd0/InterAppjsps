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
 * This class represents the primary key of the sports table.
 */
public class SportsPk implements Serializable
{
	protected int sportId;

	/** 
	 * This attribute represents whether the primitive attribute sportId is null.
	 */
	protected boolean sportIdNull;

	/** 
	 * Sets the value of sportId
	 */
	public void setSportId(int sportId)
	{
		this.sportId = sportId;
	}

	/** 
	 * Gets the value of sportId
	 */
	public int getSportId()
	{
		return sportId;
	}

	/**
	 * Method 'SportsPk'
	 * 
	 */
	public SportsPk()
	{
	}

	/**
	 * Method 'SportsPk'
	 * 
	 * @param sportId
	 */
	public SportsPk(final int sportId)
	{
		this.sportId = sportId;
	}

	/** 
	 * Sets the value of sportIdNull
	 */
	public void setSportIdNull(boolean sportIdNull)
	{
		this.sportIdNull = sportIdNull;
	}

	/** 
	 * Gets the value of sportIdNull
	 */
	public boolean isSportIdNull()
	{
		return sportIdNull;
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
		
		if (!(_other instanceof SportsPk)) {
			return false;
		}
		
		final SportsPk _cast = (SportsPk) _other;
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (sportIdNull != _cast.sportIdNull) {
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
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + (sportIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.SportsPk: " );
		ret.append( "sportId=" + sportId );
		return ret.toString();
	}

}
