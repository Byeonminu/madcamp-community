<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/login.css">
    <title>몰입캠프</title>
</head>

<body>
<div class="container">
    <jsp:include page="../include/nav.jsp"></jsp:include>
    <div class="wrapper fadeInDown">
        <div id="formContent">
            <!-- Tabs Titles -->
            <h2 class="active" id="top_signin"> Sign In </h2>
            <h2 class="inactive underlineHover" id="top_signun">Sign Up </h2>

            <!-- Icon -->
            <div class="fadeIn first">
                <a href="/">
                    <img class="logo" src="/resources/image/mad_logo.png" id="icon" alt="Madcamp Logo"/>
                </a>
            </div>

            <!-- Login Form -->
            <form action="/auth/login" method="post">
                <input type="text" id="login" class="fadeIn second" name="username" placeholder="email">
                <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
                <input type="submit" class="fadeIn fourth" value="Log In">
            </form>

            <!-- Remind Passowrd -->
            <div id="formFooter">
                <a class="underlineHover" href="#">Forgot Password?</a>
            </div>
        </div>
    </div>
</div>
<script src="/resources/js/login.js"></script>
</body>

</html>