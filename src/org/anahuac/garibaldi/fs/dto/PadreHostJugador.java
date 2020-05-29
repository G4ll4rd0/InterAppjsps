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

public class PadreHostJugador implements Serializable
{
	/** 
	 * This attribute maps to the column ID_J in the padre_host_jugador table.
	 */
	protected int idJ;

	/** 
	 * This attribute represents whether the primitive attribute idJ is null.
	 */
	protected boolean idJNull = true;

	/** 
	 * This attribute maps to the column ID_U in the padre_host_jugador table.
	 */
	protected int idU;

	/** 
	 * This attribute represents whether the primitive attribute idU is null.
	 */
	protected boolean idUNull = true;

	/** 
	 * This attribute maps to the column ID_H in the padre_host_jugador table.
	 */
	protected int idH;

	/** 
	 * This attribute represents whether the primitive attribute idH is null.
	 */
	protected boolean idHNull = true;

	/**
	 * Method 'PadreHostJugador'
	 * 
	 */
	public PadreHostJugador()
	{
	}

	/**
	 * Method 'getIdJ'
	 * 
	 * @return int
	 */
	public int getIdJ()
	{
		return idJ;
	}

	/**
	 * Method 'setIdJ'
	 * 
	 * @param idJ
	 */
	public void setIdJ(int idJ)
	{
		this.idJ = idJ;
		this.idJNull = false;
	}

	/**
	 * Method 'setIdJNull'
	 * 
	 * @param value
	 */
	public void setIdJNull(boolean value)
	{
		this.idJNull = value;
	}

	/**
	 * Method 'isIdJNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdJNull()
	{
		return idJNull;
	}

	/**
	 * Method 'getIdU'
	 * 
	 * @return int
	 */
	public int getIdU()
	{
		return idU;
	}

	/**
	 * Method 'setIdU'
	 * 
	 * @param idU
	 */
	public void setIdU(int idU)
	{
		this.idU = idU;
		this.idUNull = false;
	}

	/**
	 * Method 'setIdUNull'
	 * 
	 * @param value
	 */
	public void setIdUNull(boolean value)
	{
		this.idUNull = value;
	}

	/**
	 * Method 'isIdUNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUNull()
	{
		return idUNull;
	}

	/**
	 * Method 'getIdH'
	 * 
	 * @return int
	 */
	public int getIdH()
	{
		return idH;
	}

	/**
	 * Method 'setIdH'
	 * 
	 * @param idH
	 */
	public void setIdH(int idH)
	{
		this.idH = idH;
		this.idHNull = false;
	}

	/**
	 * Method 'setIdHNull'
	 * 
	 * @param value
	 */
	public void setIdHNull(boolean value)
	{
		this.idHNull = value;
	}

	/**
	 * Method 'isIdHNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdHNull()
	{
		return idHNull;
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
		
		if (!(_other instanceof PadreHostJugador)) {
			return false;
		}
		
		final PadreHostJugador _cast = (PadreHostJugador) _other;
		if (idJ != _cast.idJ) {
			return false;
		}
		
		if (idJNull != _cast.idJNull) {
			return false;
		}
		
		if (idU != _cast.idU) {
			return false;
		}
		
		if (idUNull != _cast.idUNull) {
			return false;
		}
		
		if (idH != _cast.idH) {
			return false;
		}
		
		if (idHNull != _cast.idHNull) {
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
		_hashCode = 29 * _hashCode + idJ;
		_hashCode = 29 * _hashCode + (idJNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idU;
		_hashCode = 29 * _hashCode + (idUNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idH;
		_hashCode = 29 * _hashCode + (idHNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.PadreHostJugador: " );
		ret.append( "idJ=" + idJ );
		ret.append( ", idU=" + idU );
		ret.append( ", idH=" + idH );
		return ret.toString();
	}

}
