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

public class ParentsHostsPlayers implements Serializable
{
	/** 
	 * This attribute maps to the column parent_host_player_id in the parents_hosts_players table.
	 */
	protected int parentHostPlayerId;

	/** 
	 * This attribute maps to the column host_id in the parents_hosts_players table.
	 */
	protected int hostId;

	/** 
	 * This attribute represents whether the primitive attribute hostId is null.
	 */
	protected boolean hostIdNull = true;

	/** 
	 * This attribute maps to the column player_id in the parents_hosts_players table.
	 */
	protected int playerId;

	/** 
	 * This attribute represents whether the primitive attribute playerId is null.
	 */
	protected boolean playerIdNull = true;

	/** 
	 * This attribute maps to the column user_id in the parents_hosts_players table.
	 */
	protected int userId;

	/** 
	 * This attribute represents whether the primitive attribute userId is null.
	 */
	protected boolean userIdNull = true;

	/**
	 * Method 'ParentsHostsPlayers'
	 * 
	 */
	public ParentsHostsPlayers()
	{
	}

	/**
	 * Method 'getParentHostPlayerId'
	 * 
	 * @return int
	 */
	public int getParentHostPlayerId()
	{
		return parentHostPlayerId;
	}

	/**
	 * Method 'setParentHostPlayerId'
	 * 
	 * @param parentHostPlayerId
	 */
	public void setParentHostPlayerId(int parentHostPlayerId)
	{
		this.parentHostPlayerId = parentHostPlayerId;
	}

	/**
	 * Method 'getHostId'
	 * 
	 * @return int
	 */
	public int getHostId()
	{
		return hostId;
	}

	/**
	 * Method 'setHostId'
	 * 
	 * @param hostId
	 */
	public void setHostId(int hostId)
	{
		this.hostId = hostId;
		this.hostIdNull = false;
	}

	/**
	 * Method 'setHostIdNull'
	 * 
	 * @param value
	 */
	public void setHostIdNull(boolean value)
	{
		this.hostIdNull = value;
	}

	/**
	 * Method 'isHostIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isHostIdNull()
	{
		return hostIdNull;
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
	 * Method 'getUserId'
	 * 
	 * @return int
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'setUserId'
	 * 
	 * @param userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
		this.userIdNull = false;
	}

	/**
	 * Method 'setUserIdNull'
	 * 
	 * @param value
	 */
	public void setUserIdNull(boolean value)
	{
		this.userIdNull = value;
	}

	/**
	 * Method 'isUserIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isUserIdNull()
	{
		return userIdNull;
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
		
		if (!(_other instanceof ParentsHostsPlayers)) {
			return false;
		}
		
		final ParentsHostsPlayers _cast = (ParentsHostsPlayers) _other;
		if (parentHostPlayerId != _cast.parentHostPlayerId) {
			return false;
		}
		
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (hostIdNull != _cast.hostIdNull) {
			return false;
		}
		
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (playerIdNull != _cast.playerIdNull) {
			return false;
		}
		
		if (userId != _cast.userId) {
			return false;
		}
		
		if (userIdNull != _cast.userIdNull) {
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
		_hashCode = 29 * _hashCode + parentHostPlayerId;
		_hashCode = 29 * _hashCode + hostId;
		_hashCode = 29 * _hashCode + (hostIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + playerId;
		_hashCode = 29 * _hashCode + (playerIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (userIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ParentsHostsPlayersPk
	 */
	public ParentsHostsPlayersPk createPk()
	{
		return new ParentsHostsPlayersPk(parentHostPlayerId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ParentsHostsPlayers: " );
		ret.append( "parentHostPlayerId=" + parentHostPlayerId );
		ret.append( ", hostId=" + hostId );
		ret.append( ", playerId=" + playerId );
		ret.append( ", userId=" + userId );
		return ret.toString();
	}

}
