<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@page import="java.sql.*"%>
<%
final boolean DEBUG = false;
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	Statement stmt2 = null;
	Statement stmt3 = null;
	Statement stmt4 = null;
	Statement stmt5	= null;
	ResultSet rs	= null;
	ResultSet rs2 	= null;
	ResultSet rs3	= null;
	ResultSet rs4	= null;
	
	String sql 		= null;
	String sql2		= null;
	String sql3		= null;
	String sql4		= null;
	String sql5		= null;
	
	String name		= null;
	String sd		= null;
	
	Integer dID 	= null;
	Integer depID	= null;
	Integer eID		= null;
	Integer uID		= null;
	
	String eram		= null;
	String edel		= null;
	String edep		= null;
	String esec		= null;
	String nequipo	= null;
	
	name = request.getParameter("favorito") == null ? "": request.getParameter("favorito");
	sd = request.getParameter("seed") == null ? "": request.getParameter("seed");
	
	name = name.trim();

	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
//		Class.forName("org.gjt.mm.mysql.Driver");
//		conn = DriverManager.getConnection("jdbc:mysql://arkesol.ddnsfree.com/" + db, user, passwd);
		conn = ResourceManager.getConnection();
		
		stmt 	= conn.createStatement();
		stmt2 	= conn.createStatement();
		stmt3 	= conn.createStatement();
		stmt4	= conn.createStatement();
		stmt5	= conn.createStatement();
		
		sql		= "SELECT delegaciones_id FROM delegaciones WHERE Nombre = '" + name + "' AND evento_id = " + eventoId;
		sql2	= "SELECT deporte_id FROM deporte WHERE Descripcion = '"+name+"' AND evento_id = " + eventoId;
		sql3	= "SELECT e.equipo_id, r.Descripcion AS 'Rama', d.Codigo AS 'Delegacion', de.Descripcion AS 'Deporte', s.Descripcion AS 'Seccion' FROM equipo e, rama r, delegaciones d, deporte de, seccion s WHERE d.delegaciones_id = e.ID_D AND de.deporte_id = e.ID_De AND r.rama_id = e.ID_R AND s.seccion_id = e.ID_S AND s.seccion_id = " + eventoId;
		sql4	= "SELECT usuario_id FROM usuario WHERE Seed = '"+sd+"'";
		
		System.out.println(sql);
		
		rs 	= stmt.executeQuery(sql);
		rs2	= stmt2.executeQuery(sql2);
		rs3	= stmt3.executeQuery(sql3);
		rs4	= stmt4.executeQuery(sql4);
		
		if(rs.next()){
			dID = rs.getInt("delegaciones_id");
		}
		
		if(rs2.next()){
			depID = rs2.getInt("deporte_id");
		}
		
		while(rs3.next()){
			eram = rs3.getString("Rama");
			edel = rs3.getString("Delegacion");
			edep = rs3.getString("Deporte");
			esec = rs3.getString("Seccion");
			
			nequipo = edel+" "+edep+" "+eram+" "+esec;
			
			System.out.println("Seleccionado "+nequipo);
			System.out.println("Favorito "+name);
			
			nequipo = nequipo.trim();
			
			boolean comp = nequipo.equals(name);
			System.out.println(comp);
			
			if(comp){
				System.out.println("Entre a la condicion");
				eID = rs3.getInt("equipo_id");
			}
		}
		
		if(rs4.next()){
			uID = rs4.getInt("usuario_id");
		}
		
		sql5 = "INSERT INTO favorito_del_usuario (ID_U, ID_D, ID_Eq, ID_De) VALUES ("+uID+", "+dID+", "+eID+", "+depID+")";
		System.out.println(sql5);
		
		stmt5.executeUpdate(sql5);
		
	}
	catch(SQLException e)
	{
		out.println("SQLException caught: " + e.getMessage());
	}
	finally
	{
		ResourceManager.close(rs);
		//try{rs.close();} catch(Exception e){}
		try{stmt.close();} catch(Exception e){}
		try{rs2.close();} catch(Exception e){}
		try{stmt2.close();} catch(Exception e){}
		try{rs3.close();} catch(Exception e){}
		try{stmt3.close();} catch(Exception e){}
		try{stmt4.close();} catch(Exception e){}
		try{stmt5.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>