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
import java.util.Date;

public class VwIEventsDates implements Serializable
{
	/** 
	 * This attribute maps to the column event_id in the vw_i_events_dates table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column event_name in the vw_i_events_dates table.
	 */
	protected String eventName;

	/** 
	 * This attribute maps to the column date in the vw_i_events_dates table.
	 */
	protected Date date;

	/**
	 * Method 'VwIEventsDates'
	 * 
	 */
	public VwIEventsDates()
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
	 * Method 'getDate'
	 * 
	 * @return Date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * Method 'setDate'
	 * 
	 * @param date
	 */
	public void setDate(Date date)
	{
		this.date = date;
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
		
		if (!(_other instanceof VwIEventsDates)) {
			return false;
		}
		
		final VwIEventsDates _cast = (VwIEventsDates) _other;
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventName == null ? _cast.eventName != eventName : !eventName.equals( _cast.eventName )) {
			return false;
		}
		
		if (date == null ? _cast.date != date : !date.equals( _cast.date )) {
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
		
		if (date != null) {
			_hashCode = 29 * _hashCode + date.hashCode();
		}
		
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwIEventsDates: " );
		ret.append( "eventId=" + eventId );
		ret.append( ", eventName=" + eventName );
		ret.append( ", date=" + date );
		return ret.toString();
	}

}
