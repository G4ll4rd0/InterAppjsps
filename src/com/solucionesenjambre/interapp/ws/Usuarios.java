package com.solucionesenjambre.interapp.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.solucionesenjambre.interapp.fs.dto.Users;
import com.solucionesenjambre.interapp.tier.UsersTier;

@Path("/users")
public class Usuarios
{
	public Usuarios()
	{}
	
	//Usuarios mediante username/pwd
	@GET
	@Path("/find")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsuarios(@QueryParam("username") String us, @QueryParam("pwd") String pw)
	{
		String json = null;
		
		UsersTier tier = new UsersTier();
		
		List<Users> results = tier.findUser(us, pw);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
	//Borrar Usuarios
	
	//Se coloca un bool para conocer si es exitoso o no
	@GET
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteUsuarios(@QueryParam("seed") String sd)
	{		
		boolean del;
		
		int pk = 0;
		
		UsersTier tier = new UsersTier();
		
		List<Users> user = tier.findBySeed(sd);
		
		for(Users usuarios : user)
		{
			pk = usuarios.getUserId();
		}
		
		del = tier.delete(pk);
		
		return del;		
	}
	
	//Insertar Usuarios
	
	//Se coloca un bool para conocer si es exitoso o no.
	//Y posteriormente obtener la seed
	@GET
	@Path("/set")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String setUsuarios(@QueryParam("username") String us, @QueryParam("passwd") String pw, @QueryParam("email") String email, @QueryParam("event") int eid)
	{		
		String json = null;
		List<Users> results = null;
		
		UsersTier tier = new UsersTier();
		
		boolean insert = tier.set(us, pw, email, eid);
		
		if(insert)
		{
			results = tier.findUser(us, pw);
		}
					
		//Se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;		
	}
	
	//Busqueda de usuarios mediante el seed
	@GET
	@Path("/bySeed")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsuariosbySeed(@QueryParam("seed") String sd)
	{
		String json = null;
		
		UsersTier tier = new UsersTier();
		
		List<Users> results = tier.findBySeed(sd);
		
		//se parsea a json
		Gson gson = new Gson();
		json = gson.toJson(results);
		
		return json;
	}
	
}