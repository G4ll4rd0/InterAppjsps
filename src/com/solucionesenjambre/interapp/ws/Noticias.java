package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.News;
import com.solucionesenjambre.interapp.tier.NewsTier;

@Path("/news")
public class Noticias
{
	public Noticias()
	{}
	
	//Obtiene todas las noticias
	@GET
	@Path("/all")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAll()
	{
		String json = null;
		
		NewsTier tier = new NewsTier();
		
		List<News> results = tier.all();
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//Obtiene por evento
	@GET
	@Path("/byEvent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getNoticiasByEId(@QueryParam("eid") int eid)
	{
		String json = null;
		
		NewsTier tier = new NewsTier();
		
		List<News> results = tier.getByEID(eid);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
}