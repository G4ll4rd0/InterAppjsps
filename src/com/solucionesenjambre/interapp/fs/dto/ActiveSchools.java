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

public class ActiveSchools implements Serializable
{
	/** 
	 * This attribute maps to the column active_school_id in the active_schools table.
	 */
	protected int activeSchoolId;

	/** 
	 * This attribute maps to the column school_id in the active_schools table.
	 */
	protected int schoolId;

	/** 
	 * This attribute represents whether the primitive attribute schoolId is null.
	 */
	protected boolean schoolIdNull = true;

	/** 
	 * This attribute maps to the column event_id in the active_schools table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'ActiveSchools'
	 * 
	 */
	public ActiveSchools()
	{
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
		
		if (!(_other instanceof ActiveSchools)) {
			return false;
		}
		
		final ActiveSchools _cast = (ActiveSchools) _other;
		if (activeSchoolId != _cast.activeSchoolId) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (schoolIdNull != _cast.schoolIdNull) {
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
		_hashCode = 29 * _hashCode + activeSchoolId;
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + (schoolIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ActiveSchoolsPk
	 */
	public ActiveSchoolsPk createPk()
	{
		return new ActiveSchoolsPk(activeSchoolId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ActiveSchools: " );
		ret.append( "activeSchoolId=" + activeSchoolId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
