/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2020-03-10 00:05:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.anahuac.garibaldi.fs.jdbc.ResourceManager;
import java.sql.*;

public final class favsUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 //@ include file="Database.jsp" 
      out.write('\r');
      out.write('\n');

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

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}