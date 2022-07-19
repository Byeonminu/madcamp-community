<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal" var="principal"/>
</sec:authorize>

<!DOCTYPE html>
<html lang="kor">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/resources/css/nav.css">
        <script src="https://kit.fontawesome.com/fab8e6b94b.js" crossorigin="anonymous"></script>
        <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>몰입캠프 게시판</title>
    </head>

    <body>
    <input type="hidden" class="type" value="${type}"/>
            <nav>
                <div class="nav_top">
                    <div class="nav_logo">
                        <a href="/">
                            <img src="/resources/image/mad_logo.png" alt="몰입캠프 로고" class="nav_img">
                        </a>
                    </div>
                    <div class="nav_auth">
                        <c:choose>
                            <c:when test="${empty principal}">
                                <a href="/login" class="login">LOG IN</a>
                                <a href="/signup" class="logout">SIGN UP</a>
                    </div>
                            </c:when>
                            <c:otherwise>
                                <a href="/user/${user.id}" class="login">${principal.nickname}님</a>
                                <a href="/logout" class="logout">LOG OUT</a>
                </div>
                <a href="/myprofile" class="myprofile">내 정보</a>
                            </c:otherwise>

                        </c:choose>

                    <div class="nav_board_container">


                    </div>
                </div>
                <div class="nav_bottom">
                    <div class="nav_mode">
                        <ul class="nav_mode_ul">



                            </li>
                        </ul>
                    </div>
                    <div class="nav_view_count">
                        <div class="nav_view_count_container">
                            <div class="nav_view_count_text">오늘의 접속자 수</div>
                            <div class="nav_view_count_num">
                                <svg width="16" height="17" viewBox="0 0 16 17" fill="none"
                                     xmlns="http://www.w3.org/2000/svg">
                                    <g clip-path="url(#clip0_116_112)">
                                        <path
                                                d="M5 9.5C5.5 11 7 11.5 8 11.5C9 11.5 10.5 11 11 9.5M6 6.5195V6.5M10 6.5195V6.5M15 8.5C15 12.366 11.866 15.5 8 15.5C4.13401 15.5 1 12.366 1 8.5C1 4.63401 4.13401 1.5 8 1.5C11.866 1.5 15 4.63401 15 8.5Z"
                                                stroke="black" stroke-width="2" stroke-linecap="round"
                                                stroke-linejoin="round" />
                                    </g>
                                    <defs>
                                        <clipPath id="clip0_116_112">
                                            <rect width="16" height="16" fill="white" transform="translate(0 0.5)" />
                                        </clipPath>
                                    </defs>
                                </svg>
                                <div class="num">${viewcnt}</div>
                            </div>
                            <div class="nav_view_count_per">
                                <svg width="24" height="24" viewBox="0 0 24 24" fill="none"
                                     xmlns="http://www.w3.org/2000/svg">
                                    <path d="M12 6V18M7 11L12 6L7 11ZM12 6L17 11L12 6Z" stroke="#36BC4C" stroke-width="1.5"
                                          stroke-linecap="round" stroke-linejoin="round" />
                                </svg>
                                <div>${percent}%</div>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        <script src="/resources/js/nav.js"></script>
    </body>

</html>