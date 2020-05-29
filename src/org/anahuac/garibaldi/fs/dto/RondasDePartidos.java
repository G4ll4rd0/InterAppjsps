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

public class RondasDePartidos implements Serializable
{
	/** 
	 * This attribute maps to the column ronda_id in the rondas_de_partidos table.
	 */
	protected int rondaId;

	/** 
	 * This attribute maps to the column descripcion in the rondas_de_partidos table.
	 */
	protected String descripcion;

	/**
	 * Method 'RondasDePartidos'
	 * 
	 */
	public RondasDePartidos()
	{
	}

	/**
	 * Method 'getRondaId'
	 * 
	 * @return int
	 */
	public int getRondaId()
	{
		return rondaId;
	}

	/**
	 * Method 'setRondaId'
	 * 
	 * @param rondaId
	 */
	public void setRondaId(int rondaId)
	{
		this.rondaId = rondaId;
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
		
		if (!(_other instanceof RondasDePartidos)) {
			return false;
		}
		
		final RondasDePartidos _cast = (RondasDePartidos) _other;
		if (rondaId != _cast.rondaId) {
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
		_hashCode = 29 * _hashCode + rondaId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RondasDePartidosPk
	 */
	public RondasDePartidosPk createPk()
	{
		return new RondasDePartidosPk(rondaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.RondasDePartidos: " );
		ret.append( "rondaId=" + rondaId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
