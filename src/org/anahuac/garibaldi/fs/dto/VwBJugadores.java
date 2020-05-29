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

public class VwBJugadores implements Serializable
{
	/** 
	 * This attribute maps to the column jugadores_id in the vw_b_jugadores table.
	 */
	protected int jugadoresId;

	/** 
	 * This attribute maps to the column tipo_de_jugador_id in the vw_b_jugadores table.
	 */
	protected int tipoDeJugadorId;

	/** 
	 * This attribute maps to the column equipo_id in the vw_b_jugadores table.
	 */
	protected int equipoId;

	/** 
	 * This attribute maps to the column deporte_id in the vw_b_jugadores table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column seccion_id in the vw_b_jugadores table.
	 */
	protected int seccionId;

	/** 
	 * This attribute maps to the column rama_id in the vw_b_jugadores table.
	 */
	protected int ramaId;

	/** 
	 * This attribute maps to the column Nombre in the vw_b_jugadores table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column Primer_Apellido in the vw_b_jugadores table.
	 */
	protected String primerApellido;

	/** 
	 * This attribute maps to the column Segundo_Apellido in the vw_b_jugadores table.
	 */
	protected String segundoApellido;

	/** 
	 * This attribute maps to the column Numero in the vw_b_jugadores table.
	 */
	protected int numero;

	/** 
	 * This attribute maps to the column tipo_jugador in the vw_b_jugadores table.
	 */
	protected String tipoJugador;

	/** 
	 * This attribute maps to the column deporte in the vw_b_jugadores table.
	 */
	protected String deporte;

	/** 
	 * This attribute maps to the column seccion in the vw_b_jugadores table.
	 */
	protected String seccion;

	/** 
	 * This attribute maps to the column rama in the vw_b_jugadores table.
	 */
	protected String rama;

	/** 
	 * This attribute maps to the column delegaciones_id in the vw_b_jugadores table.
	 */
	protected int delegacionesId;

	/** 
	 * This attribute maps to the column Delegacion_Codigo in the vw_b_jugadores table.
	 */
	protected String delegacionCodigo;

	/** 
	 * This attribute maps to the column Delegacion_Nombre in the vw_b_jugadores table.
	 */
	protected String delegacionNombre;

	/**
	 * Method 'VwBJugadores'
	 * 
	 */
	public VwBJugadores()
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
	 * Method 'getTipoDeJugadorId'
	 * 
	 * @return int
	 */
	public int getTipoDeJugadorId()
	{
		return tipoDeJugadorId;
	}

	/**
	 * Method 'setTipoDeJugadorId'
	 * 
	 * @param tipoDeJugadorId
	 */
	public void setTipoDeJugadorId(int tipoDeJugadorId)
	{
		this.tipoDeJugadorId = tipoDeJugadorId;
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
	 * Method 'getDeporteId'
	 * 
	 * @return int
	 */
	public int getDeporteId()
	{
		return deporteId;
	}

	/**
	 * Method 'setDeporteId'
	 * 
	 * @param deporteId
	 */
	public void setDeporteId(int deporteId)
	{
		this.deporteId = deporteId;
	}

	/**
	 * Method 'getSeccionId'
	 * 
	 * @return int
	 */
	public int getSeccionId()
	{
		return seccionId;
	}

	/**
	 * Method 'setSeccionId'
	 * 
	 * @param seccionId
	 */
	public void setSeccionId(int seccionId)
	{
		this.seccionId = seccionId;
	}

	/**
	 * Method 'getRamaId'
	 * 
	 * @return int
	 */
	public int getRamaId()
	{
		return ramaId;
	}

	/**
	 * Method 'setRamaId'
	 * 
	 * @param ramaId
	 */
	public void setRamaId(int ramaId)
	{
		this.ramaId = ramaId;
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
	 * Method 'getTipoJugador'
	 * 
	 * @return String
	 */
	public String getTipoJugador()
	{
		return tipoJugador;
	}

	/**
	 * Method 'setTipoJugador'
	 * 
	 * @param tipoJugador
	 */
	public void setTipoJugador(String tipoJugador)
	{
		this.tipoJugador = tipoJugador;
	}

	/**
	 * Method 'getDeporte'
	 * 
	 * @return String
	 */
	public String getDeporte()
	{
		return deporte;
	}

	/**
	 * Method 'setDeporte'
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte)
	{
		this.deporte = deporte;
	}

	/**
	 * Method 'getSeccion'
	 * 
	 * @return String
	 */
	public String getSeccion()
	{
		return seccion;
	}

	/**
	 * Method 'setSeccion'
	 * 
	 * @param seccion
	 */
	public void setSeccion(String seccion)
	{
		this.seccion = seccion;
	}

	/**
	 * Method 'getRama'
	 * 
	 * @return String
	 */
	public String getRama()
	{
		return rama;
	}

	/**
	 * Method 'setRama'
	 * 
	 * @param rama
	 */
	public void setRama(String rama)
	{
		this.rama = rama;
	}

	/**
	 * Method 'getDelegacionesId'
	 * 
	 * @return int
	 */
	public int getDelegacionesId()
	{
		return delegacionesId;
	}

	/**
	 * Method 'setDelegacionesId'
	 * 
	 * @param delegacionesId
	 */
	public void setDelegacionesId(int delegacionesId)
	{
		this.delegacionesId = delegacionesId;
	}

	/**
	 * Method 'getDelegacionCodigo'
	 * 
	 * @return String
	 */
	public String getDelegacionCodigo()
	{
		return delegacionCodigo;
	}

	/**
	 * Method 'setDelegacionCodigo'
	 * 
	 * @param delegacionCodigo
	 */
	public void setDelegacionCodigo(String delegacionCodigo)
	{
		this.delegacionCodigo = delegacionCodigo;
	}

	/**
	 * Method 'getDelegacionNombre'
	 * 
	 * @return String
	 */
	public String getDelegacionNombre()
	{
		return delegacionNombre;
	}

	/**
	 * Method 'setDelegacionNombre'
	 * 
	 * @param delegacionNombre
	 */
	public void setDelegacionNombre(String delegacionNombre)
	{
		this.delegacionNombre = delegacionNombre;
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
		
		if (!(_other instanceof VwBJugadores)) {
			return false;
		}
		
		final VwBJugadores _cast = (VwBJugadores) _other;
		if (jugadoresId != _cast.jugadoresId) {
			return false;
		}
		
		if (tipoDeJugadorId != _cast.tipoDeJugadorId) {
			return false;
		}
		
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (deporteId != _cast.deporteId) {
			return false;
		}
		
		if (seccionId != _cast.seccionId) {
			return false;
		}
		
		if (ramaId != _cast.ramaId) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (primerApellido == null ? _cast.primerApellido != primerApellido : !primerApellido.equals( _cast.primerApellido )) {
			return false;
		}
		
		if (segundoApellido == null ? _cast.segundoApellido != segundoApellido : !segundoApellido.equals( _cast.segundoApellido )) {
			return false;
		}
		
		if (numero != _cast.numero) {
			return false;
		}
		
		if (tipoJugador == null ? _cast.tipoJugador != tipoJugador : !tipoJugador.equals( _cast.tipoJugador )) {
			return false;
		}
		
		if (deporte == null ? _cast.deporte != deporte : !deporte.equals( _cast.deporte )) {
			return false;
		}
		
		if (seccion == null ? _cast.seccion != seccion : !seccion.equals( _cast.seccion )) {
			return false;
		}
		
		if (rama == null ? _cast.rama != rama : !rama.equals( _cast.rama )) {
			return false;
		}
		
		if (delegacionesId != _cast.delegacionesId) {
			return false;
		}
		
		if (delegacionCodigo == null ? _cast.delegacionCodigo != delegacionCodigo : !delegacionCodigo.equals( _cast.delegacionCodigo )) {
			return false;
		}
		
		if (delegacionNombre == null ? _cast.delegacionNombre != delegacionNombre : !delegacionNombre.equals( _cast.delegacionNombre )) {
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
		_hashCode = 29 * _hashCode + tipoDeJugadorId;
		_hashCode = 29 * _hashCode + equipoId;
		_hashCode = 29 * _hashCode + deporteId;
		_hashCode = 29 * _hashCode + seccionId;
		_hashCode = 29 * _hashCode + ramaId;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (primerApellido != null) {
			_hashCode = 29 * _hashCode + primerApellido.hashCode();
		}
		
		if (segundoApellido != null) {
			_hashCode = 29 * _hashCode + segundoApellido.hashCode();
		}
		
		_hashCode = 29 * _hashCode + numero;
		if (tipoJugador != null) {
			_hashCode = 29 * _hashCode + tipoJugador.hashCode();
		}
		
		if (deporte != null) {
			_hashCode = 29 * _hashCode + deporte.hashCode();
		}
		
		if (seccion != null) {
			_hashCode = 29 * _hashCode + seccion.hashCode();
		}
		
		if (rama != null) {
			_hashCode = 29 * _hashCode + rama.hashCode();
		}
		
		_hashCode = 29 * _hashCode + delegacionesId;
		if (delegacionCodigo != null) {
			_hashCode = 29 * _hashCode + delegacionCodigo.hashCode();
		}
		
		if (delegacionNombre != null) {
			_hashCode = 29 * _hashCode + delegacionNombre.hashCode();
		}
		
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwBJugadores: " );
		ret.append( "jugadoresId=" + jugadoresId );
		ret.append( ", tipoDeJugadorId=" + tipoDeJugadorId );
		ret.append( ", equipoId=" + equipoId );
		ret.append( ", deporteId=" + deporteId );
		ret.append( ", seccionId=" + seccionId );
		ret.append( ", ramaId=" + ramaId );
		ret.append( ", nombre=" + nombre );
		ret.append( ", primerApellido=" + primerApellido );
		ret.append( ", segundoApellido=" + segundoApellido );
		ret.append( ", numero=" + numero );
		ret.append( ", tipoJugador=" + tipoJugador );
		ret.append( ", deporte=" + deporte );
		ret.append( ", seccion=" + seccion );
		ret.append( ", rama=" + rama );
		ret.append( ", delegacionesId=" + delegacionesId );
		ret.append( ", delegacionCodigo=" + delegacionCodigo );
		ret.append( ", delegacionNombre=" + delegacionNombre );
		return ret.toString();
	}

}
