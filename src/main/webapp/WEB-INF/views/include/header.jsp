<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kor">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/resources/css/header.css">
        <script src="https://kit.fontawesome.com/fab8e6b94b.js" crossorigin="anonymous"></script>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>몰입캠프 게시판</title>
        <link href="/resources/image/mad_logo.png" rel="shortcut icon" type="image/x-icon" >
    </head>

    <body>
        <div class="head_search">
            <svg class="searchBtn" width="28" height="28" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                        d="M11.5 21C16.7467 21 21 16.7467 21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21Z"
                        stroke="#7A797D" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M22 22L20 20" stroke="#7A797D" stroke-width="1.5" stroke-linecap="round"
                      stroke-linejoin="round" />
            </svg>
            <input type="text" class="head_search_input"
                   placeholder="Search Item, Collection and Account..">

        </div>
        <div class="head_role">
            <c:choose>
                <c:when test="${user.isadmin eq 'ROLE_ADMIN'}">
                    <div  class="head_role_user">USER</div>
                    <a href="/admin" id="isAdmin" class="head_role_Creator">ADMIN</a>
                </c:when>
                <c:otherwise>
                    <div id="isAdmin" class="head_role_user">USER</div>
                    <div  class="head_role_Creator">ADMIN</div>
                </c:otherwise>
            </c:choose>

        </div>
        <div class="head_bell">
            <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                        d="M19.3399 14.49L18.3399 12.83C18.1299 12.46 17.9399 11.76 17.9399 11.35V8.82C17.9399 6.47 16.5599 4.44 14.5699 3.49C14.0499 2.57 13.0899 2 11.9899 2C10.8999 2 9.91994 2.59 9.39994 3.52C7.44994 4.49 6.09994 6.5 6.09994 8.82V11.35C6.09994 11.76 5.90994 12.46 5.69994 12.82L4.68994 14.49C4.28994 15.16 4.19994 15.9 4.44994 16.58C4.68994 17.25 5.25994 17.77 5.99994 18.02C7.93994 18.68 9.97994 19 12.0199 19C14.0599 19 16.0999 18.68 18.0399 18.03C18.7399 17.8 19.2799 17.27 19.5399 16.58C19.7999 15.89 19.7299 15.13 19.3399 14.49Z"
                        fill="#7A797D" />
                <path
                        d="M14.8301 20.01C14.4101 21.17 13.3001 22 12.0001 22C11.2101 22 10.4301 21.68 9.88005 21.11C9.56005 20.81 9.32005 20.41 9.18005 20C9.31005 20.02 9.44005 20.03 9.58005 20.05C9.81005 20.08 10.0501 20.11 10.2901 20.13C10.8601 20.18 11.4401 20.21 12.0201 20.21C12.5901 20.21 13.1601 20.18 13.7201 20.13C13.9301 20.11 14.1401 20.1 14.3401 20.07C14.5001 20.05 14.6601 20.03 14.8301 20.01Z"
                        fill="#7A797D" />
            </svg>
        </div>
        <div class="head_img">
            <img src="/resources/image/board/makguli.jpg" alt="">
        </div>
        <script src="/resources/js/header.js"></script>
    </body>

</html>