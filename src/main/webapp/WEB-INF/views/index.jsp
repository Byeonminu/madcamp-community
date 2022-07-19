<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko" class="no-js">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <link rel="stylesheet" type="text/css" href="/resources/css/index.css">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>몰입캠프</title>
        <link href="/resources/image/mad_logo.png" rel="shortcut icon" type="image/x-icon">
    </head>

    <body>
    <input class="type" value="0" />
        <div class="container">
            <jsp:include page="./include/nav.jsp"></jsp:include>
            <main class="main_box">
                <div class="main_container">
                    <header>
                        <jsp:include page="./include/header.jsp"></jsp:include>
                    </header>
                    <main class="main_center">
                        <div class="row-0">
                            <div class="col">
                                <a href="/board-main?type=1" class="noti_title">공지사항</a>
                                <div class="noti_list">
                                    <!-- 글 3개 -->
                                </div>
                            </div>
                            <div class="col">
                                <div class="best_title">추천글</div>
                                <div class="best_list">
                                    <!-- 글 3개 -->
                                </div>

                            </div>
                        </div>
                        <div class="row-1">
                            <a href="/board-main?type=2" class="main_title">
                                일반 게시판
                            </a>
                            <div class="main_list">

                            </div>
                        </div>
                        <div class="row-1">
                            <a href="/board-main?type=3" class="generation_title">
                                몰입캠프 14기 게시판
                            </a>
                            <div class="generation_list">



                            </div>
                        </div>
        </main>
        </div>
        </main>
        </div>
    <script src="/resources/js/index.js"></script>
    </body>

</html>