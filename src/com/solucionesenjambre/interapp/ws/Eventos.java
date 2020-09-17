package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.Events;
import com.solucionesenjambre.interapp.tier.EventsTier;

@Path("/events")
public class Eventos
{
	public Eventos()
	{}
	
	//Obtiene todos los eventos
	@GET
	@Path("/all")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String all()
	{
		String json = null;
		
		EventsTier tier = new EventsTier();
		
		List<Events> results = tier.all();
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}