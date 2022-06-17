<%-- 
    Document   : StudentProcessData
    Created on : May 18, 2022, 2:50:05 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data process</title>
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
         
    <body style="background-color: silver">
        <table class="top_nav">
            <tr>
                <td class="nav">
                    <a href="index.html">HOME</a>
                </td>
            </tr>
        </table>
        <%
            String student_name = request.getParameter("student_name");
            String student_ic = request.getParameter("student_ic");
            String student_register = request.getParameter("student_register");
            String student_address = request.getParameter("student_address");
            String student_department = request.getParameter("student_department");
            String selection_data = request.getParameter("selection_data");
            

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/labexercise_3", "root", "");
                Statement st = conn.createStatement();
                
                int i = st.executeUpdate("insert into data(student_name,student_ic,student_register,student_address,student_department,selection_data )values('"+student_name+"','"+student_ic+"','"+student_register+"','"+student_address+"','"+student_department+"','"+selection_data+"')");
                out.println("data is successfully inserted");
            } catch (Exception e) {
                System.out.print(e);
                e.printStackTrace();
                out.println(e);

            }
        %>
    </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</html>