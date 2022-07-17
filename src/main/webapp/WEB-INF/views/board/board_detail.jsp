<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<!DOCTYPE html>
<html lang="kor">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/resources/css/board_detail.css">
    <script src="https://kit.fontawesome.com/fab8e6b94b.js" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <title>몰입캠프 게시판</title>
</head>

<body>
<input class="type" value="${boardRespDto.type}" />
<input class="boardId" value="${boardRespDto.id}" />
<div class="container">
    <jsp:include page="../include/nav.jsp"></jsp:include>
    <main class="main_box">
        <div class="main_container">
            <header>
                <jsp:include page="../include/header.jsp"></jsp:include>
            </header>
            <main class="main_center">
                <div class="main_title">
                    몰입캠프 14기 게시판
                </div>
                <div class="main_container2">
                    <div class="main_top">
                        <div class="main_profile">
                            <img class="user_img" src="/resources/image/board/makguli.jpg" alt="">
                            <%-- <img class="user_img" src="${userDto.picture}" alt="">--%>
                            <div class="main_profile_box">
                                <div class="main_profile_name">${userDto.nickname}</div>
                                <div class="main_profile_date">${boardRespDto.updatedate}</div>
                            </div>
                        </div>
                        <div class="main_board_detail">
                            <div class="likeCount">좋아요 : ${boardRespDto.likecnt}</div>
                            <div class="commentCount">댓글 : ${boardRespDto.commentcnt}</div>
                            <div class="reportCount">신고</div>
                        </div>

                    </div>
                    <div class="main_mid">
                        <div class="main_mid_title">
                            ${boardRespDto.title}
                        </div>
                        <div class="main_mid_context">
                            ${boardRespDto.description}
                        </div>
                        <h5 class="main_mid_comment_title">댓글</h5>
                        <div class="main_mid_comment">
<%--                            댓글  --%>


                        </div>
                    </div>
                </div>
                <div class="main_num_list">

                </div>
            </main>
        </div>
    </main>
</div>
<script src="/resources/js/board_detail.js"></script>
</body>

</html>