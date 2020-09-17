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
 * This class represents the primary key of the branches table.
 */
public class BranchesPk implements Serializable
{
	protected int branchId;

	/** 
	 * This attribute represents whether the primitive attribute branchId is null.
	 */
	protected boolean branchIdNull;

	/** 
	 * Sets the value of branchId
	 */
	public void setBranchId(int branchId)
	{
		this.branchId = branchId;
	}

	/** 
	 * Gets the value of branchId
	 */
	public int getBranchId()
	{
		return branchId;
	}

	/**
	 * Method 'BranchesPk'
	 * 
	 */
	public BranchesPk()
	{
	}

	/**
	 * Method 'BranchesPk'
	 * 
	 * @param branchId
	 */
	public BranchesPk(final int branchId)
	{
		this.branchId = branchId;
	}

	/** 
	 * Sets the value of branchIdNull
	 */
	public void setBranchIdNull(boolean branchIdNull)
	{
		this.branchIdNull = branchIdNull;
	}

	/** 
	 * Gets the value of branchIdNull
	 */
	public boolean isBranchIdNull()
	{
		return branchIdNull;
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
		
		if (!(_other instanceof BranchesPk)) {
			return false;
		}
		
		final BranchesPk _cast = (BranchesPk) _other;
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (branchIdNull != _cast.branchIdNull) {
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
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + (branchIdNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.BranchesPk: " );
		ret.append( "branchId=" + branchId );
		return ret.toString();
	}

}
