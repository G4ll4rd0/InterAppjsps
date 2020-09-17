package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.solucionesenjambre.interapp.fs.dto.VwStatsPerGame;
import com.solucionesenjambre.interapp.tier.VwStatsPerGameTier;

@Path("/statsPerGame")
public class EstadisticasPorJuego
{
	public EstadisticasPorJuego()
	{}
	
	//Obtiene todos los eventos
	@GET
	@Path("/all")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String all()
	{
		String json = null;
		
		VwStatsPerGameTier tier = new VwStatsPerGameTier();
		
		List<VwStatsPerGame> results = tier.all();
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//Obtiene las estadisticas correspondientes a un juego y un equipo
	@GET
	@Path("/byGame")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String byGame_Team(@QueryParam("teamId") String teamId, @QueryParam("gameId") String gameId)
	{
		String json = null;
		
		String[] params = new String[2];
		
		params[0] = gameId;
		params[1] = teamId;
		
		VwStatsPerGameTier tier = new VwStatsPerGameTier();
		
		List<VwStatsPerGame> results = tier.byGameTeam(params);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}