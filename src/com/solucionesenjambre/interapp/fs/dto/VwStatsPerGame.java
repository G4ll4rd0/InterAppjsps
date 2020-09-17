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

public class VwStatsPerGame implements Serializable
{
	/** 
	 * This attribute maps to the column player_id in the vw_stats_per_game table.
	 */
	protected int playerId;

	/** 
	 * This attribute maps to the column team_id in the vw_stats_per_game table.
	 */
	protected int teamId;

	/** 
	 * This attribute represents whether the primitive attribute teamId is null.
	 */
	protected boolean teamIdNull = true;

	/** 
	 * This attribute maps to the column game_id in the vw_stats_per_game table.
	 */
	protected int gameId;

	/** 
	 * This attribute represents whether the primitive attribute gameId is null.
	 */
	protected boolean gameIdNull = true;

	/** 
	 * This attribute maps to the column player_name in the vw_stats_per_game table.
	 */
	protected String playerName;

	/** 
	 * This attribute maps to the column first_lastname in the vw_stats_per_game table.
	 */
	protected String firstLastname;

	/** 
	 * This attribute maps to the column second_lastname in the vw_stats_per_game table.
	 */
	protected String secondLastname;

	/** 
	 * This attribute maps to the column player_number in the vw_stats_per_game table.
	 */
	protected int playerNumber;

	/** 
	 * This attribute maps to the column points in the vw_stats_per_game table.
	 */
	protected int points;

	/** 
	 * This attribute represents whether the primitive attribute points is null.
	 */
	protected boolean pointsNull = true;

	/** 
	 * This attribute maps to the column yellow_cards in the vw_stats_per_game table.
	 */
	protected int yellowCards;

	/** 
	 * This attribute represents whether the primitive attribute yellowCards is null.
	 */
	protected boolean yellowCardsNull = true;

	/** 
	 * This attribute maps to the column red_cards in the vw_stats_per_game table.
	 */
	protected int redCards;

	/** 
	 * This attribute represents whether the primitive attribute redCards is null.
	 */
	protected boolean redCardsNull = true;

	/**
	 * Method 'VwStatsPerGame'
	 * 
	 */
	public VwStatsPerGame()
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
		this.teamIdNull = false;
	}

	/**
	 * Method 'setTeamIdNull'
	 * 
	 * @param value
	 */
	public void setTeamIdNull(boolean value)
	{
		this.teamIdNull = value;
	}

	/**
	 * Method 'isTeamIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeamIdNull()
	{
		return teamIdNull;
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
		this.gameIdNull = false;
	}

	/**
	 * Method 'setGameIdNull'
	 * 
	 * @param value
	 */
	public void setGameIdNull(boolean value)
	{
		this.gameIdNull = value;
	}

	/**
	 * Method 'isGameIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isGameIdNull()
	{
		return gameIdNull;
	}

	/**
	 * Method 'getPlayerName'
	 * 
	 * @return String
	 */
	public String getPlayerName()
	{
		return playerName;
	}

	/**
	 * Method 'setPlayerName'
	 * 
	 * @param playerName
	 */
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
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
	 * Method 'getPlayerNumber'
	 * 
	 * @return int
	 */
	public int getPlayerNumber()
	{
		return playerNumber;
	}

	/**
	 * Method 'setPlayerNumber'
	 * 
	 * @param playerNumber
	 */
	public void setPlayerNumber(int playerNumber)
	{
		this.playerNumber = playerNumber;
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
	 * @return int
	 */
	public int getYellowCards()
	{
		return yellowCards;
	}

	/**
	 * Method 'setYellowCards'
	 * 
	 * @param yellowCards
	 */
	public void setYellowCards(int yellowCards)
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
	 * @return int
	 */
	public int getRedCards()
	{
		return redCards;
	}

	/**
	 * Method 'setRedCards'
	 * 
	 * @param redCards
	 */
	public void setRedCards(int redCards)
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
		
		if (!(_other instanceof VwStatsPerGame)) {
			return false;
		}
		
		final VwStatsPerGame _cast = (VwStatsPerGame) _other;
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (teamIdNull != _cast.teamIdNull) {
			return false;
		}
		
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (gameIdNull != _cast.gameIdNull) {
			return false;
		}
		
		if (playerName == null ? _cast.playerName != playerName : !playerName.equals( _cast.playerName )) {
			return false;
		}
		
		if (firstLastname == null ? _cast.firstLastname != firstLastname : !firstLastname.equals( _cast.firstLastname )) {
			return false;
		}
		
		if (secondLastname == null ? _cast.secondLastname != secondLastname : !secondLastname.equals( _cast.secondLastname )) {
			return false;
		}
		
		if (playerNumber != _cast.playerNumber) {
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
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + (teamIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + gameId;
		_hashCode = 29 * _hashCode + (gameIdNull ? 1 : 0);
		if (playerName != null) {
			_hashCode = 29 * _hashCode + playerName.hashCode();
		}
		
		if (firstLastname != null) {
			_hashCode = 29 * _hashCode + firstLastname.hashCode();
		}
		
		if (secondLastname != null) {
			_hashCode = 29 * _hashCode + secondLastname.hashCode();
		}
		
		_hashCode = 29 * _hashCode + playerNumber;
		_hashCode = 29 * _hashCode + points;
		_hashCode = 29 * _hashCode + (pointsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + yellowCards;
		_hashCode = 29 * _hashCode + (yellowCardsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + redCards;
		_hashCode = 29 * _hashCode + (redCardsNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwStatsPerGame: " );
		ret.append( "playerId=" + playerId );
		ret.append( ", teamId=" + teamId );
		ret.append( ", gameId=" + gameId );
		ret.append( ", playerName=" + playerName );
		ret.append( ", firstLastname=" + firstLastname );
		ret.append( ", secondLastname=" + secondLastname );
		ret.append( ", playerNumber=" + playerNumber );
		ret.append( ", points=" + points );
		ret.append( ", yellowCards=" + yellowCards );
		ret.append( ", redCards=" + redCards );
		return ret.toString();
	}

}
