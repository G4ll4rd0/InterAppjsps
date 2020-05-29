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
 * This class represents the primary key of the usuario table.
 */
public class UsuarioPk implements Serializable
{
	protected int usuarioId;

	/** 
	 * This attribute represents whether the primitive attribute usuarioId is null.
	 */
	protected boolean usuarioIdNull;

	/** 
	 * Sets the value of usuarioId
	 */
	public void setUsuarioId(int usuarioId)
	{
		this.usuarioId = usuarioId;
	}

	/** 
	 * Gets the value of usuarioId
	 */
	public int getUsuarioId()
	{
		return usuarioId;
	}

	/**
	 * Method 'UsuarioPk'
	 * 
	 */
	public UsuarioPk()
	{
	}

	/**
	 * Method 'UsuarioPk'
	 * 
	 * @param usuarioId
	 */
	public UsuarioPk(final int usuarioId)
	{
		this.usuarioId = usuarioId;
	}

	/** 
	 * Sets the value of usuarioIdNull
	 */
	public void setUsuarioIdNull(boolean usuarioIdNull)
	{
		this.usuarioIdNull = usuarioIdNull;
	}

	/** 
	 * Gets the value of usuarioIdNull
	 */
	public boolean isUsuarioIdNull()
	{
		return usuarioIdNull;
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
		
		if (!(_other instanceof UsuarioPk)) {
			return false;
		}
		
		final UsuarioPk _cast = (UsuarioPk) _other;
		if (usuarioId != _cast.usuarioId) {
			return false;
		}
		
		if (usuarioIdNull != _cast.usuarioIdNull) {
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
		_hashCode = 29 * _hashCode + usuarioId;
		_hashCode = 29 * _hashCode + (usuarioIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.UsuarioPk: " );
		ret.append( "usuarioId=" + usuarioId );
		return ret.toString();
	}

}
