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

public class VwStats implements Serializable
{
	/** 
	 * This attribute maps to the column player_id in the vw_stats table.
	 */
	protected int playerId;

	/** 
	 * This attribute represents whether the primitive attribute playerId is null.
	 */
	protected boolean playerIdNull = true;

	/** 
	 * This attribute maps to the column team_id in the vw_stats table.
	 */
	protected int teamId;

	/** 
	 * This attribute maps to the column school_id in the vw_stats table.
	 */
	protected int schoolId;

	/** 
	 * This attribute maps to the column sport_id in the vw_stats table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column branch_id in the vw_stats table.
	 */
	protected int branchId;

	/** 
	 * This attribute maps to the column event_id in the vw_stats table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column number in the vw_stats table.
	 */
	protected int number;

	/** 
	 * This attribute maps to the column name in the vw_stats table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column first_lastname in the vw_stats table.
	 */
	protected String firstLastname;

	/** 
	 * This attribute maps to the column second_lastname in the vw_stats table.
	 */
	protected String secondLastname;

	/** 
	 * This attribute maps to the column points in the vw_stats table.
	 */
	protected long points;

	/** 
	 * This attribute represents whether the primitive attribute points is null.
	 */
	protected boolean pointsNull = true;

	/** 
	 * This attribute maps to the column yellow_cards in the vw_stats table.
	 */
	protected long yellowCards;

	/** 
	 * This attribute represents whether the primitive attribute yellowCards is null.
	 */
	protected boolean yellowCardsNull = true;

	/** 
	 * This attribute maps to the column red_cards in the vw_stats table.
	 */
	protected long redCards;

	/** 
	 * This attribute represents whether the primitive attribute redCards is null.
	 */
	protected boolean redCardsNull = true;

	/** 
	 * This attribute maps to the column code in the vw_stats table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column school in the vw_stats table.
	 */
	protected String school;

	/** 
	 * This attribute maps to the column sport in the vw_stats table.
	 */
	protected String sport;

	/** 
	 * This attribute maps to the column event in the vw_stats table.
	 */
	protected String event;

	/** 
	 * This attribute maps to the column branch in the vw_stats table.
	 */
	protected String branch;

	/** 
	 * This attribute maps to the column team_name in the vw_stats table.
	 */
	protected String teamName;

	/**
	 * Method 'VwStats'
	 * 
	 */
	public VwStats()
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
		this.playerIdNull = false;
	}

	/**
	 * Method 'setPlayerIdNull'
	 * 
	 * @param value
	 */
	public void setPlayerIdNull(boolean value)
	{
		this.playerIdNull = value;
	}

	/**
	 * Method 'isPlayerIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPlayerIdNull()
	{
		return playerIdNull;
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
	 * Method 'getPoints'
	 * 
	 * @return long
	 */
	public long getPoints()
	{
		return points;
	}

	/**
	 * Method 'setPoints'
	 * 
	 * @param points
	 */
	public void setPoints(long points)
	{
		this.points = points;
		this.pointsNull = false;
	}

	/**
	 * Method 'setPointsNull'
	 * 
	 * @param value
	 */
	public void setPointsNull(boolean value)
	{
		this.pointsNull = value;
	}

	/**
	 * Method 'isPointsNull'
	 * 
	 * @return boolean
	 */
	public boolean isPointsNull()
	{
		return pointsNull;
	}

	/**
	 * Method 'getYellowCards'
	 * 
	 * @return long
	 */
	public long getYellowCards()
	{
		return yellowCards;
	}

	/**
	 * Method 'setYellowCards'
	 * 
	 * @param yellowCards
	 */
	public void setYellowCards(long yellowCards)
	{
		this.yellowCards = yellowCards;
		this.yellowCardsNull = false;
	}

	/**
	 * Method 'setYellowCardsNull'
	 * 
	 * @param value
	 */
	public void setYellowCardsNull(boolean value)
	{
		this.yellowCardsNull = value;
	}

	/**
	 * Method 'isYellowCardsNull'
	 * 
	 * @return boolean
	 */
	public boolean isYellowCardsNull()
	{
		return yellowCardsNull;
	}

	/**
	 * Method 'getRedCards'
	 * 
	 * @return long
	 */
	public long getRedCards()
	{
		return redCards;
	}

	/**
	 * Method 'setRedCards'
	 * 
	 * @param redCards
	 */
	public void setRedCards(long redCards)
	{
		this.redCards = redCards;
		this.redCardsNull = false;
	}

	/**
	 * Method 'setRedCardsNull'
	 * 
	 * @param value
	 */
	public void setRedCardsNull(boolean value)
	{
		this.redCardsNull = value;
	}

	/**
	 * Method 'isRedCardsNull'
	 * 
	 * @return boolean
	 */
	public boolean isRedCardsNull()
	{
		return redCardsNull;
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
		
		if (!(_other instanceof VwStats)) {
			return false;
		}
		
		final VwStats _cast = (VwStats) _other;
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (playerIdNull != _cast.playerIdNull) {
			return false;
		}
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (number != _cast.number) {
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
		
		if (points != _cast.points) {
			return false;
		}
		
		if (pointsNull != _cast.pointsNull) {
			return false;
		}
		
		if (yellowCards != _cast.yellowCards) {
			return false;
		}
		
		if (yellowCardsNull != _cast.yellowCardsNull) {
			return false;
		}
		
		if (redCards != _cast.redCards) {
			return false;
		}
		
		if (redCardsNull != _cast.redCardsNull) {
			return false;
		}
		
		if (code == null ? _cast.code != code : !code.equals( _cast.code )) {
			return false;
		}
		
		if (school == null ? _cast.school != school : !school.equals( _cast.school )) {
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
		_hashCode = 29 * _hashCode + playerId;
		_hashCode = 29 * _hashCode + (playerIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + number;
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (firstLastname != null) {
			_hashCode = 29 * _hashCode + firstLastname.hashCode();
		}
		
		if (secondLastname != null) {
			_hashCode = 29 * _hashCode + secondLastname.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (points ^ (points >>> 32));
		_hashCode = 29 * _hashCode + (pointsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (yellowCards ^ (yellowCards >>> 32));
		_hashCode = 29 * _hashCode + (yellowCardsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (redCards ^ (redCards >>> 32));
		_hashCode = 29 * _hashCode + (redCardsNull ? 1 : 0);
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (school != null) {
			_hashCode = 29 * _hashCode + school.hashCode();
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwStats: " );
		ret.append( "playerId=" + playerId );
		ret.append( ", teamId=" + teamId );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", branchId=" + branchId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", number=" + number );
		ret.append( ", name=" + name );
		ret.append( ", firstLastname=" + firstLastname );
		ret.append( ", secondLastname=" + secondLastname );
		ret.append( ", points=" + points );
		ret.append( ", yellowCards=" + yellowCards );
		ret.append( ", redCards=" + redCards );
		ret.append( ", code=" + code );
		ret.append( ", school=" + school );
		ret.append( ", sport=" + sport );
		ret.append( ", event=" + event );
		ret.append( ", branch=" + branch );
		ret.append( ", teamName=" + teamName );
		return ret.toString();
	}

}
