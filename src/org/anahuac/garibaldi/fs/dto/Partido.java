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
import java.util.Date;

public class Partido implements Serializable
{
	/** 
	 * This attribute maps to the column partido_id in the partido table.
	 */
	protected int partidoId;

	/** 
	 * This attribute maps to the column Fecha in the partido table.
	 */
	protected Date fecha;

	/** 
	 * This attribute maps to the column ID_Eq2 in the partido table.
	 */
	protected int idEq2;

	/** 
	 * This attribute maps to the column Res_E1 in the partido table.
	 */
	protected int resE1;

	/** 
	 * This attribute represents whether the primitive attribute resE1 is null.
	 */
	protected boolean resE1Null = true;

	/** 
	 * This attribute maps to the column Res_E2 in the partido table.
	 */
	protected String resE2;

	/** 
	 * This attribute maps to the column ID_C in the partido table.
	 */
	protected int idC;

	/** 
	 * This attribute maps to the column ID_Eq in the partido table.
	 */
	protected int idEq;

	/** 
	 * This attribute maps to the column YaJugado in the partido table.
	 */
	protected int yaJugado;

	/** 
	 * This attribute maps to the column Hora in the partido table.
	 */
	protected Date hora;

	/** 
	 * This attribute maps to the column ronda_id in the partido table.
	 */
	protected int rondaId;

	/**
	 * Method 'Partido'
	 * 
	 */
	public Partido()
	{
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
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	/**
	 * Method 'getIdEq2'
	 * 
	 * @return int
	 */
	public int getIdEq2()
	{
		return idEq2;
	}

	/**
	 * Method 'setIdEq2'
	 * 
	 * @param idEq2
	 */
	public void setIdEq2(int idEq2)
	{
		this.idEq2 = idEq2;
	}

	/**
	 * Method 'getResE1'
	 * 
	 * @return int
	 */
	public int getResE1()
	{
		return resE1;
	}

	/**
	 * Method 'setResE1'
	 * 
	 * @param resE1
	 */
	public void setResE1(int resE1)
	{
		this.resE1 = resE1;
		this.resE1Null = false;
	}

	/**
	 * Method 'setResE1Null'
	 * 
	 * @param value
	 */
	public void setResE1Null(boolean value)
	{
		this.resE1Null = value;
	}

	/**
	 * Method 'isResE1Null'
	 * 
	 * @return boolean
	 */
	public boolean isResE1Null()
	{
		return resE1Null;
	}

	/**
	 * Method 'getResE2'
	 * 
	 * @return String
	 */
	public String getResE2()
	{
		return resE2;
	}

	/**
	 * Method 'setResE2'
	 * 
	 * @param resE2
	 */
	public void setResE2(String resE2)
	{
		this.resE2 = resE2;
	}

	/**
	 * Method 'getIdC'
	 * 
	 * @return int
	 */
	public int getIdC()
	{
		return idC;
	}

	/**
	 * Method 'setIdC'
	 * 
	 * @param idC
	 */
	public void setIdC(int idC)
	{
		this.idC = idC;
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
	}

	/**
	 * Method 'getYaJugado'
	 * 
	 * @return int
	 */
	public int getYaJugado()
	{
		return yaJugado;
	}

	/**
	 * Method 'setYaJugado'
	 * 
	 * @param yaJugado
	 */
	public void setYaJugado(int yaJugado)
	{
		this.yaJugado = yaJugado;
	}

	/**
	 * Method 'getHora'
	 * 
	 * @return Date
	 */
	public Date getHora()
	{
		return hora;
	}

	/**
	 * Method 'setHora'
	 * 
	 * @param hora
	 */
	public void setHora(Date hora)
	{
		this.hora = hora;
	}

	/**
	 * Method 'getRondaId'
	 * 
	 * @return int
	 */
	public int getRondaId()
	{
		return rondaId;
	}

	/**
	 * Method 'setRondaId'
	 * 
	 * @param rondaId
	 */
	public void setRondaId(int rondaId)
	{
		this.rondaId = rondaId;
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
		
		if (!(_other instanceof Partido)) {
			return false;
		}
		
		final Partido _cast = (Partido) _other;
		if (partidoId != _cast.partidoId) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (idEq2 != _cast.idEq2) {
			return false;
		}
		
		if (resE1 != _cast.resE1) {
			return false;
		}
		
		if (resE1Null != _cast.resE1Null) {
			return false;
		}
		
		if (resE2 == null ? _cast.resE2 != resE2 : !resE2.equals( _cast.resE2 )) {
			return false;
		}
		
		if (idC != _cast.idC) {
			return false;
		}
		
		if (idEq != _cast.idEq) {
			return false;
		}
		
		if (yaJugado != _cast.yaJugado) {
			return false;
		}
		
		if (hora == null ? _cast.hora != hora : !hora.equals( _cast.hora )) {
			return false;
		}
		
		if (rondaId != _cast.rondaId) {
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
		_hashCode = 29 * _hashCode + partidoId;
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idEq2;
		_hashCode = 29 * _hashCode + resE1;
		_hashCode = 29 * _hashCode + (resE1Null ? 1 : 0);
		if (resE2 != null) {
			_hashCode = 29 * _hashCode + resE2.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idC;
		_hashCode = 29 * _hashCode + idEq;
		_hashCode = 29 * _hashCode + yaJugado;
		if (hora != null) {
			_hashCode = 29 * _hashCode + hora.hashCode();
		}
		
		_hashCode = 29 * _hashCode + rondaId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PartidoPk
	 */
	public PartidoPk createPk()
	{
		return new PartidoPk(partidoId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Partido: " );
		ret.append( "partidoId=" + partidoId );
		ret.append( ", fecha=" + fecha );
		ret.append( ", idEq2=" + idEq2 );
		ret.append( ", resE1=" + resE1 );
		ret.append( ", resE2=" + resE2 );
		ret.append( ", idC=" + idC );
		ret.append( ", idEq=" + idEq );
		ret.append( ", yaJugado=" + yaJugado );
		ret.append( ", hora=" + hora );
		ret.append( ", rondaId=" + rondaId );
		return ret.toString();
	}

}
