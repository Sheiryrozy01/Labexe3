<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"rel="stylesheet" integrity="sha384- 1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
                color:white;
                text-align: center;
                padding: 10px 12px;
                text-decoration: none;
                font-size: 17px;
            }
            .nav a:hover{
                background-color: white;
                color: black;
            }
            .nav a:active{
                background-color: white;
                color: black;
            }
            .center2 {
                background-color: rgba(0, 0, 0, 0.3);
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
        <br><br>
        <br><br>
        <form action="admin_login" method="POST">
            <table class="center2">
                <tr align="center">
                    <td>
                        <br>
                        <a><h2><b>ADMIN LOGIN</b></h2></a>
                        <br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <table align="center" width="60%">
                            <tr>
                                <td>
                                    <div class="mb-3 row">
                                        <label class="col-sm-2 col-form- label">Username</label>
                                        <div
                                            class="col-sm-10"> <input type="text" class="form-control" name="admin_username">     
                                        </div>

                                    </div>
                                    <div class="mb-3 row"> <label class="col-sm-2 col-form- label">Password</label>
                                        <div 
                                            class="col-sm-10"><input type="password" class="form-control" name="admin_password">
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </td> 
                </tr>
                <tr align="center">
                    <td>
                        <input type="submit" class="btn btn-dark w-25" value="Login">
                        <br>
                        <br>
                    </td>
                </tr>
            </table>

        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script> </body>
</head>