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

public class TipoDeUsuario implements Serializable
{
	/** 
	 * This attribute maps to the column tipo_de_usuario_id in the tipo_de_usuario table.
	 */
	protected int tipoDeUsuarioId;

	/** 
	 * This attribute maps to the column Descripcion in the tipo_de_usuario table.
	 */
	protected String descripcion;

	/**
	 * Method 'TipoDeUsuario'
	 * 
	 */
	public TipoDeUsuario()
	{
	}

	/**
	 * Method 'getTipoDeUsuarioId'
	 * 
	 * @return int
	 */
	public int getTipoDeUsuarioId()
	{
		return tipoDeUsuarioId;
	}

	/**
	 * Method 'setTipoDeUsuarioId'
	 * 
	 * @param tipoDeUsuarioId
	 */
	public void setTipoDeUsuarioId(int tipoDeUsuarioId)
	{
		this.tipoDeUsuarioId = tipoDeUsuarioId;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
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
		
		if (!(_other instanceof TipoDeUsuario)) {
			return false;
		}
		
		final TipoDeUsuario _cast = (TipoDeUsuario) _other;
		if (tipoDeUsuarioId != _cast.tipoDeUsuarioId) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
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
		_hashCode = 29 * _hashCode + tipoDeUsuarioId;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoDeUsuarioPk
	 */
	public TipoDeUsuarioPk createPk()
	{
		return new TipoDeUsuarioPk(tipoDeUsuarioId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.TipoDeUsuario: " );
		ret.append( "tipoDeUsuarioId=" + tipoDeUsuarioId );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
