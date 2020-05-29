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
	String tit		= null;
	String des		= null;
	String img		= null;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql  = "SELECT * FROM noticias WHERE evento_id = " + eventoId;
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		out.print("[");
		
		if(rs.next()){
			tit = rs.getString("Titulo");
			img = rs.getString("Descripcion");
			des = rs.getString("desc_larga");
			out.print("{\"titulo\": \""+tit+"\", \"imagen\": \""+img+"\", \"descripcion\": \""+des+"\"}");
		}
		
		while(rs.next()){
			tit = rs.getString("Titulo");
			img = rs.getString("Descripcion");
			des = rs.getString("desc_larga");
			out.print(",{\"titulo\": \""+tit+"\", \"imagen\": \""+img+"\", \"descripcion\": \""+des+"\"}");
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