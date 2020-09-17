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

public class Hosts implements Serializable
{
	/** 
	 * This attribute maps to the column host_id in the hosts table.
	 */
	protected int hostId;

	/** 
	 * This attribute maps to the column host_name in the hosts table.
	 */
	protected String hostName;

	/** 
	 * This attribute maps to the column host_adress in the hosts table.
	 */
	protected String hostAdress;

	/** 
	 * This attribute maps to the column host_phone in the hosts table.
	 */
	protected String hostPhone;

	/** 
	 * This attribute maps to the column event_id in the hosts table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'Hosts'
	 * 
	 */
	public Hosts()
	{
	}

	/**
	 * Method 'getHostId'
	 * 
	 * @return int
	 */
	public int getHostId()
	{
		return hostId;
	}

	/**
	 * Method 'setHostId'
	 * 
	 * @param hostId
	 */
	public void setHostId(int hostId)
	{
		this.hostId = hostId;
	}

	/**
	 * Method 'getHostName'
	 * 
	 * @return String
	 */
	public String getHostName()
	{
		return hostName;
	}

	/**
	 * Method 'setHostName'
	 * 
	 * @param hostName
	 */
	public void setHostName(String hostName)
	{
		this.hostName = hostName;
	}

	/**
	 * Method 'getHostAdress'
	 * 
	 * @return String
	 */
	public String getHostAdress()
	{
		return hostAdress;
	}

	/**
	 * Method 'setHostAdress'
	 * 
	 * @param hostAdress
	 */
	public void setHostAdress(String hostAdress)
	{
		this.hostAdress = hostAdress;
	}

	/**
	 * Method 'getHostPhone'
	 * 
	 * @return String
	 */
	public String getHostPhone()
	{
		return hostPhone;
	}

	/**
	 * Method 'setHostPhone'
	 * 
	 * @param hostPhone
	 */
	public void setHostPhone(String hostPhone)
	{
		this.hostPhone = hostPhone;
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
		
		if (!(_other instanceof Hosts)) {
			return false;
		}
		
		final Hosts _cast = (Hosts) _other;
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (hostName == null ? _cast.hostName != hostName : !hostName.equals( _cast.hostName )) {
			return false;
		}
		
		if (hostAdress == null ? _cast.hostAdress != hostAdress : !hostAdress.equals( _cast.hostAdress )) {
			return false;
		}
		
		if (hostPhone == null ? _cast.hostPhone != hostPhone : !hostPhone.equals( _cast.hostPhone )) {
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
		_hashCode = 29 * _hashCode + hostId;
		if (hostName != null) {
			_hashCode = 29 * _hashCode + hostName.hashCode();
		}
		
		if (hostAdress != null) {
			_hashCode = 29 * _hashCode + hostAdress.hashCode();
		}
		
		if (hostPhone != null) {
			_hashCode = 29 * _hashCode + hostPhone.hashCode();
		}
		
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return HostsPk
	 */
	public HostsPk createPk()
	{
		return new HostsPk(hostId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.Hosts: " );
		ret.append( "hostId=" + hostId );
		ret.append( ", hostName=" + hostName );
		ret.append( ", hostAdress=" + hostAdress );
		ret.append( ", hostPhone=" + hostPhone );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
