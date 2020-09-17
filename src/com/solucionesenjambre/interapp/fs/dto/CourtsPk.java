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
 * This class represents the primary key of the courts table.
 */
public class CourtsPk implements Serializable
{
	protected int courtId;

	/** 
	 * This attribute represents whether the primitive attribute courtId is null.
	 */
	protected boolean courtIdNull;

	/** 
	 * Sets the value of courtId
	 */
	public void setCourtId(int courtId)
	{
		this.courtId = courtId;
	}

	/** 
	 * Gets the value of courtId
	 */
	public int getCourtId()
	{
		return courtId;
	}

	/**
	 * Method 'CourtsPk'
	 * 
	 */
	public CourtsPk()
	{
	}

	/**
	 * Method 'CourtsPk'
	 * 
	 * @param courtId
	 */
	public CourtsPk(final int courtId)
	{
		this.courtId = courtId;
	}

	/** 
	 * Sets the value of courtIdNull
	 */
	public void setCourtIdNull(boolean courtIdNull)
	{
		this.courtIdNull = courtIdNull;
	}

	/** 
	 * Gets the value of courtIdNull
	 */
	public boolean isCourtIdNull()
	{
		return courtIdNull;
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
		
		if (!(_other instanceof CourtsPk)) {
			return false;
		}
		
		final CourtsPk _cast = (CourtsPk) _other;
		if (courtId != _cast.courtId) {
			return false;
		}
		
		if (courtIdNull != _cast.courtIdNull) {
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
		_hashCode = 29 * _hashCode + courtId;
		_hashCode = 29 * _hashCode + (courtIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.CourtsPk: " );
		ret.append( "courtId=" + courtId );
		return ret.toString();
	}

}
