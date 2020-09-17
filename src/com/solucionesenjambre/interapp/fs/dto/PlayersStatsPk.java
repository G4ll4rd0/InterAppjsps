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
 * This class represents the primary key of the players_stats table.
 */
public class PlayersStatsPk implements Serializable
{
	protected int playerStatId;

	/** 
	 * This attribute represents whether the primitive attribute playerStatId is null.
	 */
	protected boolean playerStatIdNull;

	/** 
	 * Sets the value of playerStatId
	 */
	public void setPlayerStatId(int playerStatId)
	{
		this.playerStatId = playerStatId;
	}

	/** 
	 * Gets the value of playerStatId
	 */
	public int getPlayerStatId()
	{
		return playerStatId;
	}

	/**
	 * Method 'PlayersStatsPk'
	 * 
	 */
	public PlayersStatsPk()
	{
	}

	/**
	 * Method 'PlayersStatsPk'
	 * 
	 * @param playerStatId
	 */
	public PlayersStatsPk(final int playerStatId)
	{
		this.playerStatId = playerStatId;
	}

	/** 
	 * Sets the value of playerStatIdNull
	 */
	public void setPlayerStatIdNull(boolean playerStatIdNull)
	{
		this.playerStatIdNull = playerStatIdNull;
	}

	/** 
	 * Gets the value of playerStatIdNull
	 */
	public boolean isPlayerStatIdNull()
	{
		return playerStatIdNull;
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
		
		if (!(_other instanceof PlayersStatsPk)) {
			return false;
		}
		
		final PlayersStatsPk _cast = (PlayersStatsPk) _other;
		if (playerStatId != _cast.playerStatId) {
			return false;
		}
		
		if (playerStatIdNull != _cast.playerStatIdNull) {
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
		_hashCode = 29 * _hashCode + (playerStatIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.PlayersStatsPk: " );
		ret.append( "playerStatId=" + playerStatId );
		return ret.toString();
	}

}
