package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Recommend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Component/Header.jsp");
    _jspx_dependants.add("/Component/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/\">\n");
      out.write("\n");
      out.write("        <!-- title -->\n");
      out.write("        <title>Recipes that I like</title>\n");
      out.write("        <!-- favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("        <!-- google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- fontawesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\">\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("        <!-- animate css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <!-- mean menu css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/meanmenu.min.css\">\n");
      out.write("        <!-- main style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("        <!-- responsive -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .bigcontainer{\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap:wrap;\n");
      out.write("            flex-direction: row;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-around;\n");
      out.write("        }\n");
      out.write("        .card-video {\n");
      out.write("            /* Add shadows to create the \"card\" effect */\n");
      out.write("            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("            transition: 0.3s;\n");
      out.write("            width: 350px;\n");
      out.write("            height: 390px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 63px 22px 29px 0;\n");
      out.write("            padding: 13px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* On mouse-over, add a deeper shadow */\n");
      out.write("        .card-video:hover {\n");
      out.write("            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add some padding inside the card container */\n");
      out.write("        .container {\n");
      out.write("            padding: 2px 16px;\n");
      out.write("        }\n");
      out.write("        h4{\n");
      out.write("            margin-top: 19px;\n");
      out.write("        }\n");
      out.write("        iframe{\n");
      out.write("            width: 330px;\n");
      out.write("            height: 295px;\n");
      out.write("        }\n");
      out.write("        .frame-border{\n");
      out.write("            border: 4px solid grey;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("<div id=\"sticker-sticky-wrapper\" class=\"sticky-wrapper\" style=\"height: 85px;\">\n");
      out.write("    <div class=\"top-header-area\" id=\"sticker\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-sm-12 text-center\">\n");
      out.write("                    <div class=\"main-menu-wrap\">\n");
      out.write("                        <!-- menu start -->\n");
      out.write("                        <nav class=\"main-menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"current-list-item\">\n");
      out.write("                                    <a href=\"home\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">Recipes</a>\n");
      out.write("                                    <ul class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"dessert\">Desserts</a></li>\n");
      out.write("                                        <li><a href=\"drink\">Drinks</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"current-list-item\">\n");
      out.write("                                    <a href=\"cookingtips\">Cooking Tips</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- end header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- slider-section -->\n");
      out.write("        <div class=\"breadcrumb-section breadcrumb-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 offset-lg-2 text-center\">\n");
      out.write("                        <div class=\"breadcrumb-text\">\n");
      out.write("                            <h1>Below are some recipes that i'm inspired from<br>\n");
      out.write("                                Please check them out.\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end slider section -->\n");
      out.write("\n");
      out.write("        <div class=\"bigcontainer\">\n");
      out.write("            <div class=\"card-video\">\n");
      out.write("                <iframe src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\"> </iframe>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>John Doe</b></h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-video\">\n");
      out.write("                <iframe src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\"> </iframe>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>John Doe</b></h4>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("            <div class=\"card-video\">\n");
      out.write("                <iframe src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\"> </iframe>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>John Doe</b></h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-video\">\n");
      out.write("                <iframe src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\"> </iframe>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>John Doe</b></h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-video\">\n");
      out.write("                <iframe src=\"https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0\"> </iframe>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4><b>TS</b></h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #review{\n");
      out.write("        height: 32px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("</style>\n");
      out.write("<!-- footer -->\n");
      out.write("<div class=\"footer-area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <div class=\"footer-box get-in-touch\">\n");
      out.write("                    <h2 class=\"widget-title\">Get in Touch</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Hanoi.</li>\n");
      out.write("                        <li>+00 111 222 3333</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <div class=\"footer-box pages\">\n");
      out.write("                    <h2 class=\"widget-title\">Pages</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home\">Home</a></li>\n");
      out.write("                        <li>Recipes\n");
      out.write("                            <ul class=\"sub-menu\">\n");
      out.write("                                <li><a href=\"dessert\">Desserts</a></li>\n");
      out.write("                                <li><a href=\"drink\">Drinks</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"cookingtips\">Tips</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <div class=\"footer-box subscribe\" style=\"width: 270px;\">\n");
      out.write("                    <h2 class=\"widget-title\">Tell me what you think</h2>\n");
      out.write("                    <p>Speak your thoughts here</p>\n");
      out.write("                    <form action=\"home\" method=\"post\">\n");
      out.write("                        <input id=\"review\" name=\"name\" type=\"text\" placeholder=\"Your name\" required>\n");
      out.write("                        <input id=\"review\" name=\"job\" type=\"text\" placeholder=\"Your job(optional)\">\n");
      out.write("                        <textarea name=\"msg\" msg cols=\"30\" rows=\"5\" class=\"form-control\" style=\"background-color: white;\" placeholder=\"Your message\" required></textarea>\n");
      out.write("                        <button type=\"submit\" style=\"margin-top:11px;\"><i class=\"fas fa-paper-plane\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                    <h6>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.response}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- end footer -->\n");
      out.write("\n");
      out.write("        <!-- end footer -->\n");
      out.write("\n");
      out.write("        <!-- jquery -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- count down -->\n");
      out.write("        <script src=\"assets/js/jquery.countdown.js\"></script>\n");
      out.write("        <!-- isotope -->\n");
      out.write("        <script src=\"assets/js/jquery.isotope-3.0.6.min.js\"></script>\n");
      out.write("        <!-- waypoints -->\n");
      out.write("        <script src=\"assets/js/waypoints.js\"></script>\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <!-- mean menu -->\n");
      out.write("        <script src=\"assets/js/jquery.meanmenu.min.js\"></script>\n");
      out.write("        <!-- sticker js -->\n");
      out.write("        <script src=\"assets/js/sticker.js\"></script>\n");
      out.write("        <!-- main js -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"header-icons\">\n");
        out.write("                                            <a class=\"shopping-cart\" href=\"login\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i> &nbsp;Admin Login</a>\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"header-icons\">\n");
        out.write("                                            <li><a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                                <ul class=\"sub-menu\" style=\"width: 150px;\">\n");
        out.write("                                                    <li><a href=\"homeAdmin\">Admin control</a></li>\n");
        out.write("                                                    <li><a href=\"logout\">Logout</a></li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            </li>\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
