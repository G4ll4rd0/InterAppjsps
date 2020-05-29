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

public class Noticias implements Serializable
{
	/** 
	 * This attribute maps to the column noticias_ID in the noticias table.
	 */
	protected int noticiasId;

	/** 
	 * This attribute maps to the column Titulo in the noticias table.
	 */
	protected String titulo;

	/** 
	 * This attribute maps to the column Descripcion in the noticias table.
	 */
	protected String descripcion;

	/** 
	 * This attribute maps to the column desc_larga in the noticias table.
	 */
	protected String descLarga;

	/**
	 * Method 'Noticias'
	 * 
	 */
	public Noticias()
	{
	}

	/**
	 * Method 'getNoticiasId'
	 * 
	 * @return int
	 */
	public int getNoticiasId()
	{
		return noticiasId;
	}

	/**
	 * Method 'setNoticiasId'
	 * 
	 * @param noticiasId
	 */
	public void setNoticiasId(int noticiasId)
	{
		this.noticiasId = noticiasId;
	}

	/**
	 * Method 'getTitulo'
	 * 
	 * @return String
	 */
	public String getTitulo()
	{
		return titulo;
	}

	/**
	 * Method 'setTitulo'
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
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
	 * Method 'getDescLarga'
	 * 
	 * @return String
	 */
	public String getDescLarga()
	{
		return descLarga;
	}

	/**
	 * Method 'setDescLarga'
	 * 
	 * @param descLarga
	 */
	public void setDescLarga(String descLarga)
	{
		this.descLarga = descLarga;
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
		
		if (!(_other instanceof Noticias)) {
			return false;
		}
		
		final Noticias _cast = (Noticias) _other;
		if (noticiasId != _cast.noticiasId) {
			return false;
		}
		
		if (titulo == null ? _cast.titulo != titulo : !titulo.equals( _cast.titulo )) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descLarga == null ? _cast.descLarga != descLarga : !descLarga.equals( _cast.descLarga )) {
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
		_hashCode = 29 * _hashCode + noticiasId;
		if (titulo != null) {
			_hashCode = 29 * _hashCode + titulo.hashCode();
		}
		
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		if (descLarga != null) {
			_hashCode = 29 * _hashCode + descLarga.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NoticiasPk
	 */
	public NoticiasPk createPk()
	{
		return new NoticiasPk(noticiasId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Noticias: " );
		ret.append( "noticiasId=" + noticiasId );
		ret.append( ", titulo=" + titulo );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", descLarga=" + descLarga );
		return ret.toString();
	}

}
