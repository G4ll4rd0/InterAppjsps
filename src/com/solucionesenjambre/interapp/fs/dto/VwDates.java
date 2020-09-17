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

public class VwDates implements Serializable
{
	/** 
	 * This attribute maps to the column event_id in the vw_dates table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/** 
	 * This attribute maps to the column event_name in the vw_dates table.
	 */
	protected String eventName;

	/** 
	 * This attribute maps to the column date in the vw_dates table.
	 */
	protected Date date;

	/** 
	 * This attribute maps to the column num in the vw_dates table.
	 */
	protected long num;

	/**
	 * Method 'VwDates'
	 * 
	 */
	public VwDates()
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
	 * Method 'getNum'
	 * 
	 * @return long
	 */
	public long getNum()
	{
		return num;
	}

	/**
	 * Method 'setNum'
	 * 
	 * @param num
	 */
	public void setNum(long num)
	{
		this.num = num;
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
		
		if (!(_other instanceof VwDates)) {
			return false;
		}
		
		final VwDates _cast = (VwDates) _other;
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
			return false;
		}
		
		if (eventName == null ? _cast.eventName != eventName : !eventName.equals( _cast.eventName )) {
			return false;
		}
		
		if (date == null ? _cast.date != date : !date.equals( _cast.date )) {
			return false;
		}
		
		if (num != _cast.num) {
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
		if (eventName != null) {
			_hashCode = 29 * _hashCode + eventName.hashCode();
		}
		
		if (date != null) {
			_hashCode = 29 * _hashCode + date.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (num ^ (num >>> 32));
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwDates: " );
		ret.append( "eventId=" + eventId );
		ret.append( ", eventName=" + eventName );
		ret.append( ", date=" + date );
		ret.append( ", num=" + num );
		return ret.toString();
	}

}
