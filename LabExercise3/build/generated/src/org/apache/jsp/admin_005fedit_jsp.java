package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("student_id");
            String driver = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String database = "labexercise_3";
            String userid = "root";
            String password = "";

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("\n");
      out.write("        ");

            try {
                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                statement = connection.createStatement();
                String sql = "select * from data where student_id=" + id;
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("        * {box-sizing: border-box}\n");
      out.write("\n");
      out.write("\n");
      out.write("        /* Full-width input fields */\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin: 5px 0 22px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: none;\n");
      out.write("            background: #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=text]:focus, input[type=password]:focus {\n");
      out.write("            background-color: #ddd;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        hr {\n");
      out.write("            border: 1px solid #f1f1f1;\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set a style for all buttons */\n");
      out.write("        button {\n");
      out.write("            background-color: #34495E;\n");
      out.write("            color: white;\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("            opacity: 0.9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            opacity:1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Extra styles for the cancel button */\n");
      out.write("        .cancelbtn {\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            background-color: #f44336;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Float cancel and signup buttons and add an equal width */\n");
      out.write("        .cancelbtn, .signupbtn {\n");
      out.write("            float: left;\n");
      out.write("            width: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add padding to container elements */\n");
      out.write("        .container {\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Clear floats */\n");
      out.write("        .clearfix::after {\n");
      out.write("            content: \"\";\n");
      out.write("            clear: both;\n");
      out.write("            display: table;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change styles for cancel button and signup button on extra small screens */\n");
      out.write("        @media screen and (max-width: 300px) {\n");
      out.write("            .cancelbtn, .signupbtn {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td, th{border: opx solid #ddd; text-align: left;}\n");
      out.write("            table {border-collapse: collapse; width: 24.5%; border-style:solid;\n");
      out.write("                   border-width: 2px; border-color: appworkspace;}\n");
      out.write("            th, td{padding: 5px;}\n");
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
      out.write("    <body style=\"background-color: silver;\">\n");
      out.write("        <table class=\"top_nav\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"nav\">\n");
      out.write("                    <a href=\"index.html\">HOME</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h1 align=\"center\" >Update data form database in jsp</h1>\n");
      out.write("        <form method=\"post\" action=\"admin_update.jsp\">\n");
      out.write("            <input type=\"hidden\" name=\"student_id\" value=\"");
      out.print(resultSet.getString("student_id"));
      out.write("\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"student_name\"><b>STUDENT NAME</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Please Enter Student Name\" name=\"student_name\" value=\"");
      out.print(resultSet.getString("student_name"));
      out.write("\"  >\n");
      out.write("                \n");
      out.write("                <label for=\"student_ic\"><b>STUDENT IC</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Please Enter Student IC\" name=\"student_ic\" value=\"");
      out.print(resultSet.getString("student_ic"));
      out.write("\" >\n");
      out.write("                \n");
      out.write("                <label for=\"student_register\"><b>STUDENT MATRIC</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Please Enter Student Matric\" name=\"student_register\" value=\"");
      out.print(resultSet.getString("student_register"));
      out.write("\" >\n");
      out.write("                \n");
      out.write("                <label for=\"student_address\"><b>STUDENT ADDRESS</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Please Enter Student Address\" name=\"student_address\" value=\"");
      out.print(resultSet.getString("student_address"));
      out.write("\">\n");
      out.write("                \n");
      out.write("                <label for=\"student_department\"><b>STUDENT DEPARTMENT</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Please Enter Student department\" name=\"student_department\" value=\"");
      out.print(resultSet.getString("student_department"));
      out.write("\">\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <label class=\"form-label\" for=\"selection_data\"><b>STATUS</b></label>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"mb-3\" align=\"left\">\n");
      out.write("                    <select class=\"form-select\" name=\"selection_data\" value=\"");
      out.print(resultSet.getString("selection_data"));
      out.write("\" >\n");
      out.write("                        <option selected value=\"\">CHOOSE..</option>\n");
      out.write("                        <option value=\"Success\">SUCCESS</option>\n");
      out.write("                        <option value=\"Declined\">DECLINED</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <button type=\"submit\">Submit</button>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("             <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("                    ");

                        }
                        connection.close();
                        } catch (Exception e){
                        e.printStackTrace();
                        }
                    
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
