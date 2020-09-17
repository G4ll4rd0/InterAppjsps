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

public class VwPoints implements Serializable
{
	/** 
	 * This attribute maps to the column team1_id in the vw_points table.
	 */
	protected int team1Id;

	/** 
	 * This attribute represents whether the primitive attribute team1Id is null.
	 */
	protected boolean team1IdNull = true;

	/** 
	 * This attribute maps to the column school_id in the vw_points table.
	 */
	protected int schoolId;

	/** 
	 * This attribute maps to the column sport_id in the vw_points table.
	 */
	protected int sportId;

	/** 
	 * This attribute maps to the column event_id in the vw_points table.
	 */
	protected int eventId;

	/** 
	 * This attribute maps to the column branch_id in the vw_points table.
	 */
	protected int branchId;

	/** 
	 * This attribute maps to the column code in the vw_points table.
	 */
	protected String code;

	/** 
	 * This attribute maps to the column name in the vw_points table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column sport in the vw_points table.
	 */
	protected String sport;

	/** 
	 * This attribute maps to the column event in the vw_points table.
	 */
	protected String event;

	/** 
	 * This attribute maps to the column branch in the vw_points table.
	 */
	protected String branch;

	/** 
	 * This attribute maps to the column points in the vw_points table.
	 */
	protected long points;

	/** 
	 * This attribute represents whether the primitive attribute points is null.
	 */
	protected boolean pointsNull = true;

	/** 
	 * This attribute maps to the column pj in the vw_points table.
	 */
	protected long pj;

	/** 
	 * This attribute represents whether the primitive attribute pj is null.
	 */
	protected boolean pjNull = true;

	/** 
	 * This attribute maps to the column pg in the vw_points table.
	 */
	protected long pg;

	/** 
	 * This attribute represents whether the primitive attribute pg is null.
	 */
	protected boolean pgNull = true;

	/** 
	 * This attribute maps to the column pe in the vw_points table.
	 */
	protected long pe;

	/** 
	 * This attribute represents whether the primitive attribute pe is null.
	 */
	protected boolean peNull = true;

	/** 
	 * This attribute maps to the column pp in the vw_points table.
	 */
	protected long pp;

	/** 
	 * This attribute represents whether the primitive attribute pp is null.
	 */
	protected boolean ppNull = true;

	/** 
	 * This attribute maps to the column gf in the vw_points table.
	 */
	protected long gf;

	/** 
	 * This attribute represents whether the primitive attribute gf is null.
	 */
	protected boolean gfNull = true;

	/** 
	 * This attribute maps to the column gc in the vw_points table.
	 */
	protected long gc;

	/** 
	 * This attribute represents whether the primitive attribute gc is null.
	 */
	protected boolean gcNull = true;

	/** 
	 * This attribute maps to the column diff in the vw_points table.
	 */
	protected long diff;

	/** 
	 * This attribute represents whether the primitive attribute diff is null.
	 */
	protected boolean diffNull = true;

	/** 
	 * This attribute maps to the column priority_points in the vw_points table.
	 */
	protected int priorityPoints;

	/** 
	 * This attribute represents whether the primitive attribute priorityPoints is null.
	 */
	protected boolean priorityPointsNull = true;

	/**
	 * Method 'VwPoints'
	 * 
	 */
	public VwPoints()
	{
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
	 * Method 'getSchoolId'
	 * 
	 * @return int
	 */
	public int getSchoolId()
	{
		return schoolId;
	}

	/**
	 * Method 'setSchoolId'
	 * 
	 * @param schoolId
	 */
	public void setSchoolId(int schoolId)
	{
		this.schoolId = schoolId;
	}

	/**
	 * Method 'getSportId'
	 * 
	 * @return int
	 */
	public int getSportId()
	{
		return sportId;
	}

	/**
	 * Method 'setSportId'
	 * 
	 * @param sportId
	 */
	public void setSportId(int sportId)
	{
		this.sportId = sportId;
	}

	/**
	 * Method 'getEventId'
	 * 
	 * @return int
	 */
	public int getEventId()
	{
		return eventId;
	}

	/**
	 * Method 'setEventId'
	 * 
	 * @param eventId
	 */
	public void setEventId(int eventId)
	{
		this.eventId = eventId;
	}

	/**
	 * Method 'getBranchId'
	 * 
	 * @return int
	 */
	public int getBranchId()
	{
		return branchId;
	}

	/**
	 * Method 'setBranchId'
	 * 
	 * @param branchId
	 */
	public void setBranchId(int branchId)
	{
		this.branchId = branchId;
	}

	/**
	 * Method 'getCode'
	 * 
	 * @return String
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * Method 'setCode'
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getSport'
	 * 
	 * @return String
	 */
	public String getSport()
	{
		return sport;
	}

	/**
	 * Method 'setSport'
	 * 
	 * @param sport
	 */
	public void setSport(String sport)
	{
		this.sport = sport;
	}

	/**
	 * Method 'getEvent'
	 * 
	 * @return String
	 */
	public String getEvent()
	{
		return event;
	}

	/**
	 * Method 'setEvent'
	 * 
	 * @param event
	 */
	public void setEvent(String event)
	{
		this.event = event;
	}

	/**
	 * Method 'getBranch'
	 * 
	 * @return String
	 */
	public String getBranch()
	{
		return branch;
	}

	/**
	 * Method 'setBranch'
	 * 
	 * @param branch
	 */
	public void setBranch(String branch)
	{
		this.branch = branch;
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
	 * Method 'getPriorityPoints'
	 * 
	 * @return int
	 */
	public int getPriorityPoints()
	{
		return priorityPoints;
	}

	/**
	 * Method 'setPriorityPoints'
	 * 
	 * @param priorityPoints
	 */
	public void setPriorityPoints(int priorityPoints)
	{
		this.priorityPoints = priorityPoints;
		this.priorityPointsNull = false;
	}

	/**
	 * Method 'setPriorityPointsNull'
	 * 
	 * @param value
	 */
	public void setPriorityPointsNull(boolean value)
	{
		this.priorityPointsNull = value;
	}

	/**
	 * Method 'isPriorityPointsNull'
	 * 
	 * @return boolean
	 */
	public boolean isPriorityPointsNull()
	{
		return priorityPointsNull;
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
		
		if (!(_other instanceof VwPoints)) {
			return false;
		}
		
		final VwPoints _cast = (VwPoints) _other;
		if (team1Id != _cast.team1Id) {
			return false;
		}
		
		if (team1IdNull != _cast.team1IdNull) {
			return false;
		}
		
		if (schoolId != _cast.schoolId) {
			return false;
		}
		
		if (sportId != _cast.sportId) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (code == null ? _cast.code != code : !code.equals( _cast.code )) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (sport == null ? _cast.sport != sport : !sport.equals( _cast.sport )) {
			return false;
		}
		
		if (event == null ? _cast.event != event : !event.equals( _cast.event )) {
			return false;
		}
		
		if (branch == null ? _cast.branch != branch : !branch.equals( _cast.branch )) {
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
		
		if (priorityPoints != _cast.priorityPoints) {
			return false;
		}
		
		if (priorityPointsNull != _cast.priorityPointsNull) {
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
		_hashCode = 29 * _hashCode + team1Id;
		_hashCode = 29 * _hashCode + (team1IdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + schoolId;
		_hashCode = 29 * _hashCode + sportId;
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + branchId;
		if (code != null) {
			_hashCode = 29 * _hashCode + code.hashCode();
		}
		
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (sport != null) {
			_hashCode = 29 * _hashCode + sport.hashCode();
		}
		
		if (event != null) {
			_hashCode = 29 * _hashCode + event.hashCode();
		}
		
		if (branch != null) {
			_hashCode = 29 * _hashCode + branch.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (points ^ (points >>> 32));
		_hashCode = 29 * _hashCode + (pointsNull ? 1 : 0);
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
		_hashCode = 29 * _hashCode + priorityPoints;
		_hashCode = 29 * _hashCode + (priorityPointsNull ? 1 : 0);
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
		ret.append( "com.solucionesenjambre.interapp.fs.dto.VwPoints: " );
		ret.append( "team1Id=" + team1Id );
		ret.append( ", schoolId=" + schoolId );
		ret.append( ", sportId=" + sportId );
		ret.append( ", eventId=" + eventId );
		ret.append( ", branchId=" + branchId );
		ret.append( ", code=" + code );
		ret.append( ", name=" + name );
		ret.append( ", sport=" + sport );
		ret.append( ", event=" + event );
		ret.append( ", branch=" + branch );
		ret.append( ", points=" + points );
		ret.append( ", pj=" + pj );
		ret.append( ", pg=" + pg );
		ret.append( ", pe=" + pe );
		ret.append( ", pp=" + pp );
		ret.append( ", gf=" + gf );
		ret.append( ", gc=" + gc );
		ret.append( ", diff=" + diff );
		ret.append( ", priorityPoints=" + priorityPoints );
		return ret.toString();
	}

}
