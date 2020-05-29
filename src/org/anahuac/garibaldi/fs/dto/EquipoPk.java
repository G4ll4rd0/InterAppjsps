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
 * This class represents the primary key of the equipo table.
 */
public class EquipoPk implements Serializable
{
	protected int equipoId;

	/** 
	 * This attribute represents whether the primitive attribute equipoId is null.
	 */
	protected boolean equipoIdNull;

	/** 
	 * Sets the value of equipoId
	 */
	public void setEquipoId(int equipoId)
	{
		this.equipoId = equipoId;
	}

	/** 
	 * Gets the value of equipoId
	 */
	public int getEquipoId()
	{
		return equipoId;
	}

	/**
	 * Method 'EquipoPk'
	 * 
	 */
	public EquipoPk()
	{
	}

	/**
	 * Method 'EquipoPk'
	 * 
	 * @param equipoId
	 */
	public EquipoPk(final int equipoId)
	{
		this.equipoId = equipoId;
	}

	/** 
	 * Sets the value of equipoIdNull
	 */
	public void setEquipoIdNull(boolean equipoIdNull)
	{
		this.equipoIdNull = equipoIdNull;
	}

	/** 
	 * Gets the value of equipoIdNull
	 */
	public boolean isEquipoIdNull()
	{
		return equipoIdNull;
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
		
		if (!(_other instanceof EquipoPk)) {
			return false;
		}
		
		final EquipoPk _cast = (EquipoPk) _other;
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (equipoIdNull != _cast.equipoIdNull) {
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
		_hashCode = 29 * _hashCode + (equipoIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.EquipoPk: " );
		ret.append( "equipoId=" + equipoId );
		return ret.toString();
	}

}
