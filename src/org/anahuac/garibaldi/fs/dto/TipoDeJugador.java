/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dto;

import org.anahuac.garibaldi.fs.dao.*;
import org.anahuac.garibaldi.fs.factory.*;
import org.anahuac.garibaldi.fs.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class TipoDeJugador implements Serializable
{
	/** 
	 * This attribute maps to the column tipo_de_jugador_id in the tipo_de_jugador table.
	 */
	protected int tipoDeJugadorId;

	/** 
	 * This attribute maps to the column Descripcion in the tipo_de_jugador table.
	 */
	protected String descripcion;

	/**
	 * Method 'TipoDeJugador'
	 * 
	 */
	public TipoDeJugador()
	{
	}

	/**
	 * Method 'getTipoDeJugadorId'
	 * 
	 * @return int
	 */
	public int getTipoDeJugadorId()
	{
		return tipoDeJugadorId;
	}

	/**
	 * Method 'setTipoDeJugadorId'
	 * 
	 * @param tipoDeJugadorId
	 */
	public void setTipoDeJugadorId(int tipoDeJugadorId)
	{
		this.tipoDeJugadorId = tipoDeJugadorId;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
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
		
		if (!(_other instanceof TipoDeJugador)) {
			return false;
		}
		
		final TipoDeJugador _cast = (TipoDeJugador) _other;
		if (tipoDeJugadorId != _cast.tipoDeJugadorId) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
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
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoDeJugadorPk
	 */
	public TipoDeJugadorPk createPk()
	{
		return new TipoDeJugadorPk(tipoDeJugadorId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.TipoDeJugador: " );
		ret.append( "tipoDeJugadorId=" + tipoDeJugadorId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
