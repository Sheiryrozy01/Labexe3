package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ViewDataStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Data</title>\n");
      out.write("    </head>\n");
      out.write("     <style>\n");
      out.write("        .top_nav{\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav{\n");
      out.write("            float: left;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav a{\n");
      out.write("            float: left;\n");
      out.write("            color:white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav a:hover{\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .nav a:active{\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
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
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            String driver = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String database = "labexercise_3";
            String userid = "root";
            String password = "";

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                out.println(e);
            }
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <body style=\"background-color: silver\">\n");
      out.write("        <body style=\"background-color: silver\">\n");
      out.write("        <table class=\"top_nav\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"nav\">\n");
      out.write("                    <a href=\"index.html\">HOME</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <h1 align=\"center\" style=\"color:red\">STUDENT DATA</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" class=\"table table-dark table-hover w-50 \" align=\"center\">\n");
      out.write("            ");
 out.print("Today is : " + java.util.Calendar.getInstance().getTime()); 
      out.write("\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                \n");
      out.write("                <td>ID</td>\n");
      out.write("                <td>Student Nama</td>\n");
      out.write("                <td>Student IC</td>\n");
      out.write("                <td>Student Address</td>\n");
      out.write("                <td>Student Matric</td>\n");
      out.write("                <td>Student Department</td>\n");
      out.write("                <td>Status</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
                try {
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from data";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_id"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_ic"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_register"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_address"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("student_department"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(resultSet.getString("selection_data"));
      out.write("</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                   \n");
      out.write("        ");
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
