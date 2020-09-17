package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwSchools;
import com.solucionesenjambre.interapp.tier.VwSchoolsTier;

@Path("/VwSchools")
public class VwEscuelas
{
	public VwEscuelas()
	{}
	
	//Obtiene todos las delegaciones del evento
	@GET
	@Path("/byEvent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEventos(@QueryParam("eid") int eid)
	{
		String json = null;
		
		VwSchoolsTier tier = new VwSchoolsTier();
		
		List<VwSchools> results = tier.getByEvent(eid);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}