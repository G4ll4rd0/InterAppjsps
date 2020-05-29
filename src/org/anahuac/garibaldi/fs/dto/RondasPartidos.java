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

public class RondasPartidos implements Serializable
{
	/** 
	 * This attribute maps to the column ronda_id in the rondas_partidos table.
	 */
	protected int rondaId;

	/** 
	 * This attribute maps to the column Descripción in the rondas_partidos table.
	 */
	protected String descripción;

	/**
	 * Method 'RondasPartidos'
	 * 
	 */
	public RondasPartidos()
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
	 * Method 'getDescripción'
	 * 
	 * @return String
	 */
	public String getDescripción()
	{
		return descripción;
	}

	/**
	 * Method 'setDescripción'
	 * 
	 * @param descripción
	 */
	public void setDescripción(String descripción)
	{
		this.descripción = descripción;
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
		
		if (!(_other instanceof RondasPartidos)) {
			return false;
		}
		
		final RondasPartidos _cast = (RondasPartidos) _other;
		if (rondaId != _cast.rondaId) {
			return false;
		}
		
		if (descripción == null ? _cast.descripción != descripción : !descripción.equals( _cast.descripción )) {
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
		if (descripción != null) {
			_hashCode = 29 * _hashCode + descripción.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RondasPartidosPk
	 */
	public RondasPartidosPk createPk()
	{
		return new RondasPartidosPk(rondaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.RondasPartidos: " );
		ret.append( "rondaId=" + rondaId );
		ret.append( ", descripción=" + descripción );
		return ret.toString();
	}

}
