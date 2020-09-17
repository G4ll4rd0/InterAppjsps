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
 * This class represents the primary key of the news table.
 */
public class NewsPk implements Serializable
{
	protected int newId;

	/** 
	 * This attribute represents whether the primitive attribute newId is null.
	 */
	protected boolean newIdNull;

	/** 
	 * Sets the value of newId
	 */
	public void setNewId(int newId)
	{
		this.newId = newId;
	}

	/** 
	 * Gets the value of newId
	 */
	public int getNewId()
	{
		return newId;
	}

	/**
	 * Method 'NewsPk'
	 * 
	 */
	public NewsPk()
	{
	}

	/**
	 * Method 'NewsPk'
	 * 
	 * @param newId
	 */
	public NewsPk(final int newId)
	{
		this.newId = newId;
	}

	/** 
	 * Sets the value of newIdNull
	 */
	public void setNewIdNull(boolean newIdNull)
	{
		this.newIdNull = newIdNull;
	}

	/** 
	 * Gets the value of newIdNull
	 */
	public boolean isNewIdNull()
	{
		return newIdNull;
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
		
		if (!(_other instanceof NewsPk)) {
			return false;
		}
		
		final NewsPk _cast = (NewsPk) _other;
		if (newId != _cast.newId) {
			return false;
		}
		
		if (newIdNull != _cast.newIdNull) {
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
		_hashCode = 29 * _hashCode + newId;
		_hashCode = 29 * _hashCode + (newIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.NewsPk: " );
		ret.append( "newId=" + newId );
		return ret.toString();
	}

}
