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
 * This class represents the primary key of the tipo_de_jugador table.
 */
public class TipoDeJugadorPk implements Serializable
{
	protected int tipoDeJugadorId;

	/** 
	 * This attribute represents whether the primitive attribute tipoDeJugadorId is null.
	 */
	protected boolean tipoDeJugadorIdNull;

	/** 
	 * Sets the value of tipoDeJugadorId
	 */
	public void setTipoDeJugadorId(int tipoDeJugadorId)
	{
		this.tipoDeJugadorId = tipoDeJugadorId;
	}

	/** 
	 * Gets the value of tipoDeJugadorId
	 */
	public int getTipoDeJugadorId()
	{
		return tipoDeJugadorId;
	}

	/**
	 * Method 'TipoDeJugadorPk'
	 * 
	 */
	public TipoDeJugadorPk()
	{
	}

	/**
	 * Method 'TipoDeJugadorPk'
	 * 
	 * @param tipoDeJugadorId
	 */
	public TipoDeJugadorPk(final int tipoDeJugadorId)
	{
		this.tipoDeJugadorId = tipoDeJugadorId;
	}

	/** 
	 * Sets the value of tipoDeJugadorIdNull
	 */
	public void setTipoDeJugadorIdNull(boolean tipoDeJugadorIdNull)
	{
		this.tipoDeJugadorIdNull = tipoDeJugadorIdNull;
	}

	/** 
	 * Gets the value of tipoDeJugadorIdNull
	 */
	public boolean isTipoDeJugadorIdNull()
	{
		return tipoDeJugadorIdNull;
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
		
		if (!(_other instanceof TipoDeJugadorPk)) {
			return false;
		}
		
		final TipoDeJugadorPk _cast = (TipoDeJugadorPk) _other;
		if (tipoDeJugadorId != _cast.tipoDeJugadorId) {
			return false;
		}
		
		if (tipoDeJugadorIdNull != _cast.tipoDeJugadorIdNull) {
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
		_hashCode = 29 * _hashCode + tipoDeJugadorId;
		_hashCode = 29 * _hashCode + (tipoDeJugadorIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.TipoDeJugadorPk: " );
		ret.append( "tipoDeJugadorId=" + tipoDeJugadorId );
		return ret.toString();
	}

}
