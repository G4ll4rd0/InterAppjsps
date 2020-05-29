package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwBJugadores;
import org.anahuac.garibaldi.tier.VwBJugadoresTier;

import com.google.gson.Gson;

@Path("/jugadores")
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
		
		VwBJugadoresTier tier = new VwBJugadoresTier();
		
		VwBJugadores jugador = tier.get(keyId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(jugador);
		
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
		
		VwBJugadoresTier tier = new VwBJugadoresTier();
		
		List<VwBJugadores> jugadores = tier.browse(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(jugadores);
		
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
