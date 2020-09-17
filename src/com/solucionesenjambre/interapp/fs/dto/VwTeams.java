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

public class VwTeams implements Serializable
{
	/** 
	 * This attribute maps to the column team_id in the vw_teams table.
	 */
	protected int teamId;

	/** 
	 * This attribute maps to the column event_id in the vw_teams table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column description in the vw_teams table.
	 */
	protected String description;

	/** 
	 * This attribute maps to the column team_name in the vw_teams table.
	 */
	protected String teamName;

	/**
	 * Method 'VwTeams'
	 * 
	 */
	public VwTeams()
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
	 * Method 'getTeamName'
	 * 
	 * @return String
	 */
	public String getTeamName()
	{
		return teamName;
	}

	/**
	 * Method 'setTeamName'
	 * 
	 * @param teamName
	 */
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
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
		
		if (!(_other instanceof VwTeams)) {
			return false;
		}
		
		final VwTeams _cast = (VwTeams) _other;
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
			return false;
		}
		
		if (teamName == null ? _cast.teamName != teamName : !teamName.equals( _cast.teamName )) {
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
		_hashCode = 29 * _hashCode + eventId;
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		if (teamName != null) {
			_hashCode = 29 * _hashCode + teamName.hashCode();
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwTeams: " );
		ret.append( "teamId=" + teamId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", description=" + description );
		ret.append( ", teamName=" + teamName );
		return ret.toString();
	}

}
