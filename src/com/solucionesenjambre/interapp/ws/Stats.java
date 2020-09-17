package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.solucionesenjambre.interapp.fs.dto.VwStats;
import com.solucionesenjambre.interapp.tier.VwStatsTier;

import com.google.gson.Gson;

@Path("/Stats")
public class Stats
{
	public Stats()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getJugador(@QueryParam("keyId") int keyId)
	{
		String json = null;
		
		VwStatsTier tier = new VwStatsTier();
		
		VwStats results = tier.get(keyId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	@GET
	@Path("/list")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String browseJugadores(@QueryParam("keyword") String keyword)
	{
		String json = null;
		
		String[] params = {null};
		
		params[0] = keyword;
		
		VwStatsTier tier = new VwStatsTier();
		
		List<VwStats> results = tier.browse(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	@GET
	@Path("/team")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String teamJugadores(@QueryParam("keyword") int keyword)
	{
		String json = null;
		
		int params = keyword;
		
		
		VwStatsTier tier = new VwStatsTier();
		
		List<VwStats> results = tier.team(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	@GET
	@Path("/top")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String topPlayers(@QueryParam("topLimit") int topLimit, @QueryParam("deporteId") int deporteId, @QueryParam("seccionId") int seccionId)
	{
		String json = null;
		
		VwStatsTier tier = new VwStatsTier();
		
		List<VwStats> results = tier.topPlayers(topLimit, deporteId, seccionId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
}
