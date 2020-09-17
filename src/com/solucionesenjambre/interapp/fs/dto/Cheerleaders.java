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

public class Cheerleaders implements Serializable
{
	/** 
	 * This attribute maps to the column cheerleader_id in the cheerleaders table.
	 */
	protected int cheerleaderId;

	/** 
	 * This attribute maps to the column points in the cheerleaders table.
	 */
	protected int points;

	/** 
	 * This attribute maps to the column team_id in the cheerleaders table.
	 */
	protected int teamId;

	/** 
	 * This attribute represents whether the primitive attribute teamId is null.
	 */
	protected boolean teamIdNull = true;

	/**
	 * Method 'Cheerleaders'
	 * 
	 */
	public Cheerleaders()
	{
	}

	/**
	 * Method 'getCheerleaderId'
	 * 
	 * @return int
	 */
	public int getCheerleaderId()
	{
		return cheerleaderId;
	}

	/**
	 * Method 'setCheerleaderId'
	 * 
	 * @param cheerleaderId
	 */
	public void setCheerleaderId(int cheerleaderId)
	{
		this.cheerleaderId = cheerleaderId;
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
		
		if (!(_other instanceof Cheerleaders)) {
			return false;
		}
		
		final Cheerleaders _cast = (Cheerleaders) _other;
		if (cheerleaderId != _cast.cheerleaderId) {
			return false;
		}
		
		if (points != _cast.points) {
			return false;
		}
		
		if (teamId != _cast.teamId) {
			return false;
		}
		
		if (teamIdNull != _cast.teamIdNull) {
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
		_hashCode = 29 * _hashCode + cheerleaderId;
		_hashCode = 29 * _hashCode + points;
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + (teamIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CheerleadersPk
	 */
	public CheerleadersPk createPk()
	{
		return new CheerleadersPk(cheerleaderId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Cheerleaders: " );
		ret.append( "cheerleaderId=" + cheerleaderId );
		ret.append( ", points=" + points );
		ret.append( ", teamId=" + teamId );
		return ret.toString();
	}

}
