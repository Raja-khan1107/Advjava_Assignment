package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <link rel='stylesheet' href='xyz.css'>\n");
      out.write(" </head>\n");
      out.write(" \n");
      out.write("  <body>\n");
      out.write("   <div id =\"mymenu\">\n");
      out.write("    <ul>\n");
      out.write("     <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("     <li>About</li>\n");
      out.write("     <li>Contact</li>\n");
      out.write("    </ul>\n");
      out.write("   </div>\n");
      out.write("<!--      <h1 align= \"center\">Home Page</h1>-->\n");
      out.write("      <center>\n");
      out.write("      <img src=\"https://www.hotwaxsystems.com/wp-content/uploads/2019/03/hotwax-systems-logo_fe34b522273d8b9d6ef33253908487bf.png\" width=\"600\"height=\"200\"/>\n");
      out.write("      </center>>\n");
      out.write(" </body>\n");
      out.write("</html>  ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
