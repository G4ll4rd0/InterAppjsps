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

public class VwHosts implements Serializable
{
	/** 
	 * This attribute maps to the column jugador_id in the vw_hosts table.
	 */
	protected int jugadorId;

	/** 
	 * This attribute represents whether the primitive attribute jugadorId is null.
	 */
	protected boolean jugadorIdNull = true;

	/** 
	 * This attribute maps to the column padre_id in the vw_hosts table.
	 */
	protected int padreId;

	/** 
	 * This attribute represents whether the primitive attribute padreId is null.
	 */
	protected boolean padreIdNull = true;

	/** 
	 * This attribute maps to the column padre_seed in the vw_hosts table.
	 */
	protected String padreSeed;

	/** 
	 * This attribute maps to the column host_id in the vw_hosts table.
	 */
	protected int hostId;

	/** 
	 * This attribute represents whether the primitive attribute hostId is null.
	 */
	protected boolean hostIdNull = true;

	/** 
	 * This attribute maps to the column host_nombre in the vw_hosts table.
	 */
	protected String hostNombre;

	/** 
	 * This attribute maps to the column host_direccion in the vw_hosts table.
	 */
	protected String hostDireccion;

	/** 
	 * This attribute maps to the column host_telefono in the vw_hosts table.
	 */
	protected String hostTelefono;

	/** 
	 * This attribute maps to the column nombre_jugador in the vw_hosts table.
	 */
	protected String nombreJugador;

	/**
	 * Method 'VwHosts'
	 * 
	 */
	public VwHosts()
	{
	}

	/**
	 * Method 'getJugadorId'
	 * 
	 * @return int
	 */
	public int getJugadorId()
	{
		return jugadorId;
	}

	/**
	 * Method 'setJugadorId'
	 * 
	 * @param jugadorId
	 */
	public void setJugadorId(int jugadorId)
	{
		this.jugadorId = jugadorId;
		this.jugadorIdNull = false;
	}

	/**
	 * Method 'setJugadorIdNull'
	 * 
	 * @param value
	 */
	public void setJugadorIdNull(boolean value)
	{
		this.jugadorIdNull = value;
	}

	/**
	 * Method 'isJugadorIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isJugadorIdNull()
	{
		return jugadorIdNull;
	}

	/**
	 * Method 'getPadreId'
	 * 
	 * @return int
	 */
	public int getPadreId()
	{
		return padreId;
	}

	/**
	 * Method 'setPadreId'
	 * 
	 * @param padreId
	 */
	public void setPadreId(int padreId)
	{
		this.padreId = padreId;
		this.padreIdNull = false;
	}

	/**
	 * Method 'setPadreIdNull'
	 * 
	 * @param value
	 */
	public void setPadreIdNull(boolean value)
	{
		this.padreIdNull = value;
	}

	/**
	 * Method 'isPadreIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPadreIdNull()
	{
		return padreIdNull;
	}

	/**
	 * Method 'getPadreSeed'
	 * 
	 * @return String
	 */
	public String getPadreSeed()
	{
		return padreSeed;
	}

	/**
	 * Method 'setPadreSeed'
	 * 
	 * @param padreSeed
	 */
	public void setPadreSeed(String padreSeed)
	{
		this.padreSeed = padreSeed;
	}

	/**
	 * Method 'getHostId'
	 * 
	 * @return int
	 */
	public int getHostId()
	{
		return hostId;
	}

	/**
	 * Method 'setHostId'
	 * 
	 * @param hostId
	 */
	public void setHostId(int hostId)
	{
		this.hostId = hostId;
		this.hostIdNull = false;
	}

	/**
	 * Method 'setHostIdNull'
	 * 
	 * @param value
	 */
	public void setHostIdNull(boolean value)
	{
		this.hostIdNull = value;
	}

	/**
	 * Method 'isHostIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isHostIdNull()
	{
		return hostIdNull;
	}

	/**
	 * Method 'getHostNombre'
	 * 
	 * @return String
	 */
	public String getHostNombre()
	{
		return hostNombre;
	}

	/**
	 * Method 'setHostNombre'
	 * 
	 * @param hostNombre
	 */
	public void setHostNombre(String hostNombre)
	{
		this.hostNombre = hostNombre;
	}

	/**
	 * Method 'getHostDireccion'
	 * 
	 * @return String
	 */
	public String getHostDireccion()
	{
		return hostDireccion;
	}

	/**
	 * Method 'setHostDireccion'
	 * 
	 * @param hostDireccion
	 */
	public void setHostDireccion(String hostDireccion)
	{
		this.hostDireccion = hostDireccion;
	}

	/**
	 * Method 'getHostTelefono'
	 * 
	 * @return String
	 */
	public String getHostTelefono()
	{
		return hostTelefono;
	}

	/**
	 * Method 'setHostTelefono'
	 * 
	 * @param hostTelefono
	 */
	public void setHostTelefono(String hostTelefono)
	{
		this.hostTelefono = hostTelefono;
	}

	/**
	 * Method 'getNombreJugador'
	 * 
	 * @return String
	 */
	public String getNombreJugador()
	{
		return nombreJugador;
	}

	/**
	 * Method 'setNombreJugador'
	 * 
	 * @param nombreJugador
	 */
	public void setNombreJugador(String nombreJugador)
	{
		this.nombreJugador = nombreJugador;
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
		
		if (!(_other instanceof VwHosts)) {
			return false;
		}
		
		final VwHosts _cast = (VwHosts) _other;
		if (jugadorId != _cast.jugadorId) {
			return false;
		}
		
		if (jugadorIdNull != _cast.jugadorIdNull) {
			return false;
		}
		
		if (padreId != _cast.padreId) {
			return false;
		}
		
		if (padreIdNull != _cast.padreIdNull) {
			return false;
		}
		
		if (padreSeed == null ? _cast.padreSeed != padreSeed : !padreSeed.equals( _cast.padreSeed )) {
			return false;
		}
		
		if (hostId != _cast.hostId) {
			return false;
		}
		
		if (hostIdNull != _cast.hostIdNull) {
			return false;
		}
		
		if (hostNombre == null ? _cast.hostNombre != hostNombre : !hostNombre.equals( _cast.hostNombre )) {
			return false;
		}
		
		if (hostDireccion == null ? _cast.hostDireccion != hostDireccion : !hostDireccion.equals( _cast.hostDireccion )) {
			return false;
		}
		
		if (hostTelefono == null ? _cast.hostTelefono != hostTelefono : !hostTelefono.equals( _cast.hostTelefono )) {
			return false;
		}
		
		if (nombreJugador == null ? _cast.nombreJugador != nombreJugador : !nombreJugador.equals( _cast.nombreJugador )) {
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
		_hashCode = 29 * _hashCode + jugadorId;
		_hashCode = 29 * _hashCode + (jugadorIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + padreId;
		_hashCode = 29 * _hashCode + (padreIdNull ? 1 : 0);
		if (padreSeed != null) {
			_hashCode = 29 * _hashCode + padreSeed.hashCode();
		}
		
		_hashCode = 29 * _hashCode + hostId;
		_hashCode = 29 * _hashCode + (hostIdNull ? 1 : 0);
		if (hostNombre != null) {
			_hashCode = 29 * _hashCode + hostNombre.hashCode();
		}
		
		if (hostDireccion != null) {
			_hashCode = 29 * _hashCode + hostDireccion.hashCode();
		}
		
		if (hostTelefono != null) {
			_hashCode = 29 * _hashCode + hostTelefono.hashCode();
		}
		
		if (nombreJugador != null) {
			_hashCode = 29 * _hashCode + nombreJugador.hashCode();
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwHosts: " );
		ret.append( "jugadorId=" + jugadorId );
		ret.append( ", padreId=" + padreId );
		ret.append( ", padreSeed=" + padreSeed );
		ret.append( ", hostId=" + hostId );
		ret.append( ", hostNombre=" + hostNombre );
		ret.append( ", hostDireccion=" + hostDireccion );
		ret.append( ", hostTelefono=" + hostTelefono );
		ret.append( ", nombreJugador=" + nombreJugador );
		return ret.toString();
	}

}
