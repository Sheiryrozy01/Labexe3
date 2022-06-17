<%-- 
    Document   : admin_update
    Created on : May 19, 2022, 11:31:15 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .top_nav{
            width: 100%;
            background-color: rgba(0, 0, 0, 0.3);
        }
        .nav{
            float: left;
            overflow: hidden;
        }
        .nav a{
            float: left;
            color: white;
            text-align: center;
            padding: 10px 12px;
            text-decoration: none;
            font-size: 17px;
        }
        .nav a:active{
            background-color: white;
            color: black;
        }
        .nav a:hover{
            background-color: white;
            color: black;
        }
        .center2{
            background-color: rgba(0,0,0,0,3);
            width: 800px;
            margin-left: auto;
            margin-right: auto;
        }
         </style>
    <body style="background-color: silver" >
        <table class="top_nav">
            <tr>
                <td class="nav">
                    <a href="ViewDataAdmin.jsp">VIEW STUDENT DATA</a>
                </td>
            </tr>
        </table>
        <%! String driverName = "com.mysql.jdbc.Driver";%>
        <%!String url = "jdbc:mysql://localhost:3306/labexercise_3";%>
        <%!String user = "root";%>
        <%!String psw = "";%>
        <%
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
        %>
    </body>
</html>
