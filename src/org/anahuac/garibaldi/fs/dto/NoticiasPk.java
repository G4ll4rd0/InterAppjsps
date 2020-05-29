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
 * This class represents the primary key of the noticias table.
 */
public class NoticiasPk implements Serializable
{
	protected int noticiasId;

	/** 
	 * This attribute represents whether the primitive attribute noticiasId is null.
	 */
	protected boolean noticiasIdNull;

	/** 
	 * Sets the value of noticiasId
	 */
	public void setNoticiasId(int noticiasId)
	{
		this.noticiasId = noticiasId;
	}

	/** 
	 * Gets the value of noticiasId
	 */
	public int getNoticiasId()
	{
		return noticiasId;
	}

	/**
	 * Method 'NoticiasPk'
	 * 
	 */
	public NoticiasPk()
	{
	}

	/**
	 * Method 'NoticiasPk'
	 * 
	 * @param noticiasId
	 */
	public NoticiasPk(final int noticiasId)
	{
		this.noticiasId = noticiasId;
	}

	/** 
	 * Sets the value of noticiasIdNull
	 */
	public void setNoticiasIdNull(boolean noticiasIdNull)
	{
		this.noticiasIdNull = noticiasIdNull;
	}

	/** 
	 * Gets the value of noticiasIdNull
	 */
	public boolean isNoticiasIdNull()
	{
		return noticiasIdNull;
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
		
		if (!(_other instanceof NoticiasPk)) {
			return false;
		}
		
		final NoticiasPk _cast = (NoticiasPk) _other;
		if (noticiasId != _cast.noticiasId) {
			return false;
		}
		
		if (noticiasIdNull != _cast.noticiasIdNull) {
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
		_hashCode = 29 * _hashCode + noticiasId;
		_hashCode = 29 * _hashCode + (noticiasIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.NoticiasPk: " );
		ret.append( "noticiasId=" + noticiasId );
		return ret.toString();
	}

}
