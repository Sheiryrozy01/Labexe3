package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/labexercise_3";
String user = "root";
String psw = "";
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .top_nav{\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("        .nav{\n");
      out.write("            float: left;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        .nav a{\n");
      out.write("            float: left;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("        .nav a:active{\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .nav a:hover{\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .center2{\n");
      out.write("            background-color: rgba(0,0,0,0,3);\n");
      out.write("            width: 800px;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("        }\n");
      out.write("         </style>\n");
      out.write("    <body style=\"background-color: silver\" >\n");
      out.write("        <table class=\"top_nav\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"nav\">\n");
      out.write("                    <a href=\"ViewDataAdmin.jsp\">VIEW STUDENT DATA</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            String student_id = request.getParameter("student_id");
            String student_name = request.getParameter("student_name");
            String student_ic = request.getParameter("student_ic");
            String student_register = request.getParameter("student_register");
            String student_address = request.getParameter("student_address");
            String student_department = request.getParameter("student_department");
            String selection_data = request.getParameter("selection_data");

            if (student_id != null) {
                Connection con = null;
                PreparedStatement ps = null;
                int personID = Integer.parseInt(student_id);
                try {
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, psw);
                    String sql = "Update data set student_id=?,student_name=?,student_ic=?,student_register=?,student_address=?,student_department=?,selection_data=? where student_id=" + student_id;
                    ps = con.prepareStatement(sql);
                    
                    ps.setString(1, student_id);
                    ps.setString(2, student_name);
                    ps.setString(3, student_ic);
                    ps.setString(5, student_register);
                    ps.setString(4, student_address); 
                    ps.setString(6, student_department);
                    ps.setString(7, selection_data);
                    int i = ps.executeUpdate();
                    if (i > 0) {
                        out.print("Record Updated Successfully");
                    } else {
                        out.print("There is a problem in updating Record.");
                    }
                } catch (SQLException sql) {
                    request.setAttribute("error", sql);
                    out.println(sql);
                }
            }
        
      out.write("\n");
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
