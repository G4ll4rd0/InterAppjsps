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

public class VwCheer implements Serializable
{
	/** 
	 * This attribute maps to the column team_id in the vw_cheer table.
	 */
	protected int teamId;

	/** 
	 * This attribute maps to the column school_id in the vw_cheer table.
	 */
	protected int schoolId;

	/** 
	 * This attribute maps to the column sport_id in the vw_cheer table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column event_id in the vw_cheer table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/** 
	 * This attribute maps to the column points in the vw_cheer table.
	 */
	protected int points;

	/** 
	 * This attribute maps to the column school in the vw_cheer table.
	 */
	protected String school;

	/** 
	 * This attribute maps to the column code in the vw_cheer table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column sport in the vw_cheer table.
	 */
	protected String sport;

	/**
	 * Method 'VwCheer'
	 * 
	 */
	public VwCheer()
	{
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
	 * Method 'getPoints'
	 * 
	 * @return int
	 */
	public int getPoints()
	{
		return points;
	}

	/**
	 * Method 'setPoints'
	 * 
	 * @param points
	 */
	public void setPoints(int points)
	{
		this.points = points;
	}

	/**
	 * Method 'getSchool'
	 * 
	 * @return String
	 */
	public String getSchool()
	{
		return school;
	}

	/**
	 * Method 'setSchool'
	 * 
	 * @param school
	 */
	public void setSchool(String school)
	{
		this.school = school;
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
	 * Method 'getSport'
	 * 
	 * @return String
	 */
	public String getSport()
	{
		return sport;
	}

	/**
	 * Method 'setSport'
	 * 
	 * @param sport
	 */
	public void setSport(String sport)
	{
		this.sport = sport;
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
		
		if (!(_other instanceof VwCheer)) {
			return false;
		}
		
		final VwCheer _cast = (VwCheer) _other;
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
			return false;
		}
		
		if (points != _cast.points) {
			return false;
		}
		
		if (school == null ? _cast.school != school : !school.equals( _cast.school )) {
			return false;
		}
		
		if (code == null ? _cast.code != code : !code.equals( _cast.code )) {
			return false;
		}
		
		if (sport == null ? _cast.sport != sport : !sport.equals( _cast.sport )) {
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
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + points;
		if (school != null) {
			_hashCode = 29 * _hashCode + school.hashCode();
		}
		
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (sport != null) {
			_hashCode = 29 * _hashCode + sport.hashCode();
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwCheer: " );
		ret.append( "teamId=" + teamId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", points=" + points );
		ret.append( ", school=" + school );
		ret.append( ", code=" + code );
		ret.append( ", sport=" + sport );
		return ret.toString();
	}

}
