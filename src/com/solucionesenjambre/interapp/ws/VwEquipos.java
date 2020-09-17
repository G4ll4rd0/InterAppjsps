package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwTeams;
import com.solucionesenjambre.interapp.tier.VwTeamsTier;

@Path("/VwTeams")
public class VwEquipos
{
	public VwEquipos()
	{}
	
	//Obtiene todos las delegaciones del evento
	@GET
	@Path("/byEvent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEventos(@QueryParam("eid") int eid)
	{
		String json = null;
		
		VwTeamsTier tier = new VwTeamsTier();
		
		List<VwTeams> results = tier.getByEvent(eid);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}