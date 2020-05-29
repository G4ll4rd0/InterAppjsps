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

public class FavoritoDelUsuario implements Serializable
{
	/** 
	 * This attribute maps to the column ID_U in the favorito_del_usuario table.
	 */
	protected int idU;

	/** 
	 * This attribute represents whether the primitive attribute idU is null.
	 */
	protected boolean idUNull = true;

	/** 
	 * This attribute maps to the column ID_D in the favorito_del_usuario table.
	 */
	protected int idD;

	/** 
	 * This attribute represents whether the primitive attribute idD is null.
	 */
	protected boolean idDNull = true;

	/** 
	 * This attribute maps to the column ID_Eq in the favorito_del_usuario table.
	 */
	protected int idEq;

	/** 
	 * This attribute represents whether the primitive attribute idEq is null.
	 */
	protected boolean idEqNull = true;

	/** 
	 * This attribute maps to the column ID_De in the favorito_del_usuario table.
	 */
	protected int idDe;

	/** 
	 * This attribute represents whether the primitive attribute idDe is null.
	 */
	protected boolean idDeNull = true;

	/**
	 * Method 'FavoritoDelUsuario'
	 * 
	 */
	public FavoritoDelUsuario()
	{
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
	 * Method 'getIdD'
	 * 
	 * @return int
	 */
	public int getIdD()
	{
		return idD;
	}

	/**
	 * Method 'setIdD'
	 * 
	 * @param idD
	 */
	public void setIdD(int idD)
	{
		this.idD = idD;
		this.idDNull = false;
	}

	/**
	 * Method 'setIdDNull'
	 * 
	 * @param value
	 */
	public void setIdDNull(boolean value)
	{
		this.idDNull = value;
	}

	/**
	 * Method 'isIdDNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdDNull()
	{
		return idDNull;
	}

	/**
	 * Method 'getIdEq'
	 * 
	 * @return int
	 */
	public int getIdEq()
	{
		return idEq;
	}

	/**
	 * Method 'setIdEq'
	 * 
	 * @param idEq
	 */
	public void setIdEq(int idEq)
	{
		this.idEq = idEq;
		this.idEqNull = false;
	}

	/**
	 * Method 'setIdEqNull'
	 * 
	 * @param value
	 */
	public void setIdEqNull(boolean value)
	{
		this.idEqNull = value;
	}

	/**
	 * Method 'isIdEqNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEqNull()
	{
		return idEqNull;
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
		
		if (!(_other instanceof FavoritoDelUsuario)) {
			return false;
		}
		
		final FavoritoDelUsuario _cast = (FavoritoDelUsuario) _other;
		if (idU != _cast.idU) {
			return false;
		}
		
		if (idUNull != _cast.idUNull) {
			return false;
		}
		
		if (idD != _cast.idD) {
			return false;
		}
		
		if (idDNull != _cast.idDNull) {
			return false;
		}
		
		if (idEq != _cast.idEq) {
			return false;
		}
		
		if (idEqNull != _cast.idEqNull) {
			return false;
		}
		
		if (idDe != _cast.idDe) {
			return false;
		}
		
		if (idDeNull != _cast.idDeNull) {
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
		_hashCode = 29 * _hashCode + idU;
		_hashCode = 29 * _hashCode + (idUNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idD;
		_hashCode = 29 * _hashCode + (idDNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idEq;
		_hashCode = 29 * _hashCode + (idEqNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idDe;
		_hashCode = 29 * _hashCode + (idDeNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.FavoritoDelUsuario: " );
		ret.append( "idU=" + idU );
		ret.append( ", idD=" + idD );
		ret.append( ", idEq=" + idEq );
		ret.append( ", idDe=" + idDe );
		return ret.toString();
	}

}
