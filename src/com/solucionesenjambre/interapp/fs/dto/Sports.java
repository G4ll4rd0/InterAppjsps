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

public class Sports implements Serializable
{
	/** 
	 * This attribute maps to the column sport_id in the sports table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column code in the sports table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column description in the sports table.
	 */
	protected String description;

	/**
	 * Method 'Sports'
	 * 
	 */
	public Sports()
	{
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
		
		if (!(_other instanceof Sports)) {
			return false;
		}
		
		final Sports _cast = (Sports) _other;
		if (sportId != _cast.sportId) {
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
		_hashCode = 29 * _hashCode + sportId;
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
	 * @return SportsPk
	 */
	public SportsPk createPk()
	{
		return new SportsPk(sportId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Sports: " );
		ret.append( "sportId=" + sportId );
		ret.append( ", code=" + code );
		ret.append( ", description=" + description );
		return ret.toString();
	}

}
