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

public class VwSchools implements Serializable
{
	/** 
	 * This attribute maps to the column school_id in the vw_schools table.
	 */
	protected int schoolId;

	/** 
	 * This attribute maps to the column active_school_id in the vw_schools table.
	 */
	protected int activeSchoolId;

	/** 
	 * This attribute maps to the column event_id in the vw_schools table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/** 
	 * This attribute maps to the column code in the vw_schools table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column description in the vw_schools table.
	 */
	protected String description;

	/**
	 * Method 'VwSchools'
	 * 
	 */
	public VwSchools()
	{
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
	}

	/**
	 * Method 'getActiveSchoolId'
	 * 
	 * @return int
	 */
	public int getActiveSchoolId()
	{
		return activeSchoolId;
	}

	/**
	 * Method 'setActiveSchoolId'
	 * 
	 * @param activeSchoolId
	 */
	public void setActiveSchoolId(int activeSchoolId)
	{
		this.activeSchoolId = activeSchoolId;
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
		
		if (!(_other instanceof VwSchools)) {
			return false;
		}
		
		final VwSchools _cast = (VwSchools) _other;
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (activeSchoolId != _cast.activeSchoolId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
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
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + activeSchoolId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwSchools: " );
		ret.append( "schoolId=" + schoolId );
		ret.append( ", activeSchoolId=" + activeSchoolId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", code=" + code );
		ret.append( ", description=" + description );
		return ret.toString();
	}

}
