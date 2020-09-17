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
 * This class represents the primary key of the users_favorites table.
 */
public class UsersFavoritesPk implements Serializable
{
	protected int userFavoriteId;

	/** 
	 * This attribute represents whether the primitive attribute userFavoriteId is null.
	 */
	protected boolean userFavoriteIdNull;

	/** 
	 * Sets the value of userFavoriteId
	 */
	public void setUserFavoriteId(int userFavoriteId)
	{
		this.userFavoriteId = userFavoriteId;
	}

	/** 
	 * Gets the value of userFavoriteId
	 */
	public int getUserFavoriteId()
	{
		return userFavoriteId;
	}

	/**
	 * Method 'UsersFavoritesPk'
	 * 
	 */
	public UsersFavoritesPk()
	{
	}

	/**
	 * Method 'UsersFavoritesPk'
	 * 
	 * @param userFavoriteId
	 */
	public UsersFavoritesPk(final int userFavoriteId)
	{
		this.userFavoriteId = userFavoriteId;
	}

	/** 
	 * Sets the value of userFavoriteIdNull
	 */
	public void setUserFavoriteIdNull(boolean userFavoriteIdNull)
	{
		this.userFavoriteIdNull = userFavoriteIdNull;
	}

	/** 
	 * Gets the value of userFavoriteIdNull
	 */
	public boolean isUserFavoriteIdNull()
	{
		return userFavoriteIdNull;
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
		
		if (!(_other instanceof UsersFavoritesPk)) {
			return false;
		}
		
		final UsersFavoritesPk _cast = (UsersFavoritesPk) _other;
		if (userFavoriteId != _cast.userFavoriteId) {
			return false;
		}
		
		if (userFavoriteIdNull != _cast.userFavoriteIdNull) {
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
		_hashCode = 29 * _hashCode + userFavoriteId;
		_hashCode = 29 * _hashCode + (userFavoriteIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.UsersFavoritesPk: " );
		ret.append( "userFavoriteId=" + userFavoriteId );
		return ret.toString();
	}

}
