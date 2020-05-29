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

public class EstadisticasJugador implements Serializable
{
	/** 
	 * This attribute maps to the column Goles in the estadisticas_jugador table.
	 */
	protected int goles;

	/** 
	 * This attribute represents whether the primitive attribute goles is null.
	 */
	protected boolean golesNull = true;

	/** 
	 * This attribute maps to the column Puntos in the estadisticas_jugador table.
	 */
	protected int puntos;

	/** 
	 * This attribute represents whether the primitive attribute puntos is null.
	 */
	protected boolean puntosNull = true;

	/** 
	 * This attribute maps to the column Tarjetas_Am in the estadisticas_jugador table.
	 */
	protected int tarjetasAm;

	/** 
	 * This attribute represents whether the primitive attribute tarjetasAm is null.
	 */
	protected boolean tarjetasAmNull = true;

	/** 
	 * This attribute maps to the column Tarjetas_Ro in the estadisticas_jugador table.
	 */
	protected int tarjetasRo;

	/** 
	 * This attribute represents whether the primitive attribute tarjetasRo is null.
	 */
	protected boolean tarjetasRoNull = true;

	/** 
	 * This attribute maps to the column ID_J in the estadisticas_jugador table.
	 */
	protected int idJ;

	/** 
	 * This attribute represents whether the primitive attribute idJ is null.
	 */
	protected boolean idJNull = true;

	/** 
	 * This attribute maps to the column partido_id in the estadisticas_jugador table.
	 */
	protected int partidoId;

	/** 
	 * This attribute represents whether the primitive attribute partidoId is null.
	 */
	protected boolean partidoIdNull = true;

	/**
	 * Method 'EstadisticasJugador'
	 * 
	 */
	public EstadisticasJugador()
	{
	}

	/**
	 * Method 'getGoles'
	 * 
	 * @return int
	 */
	public int getGoles()
	{
		return goles;
	}

	/**
	 * Method 'setGoles'
	 * 
	 * @param goles
	 */
	public void setGoles(int goles)
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
	 * Method 'getPuntos'
	 * 
	 * @return int
	 */
	public int getPuntos()
	{
		return puntos;
	}

	/**
	 * Method 'setPuntos'
	 * 
	 * @param puntos
	 */
	public void setPuntos(int puntos)
	{
		this.puntos = puntos;
		this.puntosNull = false;
	}

	/**
	 * Method 'setPuntosNull'
	 * 
	 * @param value
	 */
	public void setPuntosNull(boolean value)
	{
		this.puntosNull = value;
	}

	/**
	 * Method 'isPuntosNull'
	 * 
	 * @return boolean
	 */
	public boolean isPuntosNull()
	{
		return puntosNull;
	}

	/**
	 * Method 'getTarjetasAm'
	 * 
	 * @return int
	 */
	public int getTarjetasAm()
	{
		return tarjetasAm;
	}

	/**
	 * Method 'setTarjetasAm'
	 * 
	 * @param tarjetasAm
	 */
	public void setTarjetasAm(int tarjetasAm)
	{
		this.tarjetasAm = tarjetasAm;
		this.tarjetasAmNull = false;
	}

	/**
	 * Method 'setTarjetasAmNull'
	 * 
	 * @param value
	 */
	public void setTarjetasAmNull(boolean value)
	{
		this.tarjetasAmNull = value;
	}

	/**
	 * Method 'isTarjetasAmNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarjetasAmNull()
	{
		return tarjetasAmNull;
	}

	/**
	 * Method 'getTarjetasRo'
	 * 
	 * @return int
	 */
	public int getTarjetasRo()
	{
		return tarjetasRo;
	}

	/**
	 * Method 'setTarjetasRo'
	 * 
	 * @param tarjetasRo
	 */
	public void setTarjetasRo(int tarjetasRo)
	{
		this.tarjetasRo = tarjetasRo;
		this.tarjetasRoNull = false;
	}

	/**
	 * Method 'setTarjetasRoNull'
	 * 
	 * @param value
	 */
	public void setTarjetasRoNull(boolean value)
	{
		this.tarjetasRoNull = value;
	}

	/**
	 * Method 'isTarjetasRoNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarjetasRoNull()
	{
		return tarjetasRoNull;
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
	 * Method 'getPartidoId'
	 * 
	 * @return int
	 */
	public int getPartidoId()
	{
		return partidoId;
	}

	/**
	 * Method 'setPartidoId'
	 * 
	 * @param partidoId
	 */
	public void setPartidoId(int partidoId)
	{
		this.partidoId = partidoId;
		this.partidoIdNull = false;
	}

	/**
	 * Method 'setPartidoIdNull'
	 * 
	 * @param value
	 */
	public void setPartidoIdNull(boolean value)
	{
		this.partidoIdNull = value;
	}

	/**
	 * Method 'isPartidoIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isPartidoIdNull()
	{
		return partidoIdNull;
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
		
		if (!(_other instanceof EstadisticasJugador)) {
			return false;
		}
		
		final EstadisticasJugador _cast = (EstadisticasJugador) _other;
		if (goles != _cast.goles) {
			return false;
		}
		
		if (golesNull != _cast.golesNull) {
			return false;
		}
		
		if (puntos != _cast.puntos) {
			return false;
		}
		
		if (puntosNull != _cast.puntosNull) {
			return false;
		}
		
		if (tarjetasAm != _cast.tarjetasAm) {
			return false;
		}
		
		if (tarjetasAmNull != _cast.tarjetasAmNull) {
			return false;
		}
		
		if (tarjetasRo != _cast.tarjetasRo) {
			return false;
		}
		
		if (tarjetasRoNull != _cast.tarjetasRoNull) {
			return false;
		}
		
		if (idJ != _cast.idJ) {
			return false;
		}
		
		if (idJNull != _cast.idJNull) {
			return false;
		}
		
		if (partidoId != _cast.partidoId) {
			return false;
		}
		
		if (partidoIdNull != _cast.partidoIdNull) {
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
		_hashCode = 29 * _hashCode + goles;
		_hashCode = 29 * _hashCode + (golesNull ? 1 : 0);
		_hashCode = 29 * _hashCode + puntos;
		_hashCode = 29 * _hashCode + (puntosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + tarjetasAm;
		_hashCode = 29 * _hashCode + (tarjetasAmNull ? 1 : 0);
		_hashCode = 29 * _hashCode + tarjetasRo;
		_hashCode = 29 * _hashCode + (tarjetasRoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idJ;
		_hashCode = 29 * _hashCode + (idJNull ? 1 : 0);
		_hashCode = 29 * _hashCode + partidoId;
		_hashCode = 29 * _hashCode + (partidoIdNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.EstadisticasJugador: " );
		ret.append( "goles=" + goles );
		ret.append( ", puntos=" + puntos );
		ret.append( ", tarjetasAm=" + tarjetasAm );
		ret.append( ", tarjetasRo=" + tarjetasRo );
		ret.append( ", idJ=" + idJ );
		ret.append( ", partidoId=" + partidoId );
		return ret.toString();
	}

}
