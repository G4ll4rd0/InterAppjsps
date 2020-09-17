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

public class UsersTypes implements Serializable
{
	/** 
	 * This attribute maps to the column user_type_id in the users_types table.
	 */
	protected int userTypeId;

	/** 
	 * This attribute maps to the column code in the users_types table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column description in the users_types table.
	 */
	protected String description;

	/**
	 * Method 'UsersTypes'
	 * 
	 */
	public UsersTypes()
	{
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
	}

	/**
	 * Method 'getCode'
	 * 
	 * @return String
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * Method 'setCode'
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
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
		
		if (!(_other instanceof UsersTypes)) {
			return false;
		}
		
		final UsersTypes _cast = (UsersTypes) _other;
		if (userTypeId != _cast.userTypeId) {
			return false;
		}
		
		if (code == null ? _cast.code != code : !code.equals( _cast.code )) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
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
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsersTypesPk
	 */
	public UsersTypesPk createPk()
	{
		return new UsersTypesPk(userTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.UsersTypes: " );
		ret.append( "userTypeId=" + userTypeId );
		ret.append( ", code=" + code );
		ret.append( ", description=" + description );
		return ret.toString();
	}

}
