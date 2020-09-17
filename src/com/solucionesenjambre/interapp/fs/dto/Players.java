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

public class Players implements Serializable
{
	/** 
	 * This attribute maps to the column player_id in the players table.
	 */
	protected int playerId;

	/** 
	 * This attribute maps to the column player_name in the players table.
	 */
	protected String playerName;

	/** 
	 * This attribute maps to the column first_lastname in the players table.
	 */
	protected String firstLastname;

	/** 
	 * This attribute maps to the column second_lastname in the players table.
	 */
	protected String secondLastname;

	/** 
	 * This attribute maps to the column player_number in the players table.
	 */
	protected int playerNumber;

	/** 
	 * This attribute maps to the column team_id in the players table.
	 */
	protected int teamId;

	/** 
	 * This attribute represents whether the primitive attribute teamId is null.
	 */
	protected boolean teamIdNull = true;

	/** 
	 * This attribute maps to the column player_type_id in the players table.
	 */
	protected int playerTypeId;

	/** 
	 * This attribute represents whether the primitive attribute playerTypeId is null.
	 */
	protected boolean playerTypeIdNull = true;

	/**
	 * Method 'Players'
	 * 
	 */
	public Players()
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
		this.playerTypeIdNull = false;
	}

	/**
	 * Method 'setPlayerTypeIdNull'
	 * 
	 * @param value
	 */
	public void setPlayerTypeIdNull(boolean value)
	{
		this.playerTypeIdNull = value;
	}

	/**
	 * Method 'isPlayerTypeIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPlayerTypeIdNull()
	{
		return playerTypeIdNull;
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
		
		if (!(_other instanceof Players)) {
			return false;
		}
		
		final Players _cast = (Players) _other;
		if (playerId != _cast.playerId) {
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
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (teamIdNull != _cast.teamIdNull) {
			return false;
		}
		
		if (playerTypeId != _cast.playerTypeId) {
			return false;
		}
		
		if (playerTypeIdNull != _cast.playerTypeIdNull) {
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
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + (teamIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + playerTypeId;
		_hashCode = 29 * _hashCode + (playerTypeIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PlayersPk
	 */
	public PlayersPk createPk()
	{
		return new PlayersPk(playerId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Players: " );
		ret.append( "playerId=" + playerId );
		ret.append( ", playerName=" + playerName );
		ret.append( ", firstLastname=" + firstLastname );
		ret.append( ", secondLastname=" + secondLastname );
		ret.append( ", playerNumber=" + playerNumber );
		ret.append( ", teamId=" + teamId );
		ret.append( ", playerTypeId=" + playerTypeId );
		return ret.toString();
	}

}
