package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favi.png\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        @import url(https://fonts.googleapis.com/css?family=Roboto:300);\n");
      out.write("\n");
      out.write("        .login-page {\n");
      out.write("            width: 360px;\n");
      out.write("            padding: 8% 0 0;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        .form {\n");
      out.write("            position: relative;\n");
      out.write("            z-index: 1;\n");
      out.write("            background: #FFFFFF;\n");
      out.write("            max-width: 360px;\n");
      out.write("            margin: 0 auto 100px;\n");
      out.write("            padding: 45px;\n");
      out.write("            text-align: center;\n");
      out.write("            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("        }\n");
      out.write("        .form input {\n");
      out.write("            font-family: \"Roboto\", sans-serif;\n");
      out.write("            outline: 0;\n");
      out.write("            background: #f2f2f2;\n");
      out.write("            width: 100%;\n");
      out.write("            border: 0;\n");
      out.write("            margin: 0 0 15px;\n");
      out.write("            padding: 15px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        .form #submit {\n");
      out.write("            font-family: \"Roboto\", sans-serif;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            outline: 0;\n");
      out.write("            background: tan;\n");
      out.write("            width: 100%;\n");
      out.write("            border: 0;\n");
      out.write("            padding: 15px;\n");
      out.write("            color: #FFFFFF;\n");
      out.write("            font-size: 14px;\n");
      out.write("            -webkit-transition: all 0.3 ease;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .form #submit:hover,.form #submit:active,.form #submit:focus {\n");
      out.write("            background: tan;\n");
      out.write("        }\n");
      out.write("        .form .message {\n");
      out.write("            margin: 15px 0 0;\n");
      out.write("            color: #b3b3b3;\n");
      out.write("            font-size: 12px;\n");
      out.write("        }\n");
      out.write("        .form .message a {\n");
      out.write("            color: tan;\n");
      out.write("            font-family: serif;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("        .form .register-form {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background: tan; /* fallback for old browsers */\n");
      out.write("            font-family: \"Roboto\", sans-serif;\n");
      out.write("            -webkit-font-smoothing: antialiased;\n");
      out.write("            -moz-osx-font-smoothing: grayscale;      \n");
      out.write("        }         \n");
      out.write("    </style>         \n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-page\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form action=\"login\" method=\"post\" class=\"login-form\">\n");
      out.write("                    <input id=\"uname\" type=\"text\" name=\"userLog\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Tài khoản\"/>                    <input id=\"pass\" type=\"password\" name=\"passLog\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Mật khẩu\"/>\n");
      out.write("\n");
      out.write("                    <input id=\"submit\" type=\"submit\" value=\"Đăng nhập\">                       \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
