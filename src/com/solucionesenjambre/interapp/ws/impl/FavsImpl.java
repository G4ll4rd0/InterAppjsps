package com.solucionesenjambre.interapp.ws.impl;

import java.util.ArrayList;
import java.util.List;

import com.solucionesenjambre.interapp.fs.dto.Schools;
import com.solucionesenjambre.interapp.fs.dto.Sports;
import com.solucionesenjambre.interapp.fs.dto.UsersFavorites;
import com.solucionesenjambre.interapp.fs.dto.VwSchools;
import com.solucionesenjambre.interapp.fs.dto.VwSports;
import com.solucionesenjambre.interapp.fs.dto.VwTeams;
import com.solucionesenjambre.interapp.tier.SchoolsTier;
import com.solucionesenjambre.interapp.tier.SportsTier;
import com.solucionesenjambre.interapp.tier.UsersFavoritesTier;
import com.solucionesenjambre.interapp.tier.VwSchoolsTier;
import com.solucionesenjambre.interapp.tier.VwSportsTier;
import com.solucionesenjambre.interapp.tier.VwTeamsTier;
import com.solucionesenjambre.interapp.ws.dto.Favs;

public class FavsImpl {
	
	public FavsImpl()
	{
	}
	
	public List<Favs> listbyUser(int userId)
	{
		int ids;
		
		List<Favs> favs = new ArrayList<Favs>();
		Favs dto;
		
		UsersFavoritesTier usersFavoritesTier = new UsersFavoritesTier();
		VwTeamsTier vwTeamsTier = new VwTeamsTier();
		SportsTier sportsTier = new SportsTier();
		SchoolsTier schoolsTier = new SchoolsTier();
		
		List<UsersFavorites> usersFavorites = usersFavoritesTier.findByUser(userId);
		//System.out.println(usersFavorites.toString());
		VwTeams vwTeams;
		Sports sports;
		Schools schools;
		
		for(UsersFavorites favorites : usersFavorites)
		{
			if(!favorites.isSchoolIdNull())
			{
				schools = new Schools();
				dto = new Favs();
				ids = favorites.getSchoolId();
				schools = schoolsTier.get(ids);
				dto.setId(favorites.getUserFavoriteId());
				dto.setFavId(schools.getSchoolId());
				dto.setIsSchool(1);
				dto.setName(schools.getDescription());
				favs.add(dto);
			}
			else if(!favorites.isSportIdNull())
			{
				sports = new Sports();
				dto = new Favs();
				ids = favorites.getSportId();
				sports = sportsTier.get(ids);
				dto.setId(favorites.getUserFavoriteId());
				dto.setFavId(sports.getSportId());
				dto.setIsSport(1);
				dto.setName(sports.getDescription());
				favs.add(dto);
			}
			else if(!favorites.isTeamIdNull())
			{
				vwTeams = new VwTeams();
				dto = new Favs();
				ids = favorites.getTeamId();
				vwTeams = vwTeamsTier.get(ids);
				dto.setId(favorites.getUserFavoriteId());
				dto.setFavId(vwTeams.getTeamId());
				dto.setIsTeam(1);
				dto.setName(vwTeams.getTeamName());
				favs.add(dto);
			}
		}
		
		return favs;
	}
	
	public List<Favs> listAll(int eid)
	{
		Favs dto;
		
		VwTeamsTier vwTeamsTier = new VwTeamsTier();
		VwSportsTier vwSportsTier = new VwSportsTier();
		VwSchoolsTier vwSchoolsTier = new VwSchoolsTier();
		
		List<VwTeams> vwTeams = vwTeamsTier.getByEvent(eid);
		List<VwSports> vwSports = vwSportsTier.getByEvent(eid);
		List<VwSchools> vwSchools = vwSchoolsTier.getByEvent(eid);
		
		List<Favs> favs = new ArrayList<Favs>();
		
		for (VwTeams team : vwTeams)
		{
			dto = new Favs();
			dto.setName(team.getTeamName());
			dto.setIsTeam(1);
			dto.setFavId(team.getTeamId());
			favs.add(dto);
		}
		
		for(VwSports sport : vwSports)
		{
			dto = new Favs();
			dto.setName(sport.getDescription());
			dto.setIsSport(1);
			dto.setFavId(sport.getSportId());
			favs.add(dto);
		}

		for(VwSchools school : vwSchools)
		{
			dto = new Favs();
			dto.setName(school.getDescription());
			dto.setIsSchool(1);
			dto.setFavId(school.getSchoolId());
			favs.add(dto);
		}
		
		return favs;
	}
}
