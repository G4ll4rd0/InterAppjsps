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

public class VwEstadisticas implements Serializable
{
	/** 
	 * This attribute maps to the column id_j in the vw_estadisticas table.
	 */
	protected int idJ;

	/** 
	 * This attribute represents whether the primitive attribute idJ is null.
	 */
	protected boolean idJNull = true;

	/** 
	 * This attribute maps to the column equipo_id in the vw_estadisticas table.
	 */
	protected int equipoId;

	/** 
	 * This attribute maps to the column delegaciones_id in the vw_estadisticas table.
	 */
	protected int delegacionesId;

	/** 
	 * This attribute maps to the column deporte_id in the vw_estadisticas table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column rama_id in the vw_estadisticas table.
	 */
	protected int ramaId;

	/** 
	 * This attribute maps to the column seccion_id in the vw_estadisticas table.
	 */
	protected int seccionId;

	/** 
	 * This attribute maps to the column numero in the vw_estadisticas table.
	 */
	protected int numero;

	/** 
	 * This attribute maps to the column nombre in the vw_estadisticas table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column primer_apellido in the vw_estadisticas table.
	 */
	protected String primerApellido;

	/** 
	 * This attribute maps to the column segundo_apellido in the vw_estadisticas table.
	 */
	protected String segundoApellido;

	/** 
	 * This attribute maps to the column goles in the vw_estadisticas table.
	 */
	protected long goles;

	/** 
	 * This attribute represents whether the primitive attribute goles is null.
	 */
	protected boolean golesNull = true;

	/** 
	 * This attribute maps to the column tarjetas_amarillas in the vw_estadisticas table.
	 */
	protected long tarjetasAmarillas;

	/** 
	 * This attribute represents whether the primitive attribute tarjetasAmarillas is null.
	 */
	protected boolean tarjetasAmarillasNull = true;

	/** 
	 * This attribute maps to the column tarjetas_rojas in the vw_estadisticas table.
	 */
	protected long tarjetasRojas;

	/** 
	 * This attribute represents whether the primitive attribute tarjetasRojas is null.
	 */
	protected boolean tarjetasRojasNull = true;

	/** 
	 * This attribute maps to the column codigo in the vw_estadisticas table.
	 */
	protected String codigo;

	/** 
	 * This attribute maps to the column delegacion in the vw_estadisticas table.
	 */
	protected String delegacion;

	/** 
	 * This attribute maps to the column deporte in the vw_estadisticas table.
	 */
	protected String deporte;

	/** 
	 * This attribute maps to the column seccion in the vw_estadisticas table.
	 */
	protected String seccion;

	/** 
	 * This attribute maps to the column rama in the vw_estadisticas table.
	 */
	protected String rama;

	/** 
	 * This attribute maps to the column nombre_equipo in the vw_estadisticas table.
	 */
	protected String nombreEquipo;

	/**
	 * Method 'VwEstadisticas'
	 * 
	 */
	public VwEstadisticas()
	{
	}

	/**
	 * Method 'getIdJ'
	 * 
	 * @return int
	 */
	public int getIdJ()
	{
		return idJ;
	}

	/**
	 * Method 'setIdJ'
	 * 
	 * @param idJ
	 */
	public void setIdJ(int idJ)
	{
		this.idJ = idJ;
		this.idJNull = false;
	}

	/**
	 * Method 'setIdJNull'
	 * 
	 * @param value
	 */
	public void setIdJNull(boolean value)
	{
		this.idJNull = value;
	}

	/**
	 * Method 'isIdJNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdJNull()
	{
		return idJNull;
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
	 * Method 'getGoles'
	 * 
	 * @return long
	 */
	public long getGoles()
	{
		return goles;
	}

	/**
	 * Method 'setGoles'
	 * 
	 * @param goles
	 */
	public void setGoles(long goles)
	{
		this.goles = goles;
		this.golesNull = false;
	}

	/**
	 * Method 'setGolesNull'
	 * 
	 * @param value
	 */
	public void setGolesNull(boolean value)
	{
		this.golesNull = value;
	}

	/**
	 * Method 'isGolesNull'
	 * 
	 * @return boolean
	 */
	public boolean isGolesNull()
	{
		return golesNull;
	}

	/**
	 * Method 'getTarjetasAmarillas'
	 * 
	 * @return long
	 */
	public long getTarjetasAmarillas()
	{
		return tarjetasAmarillas;
	}

	/**
	 * Method 'setTarjetasAmarillas'
	 * 
	 * @param tarjetasAmarillas
	 */
	public void setTarjetasAmarillas(long tarjetasAmarillas)
	{
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasAmarillasNull = false;
	}

	/**
	 * Method 'setTarjetasAmarillasNull'
	 * 
	 * @param value
	 */
	public void setTarjetasAmarillasNull(boolean value)
	{
		this.tarjetasAmarillasNull = value;
	}

	/**
	 * Method 'isTarjetasAmarillasNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarjetasAmarillasNull()
	{
		return tarjetasAmarillasNull;
	}

	/**
	 * Method 'getTarjetasRojas'
	 * 
	 * @return long
	 */
	public long getTarjetasRojas()
	{
		return tarjetasRojas;
	}

	/**
	 * Method 'setTarjetasRojas'
	 * 
	 * @param tarjetasRojas
	 */
	public void setTarjetasRojas(long tarjetasRojas)
	{
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasRojasNull = false;
	}

	/**
	 * Method 'setTarjetasRojasNull'
	 * 
	 * @param value
	 */
	public void setTarjetasRojasNull(boolean value)
	{
		this.tarjetasRojasNull = value;
	}

	/**
	 * Method 'isTarjetasRojasNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarjetasRojasNull()
	{
		return tarjetasRojasNull;
	}

	/**
	 * Method 'getCodigo'
	 * 
	 * @return String
	 */
	public String getCodigo()
	{
		return codigo;
	}

	/**
	 * Method 'setCodigo'
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	/**
	 * Method 'getDelegacion'
	 * 
	 * @return String
	 */
	public String getDelegacion()
	{
		return delegacion;
	}

	/**
	 * Method 'setDelegacion'
	 * 
	 * @param delegacion
	 */
	public void setDelegacion(String delegacion)
	{
		this.delegacion = delegacion;
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
	 * Method 'getNombreEquipo'
	 * 
	 * @return String
	 */
	public String getNombreEquipo()
	{
		return nombreEquipo;
	}

	/**
	 * Method 'setNombreEquipo'
	 * 
	 * @param nombreEquipo
	 */
	public void setNombreEquipo(String nombreEquipo)
	{
		this.nombreEquipo = nombreEquipo;
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
		
		if (!(_other instanceof VwEstadisticas)) {
			return false;
		}
		
		final VwEstadisticas _cast = (VwEstadisticas) _other;
		if (idJ != _cast.idJ) {
			return false;
		}
		
		if (idJNull != _cast.idJNull) {
			return false;
		}
		
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (delegacionesId != _cast.delegacionesId) {
			return false;
		}
		
		if (deporteId != _cast.deporteId) {
			return false;
		}
		
		if (ramaId != _cast.ramaId) {
			return false;
		}
		
		if (seccionId != _cast.seccionId) {
			return false;
		}
		
		if (numero != _cast.numero) {
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
		
		if (goles != _cast.goles) {
			return false;
		}
		
		if (golesNull != _cast.golesNull) {
			return false;
		}
		
		if (tarjetasAmarillas != _cast.tarjetasAmarillas) {
			return false;
		}
		
		if (tarjetasAmarillasNull != _cast.tarjetasAmarillasNull) {
			return false;
		}
		
		if (tarjetasRojas != _cast.tarjetasRojas) {
			return false;
		}
		
		if (tarjetasRojasNull != _cast.tarjetasRojasNull) {
			return false;
		}
		
		if (codigo == null ? _cast.codigo != codigo : !codigo.equals( _cast.codigo )) {
			return false;
		}
		
		if (delegacion == null ? _cast.delegacion != delegacion : !delegacion.equals( _cast.delegacion )) {
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
		
		if (nombreEquipo == null ? _cast.nombreEquipo != nombreEquipo : !nombreEquipo.equals( _cast.nombreEquipo )) {
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
		_hashCode = 29 * _hashCode + idJ;
		_hashCode = 29 * _hashCode + (idJNull ? 1 : 0);
		_hashCode = 29 * _hashCode + equipoId;
		_hashCode = 29 * _hashCode + delegacionesId;
		_hashCode = 29 * _hashCode + deporteId;
		_hashCode = 29 * _hashCode + ramaId;
		_hashCode = 29 * _hashCode + seccionId;
		_hashCode = 29 * _hashCode + numero;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (primerApellido != null) {
			_hashCode = 29 * _hashCode + primerApellido.hashCode();
		}
		
		if (segundoApellido != null) {
			_hashCode = 29 * _hashCode + segundoApellido.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (goles ^ (goles >>> 32));
		_hashCode = 29 * _hashCode + (golesNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (tarjetasAmarillas ^ (tarjetasAmarillas >>> 32));
		_hashCode = 29 * _hashCode + (tarjetasAmarillasNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (tarjetasRojas ^ (tarjetasRojas >>> 32));
		_hashCode = 29 * _hashCode + (tarjetasRojasNull ? 1 : 0);
		if (codigo != null) {
			_hashCode = 29 * _hashCode + codigo.hashCode();
		}
		
		if (delegacion != null) {
			_hashCode = 29 * _hashCode + delegacion.hashCode();
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
		
		if (nombreEquipo != null) {
			_hashCode = 29 * _hashCode + nombreEquipo.hashCode();
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwEstadisticas: " );
		ret.append( "idJ=" + idJ );
		ret.append( ", equipoId=" + equipoId );
		ret.append( ", delegacionesId=" + delegacionesId );
		ret.append( ", deporteId=" + deporteId );
		ret.append( ", ramaId=" + ramaId );
		ret.append( ", seccionId=" + seccionId );
		ret.append( ", numero=" + numero );
		ret.append( ", nombre=" + nombre );
		ret.append( ", primerApellido=" + primerApellido );
		ret.append( ", segundoApellido=" + segundoApellido );
		ret.append( ", goles=" + goles );
		ret.append( ", tarjetasAmarillas=" + tarjetasAmarillas );
		ret.append( ", tarjetasRojas=" + tarjetasRojas );
		ret.append( ", codigo=" + codigo );
		ret.append( ", delegacion=" + delegacion );
		ret.append( ", deporte=" + deporte );
		ret.append( ", seccion=" + seccion );
		ret.append( ", rama=" + rama );
		ret.append( ", nombreEquipo=" + nombreEquipo );
		return ret.toString();
	}

}
