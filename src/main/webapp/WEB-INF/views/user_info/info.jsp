<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/resources/css/info.css">
    <link href="/resources/image/mad_logo.png" rel="shortcut icon" type="image/x-icon">
    <title>내 정보</title>
</head>

<body>
    <div class="container">
        <jsp:include page="../include/nav.jsp"></jsp:include>
        <div class="main_box">
            <div class="main_container">
                <header>
                    <jsp:include page="../include/header.jsp"></jsp:include>
                </header>
                <div class="main_center">
                    <div class="row_0">
                        <div class="col0 my_info_box">
                            <div class="my_info_title">내 정보</div>
                            <div class="my_info_white_box">
                                <ul class="my_info_white_box">
                                    <li class="my_info img">
                                        <img class="my_info img-circle" src="/resources/image/board/makguli.jpg" alt="내 프로필 사진">
                                    </li>
    <%--                                <li class="my_info change img">--%>
    <%--                                    <button>프로필 사진 변경</button>--%>
    <%--                                </li>--%>
                                    <li class="my_info nickname">
                                        ${user.nickname}
                                    </li>
                                    <li class="my_info email">
                                        ${user.username}
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="col1 my_comment_box">
                            <div class="my_comment_title">내 댓글</div>
                            <div class="my_post_white_box mycomments">
                                <!-- 글 10개 -->

                            <!-- 댓글 10개씩? -->

                        </div>
                            <div class="main_num_list_c">


                            </div>
                    </div>

                </div>
                    <div class="row b">
                        <div class="col0 my_post_box">
                            <div class="my_post_title">내 글</div>
                            <div class="my_post_white_box myBoards">
                                <!-- 글 10개 -->


                            </div>
                            <div class="main_num_list_b">


                            </div>
                        </div>

                    </div>
            </div>
            </div>
        </div>
    </div>
            <script src="/resources/js/info.js"></script>
</body>

</html>