package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <!-- favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            /*background-color: #85C88A;*/\n");
      out.write("            background-color: #F3E9DD;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("        }\n");
      out.write("        .login{\n");
      out.write("            width: 300px;\n");
      out.write("            height: 340px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            background-color: white;\n");
      out.write("            border: 1px solid grey;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 32px;\n");
      out.write("            /*margin: 0px auto;*/\n");
      out.write("        }\n");
      out.write("        .login h2{\n");
      out.write("            display: inline-block;\n");
      out.write("            color: grey;\n");
      out.write("        }\n");
      out.write("        .login input{\n");
      out.write("            width: 200px;\n");
      out.write("            height: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border: 1px solid grey;\n");
      out.write("            padding-left: 5px;\n");
      out.write("            margin-bottom: 17px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("        .login button{\n");
      out.write("            width: 100px;\n");
      out.write("            height: 40px;\n");
      out.write("            font-size: 17px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #85C88A;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        #showpass{\n");
      out.write("            width: 15px;\n");
      out.write("        }\n");
      out.write("        .show{\n");
      out.write("            font-size: 13px;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            display: inline-block;\n");
      out.write("            float:left;\n");
      out.write("            padding-left: 50px;\n");
      out.write("            margin: 0px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <form class=\"login\" action=\"login\" method=\"post\">\n");
      out.write("            <h2>Login</h2> <br>\n");
      out.write("            <p>Username</p> <br>\n");
      out.write("            <input name=\"username\" placeholder=\"Enter username\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\n");
      out.write("            <p>Password</p> <br>\n");
      out.write("            <input id=\"password\" name=\"pass\" placeholder=\"Enter password\" type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br> \n");
      out.write("            <br>\n");
      out.write("            <button>Login</button> <br>           \n");
      out.write("        </form>\n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("    </center>\n");
      out.write("<!--\n");
      out.write("    <script>\n");
      out.write("        function myFunction() {\n");
      out.write("            var x = document.getElementById(\"password\");\n");
      out.write("            if (x.type === \"password\") {\n");
      out.write("                x.type = \"text\";\n");
      out.write("            } else {\n");
      out.write("                x.type = \"password\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
