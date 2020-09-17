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

public class PlayersStats implements Serializable
{
	/** 
	 * This attribute maps to the column player_stat_id in the players_stats table.
	 */
	protected int playerStatId;

	/** 
	 * This attribute maps to the column points in the players_stats table.
	 */
	protected int points;

	/** 
	 * This attribute represents whether the primitive attribute points is null.
	 */
	protected boolean pointsNull = true;

	/** 
	 * This attribute maps to the column yellow_cards in the players_stats table.
	 */
	protected int yellowCards;

	/** 
	 * This attribute represents whether the primitive attribute yellowCards is null.
	 */
	protected boolean yellowCardsNull = true;

	/** 
	 * This attribute maps to the column red_cards in the players_stats table.
	 */
	protected int redCards;

	/** 
	 * This attribute represents whether the primitive attribute redCards is null.
	 */
	protected boolean redCardsNull = true;

	/** 
	 * This attribute maps to the column game_id in the players_stats table.
	 */
	protected int gameId;

	/** 
	 * This attribute represents whether the primitive attribute gameId is null.
	 */
	protected boolean gameIdNull = true;

	/** 
	 * This attribute maps to the column player_id in the players_stats table.
	 */
	protected int playerId;

	/** 
	 * This attribute represents whether the primitive attribute playerId is null.
	 */
	protected boolean playerIdNull = true;

	/**
	 * Method 'PlayersStats'
	 * 
	 */
	public PlayersStats()
	{
	}

	/**
	 * Method 'getPlayerStatId'
	 * 
	 * @return int
	 */
	public int getPlayerStatId()
	{
		return playerStatId;
	}

	/**
	 * Method 'setPlayerStatId'
	 * 
	 * @param playerStatId
	 */
	public void setPlayerStatId(int playerStatId)
	{
		this.playerStatId = playerStatId;
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
		
		if (!(_other instanceof PlayersStats)) {
			return false;
		}
		
		final PlayersStats _cast = (PlayersStats) _other;
		if (playerStatId != _cast.playerStatId) {
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
		
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (gameIdNull != _cast.gameIdNull) {
			return false;
		}
		
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (playerIdNull != _cast.playerIdNull) {
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
		_hashCode = 29 * _hashCode + playerStatId;
		_hashCode = 29 * _hashCode + points;
		_hashCode = 29 * _hashCode + (pointsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + yellowCards;
		_hashCode = 29 * _hashCode + (yellowCardsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + redCards;
		_hashCode = 29 * _hashCode + (redCardsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + gameId;
		_hashCode = 29 * _hashCode + (gameIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + playerId;
		_hashCode = 29 * _hashCode + (playerIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PlayersStatsPk
	 */
	public PlayersStatsPk createPk()
	{
		return new PlayersStatsPk(playerStatId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.PlayersStats: " );
		ret.append( "playerStatId=" + playerStatId );
		ret.append( ", points=" + points );
		ret.append( ", yellowCards=" + yellowCards );
		ret.append( ", redCards=" + redCards );
		ret.append( ", gameId=" + gameId );
		ret.append( ", playerId=" + playerId );
		return ret.toString();
	}

}
