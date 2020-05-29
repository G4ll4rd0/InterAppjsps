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
	Statement stmt2 = null;
	Statement stmt3 = null;
	ResultSet rs	= null;
	ResultSet rs2 	= null;
	ResultSet rs3	= null;
	
	String sql 		= null;
	String sql2		= null;
	String sql3		= null;
	String dep		= null;
	String del		= null;
	String eram		= null;
	String edel		= null;
	String edep		= null;
	String esec		= null;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt 	= conn.createStatement();
		stmt2 	= conn.createStatement();
		stmt3 	= conn.createStatement();
		
		sql  = "SELECT Nombre FROM delegaciones WHERE evento_id = " + eventoId;
		sql2 = "SELECT d.Descripcion FROM deporte_activo d_a, deporte d WHERE d_a.ID_De=d.deporte_id AND d_a.ID_S = " + eventoId;
		sql3 = "SELECT r.Descripcion AS 'Rama', d.Codigo AS 'Delegacion', de.Descripcion AS 'Deporte', s.Descripcion AS 'Seccion' FROM equipo e, rama r, delegaciones d, deporte de, seccion s WHERE d.delegaciones_id = e.ID_D AND de.deporte_id = e.ID_De AND r.rama_id = e.ID_R AND s.seccion_id = e.ID_S AND s.seccion_id = " + eventoId;
		
		System.out.println(sql);
		
		rs	= stmt.executeQuery(sql);
		rs2	= stmt2.executeQuery(sql2);
		rs3 = stmt3.executeQuery(sql3);
		
		out.print("[");
		
		if(rs.next()){
			del = rs.getString("Nombre");
			out.print("{\"nombre\": \""+del+"\"}");
		}
		
		while(rs.next()){
			del = rs.getString("Nombre");
			out.print(",{\"nombre\": \""+del+"\"}");
		}
			
		while(rs2.next()){
			dep = rs2.getString("Descripcion");
			out.print(",{\"nombre\": \""+dep+"\"}");
		}
			
		while(rs3.next()){
			eram = rs3.getString("Rama");
			edel = rs3.getString("Delegacion");
			edep = rs3.getString("Deporte");
			esec = rs3.getString("Seccion");
			out.print(",{\"nombre\": \""+edel+" "+edep+" "+eram+" "+esec+"\"}");
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
		try{rs2.close();} catch(Exception e){}
		try{stmt2.close();} catch(Exception e){}
		try{rs3.close();} catch(Exception e){}
		try{stmt3.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>