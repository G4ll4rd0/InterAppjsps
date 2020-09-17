package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwGames;
import com.solucionesenjambre.interapp.tier.VwGamesTier;

@Path("/VwGames")
public class VwJuegos
{
	public VwJuegos()
	{}
	
	//Obtiene todos los juegos
	@GET
	@Path("/all")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String all()
	{
		String json = null;
		
		VwGamesTier tier = new VwGamesTier();
		
		List<VwGames> results = tier.all();
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//Obtiene todos los del dia/evento
	@GET
	@Path("/date")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvento(@QueryParam("eid") String eventId, @QueryParam("date") String date)
	{
		String json = null;
		
		String[] params = new String[2];
		params[0] = date;
		params[1] = eventId;
		
		VwGamesTier tier = new VwGamesTier();
		
		List<VwGames> results = tier.getByDate(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//obtiene todos los del deporte/evento
	@GET
	@Path("/sport")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvDep(@QueryParam("eid") String eventId, @QueryParam("sportId") String sportId)
	{
		String json = null;
		
		String[] params = new String [2];
		params[0] = sportId;
		params[1] = eventId;
		
		VwGamesTier tier = new VwGamesTier();
		
		List<VwGames> results = tier.getBySport(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}