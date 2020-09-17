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

public class Events implements Serializable
{
	/** 
	 * This attribute maps to the column event_id in the events table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column event_name in the events table.
	 */
	protected String eventName;

	/** 
	 * This attribute maps to the column event_code in the events table.
	 */
	protected String eventCode;

	/**
	 * Method 'Events'
	 * 
	 */
	public Events()
	{
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
	}

	/**
	 * Method 'getEventName'
	 * 
	 * @return String
	 */
	public String getEventName()
	{
		return eventName;
	}

	/**
	 * Method 'setEventName'
	 * 
	 * @param eventName
	 */
	public void setEventName(String eventName)
	{
		this.eventName = eventName;
	}

	/**
	 * Method 'getEventCode'
	 * 
	 * @return String
	 */
	public String getEventCode()
	{
		return eventCode;
	}

	/**
	 * Method 'setEventCode'
	 * 
	 * @param eventCode
	 */
	public void setEventCode(String eventCode)
	{
		this.eventCode = eventCode;
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
		
		if (!(_other instanceof Events)) {
			return false;
		}
		
		final Events _cast = (Events) _other;
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventName == null ? _cast.eventName != eventName : !eventName.equals( _cast.eventName )) {
			return false;
		}
		
		if (eventCode == null ? _cast.eventCode != eventCode : !eventCode.equals( _cast.eventCode )) {
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
		if (eventName != null) {
			_hashCode = 29 * _hashCode + eventName.hashCode();
		}
		
		if (eventCode != null) {
			_hashCode = 29 * _hashCode + eventCode.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EventsPk
	 */
	public EventsPk createPk()
	{
		return new EventsPk(eventId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Events: " );
		ret.append( "eventId=" + eventId );
		ret.append( ", eventName=" + eventName );
		ret.append( ", eventCode=" + eventCode );
		return ret.toString();
	}

}
