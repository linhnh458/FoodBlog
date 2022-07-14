<%-- 
    Document   : Login
    Created on : Mar 8, 2022, 9:57:16 PM
    Author     : Halinh
--%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <!-- favicon -->
        <link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
    </head>

    <style>
        body{
            /*background-color: #85C88A;*/
            background-color: #F3E9DD;
            font-family: sans-serif;
        }
        .login{
            width: 300px;
            height: 340px;
            font-size: 18px;
            background-color: white;
            border: 1px solid grey;
            border-radius: 8px;
            text-align: center;
            margin-top: 32px;
            /*margin: 0px auto;*/
        }
        .login h2{
            display: inline-block;
            color: grey;
        }
        .login input{
            width: 200px;
            height: 30px;
            border-radius: 8px;
            border: 1px solid grey;
            padding-left: 5px;
            margin-bottom: 17px;
            margin-top: 5px;
        }
        .login button{
            width: 100px;
            height: 40px;
            font-size: 17px;
            border: none;
            border-radius: 5px;
            background-color: #85C88A;
            color: white;
            cursor: pointer;
        }
        #showpass{
            width: 15px;
        }
        .show{
            font-size: 13px;
        }
        p{
            display: inline-block;
            float:left;
            padding-left: 50px;
            margin: 0px;
        }
    </style>
    <body>
    <center>
        <form class="login" action="login" method="post">
            <h2>Login</h2> <br>
            <p>Username</p> <br>
            <input name="username" placeholder="Enter username" type="text" value="${requestScope.uname}"> <br>
            <p>Password</p> <br>
            <input id="password" name="pass" placeholder="Enter password" type="password" value="${requestScope.pass}">
            <br> 
            <br>
            <button>Login</button> <br>  
        </form>
        <h3>${requestScope.mess}</h3>
    </center>
<!--
    <script>
        function myFunction() {
            var x = document.getElementById("password");
            if (x.type === "password") {
                x.type = "text";
            } else {
                x.type = "password";
            }
        }
    </script>-->
</body>
</html>
