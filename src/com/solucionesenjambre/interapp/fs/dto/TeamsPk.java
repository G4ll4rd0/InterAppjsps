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
 * This class represents the primary key of the teams table.
 */
public class TeamsPk implements Serializable
{
	protected int teamId;

	/** 
	 * This attribute represents whether the primitive attribute teamId is null.
	 */
	protected boolean teamIdNull;

	/** 
	 * Sets the value of teamId
	 */
	public void setTeamId(int teamId)
	{
		this.teamId = teamId;
	}

	/** 
	 * Gets the value of teamId
	 */
	public int getTeamId()
	{
		return teamId;
	}

	/**
	 * Method 'TeamsPk'
	 * 
	 */
	public TeamsPk()
	{
	}

	/**
	 * Method 'TeamsPk'
	 * 
	 * @param teamId
	 */
	public TeamsPk(final int teamId)
	{
		this.teamId = teamId;
	}

	/** 
	 * Sets the value of teamIdNull
	 */
	public void setTeamIdNull(boolean teamIdNull)
	{
		this.teamIdNull = teamIdNull;
	}

	/** 
	 * Gets the value of teamIdNull
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
		
		if (!(_other instanceof TeamsPk)) {
			return false;
		}
		
		final TeamsPk _cast = (TeamsPk) _other;
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
		_hashCode = 29 * _hashCode + teamId;
		_hashCode = 29 * _hashCode + (teamIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.TeamsPk: " );
		ret.append( "teamId=" + teamId );
		return ret.toString();
	}

}
