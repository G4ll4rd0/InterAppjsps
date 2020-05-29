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

public class VwPartidos implements Serializable
{
	/** 
	 * This attribute maps to the column partido_id in the vw_partidos table.
	 */
	protected int partidoId;

	/** 
	 * This attribute maps to the column cancha_id in the vw_partidos table.
	 */
	protected int canchaId;

	/** 
	 * This attribute maps to the column local_equipo_id in the vw_partidos table.
	 */
	protected int localEquipoId;

	/** 
	 * This attribute maps to the column local_delegacion_id in the vw_partidos table.
	 */
	protected int localDelegacionId;

	/** 
	 * This attribute maps to the column visitante_equipo_id in the vw_partidos table.
	 */
	protected int visitanteEquipoId;

	/** 
	 * This attribute maps to the column visitante_delegacion_id in the vw_partidos table.
	 */
	protected int visitanteDelegacionId;

	/** 
	 * This attribute maps to the column deporte_id in the vw_partidos table.
	 */
	protected int deporteId;

	/** 
	 * This attribute maps to the column seccion_id in the vw_partidos table.
	 */
	protected int seccionId;

	/** 
	 * This attribute maps to the column rama_id in the vw_partidos table.
	 */
	protected int ramaId;

	/** 
	 * This attribute maps to the column fecha in the vw_partidos table.
	 */
	protected Date fecha;

	/** 
	 * This attribute maps to the column hora in the vw_partidos table.
	 */
	protected Date hora;

	/** 
	 * This attribute maps to the column local_codigo_delegacion in the vw_partidos table.
	 */
	protected String localCodigoDelegacion;

	/** 
	 * This attribute maps to the column local_nombre_delegacion in the vw_partidos table.
	 */
	protected String localNombreDelegacion;

	/** 
	 * This attribute maps to the column visitante_codigo_delegacion in the vw_partidos table.
	 */
	protected String visitanteCodigoDelegacion;

	/** 
	 * This attribute maps to the column visitante_nombre_delegacion in the vw_partidos table.
	 */
	protected String visitanteNombreDelegacion;

	/** 
	 * This attribute maps to the column res_e1 in the vw_partidos table.
	 */
	protected int resE1;

	/** 
	 * This attribute represents whether the primitive attribute resE1 is null.
	 */
	protected boolean resE1Null = true;

	/** 
	 * This attribute maps to the column res_e2 in the vw_partidos table.
	 */
	protected int resE2;

	/** 
	 * This attribute represents whether the primitive attribute resE2 is null.
	 */
	protected boolean resE2Null = true;

	/** 
	 * This attribute maps to the column descripcion_cancha in the vw_partidos table.
	 */
	protected String descripcionCancha;

	/** 
	 * This attribute maps to the column descripcion_deporte in the vw_partidos table.
	 */
	protected String descripcionDeporte;

	/** 
	 * This attribute maps to the column descripcion_seccion in the vw_partidos table.
	 */
	protected String descripcionSeccion;

	/** 
	 * This attribute maps to the column descripcion_rama in the vw_partidos table.
	 */
	protected String descripcionRama;

	/** 
	 * This attribute maps to the column ya_jugado in the vw_partidos table.
	 */
	protected int yaJugado;

	/**
	 * Method 'VwPartidos'
	 * 
	 */
	public VwPartidos()
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
	 * Method 'getCanchaId'
	 * 
	 * @return int
	 */
	public int getCanchaId()
	{
		return canchaId;
	}

	/**
	 * Method 'setCanchaId'
	 * 
	 * @param canchaId
	 */
	public void setCanchaId(int canchaId)
	{
		this.canchaId = canchaId;
	}

	/**
	 * Method 'getLocalEquipoId'
	 * 
	 * @return int
	 */
	public int getLocalEquipoId()
	{
		return localEquipoId;
	}

	/**
	 * Method 'setLocalEquipoId'
	 * 
	 * @param localEquipoId
	 */
	public void setLocalEquipoId(int localEquipoId)
	{
		this.localEquipoId = localEquipoId;
	}

	/**
	 * Method 'getLocalDelegacionId'
	 * 
	 * @return int
	 */
	public int getLocalDelegacionId()
	{
		return localDelegacionId;
	}

	/**
	 * Method 'setLocalDelegacionId'
	 * 
	 * @param localDelegacionId
	 */
	public void setLocalDelegacionId(int localDelegacionId)
	{
		this.localDelegacionId = localDelegacionId;
	}

	/**
	 * Method 'getVisitanteEquipoId'
	 * 
	 * @return int
	 */
	public int getVisitanteEquipoId()
	{
		return visitanteEquipoId;
	}

	/**
	 * Method 'setVisitanteEquipoId'
	 * 
	 * @param visitanteEquipoId
	 */
	public void setVisitanteEquipoId(int visitanteEquipoId)
	{
		this.visitanteEquipoId = visitanteEquipoId;
	}

	/**
	 * Method 'getVisitanteDelegacionId'
	 * 
	 * @return int
	 */
	public int getVisitanteDelegacionId()
	{
		return visitanteDelegacionId;
	}

	/**
	 * Method 'setVisitanteDelegacionId'
	 * 
	 * @param visitanteDelegacionId
	 */
	public void setVisitanteDelegacionId(int visitanteDelegacionId)
	{
		this.visitanteDelegacionId = visitanteDelegacionId;
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
	 * Method 'getLocalCodigoDelegacion'
	 * 
	 * @return String
	 */
	public String getLocalCodigoDelegacion()
	{
		return localCodigoDelegacion;
	}

	/**
	 * Method 'setLocalCodigoDelegacion'
	 * 
	 * @param localCodigoDelegacion
	 */
	public void setLocalCodigoDelegacion(String localCodigoDelegacion)
	{
		this.localCodigoDelegacion = localCodigoDelegacion;
	}

	/**
	 * Method 'getLocalNombreDelegacion'
	 * 
	 * @return String
	 */
	public String getLocalNombreDelegacion()
	{
		return localNombreDelegacion;
	}

	/**
	 * Method 'setLocalNombreDelegacion'
	 * 
	 * @param localNombreDelegacion
	 */
	public void setLocalNombreDelegacion(String localNombreDelegacion)
	{
		this.localNombreDelegacion = localNombreDelegacion;
	}

	/**
	 * Method 'getVisitanteCodigoDelegacion'
	 * 
	 * @return String
	 */
	public String getVisitanteCodigoDelegacion()
	{
		return visitanteCodigoDelegacion;
	}

	/**
	 * Method 'setVisitanteCodigoDelegacion'
	 * 
	 * @param visitanteCodigoDelegacion
	 */
	public void setVisitanteCodigoDelegacion(String visitanteCodigoDelegacion)
	{
		this.visitanteCodigoDelegacion = visitanteCodigoDelegacion;
	}

	/**
	 * Method 'getVisitanteNombreDelegacion'
	 * 
	 * @return String
	 */
	public String getVisitanteNombreDelegacion()
	{
		return visitanteNombreDelegacion;
	}

	/**
	 * Method 'setVisitanteNombreDelegacion'
	 * 
	 * @param visitanteNombreDelegacion
	 */
	public void setVisitanteNombreDelegacion(String visitanteNombreDelegacion)
	{
		this.visitanteNombreDelegacion = visitanteNombreDelegacion;
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
	 * @return int
	 */
	public int getResE2()
	{
		return resE2;
	}

	/**
	 * Method 'setResE2'
	 * 
	 * @param resE2
	 */
	public void setResE2(int resE2)
	{
		this.resE2 = resE2;
		this.resE2Null = false;
	}

	/**
	 * Method 'setResE2Null'
	 * 
	 * @param value
	 */
	public void setResE2Null(boolean value)
	{
		this.resE2Null = value;
	}

	/**
	 * Method 'isResE2Null'
	 * 
	 * @return boolean
	 */
	public boolean isResE2Null()
	{
		return resE2Null;
	}

	/**
	 * Method 'getDescripcionCancha'
	 * 
	 * @return String
	 */
	public String getDescripcionCancha()
	{
		return descripcionCancha;
	}

	/**
	 * Method 'setDescripcionCancha'
	 * 
	 * @param descripcionCancha
	 */
	public void setDescripcionCancha(String descripcionCancha)
	{
		this.descripcionCancha = descripcionCancha;
	}

	/**
	 * Method 'getDescripcionDeporte'
	 * 
	 * @return String
	 */
	public String getDescripcionDeporte()
	{
		return descripcionDeporte;
	}

	/**
	 * Method 'setDescripcionDeporte'
	 * 
	 * @param descripcionDeporte
	 */
	public void setDescripcionDeporte(String descripcionDeporte)
	{
		this.descripcionDeporte = descripcionDeporte;
	}

	/**
	 * Method 'getDescripcionSeccion'
	 * 
	 * @return String
	 */
	public String getDescripcionSeccion()
	{
		return descripcionSeccion;
	}

	/**
	 * Method 'setDescripcionSeccion'
	 * 
	 * @param descripcionSeccion
	 */
	public void setDescripcionSeccion(String descripcionSeccion)
	{
		this.descripcionSeccion = descripcionSeccion;
	}

	/**
	 * Method 'getDescripcionRama'
	 * 
	 * @return String
	 */
	public String getDescripcionRama()
	{
		return descripcionRama;
	}

	/**
	 * Method 'setDescripcionRama'
	 * 
	 * @param descripcionRama
	 */
	public void setDescripcionRama(String descripcionRama)
	{
		this.descripcionRama = descripcionRama;
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
		
		if (!(_other instanceof VwPartidos)) {
			return false;
		}
		
		final VwPartidos _cast = (VwPartidos) _other;
		if (partidoId != _cast.partidoId) {
			return false;
		}
		
		if (canchaId != _cast.canchaId) {
			return false;
		}
		
		if (localEquipoId != _cast.localEquipoId) {
			return false;
		}
		
		if (localDelegacionId != _cast.localDelegacionId) {
			return false;
		}
		
		if (visitanteEquipoId != _cast.visitanteEquipoId) {
			return false;
		}
		
		if (visitanteDelegacionId != _cast.visitanteDelegacionId) {
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
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (hora == null ? _cast.hora != hora : !hora.equals( _cast.hora )) {
			return false;
		}
		
		if (localCodigoDelegacion == null ? _cast.localCodigoDelegacion != localCodigoDelegacion : !localCodigoDelegacion.equals( _cast.localCodigoDelegacion )) {
			return false;
		}
		
		if (localNombreDelegacion == null ? _cast.localNombreDelegacion != localNombreDelegacion : !localNombreDelegacion.equals( _cast.localNombreDelegacion )) {
			return false;
		}
		
		if (visitanteCodigoDelegacion == null ? _cast.visitanteCodigoDelegacion != visitanteCodigoDelegacion : !visitanteCodigoDelegacion.equals( _cast.visitanteCodigoDelegacion )) {
			return false;
		}
		
		if (visitanteNombreDelegacion == null ? _cast.visitanteNombreDelegacion != visitanteNombreDelegacion : !visitanteNombreDelegacion.equals( _cast.visitanteNombreDelegacion )) {
			return false;
		}
		
		if (resE1 != _cast.resE1) {
			return false;
		}
		
		if (resE1Null != _cast.resE1Null) {
			return false;
		}
		
		if (resE2 != _cast.resE2) {
			return false;
		}
		
		if (resE2Null != _cast.resE2Null) {
			return false;
		}
		
		if (descripcionCancha == null ? _cast.descripcionCancha != descripcionCancha : !descripcionCancha.equals( _cast.descripcionCancha )) {
			return false;
		}
		
		if (descripcionDeporte == null ? _cast.descripcionDeporte != descripcionDeporte : !descripcionDeporte.equals( _cast.descripcionDeporte )) {
			return false;
		}
		
		if (descripcionSeccion == null ? _cast.descripcionSeccion != descripcionSeccion : !descripcionSeccion.equals( _cast.descripcionSeccion )) {
			return false;
		}
		
		if (descripcionRama == null ? _cast.descripcionRama != descripcionRama : !descripcionRama.equals( _cast.descripcionRama )) {
			return false;
		}
		
		if (yaJugado != _cast.yaJugado) {
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
		_hashCode = 29 * _hashCode + canchaId;
		_hashCode = 29 * _hashCode + localEquipoId;
		_hashCode = 29 * _hashCode + localDelegacionId;
		_hashCode = 29 * _hashCode + visitanteEquipoId;
		_hashCode = 29 * _hashCode + visitanteDelegacionId;
		_hashCode = 29 * _hashCode + deporteId;
		_hashCode = 29 * _hashCode + seccionId;
		_hashCode = 29 * _hashCode + ramaId;
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		if (hora != null) {
			_hashCode = 29 * _hashCode + hora.hashCode();
		}
		
		if (localCodigoDelegacion != null) {
			_hashCode = 29 * _hashCode + localCodigoDelegacion.hashCode();
		}
		
		if (localNombreDelegacion != null) {
			_hashCode = 29 * _hashCode + localNombreDelegacion.hashCode();
		}
		
		if (visitanteCodigoDelegacion != null) {
			_hashCode = 29 * _hashCode + visitanteCodigoDelegacion.hashCode();
		}
		
		if (visitanteNombreDelegacion != null) {
			_hashCode = 29 * _hashCode + visitanteNombreDelegacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + resE1;
		_hashCode = 29 * _hashCode + (resE1Null ? 1 : 0);
		_hashCode = 29 * _hashCode + resE2;
		_hashCode = 29 * _hashCode + (resE2Null ? 1 : 0);
		if (descripcionCancha != null) {
			_hashCode = 29 * _hashCode + descripcionCancha.hashCode();
		}
		
		if (descripcionDeporte != null) {
			_hashCode = 29 * _hashCode + descripcionDeporte.hashCode();
		}
		
		if (descripcionSeccion != null) {
			_hashCode = 29 * _hashCode + descripcionSeccion.hashCode();
		}
		
		if (descripcionRama != null) {
			_hashCode = 29 * _hashCode + descripcionRama.hashCode();
		}
		
		_hashCode = 29 * _hashCode + yaJugado;
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
		ret.append( "org.anahuac.garibaldi.fs.dto.VwPartidos: " );
		ret.append( "partidoId=" + partidoId );
		ret.append( ", canchaId=" + canchaId );
		ret.append( ", localEquipoId=" + localEquipoId );
		ret.append( ", localDelegacionId=" + localDelegacionId );
		ret.append( ", visitanteEquipoId=" + visitanteEquipoId );
		ret.append( ", visitanteDelegacionId=" + visitanteDelegacionId );
		ret.append( ", deporteId=" + deporteId );
		ret.append( ", seccionId=" + seccionId );
		ret.append( ", ramaId=" + ramaId );
		ret.append( ", fecha=" + fecha );
		ret.append( ", hora=" + hora );
		ret.append( ", localCodigoDelegacion=" + localCodigoDelegacion );
		ret.append( ", localNombreDelegacion=" + localNombreDelegacion );
		ret.append( ", visitanteCodigoDelegacion=" + visitanteCodigoDelegacion );
		ret.append( ", visitanteNombreDelegacion=" + visitanteNombreDelegacion );
		ret.append( ", resE1=" + resE1 );
		ret.append( ", resE2=" + resE2 );
		ret.append( ", descripcionCancha=" + descripcionCancha );
		ret.append( ", descripcionDeporte=" + descripcionDeporte );
		ret.append( ", descripcionSeccion=" + descripcionSeccion );
		ret.append( ", descripcionRama=" + descripcionRama );
		ret.append( ", yaJugado=" + yaJugado );
		return ret.toString();
	}

}
