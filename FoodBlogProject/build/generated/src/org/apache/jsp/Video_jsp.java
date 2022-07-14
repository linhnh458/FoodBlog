package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Video_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>video Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .card {\n");
      out.write("            display: flex;\n");
      out.write("            /*flex-direction: column;*/\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            /* Add shadows to create the \"card\" effect */\n");
      out.write("            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("            transition: 0.3s;\n");
      out.write("            width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* On mouse-over, add a deeper shadow */\n");
      out.write("        .card:hover {\n");
      out.write("            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add some padding inside the card container */\n");
      out.write("        .container {\n");
      out.write("            padding: 2px 16px;\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>TS</b></h4>\n");
      out.write("                    <p>Architect & Engineer</p>\n");
      out.write("                </div>\n");
      out.write("                <iframe width=\"300\" height=\"215\"\n");
      out.write("                        src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\">\n");
      out.write("                </iframe>                \n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
