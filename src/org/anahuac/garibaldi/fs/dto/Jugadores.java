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

public class Jugadores implements Serializable
{
	/** 
	 * This attribute maps to the column jugadores_id in the jugadores table.
	 */
	protected int jugadoresId;

	/** 
	 * This attribute maps to the column Nombre in the jugadores table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column Numero in the jugadores table.
	 */
	protected int numero;

	/** 
	 * This attribute maps to the column ID_Eq in the jugadores table.
	 */
	protected int idEq;

	/** 
	 * This attribute represents whether the primitive attribute idEq is null.
	 */
	protected boolean idEqNull = true;

	/** 
	 * This attribute maps to the column ID_TdJ in the jugadores table.
	 */
	protected int idTdj;

	/** 
	 * This attribute represents whether the primitive attribute idTdj is null.
	 */
	protected boolean idTdjNull = true;

	/** 
	 * This attribute maps to the column primer_apellido in the jugadores table.
	 */
	protected String primerApellido;

	/** 
	 * This attribute maps to the column segundo_apellido in the jugadores table.
	 */
	protected String segundoApellido;

	/**
	 * Method 'Jugadores'
	 * 
	 */
	public Jugadores()
	{
	}

	/**
	 * Method 'getJugadoresId'
	 * 
	 * @return int
	 */
	public int getJugadoresId()
	{
		return jugadoresId;
	}

	/**
	 * Method 'setJugadoresId'
	 * 
	 * @param jugadoresId
	 */
	public void setJugadoresId(int jugadoresId)
	{
		this.jugadoresId = jugadoresId;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'getNumero'
	 * 
	 * @return int
	 */
	public int getNumero()
	{
		return numero;
	}

	/**
	 * Method 'setNumero'
	 * 
	 * @param numero
	 */
	public void setNumero(int numero)
	{
		this.numero = numero;
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
	 * Method 'getIdTdj'
	 * 
	 * @return int
	 */
	public int getIdTdj()
	{
		return idTdj;
	}

	/**
	 * Method 'setIdTdj'
	 * 
	 * @param idTdj
	 */
	public void setIdTdj(int idTdj)
	{
		this.idTdj = idTdj;
		this.idTdjNull = false;
	}

	/**
	 * Method 'setIdTdjNull'
	 * 
	 * @param value
	 */
	public void setIdTdjNull(boolean value)
	{
		this.idTdjNull = value;
	}

	/**
	 * Method 'isIdTdjNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdTdjNull()
	{
		return idTdjNull;
	}

	/**
	 * Method 'getPrimerApellido'
	 * 
	 * @return String
	 */
	public String getPrimerApellido()
	{
		return primerApellido;
	}

	/**
	 * Method 'setPrimerApellido'
	 * 
	 * @param primerApellido
	 */
	public void setPrimerApellido(String primerApellido)
	{
		this.primerApellido = primerApellido;
	}

	/**
	 * Method 'getSegundoApellido'
	 * 
	 * @return String
	 */
	public String getSegundoApellido()
	{
		return segundoApellido;
	}

	/**
	 * Method 'setSegundoApellido'
	 * 
	 * @param segundoApellido
	 */
	public void setSegundoApellido(String segundoApellido)
	{
		this.segundoApellido = segundoApellido;
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
		
		if (!(_other instanceof Jugadores)) {
			return false;
		}
		
		final Jugadores _cast = (Jugadores) _other;
		if (jugadoresId != _cast.jugadoresId) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (numero != _cast.numero) {
			return false;
		}
		
		if (idEq != _cast.idEq) {
			return false;
		}
		
		if (idEqNull != _cast.idEqNull) {
			return false;
		}
		
		if (idTdj != _cast.idTdj) {
			return false;
		}
		
		if (idTdjNull != _cast.idTdjNull) {
			return false;
		}
		
		if (primerApellido == null ? _cast.primerApellido != primerApellido : !primerApellido.equals( _cast.primerApellido )) {
			return false;
		}
		
		if (segundoApellido == null ? _cast.segundoApellido != segundoApellido : !segundoApellido.equals( _cast.segundoApellido )) {
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
		_hashCode = 29 * _hashCode + jugadoresId;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + numero;
		_hashCode = 29 * _hashCode + idEq;
		_hashCode = 29 * _hashCode + (idEqNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idTdj;
		_hashCode = 29 * _hashCode + (idTdjNull ? 1 : 0);
		if (primerApellido != null) {
			_hashCode = 29 * _hashCode + primerApellido.hashCode();
		}
		
		if (segundoApellido != null) {
			_hashCode = 29 * _hashCode + segundoApellido.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return JugadoresPk
	 */
	public JugadoresPk createPk()
	{
		return new JugadoresPk(jugadoresId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Jugadores: " );
		ret.append( "jugadoresId=" + jugadoresId );
		ret.append( ", nombre=" + nombre );
		ret.append( ", numero=" + numero );
		ret.append( ", idEq=" + idEq );
		ret.append( ", idTdj=" + idTdj );
		ret.append( ", primerApellido=" + primerApellido );
		ret.append( ", segundoApellido=" + segundoApellido );
		return ret.toString();
	}

}
