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

public class VwHosts implements Serializable
{
	/** 
	 * This attribute maps to the column player_id in the vw_hosts table.
	 */
	protected int playerId;

	/** 
	 * This attribute represents whether the primitive attribute playerId is null.
	 */
	protected boolean playerIdNull = true;

	/** 
	 * This attribute maps to the column parent_id in the vw_hosts table.
	 */
	protected int parentId;

	/** 
	 * This attribute represents whether the primitive attribute parentId is null.
	 */
	protected boolean parentIdNull = true;

	/** 
	 * This attribute maps to the column parent_seed in the vw_hosts table.
	 */
	protected String parentSeed;

	/** 
	 * This attribute maps to the column host_id in the vw_hosts table.
	 */
	protected int hostId;

	/** 
	 * This attribute represents whether the primitive attribute hostId is null.
	 */
	protected boolean hostIdNull = true;

	/** 
	 * This attribute maps to the column host_name in the vw_hosts table.
	 */
	protected String hostName;

	/** 
	 * This attribute maps to the column host_adress in the vw_hosts table.
	 */
	protected String hostAdress;

	/** 
	 * This attribute maps to the column host_phone in the vw_hosts table.
	 */
	protected String hostPhone;

	/** 
	 * This attribute maps to the column player_name in the vw_hosts table.
	 */
	protected String playerName;

	/**
	 * Method 'VwHosts'
	 * 
	 */
	public VwHosts()
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
	 * Method 'getParentId'
	 * 
	 * @return int
	 */
	public int getParentId()
	{
		return parentId;
	}

	/**
	 * Method 'setParentId'
	 * 
	 * @param parentId
	 */
	public void setParentId(int parentId)
	{
		this.parentId = parentId;
		this.parentIdNull = false;
	}

	/**
	 * Method 'setParentIdNull'
	 * 
	 * @param value
	 */
	public void setParentIdNull(boolean value)
	{
		this.parentIdNull = value;
	}

	/**
	 * Method 'isParentIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isParentIdNull()
	{
		return parentIdNull;
	}

	/**
	 * Method 'getParentSeed'
	 * 
	 * @return String
	 */
	public String getParentSeed()
	{
		return parentSeed;
	}

	/**
	 * Method 'setParentSeed'
	 * 
	 * @param parentSeed
	 */
	public void setParentSeed(String parentSeed)
	{
		this.parentSeed = parentSeed;
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
	 * Method 'getHostName'
	 * 
	 * @return String
	 */
	public String getHostName()
	{
		return hostName;
	}

	/**
	 * Method 'setHostName'
	 * 
	 * @param hostName
	 */
	public void setHostName(String hostName)
	{
		this.hostName = hostName;
	}

	/**
	 * Method 'getHostAdress'
	 * 
	 * @return String
	 */
	public String getHostAdress()
	{
		return hostAdress;
	}

	/**
	 * Method 'setHostAdress'
	 * 
	 * @param hostAdress
	 */
	public void setHostAdress(String hostAdress)
	{
		this.hostAdress = hostAdress;
	}

	/**
	 * Method 'getHostPhone'
	 * 
	 * @return String
	 */
	public String getHostPhone()
	{
		return hostPhone;
	}

	/**
	 * Method 'setHostPhone'
	 * 
	 * @param hostPhone
	 */
	public void setHostPhone(String hostPhone)
	{
		this.hostPhone = hostPhone;
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
		
		if (!(_other instanceof VwHosts)) {
			return false;
		}
		
		final VwHosts _cast = (VwHosts) _other;
		if (playerId != _cast.playerId) {
			return false;
		}
		
		if (playerIdNull != _cast.playerIdNull) {
			return false;
		}
		
		if (parentId != _cast.parentId) {
			return false;
		}
		
		if (parentIdNull != _cast.parentIdNull) {
			return false;
		}
		
		if (parentSeed == null ? _cast.parentSeed != parentSeed : !parentSeed.equals( _cast.parentSeed )) {
			return false;
		}
		
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (hostIdNull != _cast.hostIdNull) {
			return false;
		}
		
		if (hostName == null ? _cast.hostName != hostName : !hostName.equals( _cast.hostName )) {
			return false;
		}
		
		if (hostAdress == null ? _cast.hostAdress != hostAdress : !hostAdress.equals( _cast.hostAdress )) {
			return false;
		}
		
		if (hostPhone == null ? _cast.hostPhone != hostPhone : !hostPhone.equals( _cast.hostPhone )) {
			return false;
		}
		
		if (playerName == null ? _cast.playerName != playerName : !playerName.equals( _cast.playerName )) {
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
		_hashCode = 29 * _hashCode + parentId;
		_hashCode = 29 * _hashCode + (parentIdNull ? 1 : 0);
		if (parentSeed != null) {
			_hashCode = 29 * _hashCode + parentSeed.hashCode();
		}
		
		_hashCode = 29 * _hashCode + hostId;
		_hashCode = 29 * _hashCode + (hostIdNull ? 1 : 0);
		if (hostName != null) {
			_hashCode = 29 * _hashCode + hostName.hashCode();
		}
		
		if (hostAdress != null) {
			_hashCode = 29 * _hashCode + hostAdress.hashCode();
		}
		
		if (hostPhone != null) {
			_hashCode = 29 * _hashCode + hostPhone.hashCode();
		}
		
		if (playerName != null) {
			_hashCode = 29 * _hashCode + playerName.hashCode();
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwHosts: " );
		ret.append( "playerId=" + playerId );
		ret.append( ", parentId=" + parentId );
		ret.append( ", parentSeed=" + parentSeed );
		ret.append( ", hostId=" + hostId );
		ret.append( ", hostName=" + hostName );
		ret.append( ", hostAdress=" + hostAdress );
		ret.append( ", hostPhone=" + hostPhone );
		ret.append( ", playerName=" + playerName );
		return ret.toString();
	}

}
