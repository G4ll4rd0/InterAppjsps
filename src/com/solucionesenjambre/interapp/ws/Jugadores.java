package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.solucionesenjambre.interapp.fs.dto.VwBPlayers;
import com.solucionesenjambre.interapp.tier.VwBPlayersTier;

import com.google.gson.Gson;

@Path("/Players")
public class Jugadores
{
	public Jugadores()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getJugador(@QueryParam("keyId") int keyId)
	{
		String json = null;
		
		VwBPlayersTier tier = new VwBPlayersTier();
		
		VwBPlayers jugador = tier.get(keyId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(jugador);
		
		return json;
	}
	
	@GET
	@Path("/list")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String browsePlayers(@QueryParam("keyword") String keyword)
	{
		String json = null;
		
		String[] params = {null};
		
		params[0] = keyword;
		
		VwBPlayersTier tier = new VwBPlayersTier();
		
		List<VwBPlayers> Players = tier.browse(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(Players);
		
		return json;
	}
	
/*
	@GET
	@Path("/dbData")
	@Produces(MediaType.APPLICATION_XHTML_XML)
	public String dbData()
	{
		String result = null;
		
		result  = "Servidor: " + ResourceManager.getServer() + "<br>";
		result += "Port: " + ResourceManager.getPort() + "<br>";
		result += "DB: " + ResourceManager.getDatabase() + "<br>";
		result += "User: " + ResourceManager.getUser() + "<br>";
		
		System.out.println(result);
		
		return result;
	}
*/


}
