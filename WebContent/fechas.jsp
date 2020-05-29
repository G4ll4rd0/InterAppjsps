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
	Statement stmt2	= null;
	ResultSet rs2	= null;
	
	String sql 		= null;	
	String sql2		= null;
	String dep		= null;
	int depid		= 0;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		stmt2= conn.createStatement();
		
		sql  = "SELECT DISTINCT fecha FROM vw_partidos WHERE seccion_id = " + eventoId;
		sql2 = "SELECT COUNT(DISTINCT fecha) num, seccion_id FROM vw_partidos WHERE seccion_id = " + eventoId;
		
		System.out.println(sql);
		System.out.println(sql2);
		
		rs   = stmt.executeQuery(sql);
		rs2  = stmt2.executeQuery(sql2);
		
		out.print("[");
		
		if(rs2.next()){
			depid = rs2.getInt("num");
			out.print("{\"numero\": " + depid + "}");
		}
		
		while(rs.next()){
			dep = rs.getString("fecha");
			out.print(",{\"fecha\": \"" + dep + "\"}");
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