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
	ResultSet rs2	= null;
	
	String sql 		= null;
	String sql2 	= null;
	String sql3		= null;
	String us 		= null;
	String pw 		= null;
	String email	= null;
	String col		= null;
	String rid		= null;
	int ID_TdU		= 0;
	int id			= 0;
	int eid			= 0;
	
	us = request.getParameter("username") == null ? "": request.getParameter("username");
	pw = request.getParameter("passwd") == null ? "": request.getParameter("passwd");
	email = request.getParameter("email") == null ? "": request.getParameter("email");
	col = request.getParameter("colegio") == null? "": request.getParameter("colegio");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		stmt2 = conn.createStatement();
		stmt3 = conn.createStatement();
		
		sql  = "INSERT INTO usuario (ID_TdU, Username, Pssword, Correo, evento_id, Seed) VALUES (4,'"+us+"','"+pw+"','"+email+"',"+col+", uuid())";
		System.out.println(sql);
		stmt2.executeUpdate(sql);
		
		sql3 = "SELECT Seed, ID_TdU, evento_id FROM usuario WHERE Username = '"+us+"'  AND Pssword = '"+pw+"'";
		System.out.println(sql3);
		rs2 = stmt3.executeQuery(sql3);
		
		if(rs2.next())
		{
			System.out.println("Aqui bien");
			rid = rs2.getString("Seed");
			System.out.println(rid);
			id	= rs2.getInt("ID_TdU");
			eid = rs2.getInt("evento_id");
			System.out.println(eid);
		}
		
		out.println("[{\"LOGEdit\":\"succesful\", \"Seed\":\""+rid+"\", \"TdU\": " + id + ", \"evento_id\": " + eid + "}]");
	
		if(DEBUG) System.out.println(sql);
		
		try{conn.close();}catch(Exception e){}
					
		rs2.close();
		
	}
	catch(SQLException e)
	{
		out.println("[{\"LOGEdit\":\"unsuccesful\", \"Error\": \" "+ e +"\"}]");
	}
	finally
	{
		try{rs.close();} catch(Exception e){}
		try{stmt.close();} catch(Exception e){}
		try{rs2.close();} catch(Exception e){}
		try{stmt2.close();} catch(Exception e){}
		try{stmt3.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>
