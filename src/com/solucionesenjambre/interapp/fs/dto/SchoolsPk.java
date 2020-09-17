/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the schools table.
 */
public class SchoolsPk implements Serializable
{
	protected int schoolId;

	/** 
	 * This attribute represents whether the primitive attribute schoolId is null.
	 */
	protected boolean schoolIdNull;

	/** 
	 * Sets the value of schoolId
	 */
	public void setSchoolId(int schoolId)
	{
		this.schoolId = schoolId;
	}

	/** 
	 * Gets the value of schoolId
	 */
	public int getSchoolId()
	{
		return schoolId;
	}

	/**
	 * Method 'SchoolsPk'
	 * 
	 */
	public SchoolsPk()
	{
	}

	/**
	 * Method 'SchoolsPk'
	 * 
	 * @param schoolId
	 */
	public SchoolsPk(final int schoolId)
	{
		this.schoolId = schoolId;
	}

	/** 
	 * Sets the value of schoolIdNull
	 */
	public void setSchoolIdNull(boolean schoolIdNull)
	{
		this.schoolIdNull = schoolIdNull;
	}

	/** 
	 * Gets the value of schoolIdNull
	 */
	public boolean isSchoolIdNull()
	{
		return schoolIdNull;
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
		
		if (!(_other instanceof SchoolsPk)) {
			return false;
		}
		
		final SchoolsPk _cast = (SchoolsPk) _other;
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (schoolIdNull != _cast.schoolIdNull) {
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
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + (schoolIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.SchoolsPk: " );
		ret.append( "schoolId=" + schoolId );
		return ret.toString();
	}

}
