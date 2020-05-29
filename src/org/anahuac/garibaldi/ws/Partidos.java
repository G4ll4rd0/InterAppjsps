package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwPartidos;
import org.anahuac.garibaldi.tier.VwPartidosTier;

import com.google.gson.Gson;

@Path("/partidos")
public class Partidos
{
	public Partidos()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPartidos()
	{
		String json = null;
		
		VwPartidosTier tier = new VwPartidosTier();
		
		List<VwPartidos> results = tier.get(0);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	@GET
	@Path("/evento")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvento(@QueryParam("eid") int keyId, @QueryParam("fecha") int fecha)
	{
		String json = null;
		
		VwPartidosTier tier = new VwPartidosTier();
		
		List<VwPartidos> results = tier.evento(keyId, fecha);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	@GET
	@Path("/deporte")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvDep(@QueryParam("eid") int keyId, @QueryParam("deporteId") int fecha)
	{
		String json = null;
		
		VwPartidosTier tier = new VwPartidosTier();
		
		List<VwPartidos> results = tier.deporte(keyId, fecha);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}