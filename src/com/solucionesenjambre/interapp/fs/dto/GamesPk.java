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
 * This class represents the primary key of the games table.
 */
public class GamesPk implements Serializable
{
	protected int gameId;

	/** 
	 * This attribute represents whether the primitive attribute gameId is null.
	 */
	protected boolean gameIdNull;

	/** 
	 * Sets the value of gameId
	 */
	public void setGameId(int gameId)
	{
		this.gameId = gameId;
	}

	/** 
	 * Gets the value of gameId
	 */
	public int getGameId()
	{
		return gameId;
	}

	/**
	 * Method 'GamesPk'
	 * 
	 */
	public GamesPk()
	{
	}

	/**
	 * Method 'GamesPk'
	 * 
	 * @param gameId
	 */
	public GamesPk(final int gameId)
	{
		this.gameId = gameId;
	}

	/** 
	 * Sets the value of gameIdNull
	 */
	public void setGameIdNull(boolean gameIdNull)
	{
		this.gameIdNull = gameIdNull;
	}

	/** 
	 * Gets the value of gameIdNull
	 */
	public boolean isGameIdNull()
	{
		return gameIdNull;
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
		
		if (!(_other instanceof GamesPk)) {
			return false;
		}
		
		final GamesPk _cast = (GamesPk) _other;
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (gameIdNull != _cast.gameIdNull) {
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
		_hashCode = 29 * _hashCode + (gameIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.GamesPk: " );
		ret.append( "gameId=" + gameId );
		return ret.toString();
	}

}
