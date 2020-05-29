package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.Seccion;
import org.anahuac.garibaldi.tier.SeccionesTier;

import com.google.gson.Gson;

@Path("/seccion")
public class Secciones
{
	public Secciones()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPartidos()
	{
		String json = null;
		
		SeccionesTier tier = new SeccionesTier();
		
		List<Seccion> results = tier.get();
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}