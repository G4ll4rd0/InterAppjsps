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

public class Teams implements Serializable
{
	/** 
	 * This attribute maps to the column team_id in the teams table.
	 */
	protected int teamId;

	/** 
	 * This attribute maps to the column priority_points in the teams table.
	 */
	protected int priorityPoints;

	/** 
	 * This attribute represents whether the primitive attribute priorityPoints is null.
	 */
	protected boolean priorityPointsNull = true;

	/** 
	 * This attribute maps to the column branch_id in the teams table.
	 */
	protected int branchId;

	/** 
	 * This attribute represents whether the primitive attribute branchId is null.
	 */
	protected boolean branchIdNull = true;

	/** 
	 * This attribute maps to the column school_id in the teams table.
	 */
	protected int schoolId;

	/** 
	 * This attribute represents whether the primitive attribute schoolId is null.
	 */
	protected boolean schoolIdNull = true;

	/** 
	 * This attribute maps to the column sport_id in the teams table.
	 */
	protected int sportId;

	/** 
	 * This attribute represents whether the primitive attribute sportId is null.
	 */
	protected boolean sportIdNull = true;

	/** 
	 * This attribute maps to the column event_id in the teams table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'Teams'
	 * 
	 */
	public Teams()
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
	 * Method 'getPriorityPoints'
	 * 
	 * @return int
	 */
	public int getPriorityPoints()
	{
		return priorityPoints;
	}

	/**
	 * Method 'setPriorityPoints'
	 * 
	 * @param priorityPoints
	 */
	public void setPriorityPoints(int priorityPoints)
	{
		this.priorityPoints = priorityPoints;
		this.priorityPointsNull = false;
	}

	/**
	 * Method 'setPriorityPointsNull'
	 * 
	 * @param value
	 */
	public void setPriorityPointsNull(boolean value)
	{
		this.priorityPointsNull = value;
	}

	/**
	 * Method 'isPriorityPointsNull'
	 * 
	 * @return boolean
	 */
	public boolean isPriorityPointsNull()
	{
		return priorityPointsNull;
	}

	/**
	 * Method 'getBranchId'
	 * 
	 * @return int
	 */
	public int getBranchId()
	{
		return branchId;
	}

	/**
	 * Method 'setBranchId'
	 * 
	 * @param branchId
	 */
	public void setBranchId(int branchId)
	{
		this.branchId = branchId;
		this.branchIdNull = false;
	}

	/**
	 * Method 'setBranchIdNull'
	 * 
	 * @param value
	 */
	public void setBranchIdNull(boolean value)
	{
		this.branchIdNull = value;
	}

	/**
	 * Method 'isBranchIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isBranchIdNull()
	{
		return branchIdNull;
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
		
		if (!(_other instanceof Teams)) {
			return false;
		}
		
		final Teams _cast = (Teams) _other;
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (priorityPoints != _cast.priorityPoints) {
			return false;
		}
		
		if (priorityPointsNull != _cast.priorityPointsNull) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (branchIdNull != _cast.branchIdNull) {
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
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + priorityPoints;
		_hashCode = 29 * _hashCode + (priorityPointsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + (branchIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + (schoolIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + (sportIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TeamsPk
	 */
	public TeamsPk createPk()
	{
		return new TeamsPk(teamId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Teams: " );
		ret.append( "teamId=" + teamId );
		ret.append( ", priorityPoints=" + priorityPoints );
		ret.append( ", branchId=" + branchId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
