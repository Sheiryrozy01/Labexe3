<%-- 
    Document   : admin_edit
    Created on : May 19, 2022, 11:31:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <body>
        <%
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
        %>
        <%
            try {
                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                statement = connection.createStatement();
                String sql = "select * from data where student_id=" + id;
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {

        %>
    </body>
</html>

<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}


        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for all buttons */
        button {
            background-color: #34495E;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        button:hover {
            opacity:1;
        }

        /* Extra styles for the cancel button */
        .cancelbtn {
            padding: 14px 20px;
            background-color: #f44336;
        }

        /* Float cancel and signup buttons and add an equal width */
        .cancelbtn, .signupbtn {
            float: left;
            width: 50%;
        }

        /* Add padding to container elements */
        .container {
            padding: 16px;
        }

        /* Clear floats */
        .clearfix::after {
            content: "";
            clear: both;
            display: table;
        }

        /* Change styles for cancel button and signup button on extra small screens */
        @media screen and (max-width: 300px) {
            .cancelbtn, .signupbtn {
                width: 100%;
            }

            td, th{border: opx solid #ddd; text-align: left;}
            table {border-collapse: collapse; width: 24.5%; border-style:solid;
                   border-width: 2px; border-color: appworkspace;}
            th, td{padding: 5px;}
        }
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
    <body style="background-color: silver;">
        <table class="top_nav">
            <tr>
                <td class="nav">
                    <a href="index.html">HOME</a>
                </td>
            </tr>
        </table>
        <br>
        <br>
        <h1 align="center" >Update data form database in jsp</h1>
        <form method="post" action="admin_update.jsp">
            <input type="hidden" name="student_id" value="<%=resultSet.getString("student_id")%>">
            <div class="container">
                <hr>
                <br>
                <br>
                <label for="student_name"><b>STUDENT NAME</b></label>
                <input type="text" placeholder="Please Enter Student Name" name="student_name" value="<%=resultSet.getString("student_name")%>"  >
                
                <label for="student_ic"><b>STUDENT IC</b></label>
                <input type="text" placeholder="Please Enter Student IC" name="student_ic" value="<%=resultSet.getString("student_ic")%>" >
                
                <label for="student_register"><b>STUDENT MATRIC</b></label>
                <input type="text" placeholder="Please Enter Student Matric" name="student_register" value="<%=resultSet.getString("student_register")%>" >
                
                <label for="student_address"><b>STUDENT ADDRESS</b></label>
                <input type="text" placeholder="Please Enter Student Address" name="student_address" value="<%=resultSet.getString("student_address")%>">
                
                <label for="student_department"><b>STUDENT DEPARTMENT</b></label>
                <input type="text" placeholder="Please Enter Student department" name="student_department" value="<%=resultSet.getString("student_department")%>">
                
                <br>
                <label class="form-label" for="selection_data"><b>STATUS</b></label>
                <br>
                <div class="mb-3" align="left">
                    <select class="form-select" name="selection_data" value="<%=resultSet.getString("selection_data")%>" >
                        <option selected value="">CHOOSE..</option>
                        <option value="Success">SUCCESS</option>
                        <option value="Declined">DECLINED</option>
                    </select>
                </div>
                <br>
                <br>
                <div class="clearfix">

                    <td colspan="3">
                        <button type="submit">Submit</button>

                    </td>
                </div>
            </div>
        </form>
             <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                    <%
                        }
                        connection.close();
                        } catch (Exception e){
                        e.printStackTrace();
                        }
                    %>    
    </body>
</html>