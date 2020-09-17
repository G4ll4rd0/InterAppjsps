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
 * This class represents the primary key of the users_types table.
 */
public class UsersTypesPk implements Serializable
{
	protected int userTypeId;

	/** 
	 * This attribute represents whether the primitive attribute userTypeId is null.
	 */
	protected boolean userTypeIdNull;

	/** 
	 * Sets the value of userTypeId
	 */
	public void setUserTypeId(int userTypeId)
	{
		this.userTypeId = userTypeId;
	}

	/** 
	 * Gets the value of userTypeId
	 */
	public int getUserTypeId()
	{
		return userTypeId;
	}

	/**
	 * Method 'UsersTypesPk'
	 * 
	 */
	public UsersTypesPk()
	{
	}

	/**
	 * Method 'UsersTypesPk'
	 * 
	 * @param userTypeId
	 */
	public UsersTypesPk(final int userTypeId)
	{
		this.userTypeId = userTypeId;
	}

	/** 
	 * Sets the value of userTypeIdNull
	 */
	public void setUserTypeIdNull(boolean userTypeIdNull)
	{
		this.userTypeIdNull = userTypeIdNull;
	}

	/** 
	 * Gets the value of userTypeIdNull
	 */
	public boolean isUserTypeIdNull()
	{
		return userTypeIdNull;
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
		
		if (!(_other instanceof UsersTypesPk)) {
			return false;
		}
		
		final UsersTypesPk _cast = (UsersTypesPk) _other;
		if (userTypeId != _cast.userTypeId) {
			return false;
		}
		
		if (userTypeIdNull != _cast.userTypeIdNull) {
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
		_hashCode = 29 * _hashCode + userTypeId;
		_hashCode = 29 * _hashCode + (userTypeIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.UsersTypesPk: " );
		ret.append( "userTypeId=" + userTypeId );
		return ret.toString();
	}

}
