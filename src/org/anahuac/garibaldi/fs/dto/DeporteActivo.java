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

public class DeporteActivo implements Serializable
{
	/** 
	 * This attribute maps to the column ID_De in the deporte_activo table.
	 */
	protected int idDe;

	/** 
	 * This attribute represents whether the primitive attribute idDe is null.
	 */
	protected boolean idDeNull = true;

	/** 
	 * This attribute maps to the column ID_S in the deporte_activo table.
	 */
	protected int idS;

	/** 
	 * This attribute represents whether the primitive attribute idS is null.
	 */
	protected boolean idSNull = true;

	/**
	 * Method 'DeporteActivo'
	 * 
	 */
	public DeporteActivo()
	{
	}

	/**
	 * Method 'getIdDe'
	 * 
	 * @return int
	 */
	public int getIdDe()
	{
		return idDe;
	}

	/**
	 * Method 'setIdDe'
	 * 
	 * @param idDe
	 */
	public void setIdDe(int idDe)
	{
		this.idDe = idDe;
		this.idDeNull = false;
	}

	/**
	 * Method 'setIdDeNull'
	 * 
	 * @param value
	 */
	public void setIdDeNull(boolean value)
	{
		this.idDeNull = value;
	}

	/**
	 * Method 'isIdDeNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdDeNull()
	{
		return idDeNull;
	}

	/**
	 * Method 'getIdS'
	 * 
	 * @return int
	 */
	public int getIdS()
	{
		return idS;
	}

	/**
	 * Method 'setIdS'
	 * 
	 * @param idS
	 */
	public void setIdS(int idS)
	{
		this.idS = idS;
		this.idSNull = false;
	}

	/**
	 * Method 'setIdSNull'
	 * 
	 * @param value
	 */
	public void setIdSNull(boolean value)
	{
		this.idSNull = value;
	}

	/**
	 * Method 'isIdSNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdSNull()
	{
		return idSNull;
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
		
		if (!(_other instanceof DeporteActivo)) {
			return false;
		}
		
		final DeporteActivo _cast = (DeporteActivo) _other;
		if (idDe != _cast.idDe) {
			return false;
		}
		
		if (idDeNull != _cast.idDeNull) {
			return false;
		}
		
		if (idS != _cast.idS) {
			return false;
		}
		
		if (idSNull != _cast.idSNull) {
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
		_hashCode = 29 * _hashCode + idDe;
		_hashCode = 29 * _hashCode + (idDeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idS;
		_hashCode = 29 * _hashCode + (idSNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.DeporteActivo: " );
		ret.append( "idDe=" + idDe );
		ret.append( ", idS=" + idS );
		return ret.toString();
	}

}
