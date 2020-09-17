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
 * This class represents the primary key of the active_sports table.
 */
public class ActiveSportsPk implements Serializable
{
	protected int activeSportId;

	/** 
	 * This attribute represents whether the primitive attribute activeSportId is null.
	 */
	protected boolean activeSportIdNull;

	/** 
	 * Sets the value of activeSportId
	 */
	public void setActiveSportId(int activeSportId)
	{
		this.activeSportId = activeSportId;
	}

	/** 
	 * Gets the value of activeSportId
	 */
	public int getActiveSportId()
	{
		return activeSportId;
	}

	/**
	 * Method 'ActiveSportsPk'
	 * 
	 */
	public ActiveSportsPk()
	{
	}

	/**
	 * Method 'ActiveSportsPk'
	 * 
	 * @param activeSportId
	 */
	public ActiveSportsPk(final int activeSportId)
	{
		this.activeSportId = activeSportId;
	}

	/** 
	 * Sets the value of activeSportIdNull
	 */
	public void setActiveSportIdNull(boolean activeSportIdNull)
	{
		this.activeSportIdNull = activeSportIdNull;
	}

	/** 
	 * Gets the value of activeSportIdNull
	 */
	public boolean isActiveSportIdNull()
	{
		return activeSportIdNull;
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
		
		if (!(_other instanceof ActiveSportsPk)) {
			return false;
		}
		
		final ActiveSportsPk _cast = (ActiveSportsPk) _other;
		if (activeSportId != _cast.activeSportId) {
			return false;
		}
		
		if (activeSportIdNull != _cast.activeSportIdNull) {
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
		_hashCode = 29 * _hashCode + activeSportId;
		_hashCode = 29 * _hashCode + (activeSportIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ActiveSportsPk: " );
		ret.append( "activeSportId=" + activeSportId );
		return ret.toString();
	}

}
