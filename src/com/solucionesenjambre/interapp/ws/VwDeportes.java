package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwSports;
import com.solucionesenjambre.interapp.tier.VwSportsTier;

@Path("/VwSports")
public class VwDeportes
{
	public VwDeportes()
	{}
	
	//Obtiene todos los deportes del evento
	@GET
	@Path("/byEvent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String byEvent(@QueryParam("eid") int eid)
	{
		String json = null;
		
		VwSportsTier tier = new VwSportsTier();
		
		List<VwSports> results = tier.getByEvent(eid);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}