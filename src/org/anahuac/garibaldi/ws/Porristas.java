package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwPorristas;
import org.anahuac.garibaldi.tier.VwPorristasTier;

import com.google.gson.Gson;

@Path("/porristas")
public class Porristas
{
	public Porristas()
	{}
	
	@GET
	@Path("/posiciones")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPartidos(@QueryParam("eid") int keyId)
	{
		String json = null;
		
		VwPorristasTier tier = new VwPorristasTier();
		
		List<VwPorristas> results = tier.get(keyId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}