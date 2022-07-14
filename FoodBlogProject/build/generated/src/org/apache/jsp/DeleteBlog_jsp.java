package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DeleteBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!-- beautify ignore:start -->\n");
      out.write("<html\n");
      out.write("    lang=\"en\"\n");
      out.write("    class=\"light-style layout-menu-fixed\"\n");
      out.write("    dir=\"ltr\"\n");
      out.write("    data-theme=\"theme-default\"\n");
      out.write("    data-assets-path=\"../assets/\"\n");
      out.write("    data-template=\"vertical-menu-template-free\"\n");
      out.write("    >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <title>Admin Console - Delete</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <!-- favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("        <!-- Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- Icons. Uncomment required icon fonts -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/vendor/fonts/boxicons.css\" />\n");
      out.write("\n");
      out.write("        <!-- Core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/vendor/css/core.css\" class=\"template-customizer-core-css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/vendor/css/theme-default.css\" class=\"template-customizer-theme-css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/demo.css\" />\n");
      out.write("\n");
      out.write("        <!-- Vendors CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css\" />\n");
      out.write("\n");
      out.write("        <!-- Page CSS -->\n");
      out.write("\n");
      out.write("        <!-- Helpers -->\n");
      out.write("        <script src=\"assets/vendor/js/helpers.js\"></script>\n");
      out.write("\n");
      out.write("        <!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->\n");
      out.write("        <!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->\n");
      out.write("        <script src=\"assets/js/config.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"layout-wrapper layout-content-navbar\">\n");
      out.write("            <div class=\"layout-container\">\n");
      out.write("                <!-- Menu -->\n");
      out.write("                <aside id=\"layout-menu\" class=\"layout-menu menu-vertical menu bg-menu-theme\">\n");
      out.write("                    <div class=\"app-brand demo\"></div>\n");
      out.write("                    <!--<div class=\"menu-inner-shadow\"></div>-->\n");
      out.write("                    <ul class=\"menu-inner py-1\">\n");
      out.write("                        <li class=\"menu-header small text-uppercase\">\n");
      out.write("                            <span class=\"menu-header-text\">Functions</span>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Create post --> \n");
      out.write("                        <li class=\"menu-item\">\n");
      out.write("                            <a href=\"homeAdmin\" class=\"menu-link\">\n");
      out.write("                                <i class=\"menu-icon tf-icons bx bx-crown\"></i>\n");
      out.write("                                <div data-i18n=\"Analytics\">Create a post</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Filter -->\n");
      out.write("                        <li class=\"menu-item\">\n");
      out.write("                            <a href=\"adminReview\" class=\"menu-link\">\n");
      out.write("                                <i class=\"menu-icon tf-icons bx bx-cube-alt\"></i>\n");
      out.write("                                <div data-i18n=\"Analytics\">Filter review</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu-header small text-uppercase\">\n");
      out.write("                            <span class=\"menu-header-text\"></span>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu-item\">\n");
      out.write("                            <a href=\"home\" class=\"menu-link\">\n");
      out.write("                                <i class=\"menu-icon tf-icons bx bx-home-circle\"></i>\n");
      out.write("                                <div data-i18n=\"Analytics\">Back to home</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </aside>\n");
      out.write("                <!-- Layout container -->\n");
      out.write("                <div class=\"layout-page\">\n");
      out.write("                    <hr class=\"my-5\" />\n");
      out.write("                    <!-- Bordered Table -->\n");
      out.write("                    <div class=\"card\" style=\"margin-left: 10px;width:98%\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"table-responsive text-nowrap\">\n");
      out.write("                                <table class=\"table table-bordered\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Blog ID</th>\n");
      out.write("                                            <th>Blog title</th>\n");
      out.write("                                            <th>Category</th>\n");
      out.write("                                            <th>Author</th>\n");
      out.write("                                            <th>Action</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--end table-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Core JS -->\n");
      out.write("        <!-- build:js assets/vendor/js/core.js -->\n");
      out.write("        <script src=\"../assets/vendor/libs/jquery/jquery.js\"></script>\n");
      out.write("        <script src=\"../assets/vendor/libs/popper/popper.js\"></script>\n");
      out.write("        <script src=\"../assets/vendor/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../assets/vendor/js/menu.js\"></script>\n");
      out.write("        <!--giu nguyen format-->\n");
      out.write("        <script src=\"//cdn.ckeditor.com/4.17.2/full/ckeditor.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                        CKEDITOR.replace('content');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function deleteBlog(blogid) {\n");
      out.write("                var c = confirm(\"Are you sure to delete this blog ? \")\n");
      out.write("                if (c) {\n");
      out.write("                    window.location.href = \"deleteBlogDessert?blogid=\" + blogid\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- endbuild -->\n");
      out.write("\n");
      out.write("        <!-- Vendors JS -->\n");
      out.write("\n");
      out.write("        <!-- Main JS -->\n");
      out.write("        <script src=\"../assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page JS -->\n");
      out.write("\n");
      out.write("        <!-- Place this tag in your head or just before your close body tag. -->\n");
      out.write("        <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listBlog}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBlogID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBlogTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getAuthor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>\n");
          out.write("                                                    <button onclick=\"deleteBlog(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBlogID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" style=\"background-color:purple;color:white\">\n");
          out.write("                                                        Delete\n");
          out.write("                                                    </button>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
