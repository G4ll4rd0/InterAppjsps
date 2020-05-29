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

public class Equipo implements Serializable
{
	/** 
	 * This attribute maps to the column equipo_id in the equipo table.
	 */
	protected int equipoId;

	/** 
	 * This attribute maps to the column ID_D in the equipo table.
	 */
	protected int idD;

	/** 
	 * This attribute represents whether the primitive attribute idD is null.
	 */
	protected boolean idDNull = true;

	/** 
	 * This attribute maps to the column ID_S in the equipo table.
	 */
	protected int idS;

	/** 
	 * This attribute represents whether the primitive attribute idS is null.
	 */
	protected boolean idSNull = true;

	/** 
	 * This attribute maps to the column ID_De in the equipo table.
	 */
	protected int idDe;

	/** 
	 * This attribute represents whether the primitive attribute idDe is null.
	 */
	protected boolean idDeNull = true;

	/** 
	 * This attribute maps to the column ID_R in the equipo table.
	 */
	protected int idR;

	/** 
	 * This attribute represents whether the primitive attribute idR is null.
	 */
	protected boolean idRNull = true;

	/**
	 * Method 'Equipo'
	 * 
	 */
	public Equipo()
	{
	}

	/**
	 * Method 'getEquipoId'
	 * 
	 * @return int
	 */
	public int getEquipoId()
	{
		return equipoId;
	}

	/**
	 * Method 'setEquipoId'
	 * 
	 * @param equipoId
	 */
	public void setEquipoId(int equipoId)
	{
		this.equipoId = equipoId;
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
	 * Method 'getIdR'
	 * 
	 * @return int
	 */
	public int getIdR()
	{
		return idR;
	}

	/**
	 * Method 'setIdR'
	 * 
	 * @param idR
	 */
	public void setIdR(int idR)
	{
		this.idR = idR;
		this.idRNull = false;
	}

	/**
	 * Method 'setIdRNull'
	 * 
	 * @param value
	 */
	public void setIdRNull(boolean value)
	{
		this.idRNull = value;
	}

	/**
	 * Method 'isIdRNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdRNull()
	{
		return idRNull;
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
		
		if (!(_other instanceof Equipo)) {
			return false;
		}
		
		final Equipo _cast = (Equipo) _other;
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (idD != _cast.idD) {
			return false;
		}
		
		if (idDNull != _cast.idDNull) {
			return false;
		}
		
		if (idS != _cast.idS) {
			return false;
		}
		
		if (idSNull != _cast.idSNull) {
			return false;
		}
		
		if (idDe != _cast.idDe) {
			return false;
		}
		
		if (idDeNull != _cast.idDeNull) {
			return false;
		}
		
		if (idR != _cast.idR) {
			return false;
		}
		
		if (idRNull != _cast.idRNull) {
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
		_hashCode = 29 * _hashCode + equipoId;
		_hashCode = 29 * _hashCode + idD;
		_hashCode = 29 * _hashCode + (idDNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idS;
		_hashCode = 29 * _hashCode + (idSNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idDe;
		_hashCode = 29 * _hashCode + (idDeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idR;
		_hashCode = 29 * _hashCode + (idRNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EquipoPk
	 */
	public EquipoPk createPk()
	{
		return new EquipoPk(equipoId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Equipo: " );
		ret.append( "equipoId=" + equipoId );
		ret.append( ", idD=" + idD );
		ret.append( ", idS=" + idS );
		ret.append( ", idDe=" + idDe );
		ret.append( ", idR=" + idR );
		return ret.toString();
	}

}
