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
 * This class represents the primary key of the rondas_partidos table.
 */
public class RondasPartidosPk implements Serializable
{
	protected int rondaId;

	/** 
	 * This attribute represents whether the primitive attribute rondaId is null.
	 */
	protected boolean rondaIdNull;

	/** 
	 * Sets the value of rondaId
	 */
	public void setRondaId(int rondaId)
	{
		this.rondaId = rondaId;
	}

	/** 
	 * Gets the value of rondaId
	 */
	public int getRondaId()
	{
		return rondaId;
	}

	/**
	 * Method 'RondasPartidosPk'
	 * 
	 */
	public RondasPartidosPk()
	{
	}

	/**
	 * Method 'RondasPartidosPk'
	 * 
	 * @param rondaId
	 */
	public RondasPartidosPk(final int rondaId)
	{
		this.rondaId = rondaId;
	}

	/** 
	 * Sets the value of rondaIdNull
	 */
	public void setRondaIdNull(boolean rondaIdNull)
	{
		this.rondaIdNull = rondaIdNull;
	}

	/** 
	 * Gets the value of rondaIdNull
	 */
	public boolean isRondaIdNull()
	{
		return rondaIdNull;
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
		
		if (!(_other instanceof RondasPartidosPk)) {
			return false;
		}
		
		final RondasPartidosPk _cast = (RondasPartidosPk) _other;
		if (rondaId != _cast.rondaId) {
			return false;
		}
		
		if (rondaIdNull != _cast.rondaIdNull) {
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
		_hashCode = 29 * _hashCode + rondaId;
		_hashCode = 29 * _hashCode + (rondaIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.RondasPartidosPk: " );
		ret.append( "rondaId=" + rondaId );
		return ret.toString();
	}

}
