/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the players table.
 */
public class PlayersPk implements Serializable
{
	protected int playerId;

	/** 
	 * This attribute represents whether the primitive attribute playerId is null.
	 */
	protected boolean playerIdNull;

	/** 
	 * Sets the value of playerId
	 */
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}

	/** 
	 * Gets the value of playerId
	 */
	public int getPlayerId()
	{
		return playerId;
	}

	/**
	 * Method 'PlayersPk'
	 * 
	 */
	public PlayersPk()
	{
	}

	/**
	 * Method 'PlayersPk'
	 * 
	 * @param playerId
	 */
	public PlayersPk(final int playerId)
	{
		this.playerId = playerId;
	}

	/** 
	 * Sets the value of playerIdNull
	 */
	public void setPlayerIdNull(boolean playerIdNull)
	{
		this.playerIdNull = playerIdNull;
	}

	/** 
	 * Gets the value of playerIdNull
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
		
		if (!(_other instanceof PlayersPk)) {
			return false;
		}
		
		final PlayersPk _cast = (PlayersPk) _other;
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
		_hashCode = 29 * _hashCode + playerId;
		_hashCode = 29 * _hashCode + (playerIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.PlayersPk: " );
		ret.append( "playerId=" + playerId );
		return ret.toString();
	}

}
