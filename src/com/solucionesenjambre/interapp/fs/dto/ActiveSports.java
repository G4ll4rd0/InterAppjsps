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

public class ActiveSports implements Serializable
{
	/** 
	 * This attribute maps to the column active_sport_id in the active_sports table.
	 */
	protected int activeSportId;

	/** 
	 * This attribute maps to the column sport_id in the active_sports table.
	 */
	protected int sportId;

	/** 
	 * This attribute represents whether the primitive attribute sportId is null.
	 */
	protected boolean sportIdNull = true;

	/** 
	 * This attribute maps to the column event_id in the active_sports table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'ActiveSports'
	 * 
	 */
	public ActiveSports()
	{
	}

	/**
	 * Method 'getActiveSportId'
	 * 
	 * @return int
	 */
	public int getActiveSportId()
	{
		return activeSportId;
	}

	/**
	 * Method 'setActiveSportId'
	 * 
	 * @param activeSportId
	 */
	public void setActiveSportId(int activeSportId)
	{
		this.activeSportId = activeSportId;
	}

	/**
	 * Method 'getSportId'
	 * 
	 * @return int
	 */
	public int getSportId()
	{
		return sportId;
	}

	/**
	 * Method 'setSportId'
	 * 
	 * @param sportId
	 */
	public void setSportId(int sportId)
	{
		this.sportId = sportId;
		this.sportIdNull = false;
	}

	/**
	 * Method 'setSportIdNull'
	 * 
	 * @param value
	 */
	public void setSportIdNull(boolean value)
	{
		this.sportIdNull = value;
	}

	/**
	 * Method 'isSportIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isSportIdNull()
	{
		return sportIdNull;
	}

	/**
	 * Method 'getEventId'
	 * 
	 * @return int
	 */
	public int getEventId()
	{
		return eventId;
	}

	/**
	 * Method 'setEventId'
	 * 
	 * @param eventId
	 */
	public void setEventId(int eventId)
	{
		this.eventId = eventId;
		this.eventIdNull = false;
	}

	/**
	 * Method 'setEventIdNull'
	 * 
	 * @param value
	 */
	public void setEventIdNull(boolean value)
	{
		this.eventIdNull = value;
	}

	/**
	 * Method 'isEventIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isEventIdNull()
	{
		return eventIdNull;
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
		
		if (!(_other instanceof ActiveSports)) {
			return false;
		}
		
		final ActiveSports _cast = (ActiveSports) _other;
		if (activeSportId != _cast.activeSportId) {
			return false;
		}
		
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (sportIdNull != _cast.sportIdNull) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
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
		_hashCode = 29 * _hashCode + activeSportId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + (sportIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ActiveSportsPk
	 */
	public ActiveSportsPk createPk()
	{
		return new ActiveSportsPk(activeSportId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.ActiveSports: " );
		ret.append( "activeSportId=" + activeSportId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
