/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2020-01-30 15:18:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Porristas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<title>IS | Porristas</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

			String db 		= "interapp";
			String user 	= "interapp";
			String passwd	= "oH3C7!Jo5PZw5Zfc";
			
			Connection conn = null;
			Statement stmt	= null;
			String sql		= null;
			Statement stmt2	= null;
			String sql2		= null;
			ResultSet rs	= null;
			
			String eqId;
			String pnts;
			String puntos;
			
			String equipo;
			int id;
			
			String servidor = "";;
			String pagina 	= "./IntersResultados.jsp";
			
			try
			{
				Class.forName("org.gjt.mm.mysql.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://arkesol.ddnsfree.com/" + db, user, passwd);
				
				stmt 	= conn.createStatement();
				stmt2	= conn.createStatement();
			}
			catch(SQLException e){}
			
			Enumeration<String> parameterNames = request.getParameterNames();
			
			while (parameterNames.hasMoreElements())
			{
				String paramName = parameterNames.nextElement();
			    String paramValue = request.getParameter(paramName);
			    
			    if (paramName.indexOf("puntos") >= 0)
			    {
			    	eqId = paramName.substring(7);
			    	
			    	pnts = "puntos|" + eqId;
			    	
			    	puntos = request.getParameter(pnts);
			    	
			    	sql = "INSERT INTO porristas (ID_E, puntos) VALUES (" + eqId + ", " + puntos + ")";
			    	
			    	try
			    	{
			    		stmt.executeUpdate(sql);
			    	}
			    	catch(SQLException e)
			    	{
			    		out.println("SQLException caught: " + e.getMessage());
			    	}
			    }
			    out.println("<div \"Aviso\" style=\"top: 35%; left: 20%;\">							<div>Registro Exitoso</div>								<a  href=\"" + pagina + "\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">Volver</button></a></div>");
			}
		
      out.write("\r\n");
      out.write("\t\t<form action=\"Porristas.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t");

				try
				{
					sql2 = "SELECT * FROM vw_equipos WHERE nombre_equipo LIKE '%Porristas%'";
					rs	 = stmt2.executeQuery(sql2);
					
					out.println("<table style=\"position: absolute; left:28%; width: 50%;\"><tr><th class=\"nombre\">Equipo</th><th class=\"nombre\">Puntaje</th></tr>");
					
					while(rs.next())
					{
						out.println("<tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>");//esto es para dar espacio
						equipo = rs.getString("Nombre");
						id	   = rs.getInt("equipo_id");
						out.println("<tr><td class=\"nombre\">" + equipo + "</td><td><input class=\"input\" name=\"puntos|" + id + "\" id=\"puntos|" + id + "\" value=\"0\" style=\" position: relative; width: 40%; left: 30%;\"></td></tr>");
					}
					
					out.println("</table>");
				}
				catch(SQLException e)
				{
					out.println("SQLException caught: " + e.getMessage());
				}
				finally
				{
					try{rs.close();} catch(Exception e){}
					try{stmt2.close();} catch(Exception e){}
					try{stmt.close();} catch(Exception e){}
					try{conn.close();} catch(Exception e){}
				}
			
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<button type=\"submit\" style=\"position: fixed; width: 15%; height: 10%; left: 80%; top: 50%;\">Registrar</button> \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
