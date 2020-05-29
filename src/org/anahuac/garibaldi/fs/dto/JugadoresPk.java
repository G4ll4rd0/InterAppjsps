/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the jugadores table.
 */
public class JugadoresPk implements Serializable
{
	protected int jugadoresId;

	/** 
	 * This attribute represents whether the primitive attribute jugadoresId is null.
	 */
	protected boolean jugadoresIdNull;

	/** 
	 * Sets the value of jugadoresId
	 */
	public void setJugadoresId(int jugadoresId)
	{
		this.jugadoresId = jugadoresId;
	}

	/** 
	 * Gets the value of jugadoresId
	 */
	public int getJugadoresId()
	{
		return jugadoresId;
	}

	/**
	 * Method 'JugadoresPk'
	 * 
	 */
	public JugadoresPk()
	{
	}

	/**
	 * Method 'JugadoresPk'
	 * 
	 * @param jugadoresId
	 */
	public JugadoresPk(final int jugadoresId)
	{
		this.jugadoresId = jugadoresId;
	}

	/** 
	 * Sets the value of jugadoresIdNull
	 */
	public void setJugadoresIdNull(boolean jugadoresIdNull)
	{
		this.jugadoresIdNull = jugadoresIdNull;
	}

	/** 
	 * Gets the value of jugadoresIdNull
	 */
	public boolean isJugadoresIdNull()
	{
		return jugadoresIdNull;
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
		
		if (!(_other instanceof JugadoresPk)) {
			return false;
		}
		
		final JugadoresPk _cast = (JugadoresPk) _other;
		if (jugadoresId != _cast.jugadoresId) {
			return false;
		}
		
		if (jugadoresIdNull != _cast.jugadoresIdNull) {
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
		_hashCode = 29 * _hashCode + jugadoresId;
		_hashCode = 29 * _hashCode + (jugadoresIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.JugadoresPk: " );
		ret.append( "jugadoresId=" + jugadoresId );
		return ret.toString();
	}

}
