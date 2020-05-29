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
	 * This attribute maps to the column Descripci�n in the rondas_partidos table.
	 */
	protected String descripci�n;

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
	 * Method 'getDescripci�n'
	 * 
	 * @return String
	 */
	public String getDescripci�n()
	{
		return descripci�n;
	}

	/**
	 * Method 'setDescripci�n'
	 * 
	 * @param descripci�n
	 */
	public void setDescripci�n(String descripci�n)
	{
		this.descripci�n = descripci�n;
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
		
		if (descripci�n == null ? _cast.descripci�n != descripci�n : !descripci�n.equals( _cast.descripci�n )) {
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
		if (descripci�n != null) {
			_hashCode = 29 * _hashCode + descripci�n.hashCode();
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
		ret.append( ", descripci�n=" + descripci�n );
		return ret.toString();
	}

}
