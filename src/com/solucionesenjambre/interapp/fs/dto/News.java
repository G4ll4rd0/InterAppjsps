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

public class News implements Serializable
{
	/** 
	 * This attribute maps to the column new_id in the news table.
	 */
	protected int newId;

	/** 
	 * This attribute maps to the column title in the news table.
	 */
	protected String title;

	/** 
	 * This attribute maps to the column image in the news table.
	 */
	protected String image;

	/** 
	 * This attribute maps to the column description in the news table.
	 */
	protected String description;

	/** 
	 * This attribute maps to the column event_id in the news table.
	 */
	protected int eventId;

	/** 
	 * This attribute represents whether the primitive attribute eventId is null.
	 */
	protected boolean eventIdNull = true;

	/**
	 * Method 'News'
	 * 
	 */
	public News()
	{
	}

	/**
	 * Method 'getNewId'
	 * 
	 * @return int
	 */
	public int getNewId()
	{
		return newId;
	}

	/**
	 * Method 'setNewId'
	 * 
	 * @param newId
	 */
	public void setNewId(int newId)
	{
		this.newId = newId;
	}

	/**
	 * Method 'getTitle'
	 * 
	 * @return String
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Method 'setTitle'
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Method 'getImage'
	 * 
	 * @return String
	 */
	public String getImage()
	{
		return image;
	}

	/**
	 * Method 'setImage'
	 * 
	 * @param image
	 */
	public void setImage(String image)
	{
		this.image = image;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
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
		this.eventIdNull = false;
	}

	/**
	 * Method 'setEventIdNull'
	 * 
	 * @param value
	 */
	public void setEventIdNull(boolean value)
	{
		this.eventIdNull = value;
	}

	/**
	 * Method 'isEventIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isEventIdNull()
	{
		return eventIdNull;
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
		
		if (!(_other instanceof News)) {
			return false;
		}
		
		final News _cast = (News) _other;
		if (newId != _cast.newId) {
			return false;
		}
		
		if (title == null ? _cast.title != title : !title.equals( _cast.title )) {
			return false;
		}
		
		if (image == null ? _cast.image != image : !image.equals( _cast.image )) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
			return false;
		}
		
		if (eventId != _cast.eventId) {
			return false;
		}
		
		if (eventIdNull != _cast.eventIdNull) {
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
		_hashCode = 29 * _hashCode + newId;
		if (title != null) {
			_hashCode = 29 * _hashCode + title.hashCode();
		}
		
		if (image != null) {
			_hashCode = 29 * _hashCode + image.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		_hashCode = 29 * _hashCode + eventId;
		_hashCode = 29 * _hashCode + (eventIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NewsPk
	 */
	public NewsPk createPk()
	{
		return new NewsPk(newId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.solucionesenjambre.interapp.fs.dto.News: " );
		ret.append( "newId=" + newId );
		ret.append( ", title=" + title );
		ret.append( ", image=" + image );
		ret.append( ", description=" + description );
		ret.append( ", eventId=" + eventId );
		return ret.toString();
	}

}
