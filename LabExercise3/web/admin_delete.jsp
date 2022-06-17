<%-- 
    Document   : admin_delete
    Created on : May 19, 2022, 11:31:41 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <head>
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
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Data</title>
    </head>
    <body style="background-color: silver">
        <table class="top_nav">
            <tr>
                <td class="nav">
                    <a href="ViewDataAdmin.jsp">VIEW STUDENT DATA</a>
                </td>
            </tr>
        </table>
        <%
            String id=request.getParameter("student_id");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/labexercise_3", "root", "");
                Statement st = conn.createStatement();
                
                int i=st.executeUpdate("DELETE FROM data WHERE student_id="+id);
                out.println("Data Deleted Successfully");
            }
            catch(Exception e){
                System.out.print(e);
                e.printStackTrace();
                out.println(e);
            }
        %>
    </body>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</html>
