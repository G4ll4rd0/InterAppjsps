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
 * This class represents the primary key of the players_types table.
 */
public class PlayersTypesPk implements Serializable
{
	protected int playerTypeId;

	/** 
	 * This attribute represents whether the primitive attribute playerTypeId is null.
	 */
	protected boolean playerTypeIdNull;

	/** 
	 * Sets the value of playerTypeId
	 */
	public void setPlayerTypeId(int playerTypeId)
	{
		this.playerTypeId = playerTypeId;
	}

	/** 
	 * Gets the value of playerTypeId
	 */
	public int getPlayerTypeId()
	{
		return playerTypeId;
	}

	/**
	 * Method 'PlayersTypesPk'
	 * 
	 */
	public PlayersTypesPk()
	{
	}

	/**
	 * Method 'PlayersTypesPk'
	 * 
	 * @param playerTypeId
	 */
	public PlayersTypesPk(final int playerTypeId)
	{
		this.playerTypeId = playerTypeId;
	}

	/** 
	 * Sets the value of playerTypeIdNull
	 */
	public void setPlayerTypeIdNull(boolean playerTypeIdNull)
	{
		this.playerTypeIdNull = playerTypeIdNull;
	}

	/** 
	 * Gets the value of playerTypeIdNull
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
		
		if (!(_other instanceof PlayersTypesPk)) {
			return false;
		}
		
		final PlayersTypesPk _cast = (PlayersTypesPk) _other;
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
		_hashCode = 29 * _hashCode + playerTypeId;
		_hashCode = 29 * _hashCode + (playerTypeIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.PlayersTypesPk: " );
		ret.append( "playerTypeId=" + playerTypeId );
		return ret.toString();
	}

}
