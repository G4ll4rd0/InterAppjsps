package org.anahuac.garibaldi.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.anahuac.garibaldi.fs.dto.VwHosts;
import org.anahuac.garibaldi.tier.VwHostsTier;

import com.google.gson.Gson;

@Path("/hosts")
public class Hosts
{
	public Hosts()
	{}
	
	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPartidos(@QueryParam("seed") String key)
	{
		String json = null;
		
		VwHostsTier tier = new VwHostsTier();
		
		List<VwHosts> results = tier.get(key);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}