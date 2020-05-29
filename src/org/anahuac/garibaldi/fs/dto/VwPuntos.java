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

public class VwPuntos implements Serializable
{
	/** 
	 * This attribute maps to the column equipo_id in the vw_puntos table.
	 */
	protected int equipoId;

	/** 
	 * This attribute represents whether the primitive attribute equipoId is null.
	 */
	protected boolean equipoIdNull = true;

	/** 
	 * This attribute maps to the column delegaciones_id in the vw_puntos table.
	 */
	protected int delegacionesId;

	/** 
	 * This attribute maps to the column deporte_id in the vw_puntos table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column seccion_id in the vw_puntos table.
	 */
	protected int seccionId;

	/** 
	 * This attribute maps to the column rama_id in the vw_puntos table.
	 */
	protected int ramaId;

	/** 
	 * This attribute maps to the column codigo in the vw_puntos table.
	 */
	protected String codigo;

	/** 
	 * This attribute maps to the column nombre in the vw_puntos table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column deporte in the vw_puntos table.
	 */
	protected String deporte;

	/** 
	 * This attribute maps to the column seccion in the vw_puntos table.
	 */
	protected String seccion;

	/** 
	 * This attribute maps to the column rama in the vw_puntos table.
	 */
	protected String rama;

	/** 
	 * This attribute maps to the column puntos in the vw_puntos table.
	 */
	protected long puntos;

	/** 
	 * This attribute represents whether the primitive attribute puntos is null.
	 */
	protected boolean puntosNull = true;

	/** 
	 * This attribute maps to the column pj in the vw_puntos table.
	 */
	protected long pj;

	/** 
	 * This attribute represents whether the primitive attribute pj is null.
	 */
	protected boolean pjNull = true;

	/** 
	 * This attribute maps to the column pg in the vw_puntos table.
	 */
	protected long pg;

	/** 
	 * This attribute represents whether the primitive attribute pg is null.
	 */
	protected boolean pgNull = true;

	/** 
	 * This attribute maps to the column pe in the vw_puntos table.
	 */
	protected long pe;

	/** 
	 * This attribute represents whether the primitive attribute pe is null.
	 */
	protected boolean peNull = true;

	/** 
	 * This attribute maps to the column pp in the vw_puntos table.
	 */
	protected long pp;

	/** 
	 * This attribute represents whether the primitive attribute pp is null.
	 */
	protected boolean ppNull = true;

	/** 
	 * This attribute maps to the column gf in the vw_puntos table.
	 */
	protected long gf;

	/** 
	 * This attribute represents whether the primitive attribute gf is null.
	 */
	protected boolean gfNull = true;

	/** 
	 * This attribute maps to the column gc in the vw_puntos table.
	 */
	protected long gc;

	/** 
	 * This attribute represents whether the primitive attribute gc is null.
	 */
	protected boolean gcNull = true;

	/** 
	 * This attribute maps to the column diff in the vw_puntos table.
	 */
	protected long diff;

	/** 
	 * This attribute represents whether the primitive attribute diff is null.
	 */
	protected boolean diffNull = true;

	/**
	 * Method 'VwPuntos'
	 * 
	 */
	public VwPuntos()
	{
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
		this.equipoIdNull = false;
	}

	/**
	 * Method 'setEquipoIdNull'
	 * 
	 * @param value
	 */
	public void setEquipoIdNull(boolean value)
	{
		this.equipoIdNull = value;
	}

	/**
	 * Method 'isEquipoIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isEquipoIdNull()
	{
		return equipoIdNull;
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
	 * Method 'getPuntos'
	 * 
	 * @return long
	 */
	public long getPuntos()
	{
		return puntos;
	}

	/**
	 * Method 'setPuntos'
	 * 
	 * @param puntos
	 */
	public void setPuntos(long puntos)
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
	 * Method 'getPj'
	 * 
	 * @return long
	 */
	public long getPj()
	{
		return pj;
	}

	/**
	 * Method 'setPj'
	 * 
	 * @param pj
	 */
	public void setPj(long pj)
	{
		this.pj = pj;
		this.pjNull = false;
	}

	/**
	 * Method 'setPjNull'
	 * 
	 * @param value
	 */
	public void setPjNull(boolean value)
	{
		this.pjNull = value;
	}

	/**
	 * Method 'isPjNull'
	 * 
	 * @return boolean
	 */
	public boolean isPjNull()
	{
		return pjNull;
	}

	/**
	 * Method 'getPg'
	 * 
	 * @return long
	 */
	public long getPg()
	{
		return pg;
	}

	/**
	 * Method 'setPg'
	 * 
	 * @param pg
	 */
	public void setPg(long pg)
	{
		this.pg = pg;
		this.pgNull = false;
	}

	/**
	 * Method 'setPgNull'
	 * 
	 * @param value
	 */
	public void setPgNull(boolean value)
	{
		this.pgNull = value;
	}

	/**
	 * Method 'isPgNull'
	 * 
	 * @return boolean
	 */
	public boolean isPgNull()
	{
		return pgNull;
	}

	/**
	 * Method 'getPe'
	 * 
	 * @return long
	 */
	public long getPe()
	{
		return pe;
	}

	/**
	 * Method 'setPe'
	 * 
	 * @param pe
	 */
	public void setPe(long pe)
	{
		this.pe = pe;
		this.peNull = false;
	}

	/**
	 * Method 'setPeNull'
	 * 
	 * @param value
	 */
	public void setPeNull(boolean value)
	{
		this.peNull = value;
	}

	/**
	 * Method 'isPeNull'
	 * 
	 * @return boolean
	 */
	public boolean isPeNull()
	{
		return peNull;
	}

	/**
	 * Method 'getPp'
	 * 
	 * @return long
	 */
	public long getPp()
	{
		return pp;
	}

	/**
	 * Method 'setPp'
	 * 
	 * @param pp
	 */
	public void setPp(long pp)
	{
		this.pp = pp;
		this.ppNull = false;
	}

	/**
	 * Method 'setPpNull'
	 * 
	 * @param value
	 */
	public void setPpNull(boolean value)
	{
		this.ppNull = value;
	}

	/**
	 * Method 'isPpNull'
	 * 
	 * @return boolean
	 */
	public boolean isPpNull()
	{
		return ppNull;
	}

	/**
	 * Method 'getGf'
	 * 
	 * @return long
	 */
	public long getGf()
	{
		return gf;
	}

	/**
	 * Method 'setGf'
	 * 
	 * @param gf
	 */
	public void setGf(long gf)
	{
		this.gf = gf;
		this.gfNull = false;
	}

	/**
	 * Method 'setGfNull'
	 * 
	 * @param value
	 */
	public void setGfNull(boolean value)
	{
		this.gfNull = value;
	}

	/**
	 * Method 'isGfNull'
	 * 
	 * @return boolean
	 */
	public boolean isGfNull()
	{
		return gfNull;
	}

	/**
	 * Method 'getGc'
	 * 
	 * @return long
	 */
	public long getGc()
	{
		return gc;
	}

	/**
	 * Method 'setGc'
	 * 
	 * @param gc
	 */
	public void setGc(long gc)
	{
		this.gc = gc;
		this.gcNull = false;
	}

	/**
	 * Method 'setGcNull'
	 * 
	 * @param value
	 */
	public void setGcNull(boolean value)
	{
		this.gcNull = value;
	}

	/**
	 * Method 'isGcNull'
	 * 
	 * @return boolean
	 */
	public boolean isGcNull()
	{
		return gcNull;
	}

	/**
	 * Method 'getDiff'
	 * 
	 * @return long
	 */
	public long getDiff()
	{
		return diff;
	}

	/**
	 * Method 'setDiff'
	 * 
	 * @param diff
	 */
	public void setDiff(long diff)
	{
		this.diff = diff;
		this.diffNull = false;
	}

	/**
	 * Method 'setDiffNull'
	 * 
	 * @param value
	 */
	public void setDiffNull(boolean value)
	{
		this.diffNull = value;
	}

	/**
	 * Method 'isDiffNull'
	 * 
	 * @return boolean
	 */
	public boolean isDiffNull()
	{
		return diffNull;
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
		
		if (!(_other instanceof VwPuntos)) {
			return false;
		}
		
		final VwPuntos _cast = (VwPuntos) _other;
		if (equipoId != _cast.equipoId) {
			return false;
		}
		
		if (equipoIdNull != _cast.equipoIdNull) {
			return false;
		}
		
		if (delegacionesId != _cast.delegacionesId) {
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
		
		if (codigo == null ? _cast.codigo != codigo : !codigo.equals( _cast.codigo )) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
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
		
		if (puntos != _cast.puntos) {
			return false;
		}
		
		if (puntosNull != _cast.puntosNull) {
			return false;
		}
		
		if (pj != _cast.pj) {
			return false;
		}
		
		if (pjNull != _cast.pjNull) {
			return false;
		}
		
		if (pg != _cast.pg) {
			return false;
		}
		
		if (pgNull != _cast.pgNull) {
			return false;
		}
		
		if (pe != _cast.pe) {
			return false;
		}
		
		if (peNull != _cast.peNull) {
			return false;
		}
		
		if (pp != _cast.pp) {
			return false;
		}
		
		if (ppNull != _cast.ppNull) {
			return false;
		}
		
		if (gf != _cast.gf) {
			return false;
		}
		
		if (gfNull != _cast.gfNull) {
			return false;
		}
		
		if (gc != _cast.gc) {
			return false;
		}
		
		if (gcNull != _cast.gcNull) {
			return false;
		}
		
		if (diff != _cast.diff) {
			return false;
		}
		
		if (diffNull != _cast.diffNull) {
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
		_hashCode = 29 * _hashCode + equipoId;
		_hashCode = 29 * _hashCode + (equipoIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + delegacionesId;
		_hashCode = 29 * _hashCode + deporteId;
		_hashCode = 29 * _hashCode + seccionId;
		_hashCode = 29 * _hashCode + ramaId;
		if (codigo != null) {
			_hashCode = 29 * _hashCode + codigo.hashCode();
		}
		
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
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
		
		_hashCode = 29 * _hashCode + (int) (puntos ^ (puntos >>> 32));
		_hashCode = 29 * _hashCode + (puntosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pj ^ (pj >>> 32));
		_hashCode = 29 * _hashCode + (pjNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pg ^ (pg >>> 32));
		_hashCode = 29 * _hashCode + (pgNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pe ^ (pe >>> 32));
		_hashCode = 29 * _hashCode + (peNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pp ^ (pp >>> 32));
		_hashCode = 29 * _hashCode + (ppNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (gf ^ (gf >>> 32));
		_hashCode = 29 * _hashCode + (gfNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (gc ^ (gc >>> 32));
		_hashCode = 29 * _hashCode + (gcNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (diff ^ (diff >>> 32));
		_hashCode = 29 * _hashCode + (diffNull ? 1 : 0);
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwPuntos: " );
		ret.append( "equipoId=" + equipoId );
		ret.append( ", delegacionesId=" + delegacionesId );
		ret.append( ", deporteId=" + deporteId );
		ret.append( ", seccionId=" + seccionId );
		ret.append( ", ramaId=" + ramaId );
		ret.append( ", codigo=" + codigo );
		ret.append( ", nombre=" + nombre );
		ret.append( ", deporte=" + deporte );
		ret.append( ", seccion=" + seccion );
		ret.append( ", rama=" + rama );
		ret.append( ", puntos=" + puntos );
		ret.append( ", pj=" + pj );
		ret.append( ", pg=" + pg );
		ret.append( ", pe=" + pe );
		ret.append( ", pp=" + pp );
		ret.append( ", gf=" + gf );
		ret.append( ", gc=" + gc );
		ret.append( ", diff=" + diff );
		return ret.toString();
	}

}
