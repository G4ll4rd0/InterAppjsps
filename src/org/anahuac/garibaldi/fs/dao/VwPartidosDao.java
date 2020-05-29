/*
 * This source file was generated to Arke Soluciones
 * 
 * For more information please visit http://www.arkesol.mx
 * Author: RG
 */

package org.anahuac.garibaldi.fs.dao;

import java.util.Date;
import org.anahuac.garibaldi.fs.dto.*;
import org.anahuac.garibaldi.fs.exceptions.*;

public interface VwPartidosDao
{
	/** 
	 * Returns all rows from the vw_partidos table that match the criteria ''.
	 */
	public VwPartidos[] findAll() throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'partido_id = :partidoId'.
	 */
	public VwPartidos[] findWherePartidoIdEquals(int partidoId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'cancha_id = :canchaId'.
	 */
	public VwPartidos[] findWhereCanchaIdEquals(int canchaId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_equipo_id = :localEquipoId'.
	 */
	public VwPartidos[] findWhereLocalEquipoIdEquals(int localEquipoId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_delegacion_id = :localDelegacionId'.
	 */
	public VwPartidos[] findWhereLocalDelegacionIdEquals(int localDelegacionId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_equipo_id = :visitanteEquipoId'.
	 */
	public VwPartidos[] findWhereVisitanteEquipoIdEquals(int visitanteEquipoId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_delegacion_id = :visitanteDelegacionId'.
	 */
	public VwPartidos[] findWhereVisitanteDelegacionIdEquals(int visitanteDelegacionId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'deporte_id = :deporteId'.
	 */
	public VwPartidos[] findWhereDeporteIdEquals(int deporteId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'seccion_id = :seccionId'.
	 */
	public VwPartidos[] findWhereSeccionIdEquals(int seccionId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'rama_id = :ramaId'.
	 */
	public VwPartidos[] findWhereRamaIdEquals(int ramaId) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'fecha = :fecha'.
	 */
	public VwPartidos[] findWhereFechaEquals(Date fecha) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'hora = :hora'.
	 */
	public VwPartidos[] findWhereHoraEquals(Date hora) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_codigo_delegacion = :localCodigoDelegacion'.
	 */
	public VwPartidos[] findWhereLocalCodigoDelegacionEquals(String localCodigoDelegacion) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'local_nombre_delegacion = :localNombreDelegacion'.
	 */
	public VwPartidos[] findWhereLocalNombreDelegacionEquals(String localNombreDelegacion) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_codigo_delegacion = :visitanteCodigoDelegacion'.
	 */
	public VwPartidos[] findWhereVisitanteCodigoDelegacionEquals(String visitanteCodigoDelegacion) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'visitante_nombre_delegacion = :visitanteNombreDelegacion'.
	 */
	public VwPartidos[] findWhereVisitanteNombreDelegacionEquals(String visitanteNombreDelegacion) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'res_e1 = :resE1'.
	 */
	public VwPartidos[] findWhereResE1Equals(int resE1) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'res_e2 = :resE2'.
	 */
	public VwPartidos[] findWhereResE2Equals(int resE2) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_cancha = :descripcionCancha'.
	 */
	public VwPartidos[] findWhereDescripcionCanchaEquals(String descripcionCancha) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_deporte = :descripcionDeporte'.
	 */
	public VwPartidos[] findWhereDescripcionDeporteEquals(String descripcionDeporte) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_seccion = :descripcionSeccion'.
	 */
	public VwPartidos[] findWhereDescripcionSeccionEquals(String descripcionSeccion) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'descripcion_rama = :descripcionRama'.
	 */
	public VwPartidos[] findWhereDescripcionRamaEquals(String descripcionRama) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the criteria 'ya_jugado = :yaJugado'.
	 */
	public VwPartidos[] findWhereYaJugadoEquals(int yaJugado) throws VwPartidosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vw_partidos table that match the specified arbitrary SQL statement
	 */
	public VwPartidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VwPartidosDaoException;

	/** 
	 * Returns all rows from the vw_partidos table that match the specified arbitrary SQL statement
	 */
	public VwPartidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VwPartidosDaoException;

}
