package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.solucionesenjambre.interapp.tier.UsersFavoritesTier;
import com.solucionesenjambre.interapp.ws.dto.Favs;
import com.solucionesenjambre.interapp.ws.impl.FavsImpl;

@Path("/favs")
public class Favoritos
{
	public Favoritos()
	{}
	
	//Obtiene todos los que participan en el evento
	@GET
	@Path("/all")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getTodos(@QueryParam("eid") int eid)
	{
		String json = null;
		
		FavsImpl tier = new FavsImpl();
		
		List<Favs> results = tier.listAll(eid);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//Añade nuevo favorito
	@GET
	@Path("/add")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean insert(@QueryParam("name") String name, @QueryParam("favId") int favId, @QueryParam("isSport") int isSport, @QueryParam("isSchool") int isSchool, @QueryParam("isTeam") int isTeam, @QueryParam("userId") int userId)
	{
		UsersFavoritesTier tier = new UsersFavoritesTier();
		
		boolean result = tier.add(name, favId, isSport, isSchool, isTeam, userId);
		
		return result;
	}
	
	//Borrar favorito
	@GET
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@QueryParam("favId") int pk)
	{
		UsersFavoritesTier tier = new UsersFavoritesTier();
		
		boolean result = tier.delete(pk);
		
		return result;
	}
	
	//Obtener por usuario
	@GET
	@Path("/byUser")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String byUser(@QueryParam("userId") int userId)
	{
		String json = null;
		
		FavsImpl tier = new FavsImpl();
		
		List<Favs> results = tier.listbyUser(userId);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}