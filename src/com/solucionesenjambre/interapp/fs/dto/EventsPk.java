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
 * This class represents the primary key of the events table.
 */
public class EventsPk implements Serializable
{
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull;

	/** 
	 * Sets the value of eventId
	 */
	public void setEventId(int eventId)
	{
		this.eventId = eventId;
	}

	/** 
	 * Gets the value of eventId
	 */
	public int getEventId()
	{
		return eventId;
	}

	/**
	 * Method 'EventsPk'
	 * 
	 */
	public EventsPk()
	{
	}

	/**
	 * Method 'EventsPk'
	 * 
	 * @param eventId
	 */
	public EventsPk(final int eventId)
	{
		this.eventId = eventId;
	}

	/** 
	 * Sets the value of eventIdNull
	 */
	public void setEventIdNull(boolean eventIdNull)
	{
		this.eventIdNull = eventIdNull;
	}

	/** 
	 * Gets the value of eventIdNull
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
		
		if (!(_other instanceof EventsPk)) {
			return false;
		}
		
		final EventsPk _cast = (EventsPk) _other;
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
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.EventsPk: " );
		ret.append( "eventId=" + eventId );
		return ret.toString();
	}

}
