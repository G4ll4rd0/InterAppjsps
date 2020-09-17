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

public class Games implements Serializable
{
	/** 
	 * This attribute maps to the column game_id in the games table.
	 */
	protected int gameId;

	/** 
	 * This attribute maps to the column date in the games table.
	 */
	protected Date date;

	/** 
	 * This attribute maps to the column time in the games table.
	 */
	protected Date time;

	/** 
	 * This attribute maps to the column already_played in the games table.
	 */
	protected int alreadyPlayed;

	/** 
	 * This attribute maps to the column team1_id in the games table.
	 */
	protected int team1Id;

	/** 
	 * This attribute represents whether the primitive attribute team1Id is null.
	 */
	protected boolean team1IdNull = true;

	/** 
	 * This attribute maps to the column team2_id in the games table.
	 */
	protected int team2Id;

	/** 
	 * This attribute represents whether the primitive attribute team2Id is null.
	 */
	protected boolean team2IdNull = true;

	/** 
	 * This attribute maps to the column team1_result in the games table.
	 */
	protected int team1Result;

	/** 
	 * This attribute represents whether the primitive attribute team1Result is null.
	 */
	protected boolean team1ResultNull = true;

	/** 
	 * This attribute maps to the column team2_result in the games table.
	 */
	protected int team2Result;

	/** 
	 * This attribute represents whether the primitive attribute team2Result is null.
	 */
	protected boolean team2ResultNull = true;

	/** 
	 * This attribute maps to the column court_id in the games table.
	 */
	protected int courtId;

	/** 
	 * This attribute represents whether the primitive attribute courtId is null.
	 */
	protected boolean courtIdNull = true;

	/** 
	 * This attribute maps to the column round_id in the games table.
	 */
	protected int roundId;

	/** 
	 * This attribute represents whether the primitive attribute roundId is null.
	 */
	protected boolean roundIdNull = true;

	/**
	 * Method 'Games'
	 * 
	 */
	public Games()
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
	 * Method 'getTeam1Id'
	 * 
	 * @return int
	 */
	public int getTeam1Id()
	{
		return team1Id;
	}

	/**
	 * Method 'setTeam1Id'
	 * 
	 * @param team1Id
	 */
	public void setTeam1Id(int team1Id)
	{
		this.team1Id = team1Id;
		this.team1IdNull = false;
	}

	/**
	 * Method 'setTeam1IdNull'
	 * 
	 * @param value
	 */
	public void setTeam1IdNull(boolean value)
	{
		this.team1IdNull = value;
	}

	/**
	 * Method 'isTeam1IdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeam1IdNull()
	{
		return team1IdNull;
	}

	/**
	 * Method 'getTeam2Id'
	 * 
	 * @return int
	 */
	public int getTeam2Id()
	{
		return team2Id;
	}

	/**
	 * Method 'setTeam2Id'
	 * 
	 * @param team2Id
	 */
	public void setTeam2Id(int team2Id)
	{
		this.team2Id = team2Id;
		this.team2IdNull = false;
	}

	/**
	 * Method 'setTeam2IdNull'
	 * 
	 * @param value
	 */
	public void setTeam2IdNull(boolean value)
	{
		this.team2IdNull = value;
	}

	/**
	 * Method 'isTeam2IdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeam2IdNull()
	{
		return team2IdNull;
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
		this.courtIdNull = false;
	}

	/**
	 * Method 'setCourtIdNull'
	 * 
	 * @param value
	 */
	public void setCourtIdNull(boolean value)
	{
		this.courtIdNull = value;
	}

	/**
	 * Method 'isCourtIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isCourtIdNull()
	{
		return courtIdNull;
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
		
		if (!(_other instanceof Games)) {
			return false;
		}
		
		final Games _cast = (Games) _other;
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (date == null ? _cast.date != date : !date.equals( _cast.date )) {
			return false;
		}
		
		if (time == null ? _cast.time != time : !time.equals( _cast.time )) {
			return false;
		}
		
		if (alreadyPlayed != _cast.alreadyPlayed) {
			return false;
		}
		
		if (team1Id != _cast.team1Id) {
			return false;
		}
		
		if (team1IdNull != _cast.team1IdNull) {
			return false;
		}
		
		if (team2Id != _cast.team2Id) {
			return false;
		}
		
		if (team2IdNull != _cast.team2IdNull) {
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
		
		if (courtId != _cast.courtId) {
			return false;
		}
		
		if (courtIdNull != _cast.courtIdNull) {
			return false;
		}
		
		if (roundId != _cast.roundId) {
			return false;
		}
		
		if (roundIdNull != _cast.roundIdNull) {
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
		if (date != null) {
			_hashCode = 29 * _hashCode + date.hashCode();
		}
		
		if (time != null) {
			_hashCode = 29 * _hashCode + time.hashCode();
		}
		
		_hashCode = 29 * _hashCode + alreadyPlayed;
		_hashCode = 29 * _hashCode + team1Id;
		_hashCode = 29 * _hashCode + (team1IdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + team2Id;
		_hashCode = 29 * _hashCode + (team2IdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + team1Result;
		_hashCode = 29 * _hashCode + (team1ResultNull ? 1 : 0);
		_hashCode = 29 * _hashCode + team2Result;
		_hashCode = 29 * _hashCode + (team2ResultNull ? 1 : 0);
		_hashCode = 29 * _hashCode + courtId;
		_hashCode = 29 * _hashCode + (courtIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + roundId;
		_hashCode = 29 * _hashCode + (roundIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return GamesPk
	 */
	public GamesPk createPk()
	{
		return new GamesPk(gameId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Games: " );
		ret.append( "gameId=" + gameId );
		ret.append( ", date=" + date );
		ret.append( ", time=" + time );
		ret.append( ", alreadyPlayed=" + alreadyPlayed );
		ret.append( ", team1Id=" + team1Id );
		ret.append( ", team2Id=" + team2Id );
		ret.append( ", team1Result=" + team1Result );
		ret.append( ", team2Result=" + team2Result );
		ret.append( ", courtId=" + courtId );
		ret.append( ", roundId=" + roundId );
		return ret.toString();
	}

}
