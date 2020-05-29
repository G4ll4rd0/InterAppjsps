package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwPuntos;
import org.anahuac.garibaldi.tier.VwPuntosTier;

import com.google.gson.Gson;

@Path("/posiciones")
public class Puntos
{
	public Puntos()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPosiciones(@QueryParam("deporte") int keyword, @QueryParam("eid") int keyId)
	{
		String json = null;
		
		VwPuntosTier tier = new VwPuntosTier();
		
		List<VwPuntos> results = tier.get(keyword, keyId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}