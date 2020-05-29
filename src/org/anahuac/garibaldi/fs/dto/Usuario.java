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

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column usuario_id in the usuario table.
	 */
	protected int usuarioId;

	/** 
	 * This attribute maps to the column Username in the usuario table.
	 */
	protected String username;

	/** 
	 * This attribute maps to the column Pssword in the usuario table.
	 */
	protected String pssword;

	/** 
	 * This attribute maps to the column Correo in the usuario table.
	 */
	protected String correo;

	/** 
	 * This attribute maps to the column ID_TdU in the usuario table.
	 */
	protected int idTdu;

	/** 
	 * This attribute maps to the column ID_D in the usuario table.
	 */
	protected int idD;

	/** 
	 * This attribute maps to the column Seed in the usuario table.
	 */
	protected String seed;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getUsuarioId'
	 * 
	 * @return int
	 */
	public int getUsuarioId()
	{
		return usuarioId;
	}

	/**
	 * Method 'setUsuarioId'
	 * 
	 * @param usuarioId
	 */
	public void setUsuarioId(int usuarioId)
	{
		this.usuarioId = usuarioId;
	}

	/**
	 * Method 'getUsername'
	 * 
	 * @return String
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Method 'setUsername'
	 * 
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Method 'getPssword'
	 * 
	 * @return String
	 */
	public String getPssword()
	{
		return pssword;
	}

	/**
	 * Method 'setPssword'
	 * 
	 * @param pssword
	 */
	public void setPssword(String pssword)
	{
		this.pssword = pssword;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	/**
	 * Method 'getIdTdu'
	 * 
	 * @return int
	 */
	public int getIdTdu()
	{
		return idTdu;
	}

	/**
	 * Method 'setIdTdu'
	 * 
	 * @param idTdu
	 */
	public void setIdTdu(int idTdu)
	{
		this.idTdu = idTdu;
	}

	/**
	 * Method 'getIdD'
	 * 
	 * @return int
	 */
	public int getIdD()
	{
		return idD;
	}

	/**
	 * Method 'setIdD'
	 * 
	 * @param idD
	 */
	public void setIdD(int idD)
	{
		this.idD = idD;
	}

	/**
	 * Method 'getSeed'
	 * 
	 * @return String
	 */
	public String getSeed()
	{
		return seed;
	}

	/**
	 * Method 'setSeed'
	 * 
	 * @param seed
	 */
	public void setSeed(String seed)
	{
		this.seed = seed;
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
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (usuarioId != _cast.usuarioId) {
			return false;
		}
		
		if (username == null ? _cast.username != username : !username.equals( _cast.username )) {
			return false;
		}
		
		if (pssword == null ? _cast.pssword != pssword : !pssword.equals( _cast.pssword )) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (idTdu != _cast.idTdu) {
			return false;
		}
		
		if (idD != _cast.idD) {
			return false;
		}
		
		if (seed == null ? _cast.seed != seed : !seed.equals( _cast.seed )) {
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
		_hashCode = 29 * _hashCode + usuarioId;
		if (username != null) {
			_hashCode = 29 * _hashCode + username.hashCode();
		}
		
		if (pssword != null) {
			_hashCode = 29 * _hashCode + pssword.hashCode();
		}
		
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idTdu;
		_hashCode = 29 * _hashCode + idD;
		if (seed != null) {
			_hashCode = 29 * _hashCode + seed.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(usuarioId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "org.anahuac.garibaldi.fs.dto.Usuario: " );
		ret.append( "usuarioId=" + usuarioId );
		ret.append( ", username=" + username );
		ret.append( ", pssword=" + pssword );
		ret.append( ", correo=" + correo );
		ret.append( ", idTdu=" + idTdu );
		ret.append( ", idD=" + idD );
		ret.append( ", seed=" + seed );
		return ret.toString();
	}

}
