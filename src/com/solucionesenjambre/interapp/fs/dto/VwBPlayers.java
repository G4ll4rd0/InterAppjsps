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

public class VwBPlayers implements Serializable
{
	/** 
	 * This attribute maps to the column player_id in the vw_b_players table.
	 */
	protected int playerId;

	/** 
	 * This attribute maps to the column player_type_id in the vw_b_players table.
	 */
	protected int playerTypeId;

	/** 
	 * This attribute maps to the column team_id in the vw_b_players table.
	 */
	protected int teamId;

	/** 
	 * This attribute maps to the column sport_id in the vw_b_players table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column event_id in the vw_b_players table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column branch_id in the vw_b_players table.
	 */
	protected int branchId;

	/** 
	 * This attribute maps to the column school_id in the vw_b_players table.
	 */
	protected int schoolId;

	/** 
	 * This attribute maps to the column name in the vw_b_players table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column first_lastname in the vw_b_players table.
	 */
	protected String firstLastname;

	/** 
	 * This attribute maps to the column second_lastname in the vw_b_players table.
	 */
	protected String secondLastname;

	/** 
	 * This attribute maps to the column number in the vw_b_players table.
	 */
	protected int number;

	/** 
	 * This attribute maps to the column player_type in the vw_b_players table.
	 */
	protected String playerType;

	/** 
	 * This attribute maps to the column sport in the vw_b_players table.
	 */
	protected String sport;

	/** 
	 * This attribute maps to the column EVENT in the vw_b_players table.
	 */
	protected String event;

	/** 
	 * This attribute maps to the column branch in the vw_b_players table.
	 */
	protected String branch;

	/** 
	 * This attribute maps to the column school_code in the vw_b_players table.
	 */
	protected String schoolCode;

	/** 
	 * This attribute maps to the column school_name in the vw_b_players table.
	 */
	protected String schoolName;

	/**
	 * Method 'VwBPlayers'
	 * 
	 */
	public VwBPlayers()
	{
	}

	/**
	 * Method 'getPlayerId'
	 * 
	 * @return int
	 */
	public int getPlayerId()
	{
		return playerId;
	}

	/**
	 * Method 'setPlayerId'
	 * 
	 * @param playerId
	 */
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}

	/**
	 * Method 'getPlayerTypeId'
	 * 
	 * @return int
	 */
	public int getPlayerTypeId()
	{
		return playerTypeId;
	}

	/**
	 * Method 'setPlayerTypeId'
	 * 
	 * @param playerTypeId
	 */
	public void setPlayerTypeId(int playerTypeId)
	{
		this.playerTypeId = playerTypeId;
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
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getFirstLastname'
	 * 
	 * @return String
	 */
	public String getFirstLastname()
	{
		return firstLastname;
	}

	/**
	 * Method 'setFirstLastname'
	 * 
	 * @param firstLastname
	 */
	public void setFirstLastname(String firstLastname)
	{
		this.firstLastname = firstLastname;
	}

	/**
	 * Method 'getSecondLastname'
	 * 
	 * @return String
	 */
	public String getSecondLastname()
	{
		return secondLastname;
	}

	/**
	 * Method 'setSecondLastname'
	 * 
	 * @param secondLastname
	 */
	public void setSecondLastname(String secondLastname)
	{
		this.secondLastname = secondLastname;
	}

	/**
	 * Method 'getNumber'
	 * 
	 * @return int
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * Method 'setNumber'
	 * 
	 * @param number
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	 * Method 'getPlayerType'
	 * 
	 * @return String
	 */
	public String getPlayerType()
	{
		return playerType;
	}

	/**
	 * Method 'setPlayerType'
	 * 
	 * @param playerType
	 */
	public void setPlayerType(String playerType)
	{
		this.playerType = playerType;
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
	 * Method 'getEvent'
	 * 
	 * @return String
	 */
	public String getEvent()
	{
		return event;
	}

	/**
	 * Method 'setEvent'
	 * 
	 * @param event
	 */
	public void setEvent(String event)
	{
		this.event = event;
	}

	/**
	 * Method 'getBranch'
	 * 
	 * @return String
	 */
	public String getBranch()
	{
		return branch;
	}

	/**
	 * Method 'setBranch'
	 * 
	 * @param branch
	 */
	public void setBranch(String branch)
	{
		this.branch = branch;
	}

	/**
	 * Method 'getSchoolCode'
	 * 
	 * @return String
	 */
	public String getSchoolCode()
	{
		return schoolCode;
	}

	/**
	 * Method 'setSchoolCode'
	 * 
	 * @param schoolCode
	 */
	public void setSchoolCode(String schoolCode)
	{
		this.schoolCode = schoolCode;
	}

	/**
	 * Method 'getSchoolName'
	 * 
	 * @return String
	 */
	public String getSchoolName()
	{
		return schoolName;
	}

	/**
	 * Method 'setSchoolName'
	 * 
	 * @param schoolName
	 */
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
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
		
		if (!(_other instanceof VwBPlayers)) {
			return false;
		}
		
		final VwBPlayers _cast = (VwBPlayers) _other;
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (playerTypeId != _cast.playerTypeId) {
			return false;
		}
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (firstLastname == null ? _cast.firstLastname != firstLastname : !firstLastname.equals( _cast.firstLastname )) {
			return false;
		}
		
		if (secondLastname == null ? _cast.secondLastname != secondLastname : !secondLastname.equals( _cast.secondLastname )) {
			return false;
		}
		
		if (number != _cast.number) {
			return false;
		}
		
		if (playerType == null ? _cast.playerType != playerType : !playerType.equals( _cast.playerType )) {
			return false;
		}
		
		if (sport == null ? _cast.sport != sport : !sport.equals( _cast.sport )) {
			return false;
		}
		
		if (event == null ? _cast.event != event : !event.equals( _cast.event )) {
			return false;
		}
		
		if (branch == null ? _cast.branch != branch : !branch.equals( _cast.branch )) {
			return false;
		}
		
		if (schoolCode == null ? _cast.schoolCode != schoolCode : !schoolCode.equals( _cast.schoolCode )) {
			return false;
		}
		
		if (schoolName == null ? _cast.schoolName != schoolName : !schoolName.equals( _cast.schoolName )) {
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
		_hashCode = 29 * _hashCode + playerId;
		_hashCode = 29 * _hashCode + playerTypeId;
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + schoolId;
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (firstLastname != null) {
			_hashCode = 29 * _hashCode + firstLastname.hashCode();
		}
		
		if (secondLastname != null) {
			_hashCode = 29 * _hashCode + secondLastname.hashCode();
		}
		
		_hashCode = 29 * _hashCode + number;
		if (playerType != null) {
			_hashCode = 29 * _hashCode + playerType.hashCode();
		}
		
		if (sport != null) {
			_hashCode = 29 * _hashCode + sport.hashCode();
		}
		
		if (event != null) {
			_hashCode = 29 * _hashCode + event.hashCode();
		}
		
		if (branch != null) {
			_hashCode = 29 * _hashCode + branch.hashCode();
		}
		
		if (schoolCode != null) {
			_hashCode = 29 * _hashCode + schoolCode.hashCode();
		}
		
		if (schoolName != null) {
			_hashCode = 29 * _hashCode + schoolName.hashCode();
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwBPlayers: " );
		ret.append( "playerId=" + playerId );
		ret.append( ", playerTypeId=" + playerTypeId );
		ret.append( ", teamId=" + teamId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", branchId=" + branchId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", name=" + name );
		ret.append( ", firstLastname=" + firstLastname );
		ret.append( ", secondLastname=" + secondLastname );
		ret.append( ", number=" + number );
		ret.append( ", playerType=" + playerType );
		ret.append( ", sport=" + sport );
		ret.append( ", event=" + event );
		ret.append( ", branch=" + branch );
		ret.append( ", schoolCode=" + schoolCode );
		ret.append( ", schoolName=" + schoolName );
		return ret.toString();
	}

}
