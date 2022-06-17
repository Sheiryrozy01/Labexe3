<%-- 
    Document   : StudentInsertData
    Created on : May 18, 2022, 2:14:22 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}

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

        .cancelbtn {
            padding: 14px 20px;
            background-color: #f44336;
        }

        .cancelbtn, .signupbtn {
            float: left;
            width: 50%;
        }

        .container {
            padding: 16px;
        }

        .clearfix::after {
            content: "";
            clear: both;
            display: table;
        }

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
    
    <script>
        function verify(){
            if(document.form1.student_name.value.length === 0){
                alert("Please Enter Student Name");
                return(false);
            }
            if(document.form1.student_ic.value.length === 0){
                alert("Please Enter Student IC");
                return(false);
            }
            if(document.form1.student_register.value.length === 0){
                alert("Please Enter Student Matric");
                return(false);
            }
            if(document.form1.student_address.value.length === 0){
                alert("Please Enter Student Address");
                return(false);
            }
            if(document.form1.student_department.value.length === 0){
                alert("Please select department");
                return(false);
            } 
        }
    </script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Student Information</title>
    </head>
    <body style="background-color: silver">
        <table class="top_nav">
            <tr>
                <td class="nav">
                    <a href="index.html">HOME</a>
                </td>
            </tr>
        </table>
        <form name="form1" method="POST" action="StudentProcessData.jsp">
            <div class="container">
                <h1>LAB EXERCISE 3</h1>
                <p>STUDENT REGISTRATION SYSTEM</p>
                <hr>
                <br>
                <br>
                <label for="student_name"><b>STUDENT NAME</b></label>
                <input type="text" placeholder="Please Enter Student Name" name="student_name" >

                <label for="student_ic"><b>STUDENT IC</b></label>
                <input type="text" placeholder="Please Enter Student IC" name="student_ic" >
                
                <label for="student_register"><b>STUDENT MATRIC</b></label>
                <input type="text" placeholder="Please Enter Student Matric" name="student_register" >
                
                <label for="student_address"><b>STUDENT ADDRESS</b></label>
                <input type="text" placeholder="Please Enter Student Address" name="student_address" >

                <br>
                <label class="form-label" for="student_department"><b>SELECT DEPARTMENT</b></label>
                <br>
                <div class="mb-3" align="left">
                    <select class="form-select" name="student_department">
                        <option selected value="">CHOOSE..</option>
                        <option value="JKE">JKE</option>
                        <option value="JTMK">JTMK</option>
                        <option value="JP">JP</option>
                    </select>
                </div>
                <br>
                

                <br>
                <br>
                <div class="clearfix">

                    <td colspan="3">
                        <button type="submit" onclick="return(verify())">Submit</button>

                    </td>
                </div>
            </div>
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>

