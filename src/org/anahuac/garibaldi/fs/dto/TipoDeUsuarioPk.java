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
 * This class represents the primary key of the tipo_de_usuario table.
 */
public class TipoDeUsuarioPk implements Serializable
{
	protected int tipoDeUsuarioId;

	/** 
	 * This attribute represents whether the primitive attribute tipoDeUsuarioId is null.
	 */
	protected boolean tipoDeUsuarioIdNull;

	/** 
	 * Sets the value of tipoDeUsuarioId
	 */
	public void setTipoDeUsuarioId(int tipoDeUsuarioId)
	{
		this.tipoDeUsuarioId = tipoDeUsuarioId;
	}

	/** 
	 * Gets the value of tipoDeUsuarioId
	 */
	public int getTipoDeUsuarioId()
	{
		return tipoDeUsuarioId;
	}

	/**
	 * Method 'TipoDeUsuarioPk'
	 * 
	 */
	public TipoDeUsuarioPk()
	{
	}

	/**
	 * Method 'TipoDeUsuarioPk'
	 * 
	 * @param tipoDeUsuarioId
	 */
	public TipoDeUsuarioPk(final int tipoDeUsuarioId)
	{
		this.tipoDeUsuarioId = tipoDeUsuarioId;
	}

	/** 
	 * Sets the value of tipoDeUsuarioIdNull
	 */
	public void setTipoDeUsuarioIdNull(boolean tipoDeUsuarioIdNull)
	{
		this.tipoDeUsuarioIdNull = tipoDeUsuarioIdNull;
	}

	/** 
	 * Gets the value of tipoDeUsuarioIdNull
	 */
	public boolean isTipoDeUsuarioIdNull()
	{
		return tipoDeUsuarioIdNull;
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
		
		if (!(_other instanceof TipoDeUsuarioPk)) {
			return false;
		}
		
		final TipoDeUsuarioPk _cast = (TipoDeUsuarioPk) _other;
		if (tipoDeUsuarioId != _cast.tipoDeUsuarioId) {
			return false;
		}
		
		if (tipoDeUsuarioIdNull != _cast.tipoDeUsuarioIdNull) {
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
		_hashCode = 29 * _hashCode + tipoDeUsuarioId;
		_hashCode = 29 * _hashCode + (tipoDeUsuarioIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.TipoDeUsuarioPk: " );
		ret.append( "tipoDeUsuarioId=" + tipoDeUsuarioId );
		return ret.toString();
	}

}
