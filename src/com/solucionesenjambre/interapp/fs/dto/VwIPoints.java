/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dto;

import com.solucionesenjambre.interapp.fs.dao.*;
import com.solucionesenjambre.interapp.fs.factory.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class VwIPoints implements Serializable
{
	/** 
	 * This attribute maps to the column game_id in the vw_i_points table.
	 */
	protected int gameId;

	/** 
	 * This attribute maps to the column team1_id in the vw_i_points table.
	 */
	protected int team1Id;

	/** 
	 * This attribute represents whether the primitive attribute team1Id is null.
	 */
	protected boolean team1IdNull = true;

	/** 
	 * This attribute maps to the column points in the vw_i_points table.
	 */
	protected long points;

	/** 
	 * This attribute represents whether the primitive attribute points is null.
	 */
	protected boolean pointsNull = true;

	/** 
	 * This attribute maps to the column PJ in the vw_i_points table.
	 */
	protected long pj;

	/** 
	 * This attribute maps to the column PG in the vw_i_points table.
	 */
	protected long pg;

	/** 
	 * This attribute represents whether the primitive attribute pg is null.
	 */
	protected boolean pgNull = true;

	/** 
	 * This attribute maps to the column PP in the vw_i_points table.
	 */
	protected long pp;

	/** 
	 * This attribute represents whether the primitive attribute pp is null.
	 */
	protected boolean ppNull = true;

	/** 
	 * This attribute maps to the column PE in the vw_i_points table.
	 */
	protected long pe;

	/** 
	 * This attribute represents whether the primitive attribute pe is null.
	 */
	protected boolean peNull = true;

	/** 
	 * This attribute maps to the column GF in the vw_i_points table.
	 */
	protected int gf;

	/** 
	 * This attribute represents whether the primitive attribute gf is null.
	 */
	protected boolean gfNull = true;

	/** 
	 * This attribute maps to the column GC in the vw_i_points table.
	 */
	protected int gc;

	/** 
	 * This attribute represents whether the primitive attribute gc is null.
	 */
	protected boolean gcNull = true;

	/**
	 * Method 'VwIPoints'
	 * 
	 */
	public VwIPoints()
	{
	}

	/**
	 * Method 'getGameId'
	 * 
	 * @return int
	 */
	public int getGameId()
	{
		return gameId;
	}

	/**
	 * Method 'setGameId'
	 * 
	 * @param gameId
	 */
	public void setGameId(int gameId)
	{
		this.gameId = gameId;
	}

	/**
	 * Method 'getTeam1Id'
	 * 
	 * @return int
	 */
	public int getTeam1Id()
	{
		return team1Id;
	}

	/**
	 * Method 'setTeam1Id'
	 * 
	 * @param team1Id
	 */
	public void setTeam1Id(int team1Id)
	{
		this.team1Id = team1Id;
		this.team1IdNull = false;
	}

	/**
	 * Method 'setTeam1IdNull'
	 * 
	 * @param value
	 */
	public void setTeam1IdNull(boolean value)
	{
		this.team1IdNull = value;
	}

	/**
	 * Method 'isTeam1IdNull'
	 * 
	 * @return boolean
	 */
	public boolean isTeam1IdNull()
	{
		return team1IdNull;
	}

	/**
	 * Method 'getPoints'
	 * 
	 * @return long
	 */
	public long getPoints()
	{
		return points;
	}

	/**
	 * Method 'setPoints'
	 * 
	 * @param points
	 */
	public void setPoints(long points)
	{
		this.points = points;
		this.pointsNull = false;
	}

	/**
	 * Method 'setPointsNull'
	 * 
	 * @param value
	 */
	public void setPointsNull(boolean value)
	{
		this.pointsNull = value;
	}

	/**
	 * Method 'isPointsNull'
	 * 
	 * @return boolean
	 */
	public boolean isPointsNull()
	{
		return pointsNull;
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
	 * Method 'getGf'
	 * 
	 * @return int
	 */
	public int getGf()
	{
		return gf;
	}

	/**
	 * Method 'setGf'
	 * 
	 * @param gf
	 */
	public void setGf(int gf)
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
	 * @return int
	 */
	public int getGc()
	{
		return gc;
	}

	/**
	 * Method 'setGc'
	 * 
	 * @param gc
	 */
	public void setGc(int gc)
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
		
		if (!(_other instanceof VwIPoints)) {
			return false;
		}
		
		final VwIPoints _cast = (VwIPoints) _other;
		if (gameId != _cast.gameId) {
			return false;
		}
		
		if (team1Id != _cast.team1Id) {
			return false;
		}
		
		if (team1IdNull != _cast.team1IdNull) {
			return false;
		}
		
		if (points != _cast.points) {
			return false;
		}
		
		if (pointsNull != _cast.pointsNull) {
			return false;
		}
		
		if (pj != _cast.pj) {
			return false;
		}
		
		if (pg != _cast.pg) {
			return false;
		}
		
		if (pgNull != _cast.pgNull) {
			return false;
		}
		
		if (pp != _cast.pp) {
			return false;
		}
		
		if (ppNull != _cast.ppNull) {
			return false;
		}
		
		if (pe != _cast.pe) {
			return false;
		}
		
		if (peNull != _cast.peNull) {
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
		_hashCode = 29 * _hashCode + gameId;
		_hashCode = 29 * _hashCode + team1Id;
		_hashCode = 29 * _hashCode + (team1IdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (points ^ (points >>> 32));
		_hashCode = 29 * _hashCode + (pointsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pj ^ (pj >>> 32));
		_hashCode = 29 * _hashCode + (int) (pg ^ (pg >>> 32));
		_hashCode = 29 * _hashCode + (pgNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pp ^ (pp >>> 32));
		_hashCode = 29 * _hashCode + (ppNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (pe ^ (pe >>> 32));
		_hashCode = 29 * _hashCode + (peNull ? 1 : 0);
		_hashCode = 29 * _hashCode + gf;
		_hashCode = 29 * _hashCode + (gfNull ? 1 : 0);
		_hashCode = 29 * _hashCode + gc;
		_hashCode = 29 * _hashCode + (gcNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwIPoints: " );
		ret.append( "gameId=" + gameId );
		ret.append( ", team1Id=" + team1Id );
		ret.append( ", points=" + points );
		ret.append( ", pj=" + pj );
		ret.append( ", pg=" + pg );
		ret.append( ", pp=" + pp );
		ret.append( ", pe=" + pe );
		ret.append( ", gf=" + gf );
		ret.append( ", gc=" + gc );
		return ret.toString();
	}

}
