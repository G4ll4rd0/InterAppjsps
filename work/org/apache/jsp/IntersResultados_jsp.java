/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2020-03-10 19:52:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IntersResultados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 //@ include file="Database.jsp" 
      out.write('\r');
      out.write('\n');

final boolean DEBUG = false;
	
	String Futbol		= "Futbol.jsp";
	String Basquetbol	= "Basquetbol.jsp";
	String Porristas	= "Porristas.jsp";
	String Voleibol		= "Voleibol.jsp";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>IS | Resultados</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"aaaCssGeneralInterWebApp.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"Titulo\">Resultados</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"");
 out.println(Futbol); 
      out.write("\">\r\n");
      out.write("\t\t<button class=\"botonHome\" style=\" position: absolute; top:20%; left: 31%; width: 35%; \">\r\n");
      out.write("\t\t\t<b>Futbol</b>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"");
 out.println(Basquetbol); 
      out.write("\">\r\n");
      out.write("\t\t<button class=\"botonHome\" style=\"position: absolute; top:40%; left: 31%; width: 35%;\">\r\n");
      out.write("\t\t\t<b>Basquetbol</b>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"");
 out.println(Voleibol); 
      out.write("\">\r\n");
      out.write("\t\t<button class=\"botonHome\" style=\"position: absolute; top: 60%; left: 31%; width: 35%;\">\r\n");
      out.write("\t\t\t<b>Voleibol</b>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"");
 out.println(Porristas); 
      out.write("\">\r\n");
      out.write("\t\t<button class=\"botonHome\" style=\"position: absolute; top: 80%; left: 31%; width: 35%;\">\r\n");
      out.write("\t\t\t<b>Porristas</b>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</a>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
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
