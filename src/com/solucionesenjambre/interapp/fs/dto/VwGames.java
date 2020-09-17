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
import java.util.Date;

public class VwGames implements Serializable
{
	/** 
	 * This attribute maps to the column game_id in the vw_games table.
	 */
	protected int gameId;

	/** 
	 * This attribute maps to the column court_id in the vw_games table.
	 */
	protected int courtId;

	/** 
	 * This attribute maps to the column local_team_id in the vw_games table.
	 */
	protected int localTeamId;

	/** 
	 * This attribute maps to the column local_school_id in the vw_games table.
	 */
	protected int localSchoolId;

	/** 
	 * This attribute maps to the column visitante_team_id in the vw_games table.
	 */
	protected int visitanteTeamId;

	/** 
	 * This attribute maps to the column visitante_school_id in the vw_games table.
	 */
	protected int visitanteSchoolId;

	/** 
	 * This attribute maps to the column sport_id in the vw_games table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column event_id in the vw_games table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column branch_id in the vw_games table.
	 */
	protected int branchId;

	/** 
	 * This attribute maps to the column round_id in the vw_games table.
	 */
	protected int roundId;

	/** 
	 * This attribute represents whether the primitive attribute roundId is null.
	 */
	protected boolean roundIdNull = true;

	/** 
	 * This attribute maps to the column date in the vw_games table.
	 */
	protected Date date;

	/** 
	 * This attribute maps to the column time in the vw_games table.
	 */
	protected Date time;

	/** 
	 * This attribute maps to the column local_code_delegacion in the vw_games table.
	 */
	protected String localCodeDelegacion;

	/** 
	 * This attribute maps to the column local_name_delegacion in the vw_games table.
	 */
	protected String localNameDelegacion;

	/** 
	 * This attribute maps to the column team1_result in the vw_games table.
	 */
	protected int team1Result;

	/** 
	 * This attribute represents whether the primitive attribute team1Result is null.
	 */
	protected boolean team1ResultNull = true;

	/** 
	 * This attribute maps to the column team2_result in the vw_games table.
	 */
	protected int team2Result;

	/** 
	 * This attribute represents whether the primitive attribute team2Result is null.
	 */
	protected boolean team2ResultNull = true;

	/** 
	 * This attribute maps to the column visitante_code_delegacion in the vw_games table.
	 */
	protected String visitanteCodeDelegacion;

	/** 
	 * This attribute maps to the column visitante_name_delegacion in the vw_games table.
	 */
	protected String visitanteNameDelegacion;

	/** 
	 * This attribute maps to the column court_name in the vw_games table.
	 */
	protected String courtName;

	/** 
	 * This attribute maps to the column sport_name in the vw_games table.
	 */
	protected String sportName;

	/** 
	 * This attribute maps to the column event_name in the vw_games table.
	 */
	protected String eventName;

	/** 
	 * This attribute maps to the column branch_name in the vw_games table.
	 */
	protected String branchName;

	/** 
	 * This attribute maps to the column round_name in the vw_games table.
	 */
	protected String roundName;

	/** 
	 * This attribute maps to the column already_played in the vw_games table.
	 */
	protected int alreadyPlayed;

	/**
	 * Method 'VwGames'
	 * 
	 */
	public VwGames()
	{
	}

	/**
	 * Method 'getGameId'
	 * 
	 * @return int
	 */
	public int getGameId()
	{
		return gameId;
	}

	/**
	 * Method 'setGameId'
	 * 
	 * @param gameId
	 */
	public void setGameId(int gameId)
	{
		this.gameId = gameId;
	}

	/**
	 * Method 'getCourtId'
	 * 
	 * @return int
	 */
	public int getCourtId()
	{
		return courtId;
	}

	/**
	 * Method 'setCourtId'
	 * 
	 * @param courtId
	 */
	public void setCourtId(int courtId)
	{
		this.courtId = courtId;
	}

	/**
	 * Method 'getLocalTeamId'
	 * 
	 * @return int
	 */
	public int getLocalTeamId()
	{
		return localTeamId;
	}

	/**
	 * Method 'setLocalTeamId'
	 * 
	 * @param localTeamId
	 */
	public void setLocalTeamId(int localTeamId)
	{
		this.localTeamId = localTeamId;
	}

	/**
	 * Method 'getLocalSchoolId'
	 * 
	 * @return int
	 */
	public int getLocalSchoolId()
	{
		return localSchoolId;
	}

	/**
	 * Method 'setLocalSchoolId'
	 * 
	 * @param localSchoolId
	 */
	public void setLocalSchoolId(int localSchoolId)
	{
		this.localSchoolId = localSchoolId;
	}

	/**
	 * Method 'getVisitanteTeamId'
	 * 
	 * @return int
	 */
	public int getVisitanteTeamId()
	{
		return visitanteTeamId;
	}

	/**
	 * Method 'setVisitanteTeamId'
	 * 
	 * @param visitanteTeamId
	 */
	public void setVisitanteTeamId(int visitanteTeamId)
	{
		this.visitanteTeamId = visitanteTeamId;
	}

	/**
	 * Method 'getVisitanteSchoolId'
	 * 
	 * @return int
	 */
	public int getVisitanteSchoolId()
	{
		return visitanteSchoolId;
	}

	/**
	 * Method 'setVisitanteSchoolId'
	 * 
	 * @param visitanteSchoolId
	 */
	public void setVisitanteSchoolId(int visitanteSchoolId)
	{
		this.visitanteSchoolId = visitanteSchoolId;
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
	 * Method 'getRoundId'
	 * 
	 * @return int
	 */
	public int getRoundId()
	{
		return roundId;
	}

	/**
	 * Method 'setRoundId'
	 * 
	 * @param roundId
	 */
	public void setRoundId(int roundId)
	{
		this.roundId = roundId;
		this.roundIdNull = false;
	}

	/**
	 * Method 'setRoundIdNull'
	 * 
	 * @param value
	 */
	public void setRoundIdNull(boolean value)
	{
		this.roundIdNull = value;
	}

	/**
	 * Method 'isRoundIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isRoundIdNull()
	{
		return roundIdNull;
	}

	/**
	 * Method 'getDate'
	 * 
	 * @return Date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * Method 'setDate'
	 * 
	 * @param date
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * Method 'getTime'
	 * 
	 * @return Date
	 */
	public Date getTime()
	{
		return time;
	}

	/**
	 * Method 'setTime'
	 * 
	 * @param time
	 */
	public void setTime(Date time)
	{
		this.time = time;
	}

	/**
	 * Method 'getLocalCodeDelegacion'
	 * 
	 * @return String
	 */
	public String getLocalCodeDelegacion()
	{
		return localCodeDelegacion;
	}

	/**
	 * Method 'setLocalCodeDelegacion'
	 * 
	 * @param localCodeDelegacion
	 */
	public void setLocalCodeDelegacion(String localCodeDelegacion)
	{
		this.localCodeDelegacion = localCodeDelegacion;
	}

	/**
	 * Method 'getLocalNameDelegacion'
	 * 
	 * @return String
	 */
	public String getLocalNameDelegacion()
	{
		return localNameDelegacion;
	}

	/**
	 * Method 'setLocalNameDelegacion'
	 * 
	 * @param localNameDelegacion
	 */
	public void setLocalNameDelegacion(String localNameDelegacion)
	{
		this.localNameDelegacion = localNameDelegacion;
	}

	/**
	 * Method 'getTeam1Result'
	 * 
	 * @return int
	 */
	public int getTeam1Result()
	{
		return team1Result;
	}

	/**
	 * Method 'setTeam1Result'
	 * 
	 * @param team1Result
	 */
	public void setTeam1Result(int team1Result)
	{
		this.team1Result = team1Result;
		this.team1ResultNull = false;
	}

	/**
	 * Method 'setTeam1ResultNull'
	 * 
	 * @param value
	 */
	public void setTeam1ResultNull(boolean value)
	{
		this.team1ResultNull = value;
	}

	/**
	 * Method 'isTeam1ResultNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeam1ResultNull()
	{
		return team1ResultNull;
	}

	/**
	 * Method 'getTeam2Result'
	 * 
	 * @return int
	 */
	public int getTeam2Result()
	{
		return team2Result;
	}

	/**
	 * Method 'setTeam2Result'
	 * 
	 * @param team2Result
	 */
	public void setTeam2Result(int team2Result)
	{
		this.team2Result = team2Result;
		this.team2ResultNull = false;
	}

	/**
	 * Method 'setTeam2ResultNull'
	 * 
	 * @param value
	 */
	public void setTeam2ResultNull(boolean value)
	{
		this.team2ResultNull = value;
	}

	/**
	 * Method 'isTeam2ResultNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeam2ResultNull()
	{
		return team2ResultNull;
	}

	/**
	 * Method 'getVisitanteCodeDelegacion'
	 * 
	 * @return String
	 */
	public String getVisitanteCodeDelegacion()
	{
		return visitanteCodeDelegacion;
	}

	/**
	 * Method 'setVisitanteCodeDelegacion'
	 * 
	 * @param visitanteCodeDelegacion
	 */
	public void setVisitanteCodeDelegacion(String visitanteCodeDelegacion)
	{
		this.visitanteCodeDelegacion = visitanteCodeDelegacion;
	}

	/**
	 * Method 'getVisitanteNameDelegacion'
	 * 
	 * @return String
	 */
	public String getVisitanteNameDelegacion()
	{
		return visitanteNameDelegacion;
	}

	/**
	 * Method 'setVisitanteNameDelegacion'
	 * 
	 * @param visitanteNameDelegacion
	 */
	public void setVisitanteNameDelegacion(String visitanteNameDelegacion)
	{
		this.visitanteNameDelegacion = visitanteNameDelegacion;
	}

	/**
	 * Method 'getCourtName'
	 * 
	 * @return String
	 */
	public String getCourtName()
	{
		return courtName;
	}

	/**
	 * Method 'setCourtName'
	 * 
	 * @param courtName
	 */
	public void setCourtName(String courtName)
	{
		this.courtName = courtName;
	}

	/**
	 * Method 'getSportName'
	 * 
	 * @return String
	 */
	public String getSportName()
	{
		return sportName;
	}

	/**
	 * Method 'setSportName'
	 * 
	 * @param sportName
	 */
	public void setSportName(String sportName)
	{
		this.sportName = sportName;
	}

	/**
	 * Method 'getEventName'
	 * 
	 * @return String
	 */
	public String getEventName()
	{
		return eventName;
	}

	/**
	 * Method 'setEventName'
	 * 
	 * @param eventName
	 */
	public void setEventName(String eventName)
	{
		this.eventName = eventName;
	}

	/**
	 * Method 'getBranchName'
	 * 
	 * @return String
	 */
	public String getBranchName()
	{
		return branchName;
	}

	/**
	 * Method 'setBranchName'
	 * 
	 * @param branchName
	 */
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	/**
	 * Method 'getRoundName'
	 * 
	 * @return String
	 */
	public String getRoundName()
	{
		return roundName;
	}

	/**
	 * Method 'setRoundName'
	 * 
	 * @param roundName
	 */
	public void setRoundName(String roundName)
	{
		this.roundName = roundName;
	}

	/**
	 * Method 'getAlreadyPlayed'
	 * 
	 * @return int
	 */
	public int getAlreadyPlayed()
	{
		return alreadyPlayed;
	}

	/**
	 * Method 'setAlreadyPlayed'
	 * 
	 * @param alreadyPlayed
	 */
	public void setAlreadyPlayed(int alreadyPlayed)
	{
		this.alreadyPlayed = alreadyPlayed;
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
		
		if (!(_other instanceof VwGames)) {
			return false;
		}
		
		final VwGames _cast = (VwGames) _other;
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (courtId != _cast.courtId) {
			return false;
		}
		
		if (localTeamId != _cast.localTeamId) {
			return false;
		}
		
		if (localSchoolId != _cast.localSchoolId) {
			return false;
		}
		
		if (visitanteTeamId != _cast.visitanteTeamId) {
			return false;
		}
		
		if (visitanteSchoolId != _cast.visitanteSchoolId) {
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
		
		if (roundId != _cast.roundId) {
			return false;
		}
		
		if (roundIdNull != _cast.roundIdNull) {
			return false;
		}
		
		if (date == null ? _cast.date != date : !date.equals( _cast.date )) {
			return false;
		}
		
		if (time == null ? _cast.time != time : !time.equals( _cast.time )) {
			return false;
		}
		
		if (localCodeDelegacion == null ? _cast.localCodeDelegacion != localCodeDelegacion : !localCodeDelegacion.equals( _cast.localCodeDelegacion )) {
			return false;
		}
		
		if (localNameDelegacion == null ? _cast.localNameDelegacion != localNameDelegacion : !localNameDelegacion.equals( _cast.localNameDelegacion )) {
			return false;
		}
		
		if (team1Result != _cast.team1Result) {
			return false;
		}
		
		if (team1ResultNull != _cast.team1ResultNull) {
			return false;
		}
		
		if (team2Result != _cast.team2Result) {
			return false;
		}
		
		if (team2ResultNull != _cast.team2ResultNull) {
			return false;
		}
		
		if (visitanteCodeDelegacion == null ? _cast.visitanteCodeDelegacion != visitanteCodeDelegacion : !visitanteCodeDelegacion.equals( _cast.visitanteCodeDelegacion )) {
			return false;
		}
		
		if (visitanteNameDelegacion == null ? _cast.visitanteNameDelegacion != visitanteNameDelegacion : !visitanteNameDelegacion.equals( _cast.visitanteNameDelegacion )) {
			return false;
		}
		
		if (courtName == null ? _cast.courtName != courtName : !courtName.equals( _cast.courtName )) {
			return false;
		}
		
		if (sportName == null ? _cast.sportName != sportName : !sportName.equals( _cast.sportName )) {
			return false;
		}
		
		if (eventName == null ? _cast.eventName != eventName : !eventName.equals( _cast.eventName )) {
			return false;
		}
		
		if (branchName == null ? _cast.branchName != branchName : !branchName.equals( _cast.branchName )) {
			return false;
		}
		
		if (roundName == null ? _cast.roundName != roundName : !roundName.equals( _cast.roundName )) {
			return false;
		}
		
		if (alreadyPlayed != _cast.alreadyPlayed) {
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
		_hashCode = 29 * _hashCode + gameId;
		_hashCode = 29 * _hashCode + courtId;
		_hashCode = 29 * _hashCode + localTeamId;
		_hashCode = 29 * _hashCode + localSchoolId;
		_hashCode = 29 * _hashCode + visitanteTeamId;
		_hashCode = 29 * _hashCode + visitanteSchoolId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + roundId;
		_hashCode = 29 * _hashCode + (roundIdNull ? 1 : 0);
		if (date != null) {
			_hashCode = 29 * _hashCode + date.hashCode();
		}
		
		if (time != null) {
			_hashCode = 29 * _hashCode + time.hashCode();
		}
		
		if (localCodeDelegacion != null) {
			_hashCode = 29 * _hashCode + localCodeDelegacion.hashCode();
		}
		
		if (localNameDelegacion != null) {
			_hashCode = 29 * _hashCode + localNameDelegacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + team1Result;
		_hashCode = 29 * _hashCode + (team1ResultNull ? 1 : 0);
		_hashCode = 29 * _hashCode + team2Result;
		_hashCode = 29 * _hashCode + (team2ResultNull ? 1 : 0);
		if (visitanteCodeDelegacion != null) {
			_hashCode = 29 * _hashCode + visitanteCodeDelegacion.hashCode();
		}
		
		if (visitanteNameDelegacion != null) {
			_hashCode = 29 * _hashCode + visitanteNameDelegacion.hashCode();
		}
		
		if (courtName != null) {
			_hashCode = 29 * _hashCode + courtName.hashCode();
		}
		
		if (sportName != null) {
			_hashCode = 29 * _hashCode + sportName.hashCode();
		}
		
		if (eventName != null) {
			_hashCode = 29 * _hashCode + eventName.hashCode();
		}
		
		if (branchName != null) {
			_hashCode = 29 * _hashCode + branchName.hashCode();
		}
		
		if (roundName != null) {
			_hashCode = 29 * _hashCode + roundName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + alreadyPlayed;
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwGames: " );
		ret.append( "gameId=" + gameId );
		ret.append( ", courtId=" + courtId );
		ret.append( ", localTeamId=" + localTeamId );
		ret.append( ", localSchoolId=" + localSchoolId );
		ret.append( ", visitanteTeamId=" + visitanteTeamId );
		ret.append( ", visitanteSchoolId=" + visitanteSchoolId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", branchId=" + branchId );
		ret.append( ", roundId=" + roundId );
		ret.append( ", date=" + date );
		ret.append( ", time=" + time );
		ret.append( ", localCodeDelegacion=" + localCodeDelegacion );
		ret.append( ", localNameDelegacion=" + localNameDelegacion );
		ret.append( ", team1Result=" + team1Result );
		ret.append( ", team2Result=" + team2Result );
		ret.append( ", visitanteCodeDelegacion=" + visitanteCodeDelegacion );
		ret.append( ", visitanteNameDelegacion=" + visitanteNameDelegacion );
		ret.append( ", courtName=" + courtName );
		ret.append( ", sportName=" + sportName );
		ret.append( ", eventName=" + eventName );
		ret.append( ", branchName=" + branchName );
		ret.append( ", roundName=" + roundName );
		ret.append( ", alreadyPlayed=" + alreadyPlayed );
		return ret.toString();
	}

}
