package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwEstadisticas;
import org.anahuac.garibaldi.tier.VwEstadisticasTier;

import com.google.gson.Gson;

@Path("/estadisticas")
public class Estadisticas
{
	public Estadisticas()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getJugador(@QueryParam("keyId") int keyId)
	{
		String json = null;
		
		VwEstadisticasTier tier = new VwEstadisticasTier();
		
		VwEstadisticas results = tier.get(keyId);
		
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
		
		VwEstadisticasTier tier = new VwEstadisticasTier();
		
		List<VwEstadisticas> results = tier.browse(params);
		
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
		
		
		VwEstadisticasTier tier = new VwEstadisticasTier();
		
		List<VwEstadisticas> results = tier.team(params);
		
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
		
		VwEstadisticasTier tier = new VwEstadisticasTier();
		
		List<VwEstadisticas> results = tier.topPlayers(topLimit, deporteId, seccionId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
}
