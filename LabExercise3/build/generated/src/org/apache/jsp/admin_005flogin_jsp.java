package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"rel=\"stylesheet\" integrity=\"sha384- 1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            .top_nav{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.3); \n");
      out.write("            }\n");
      out.write("            .nav{\n");
      out.write("                float: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .nav a{\n");
      out.write("                float: left;\n");
      out.write("                color:white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px 12px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("            .nav a:hover{\n");
      out.write("                background-color: white;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .nav a:active{\n");
      out.write("                background-color: white;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .center2 {\n");
      out.write("                background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("                width: 800px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body style=\"background-color: silver\">\n");
      out.write("        <table class=\"top_nav\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"nav\">\n");
      out.write("                    <a href=\"index.html\">HOME</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br><br>\n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"admin_login\" method=\"POST\">\n");
      out.write("            <table class=\"center2\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>\n");
      out.write("                        <br>\n");
      out.write("                        <a>ADMIN LOGIN</a>\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <table align=\"center\" width=\"60%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"mb-3 row\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form- label\">Username</label>\n");
      out.write("                                        <div\n");
      out.write("                                            class=\"col-sm-10\"> <input type=\"text\" class=\"form-control\" name=\"admin_username\">     \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3 row\"> <label class=\"col-sm-2 col-form- label\">Password</label>\n");
      out.write("                                        <div \n");
      out.write("                                            class=\"col-sm-10\"><input type=\"password\" class=\"form-control\" name=\"admin_password\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-dark w-25\" value=\"Login\">\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script> </body>\n");
      out.write("</head>");
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
