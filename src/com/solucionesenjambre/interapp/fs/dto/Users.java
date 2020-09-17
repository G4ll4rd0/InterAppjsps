/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dto;

import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.factory.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Users implements Serializable
{
	/** 
	 * This attribute maps to the column user_id in the users table.
	 */
	protected int userId;

	/** 
	 * This attribute maps to the column username in the users table.
	 */
	protected String username;

	/** 
	 * This attribute maps to the column pssword in the users table.
	 */
	protected String pssword;

	/** 
	 * This attribute maps to the column email in the users table.
	 */
	protected String email;

	/** 
	 * This attribute maps to the column seed in the users table.
	 */
	protected String seed;

	/** 
	 * This attribute maps to the column user_type_id in the users table.
	 */
	protected int userTypeId;

	/** 
	 * This attribute represents whether the primitive attribute userTypeId is null.
	 */
	protected boolean userTypeIdNull = true;

	/** 
	 * This attribute maps to the column event_id in the users table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'Users'
	 * 
	 */
	public Users()
	{
	}

	/**
	 * Method 'getUserId'
	 * 
	 * @return int
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'setUserId'
	 * 
	 * @param userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	/**
	 * Method 'getUsername'
	 * 
	 * @return String
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Method 'setUsername'
	 * 
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Method 'getPssword'
	 * 
	 * @return String
	 */
	public String getPssword()
	{
		return pssword;
	}

	/**
	 * Method 'setPssword'
	 * 
	 * @param pssword
	 */
	public void setPssword(String pssword)
	{
		this.pssword = pssword;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Method 'getSeed'
	 * 
	 * @return String
	 */
	public String getSeed()
	{
		return seed;
	}

	/**
	 * Method 'setSeed'
	 * 
	 * @param seed
	 */
	public void setSeed(String seed)
	{
		this.seed = seed;
	}

	/**
	 * Method 'getUserTypeId'
	 * 
	 * @return int
	 */
	public int getUserTypeId()
	{
		return userTypeId;
	}

	/**
	 * Method 'setUserTypeId'
	 * 
	 * @param userTypeId
	 */
	public void setUserTypeId(int userTypeId)
	{
		this.userTypeId = userTypeId;
		this.userTypeIdNull = false;
	}

	/**
	 * Method 'setUserTypeIdNull'
	 * 
	 * @param value
	 */
	public void setUserTypeIdNull(boolean value)
	{
		this.userTypeIdNull = value;
	}

	/**
	 * Method 'isUserTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isUserTypeIdNull()
	{
		return userTypeIdNull;
	}

	/**
	 * Method 'getEventId'
	 * 
	 * @return int
	 */
	public int getEventId()
	{
		return eventId;
	}

	/**
	 * Method 'setEventId'
	 * 
	 * @param eventId
	 */
	public void setEventId(int eventId)
	{
		this.eventId = eventId;
		this.eventIdNull = false;
	}

	/**
	 * Method 'setEventIdNull'
	 * 
	 * @param value
	 */
	public void setEventIdNull(boolean value)
	{
		this.eventIdNull = value;
	}

	/**
	 * Method 'isEventIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isEventIdNull()
	{
		return eventIdNull;
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
		
		if (!(_other instanceof Users)) {
			return false;
		}
		
		final Users _cast = (Users) _other;
		if (userId != _cast.userId) {
			return false;
		}
		
		if (username == null ? _cast.username != username : !username.equals( _cast.username )) {
			return false;
		}
		
		if (pssword == null ? _cast.pssword != pssword : !pssword.equals( _cast.pssword )) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (seed == null ? _cast.seed != seed : !seed.equals( _cast.seed )) {
			return false;
		}
		
		if (userTypeId != _cast.userTypeId) {
			return false;
		}
		
		if (userTypeIdNull != _cast.userTypeIdNull) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
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
		if (username != null) {
			_hashCode = 29 * _hashCode + username.hashCode();
		}
		
		if (pssword != null) {
			_hashCode = 29 * _hashCode + pssword.hashCode();
		}
		
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		if (seed != null) {
			_hashCode = 29 * _hashCode + seed.hashCode();
		}
		
		_hashCode = 29 * _hashCode + userTypeId;
		_hashCode = 29 * _hashCode + (userTypeIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsersPk
	 */
	public UsersPk createPk()
	{
		return new UsersPk(userId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Users: " );
		ret.append( "userId=" + userId );
		ret.append( ", username=" + username );
		ret.append( ", pssword=" + pssword );
		ret.append( ", email=" + email );
		ret.append( ", seed=" + seed );
		ret.append( ", userTypeId=" + userTypeId );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
