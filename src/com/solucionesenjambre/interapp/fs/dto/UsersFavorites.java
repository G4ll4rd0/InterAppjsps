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

public class UsersFavorites implements Serializable
{
	/** 
	 * This attribute maps to the column user_favorite_id in the users_favorites table.
	 */
	protected int userFavoriteId;

	/** 
	 * This attribute maps to the column user_id in the users_favorites table.
	 */
	protected int userId;

	/** 
	 * This attribute represents whether the primitive attribute userId is null.
	 */
	protected boolean userIdNull = true;

	/** 
	 * This attribute maps to the column team_id in the users_favorites table.
	 */
	protected int teamId;

	/** 
	 * This attribute represents whether the primitive attribute teamId is null.
	 */
	protected boolean teamIdNull = true;

	/** 
	 * This attribute maps to the column school_id in the users_favorites table.
	 */
	protected int schoolId;

	/** 
	 * This attribute represents whether the primitive attribute schoolId is null.
	 */
	protected boolean schoolIdNull = true;

	/** 
	 * This attribute maps to the column sport_id in the users_favorites table.
	 */
	protected int sportId;

	/** 
	 * This attribute represents whether the primitive attribute sportId is null.
	 */
	protected boolean sportIdNull = true;

	/**
	 * Method 'UsersFavorites'
	 * 
	 */
	public UsersFavorites()
	{
	}

	/**
	 * Method 'getUserFavoriteId'
	 * 
	 * @return int
	 */
	public int getUserFavoriteId()
	{
		return userFavoriteId;
	}

	/**
	 * Method 'setUserFavoriteId'
	 * 
	 * @param userFavoriteId
	 */
	public void setUserFavoriteId(int userFavoriteId)
	{
		this.userFavoriteId = userFavoriteId;
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
		this.userIdNull = false;
	}

	/**
	 * Method 'setUserIdNull'
	 * 
	 * @param value
	 */
	public void setUserIdNull(boolean value)
	{
		this.userIdNull = value;
	}

	/**
	 * Method 'isUserIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isUserIdNull()
	{
		return userIdNull;
	}

	/**
	 * Method 'getTeamId'
	 * 
	 * @return int
	 */
	public int getTeamId()
	{
		return teamId;
	}

	/**
	 * Method 'setTeamId'
	 * 
	 * @param teamId
	 */
	public void setTeamId(int teamId)
	{
		this.teamId = teamId;
		this.teamIdNull = false;
	}

	/**
	 * Method 'setTeamIdNull'
	 * 
	 * @param value
	 */
	public void setTeamIdNull(boolean value)
	{
		this.teamIdNull = value;
	}

	/**
	 * Method 'isTeamIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeamIdNull()
	{
		return teamIdNull;
	}

	/**
	 * Method 'getSchoolId'
	 * 
	 * @return int
	 */
	public int getSchoolId()
	{
		return schoolId;
	}

	/**
	 * Method 'setSchoolId'
	 * 
	 * @param schoolId
	 */
	public void setSchoolId(int schoolId)
	{
		this.schoolId = schoolId;
		this.schoolIdNull = false;
	}

	/**
	 * Method 'setSchoolIdNull'
	 * 
	 * @param value
	 */
	public void setSchoolIdNull(boolean value)
	{
		this.schoolIdNull = value;
	}

	/**
	 * Method 'isSchoolIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSchoolIdNull()
	{
		return schoolIdNull;
	}

	/**
	 * Method 'getSportId'
	 * 
	 * @return int
	 */
	public int getSportId()
	{
		return sportId;
	}

	/**
	 * Method 'setSportId'
	 * 
	 * @param sportId
	 */
	public void setSportId(int sportId)
	{
		this.sportId = sportId;
		this.sportIdNull = false;
	}

	/**
	 * Method 'setSportIdNull'
	 * 
	 * @param value
	 */
	public void setSportIdNull(boolean value)
	{
		this.sportIdNull = value;
	}

	/**
	 * Method 'isSportIdNull'
	 * 
	 * @return boolean
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
		
		if (!(_other instanceof UsersFavorites)) {
			return false;
		}
		
		final UsersFavorites _cast = (UsersFavorites) _other;
		if (userFavoriteId != _cast.userFavoriteId) {
			return false;
		}
		
		if (userId != _cast.userId) {
			return false;
		}
		
		if (userIdNull != _cast.userIdNull) {
			return false;
		}
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (teamIdNull != _cast.teamIdNull) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (schoolIdNull != _cast.schoolIdNull) {
			return false;
		}
		
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
		_hashCode = 29 * _hashCode + userFavoriteId;
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (userIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + (teamIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + (schoolIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + (sportIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsersFavoritesPk
	 */
	public UsersFavoritesPk createPk()
	{
		return new UsersFavoritesPk(userFavoriteId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.UsersFavorites: " );
		ret.append( "userFavoriteId=" + userFavoriteId );
		ret.append( ", userId=" + userId );
		ret.append( ", teamId=" + teamId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", sportId=" + sportId );
		return ret.toString();
	}

}
