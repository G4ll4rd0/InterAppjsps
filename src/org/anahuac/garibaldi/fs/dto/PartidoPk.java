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
 * This class represents the primary key of the partido table.
 */
public class PartidoPk implements Serializable
{
	protected int partidoId;

	/** 
	 * This attribute represents whether the primitive attribute partidoId is null.
	 */
	protected boolean partidoIdNull;

	/** 
	 * Sets the value of partidoId
	 */
	public void setPartidoId(int partidoId)
	{
		this.partidoId = partidoId;
	}

	/** 
	 * Gets the value of partidoId
	 */
	public int getPartidoId()
	{
		return partidoId;
	}

	/**
	 * Method 'PartidoPk'
	 * 
	 */
	public PartidoPk()
	{
	}

	/**
	 * Method 'PartidoPk'
	 * 
	 * @param partidoId
	 */
	public PartidoPk(final int partidoId)
	{
		this.partidoId = partidoId;
	}

	/** 
	 * Sets the value of partidoIdNull
	 */
	public void setPartidoIdNull(boolean partidoIdNull)
	{
		this.partidoIdNull = partidoIdNull;
	}

	/** 
	 * Gets the value of partidoIdNull
	 */
	public boolean isPartidoIdNull()
	{
		return partidoIdNull;
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
		
		if (!(_other instanceof PartidoPk)) {
			return false;
		}
		
		final PartidoPk _cast = (PartidoPk) _other;
		if (partidoId != _cast.partidoId) {
			return false;
		}
		
		if (partidoIdNull != _cast.partidoIdNull) {
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
		_hashCode = 29 * _hashCode + partidoId;
		_hashCode = 29 * _hashCode + (partidoIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.PartidoPk: " );
		ret.append( "partidoId=" + partidoId );
		return ret.toString();
	}

}
