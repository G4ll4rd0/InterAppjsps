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
 * This class represents the primary key of the users table.
 */
public class UsersPk implements Serializable
{
	protected int userId;

	/** 
	 * This attribute represents whether the primitive attribute userId is null.
	 */
	protected boolean userIdNull;

	/** 
	 * Sets the value of userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	/** 
	 * Gets the value of userId
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'UsersPk'
	 * 
	 */
	public UsersPk()
	{
	}

	/**
	 * Method 'UsersPk'
	 * 
	 * @param userId
	 */
	public UsersPk(final int userId)
	{
		this.userId = userId;
	}

	/** 
	 * Sets the value of userIdNull
	 */
	public void setUserIdNull(boolean userIdNull)
	{
		this.userIdNull = userIdNull;
	}

	/** 
	 * Gets the value of userIdNull
	 */
	public boolean isUserIdNull()
	{
		return userIdNull;
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
		
		if (!(_other instanceof UsersPk)) {
			return false;
		}
		
		final UsersPk _cast = (UsersPk) _other;
		if (userId != _cast.userId) {
			return false;
		}
		
		if (userIdNull != _cast.userIdNull) {
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
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (userIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.UsersPk: " );
		ret.append( "userId=" + userId );
		return ret.toString();
	}

}
