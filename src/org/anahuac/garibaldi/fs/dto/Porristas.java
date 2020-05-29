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

public class Porristas implements Serializable
{
	/** 
	 * This attribute maps to the column ID_E in the porristas table.
	 */
	protected int idE;

	/** 
	 * This attribute maps to the column puntos in the porristas table.
	 */
	protected int puntos;

	/**
	 * Method 'Porristas'
	 * 
	 */
	public Porristas()
	{
	}

	/**
	 * Method 'getIdE'
	 * 
	 * @return int
	 */
	public int getIdE()
	{
		return idE;
	}

	/**
	 * Method 'setIdE'
	 * 
	 * @param idE
	 */
	public void setIdE(int idE)
	{
		this.idE = idE;
	}

	/**
	 * Method 'getPuntos'
	 * 
	 * @return int
	 */
	public int getPuntos()
	{
		return puntos;
	}

	/**
	 * Method 'setPuntos'
	 * 
	 * @param puntos
	 */
	public void setPuntos(int puntos)
	{
		this.puntos = puntos;
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
		
		if (!(_other instanceof Porristas)) {
			return false;
		}
		
		final Porristas _cast = (Porristas) _other;
		if (idE != _cast.idE) {
			return false;
		}
		
		if (puntos != _cast.puntos) {
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
		_hashCode = 29 * _hashCode + idE;
		_hashCode = 29 * _hashCode + puntos;
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
		ret.append( "org.anahuac.garibaldi.fs.dto.Porristas: " );
		ret.append( "idE=" + idE );
		ret.append( ", puntos=" + puntos );
		return ret.toString();
	}

}
