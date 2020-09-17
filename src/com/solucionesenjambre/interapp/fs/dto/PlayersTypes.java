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

public class PlayersTypes implements Serializable
{
	/** 
	 * This attribute maps to the column player_type_id in the players_types table.
	 */
	protected int playerTypeId;

	/** 
	 * This attribute maps to the column code in the players_types table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column description in the players_types table.
	 */
	protected String description;

	/**
	 * Method 'PlayersTypes'
	 * 
	 */
	public PlayersTypes()
	{
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
	}

	/**
	 * Method 'getCode'
	 * 
	 * @return String
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * Method 'setCode'
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
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
		
		if (!(_other instanceof PlayersTypes)) {
			return false;
		}
		
		final PlayersTypes _cast = (PlayersTypes) _other;
		if (playerTypeId != _cast.playerTypeId) {
			return false;
		}
		
		if (code == null ? _cast.code != code : !code.equals( _cast.code )) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
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
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PlayersTypesPk
	 */
	public PlayersTypesPk createPk()
	{
		return new PlayersTypesPk(playerTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.PlayersTypes: " );
		ret.append( "playerTypeId=" + playerTypeId );
		ret.append( ", code=" + code );
		ret.append( ", description=" + description );
		return ret.toString();
	}

}
