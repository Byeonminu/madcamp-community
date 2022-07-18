<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<!DOCTYPE html>
<html lang="kor">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/resources/css/board.css">
        <script src="https://kit.fontawesome.com/fab8e6b94b.js" crossorigin="anonymous"></script>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>몰입캠프 게시판</title>
    </head>

    <body>
    <input class="type" value="${type}"/>
        <div class="container">
            <jsp:include page="../include/nav.jsp"></jsp:include>
            <main class="main_box">
                <div class="main_container">
                    <header>
                        <jsp:include page="../include/header.jsp"></jsp:include>
                    </header>
                    <main class="main_center">
                        <div class="main_title">
                            일반게시판
                        </div>
                        <div class="main_list">


                        </div>
                        <div class="main_num_list">


                        </div>
                        <div>


                        </div>


                    </main>

                </div>
            </main>
        </div>
        <script src="/resources/js/board.js"></script>
    </body>

</html>