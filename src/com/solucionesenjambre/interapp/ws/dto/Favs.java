package com.solucionesenjambre.interapp.ws.dto;

public class Favs {
	
	protected int id;
	protected String name;
	protected int favId;
	protected int isSport;
	protected int isSchool;
	protected int isTeam;
	
	public Favs()
	{
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsSport() {
		return isSport;
	}

	public void setIsSport(int isSport) {
		this.isSport = isSport;
	}

	public int getIsSchool() {
		return isSchool;
	}

	public void setIsSchool(int isSchool) {
		this.isSchool = isSchool;
	}

	public int getIsTeam() {
		return isTeam;
	}

	public void setIsTeam(int isTeam) {
		this.isTeam = isTeam;
	}

	public int getFavId() {
		return favId;
	}

	public void setFavId(int favId) {
		this.favId = favId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
