<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@page import="java.sql.*"%>

<% //@ include file="Database.jsp" %>
<%
final boolean DEBUG = false;
	//String db = request.getParameter("db");
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	ResultSet rs	= null;
	String sql 		= null;
	String eq		= null;
	
	String eram		= null;
	String edel		= null;
	String edep		= null;
	String esec		= null;
	int eId;
	
	eq = request.getParameter("delegacion") == null ? "": request.getParameter("delegacion");
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql  = "SELECT equipo_id, r.Descripcion AS 'Rama', d.Codigo AS 'Delegacion', de.Descripcion AS 'Deporte', s.Descripcion AS 'Seccion' FROM equipo e, rama r, delegaciones d, deporte de, seccion s WHERE d.delegaciones_id = e.ID_D AND de.deporte_id = e.ID_De AND r.rama_id = e.ID_R AND s.seccion_id = e.ID_S AND d.delegaciones_id = " + eq + " AND evento_id = " + eventoId;
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		out.print("[");
		
		if(rs.next()){
			eram = rs.getString("Rama");
			edel = rs.getString("Delegacion");
			edep = rs.getString("Deporte");
			esec = rs.getString("Seccion");
			eId	 = rs.getInt("equipo_id");
			out.print("{\"nombre\": \""+edel+" "+edep+" "+eram+" "+esec+"\", \"equipoId\": " + eId + "}");
		}
		
		while(rs.next()){
			eram = rs.getString("Rama");
			edel = rs.getString("Delegacion");
			edep = rs.getString("Deporte");
			esec = rs.getString("Seccion");
			eId	 = rs.getInt("equipo_id");
			out.print(",{\"nombre\": \""+edel+" "+edep+" "+eram+" "+esec+"\", \"equipoId\": " + eId + "}");
		}
		
		out.print("]");		
		
		try{conn.close();}catch(Exception e){}
					
		rs.close();
		
	}
	catch(SQLException e)
	{
		out.println("SQLException caught: " + e.getMessage());
	}
	finally
	{
		try{rs.close();} catch(Exception e){}
		try{stmt.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>