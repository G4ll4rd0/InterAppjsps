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
	int id			= 0;
	String sd 		= null;
	
	int i = 0;
	
	sd = request.getParameter("seed") == null ? "": request.getParameter("seed");
	
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt 	= conn.createStatement();
		stmt2 	= conn.createStatement();
		stmt3 	= conn.createStatement();
		
		sql  = "SELECT d.Nombre, d.delegaciones_id ID FROM delegaciones d, usuario u, favorito_del_usuario fdu WHERE u.Seed = '"+sd+"' AND u.usuario_id = fdu.ID_U AND fdu.ID_D = d.delegaciones_id";
		sql2 = "SELECT de.Descripcion, de.deporte_id ID FROM deporte de, usuario u, favorito_del_usuario fdu WHERE u.Seed = '"+sd+"' AND u.usuario_id = fdu.ID_U AND fdu.ID_De = de.deporte_id";
		sql3 = "SELECT e.equipo_id ID, r.Descripcion AS 'Rama', d.Codigo AS 'Delegacion', de.Descripcion AS 'Deporte', s.Descripcion AS 'Seccion' FROM equipo e, rama r, delegaciones d, deporte de, seccion s, usuario u, favorito_del_usuario fdu WHERE d.delegaciones_id = e.ID_D AND de.deporte_id = e.ID_De AND r.rama_id = e.ID_R AND s.seccion_id = e.ID_S AND u.Seed = '"+sd+"' AND u.usuario_id = fdu.ID_U AND fdu.ID_Eq = e.equipo_id";
				
		rs	= stmt.executeQuery(sql);
		rs2	= stmt2.executeQuery(sql2);
		rs3 = stmt3.executeQuery(sql3);
		
		out.print("[");
		
		if(rs.next())
			i = 1;
		else if(rs2.next())
			i = 2;
		else if(rs3.next())
			i = 3;
		
		switch(i){
			case 1:
				del = rs.getString("Nombre");
				id  = rs.getInt("ID");
				out.print("{\"nombre\": \""+del+"\", \"equipo\": 0, \"delegacion\": 1, \"deporte\": 0, \"equipoId\": 0, \"delegacionId\": " + id + ", \"deporteId\": 0}");
				break;
			case 2:
				dep = rs2.getString("Descripcion");
				id	= rs2.getInt("ID");
				out.print("{\"nombre\": \""+dep+"\", \"equipo\": 0, \"delegacion\": 0, \"deporte\": 1, \"equipoId\": 0, \"delegacionId\": 0, \"deporteId\": " + id + "}");
				break;
			case 3:
				eram = rs3.getString("Rama");
				edel = rs3.getString("Delegacion");
				edep = rs3.getString("Deporte");
				esec = rs3.getString("Seccion");
				id	 = rs3.getInt("ID");
				out.print("{\"nombre\": \""+edel+" "+edep+" "+eram+" "+esec+"\", \"equipo\": 1, \"delegacion\": 0, \"deporte\": 0, \"equipoId\": " + id + ", \"delegacionId\": 0, \"deporteId\": 0}");
				break;
			default:
				break;
		}
		
		while(rs.next()){
			del = rs.getString("Nombre");
			id	= rs.getInt("ID");
			out.print(",{\"nombre\": \""+del+"\", \"equipo\": 0, \"delegacion\": 1, \"deporte\": 0, \"equipoId\": 0, \"delegacionId\": " + id + ", \"deporteId\": 0}");
		}
			
		while(rs2.next()){
			dep = rs2.getString("Descripcion");
			id	= rs2.getInt("ID");
			out.print(",{\"nombre\": \""+dep+"\", \"equipo\": 0, \"delegacion\": 0, \"deporte\": 1, \"equipoId\": 0, \"delegacionId\": 0, \"deporteId\": " + id + "}");
		}
			
		while(rs3.next()){
			eram = rs3.getString("Rama");
			edel = rs3.getString("Delegacion");
			edep = rs3.getString("Deporte");
			esec = rs3.getString("Seccion");
			id	 = rs3.getInt("ID");
			out.print(",{\"nombre\": \""+edel+" "+edep+" "+eram+" "+esec+"\", \"equipo\": 1, \"delegacion\": 0, \"deporte\": 0, \"equipoId\": " + id + ", \"delegacionId\": 0, \"deporteId\": 0}");
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