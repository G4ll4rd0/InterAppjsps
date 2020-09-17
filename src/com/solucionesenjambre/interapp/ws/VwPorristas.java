package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwCheer;
import com.solucionesenjambre.interapp.tier.VwCheerTier;

@Path("/VwCheer")
public class VwPorristas
{
	public VwPorristas()
	{}
	
	//Obtiene todos los eventos
	@GET
	@Path("/positions")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String posiciones(@QueryParam("eid") String eventId)
	{
		String json = null;
		
		String[] params = new String[1]; 
		params[0] = eventId;
		
		VwCheerTier tier = new VwCheerTier();
		
		List<VwCheer> results = tier.positions(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}