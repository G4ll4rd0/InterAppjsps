/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwEstadisticasDao
{
	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria ''.
	 */
	public VwEstadisticas[] findAll() throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'id_j = :idJ'.
	 */
	public VwEstadisticas[] findWhereIdJEquals(int idJ) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'equipo_id = :equipoId'.
	 */
	public VwEstadisticas[] findWhereEquipoIdEquals(int equipoId) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'delegaciones_id = :delegacionesId'.
	 */
	public VwEstadisticas[] findWhereDelegacionesIdEquals(int delegacionesId) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwEstadisticas[] findWhereDeporteIdEquals(int deporteId) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwEstadisticas[] findWhereRamaIdEquals(int ramaId) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwEstadisticas[] findWhereSeccionIdEquals(int seccionId) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'numero = :numero'.
	 */
	public VwEstadisticas[] findWhereNumeroEquals(int numero) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'nombre = :nombre'.
	 */
	public VwEstadisticas[] findWhereNombreEquals(String nombre) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'primer_apellido = :primerApellido'.
	 */
	public VwEstadisticas[] findWherePrimerApellidoEquals(String primerApellido) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'segundo_apellido = :segundoApellido'.
	 */
	public VwEstadisticas[] findWhereSegundoApellidoEquals(String segundoApellido) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'goles = :goles'.
	 */
	public VwEstadisticas[] findWhereGolesEquals(long goles) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'tarjetas_amarillas = :tarjetasAmarillas'.
	 */
	public VwEstadisticas[] findWhereTarjetasAmarillasEquals(long tarjetasAmarillas) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'tarjetas_rojas = :tarjetasRojas'.
	 */
	public VwEstadisticas[] findWhereTarjetasRojasEquals(long tarjetasRojas) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'codigo = :codigo'.
	 */
	public VwEstadisticas[] findWhereCodigoEquals(String codigo) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'delegacion = :delegacion'.
	 */
	public VwEstadisticas[] findWhereDelegacionEquals(String delegacion) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'deporte = :deporte'.
	 */
	public VwEstadisticas[] findWhereDeporteEquals(String deporte) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'seccion = :seccion'.
	 */
	public VwEstadisticas[] findWhereSeccionEquals(String seccion) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the criteria 'rama = :rama'.
	 */
	public VwEstadisticas[] findWhereRamaEquals(String rama) throws VwEstadisticasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_estadisticas table that match the specified arbitrary SQL statement
	 */
	public VwEstadisticas[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwEstadisticasDaoException;

	/** 
	 * Returns all rows from the vw_estadisticas table that match the specified arbitrary SQL statement
	 */
	public VwEstadisticas[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwEstadisticasDaoException;

}
