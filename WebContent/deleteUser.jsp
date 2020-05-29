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
	String sd 		= null;
	
	sd = request.getParameter("seed") == null ? "": request.getParameter("seed");
	
	try
	{
		conn = ResourceManager.getConnection();
		stmt = conn.createStatement();
		
		sql  = "DELETE FROM usuario WHERE Seed = \""+sd+"\"";
		
		System.out.println(sql);
		
		stmt.executeUpdate(sql);
		
		try{conn.close();}catch(Exception e){}
		
		out.println("[{\"UPDATE\": \"succesful\"}]");
		
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