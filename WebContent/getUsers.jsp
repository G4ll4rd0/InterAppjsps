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
	String us 		= null;
	String pw 		= null;
	String rid		= null;
	int id			= 0;
	int eid			= 0;
	
	us = request.getParameter("username") == null ? "": request.getParameter("username");
	pw = request.getParameter("pwd") == null ? "": request.getParameter("pwd");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql  = "SELECT Seed, ID_TdU, evento_id FROM usuario WHERE (Username = '"+us+"'  AND Pssword = '"+pw+"') OR (Correo = '"+us+"' AND Pssword = '"+pw+"')";
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		if (rs.next())
		{
			rid = rs.getString("Seed");
			id	= rs.getInt("ID_TdU");
			eid = rs.getInt("evento_id");
			out.println("[{\"LOGIN\":\"succesful\", \"Seed\":\""+rid+"\", \"TdU\": " + id + ", \"evento_id\": " + eid + "}]");
		}else{
			out.println("[{\"LOGIN\":\"unsuccesful\"}]");
		}
		
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