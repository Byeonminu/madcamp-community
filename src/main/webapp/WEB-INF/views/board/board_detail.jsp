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
    <link rel="stylesheet" href="/resources/css/board_detail.css">
    <script src="https://kit.fontawesome.com/fab8e6b94b.js" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <title>몰입캠프 게시판</title>
</head>

<body>
<input type="hidden" class="type" value="${boardRespDto.type}" />
<input type="hidden" class="boardId" value="${boardRespDto.id}" />
<input type="hidden" class="isLogin" value="${empty principal}" />
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
                <div class="reply_area_write">
                    <div class="reply_write_space">
                        <form action="/board/comment_write" method="post" class="reply_form">
                            <c:choose>
                                <c:when test="${empty  principal}">
                                    <textarea id="reply_textarea" name="reply" placeholder="로그인 후 이용하실 수 있습니다."></textarea>
                                    <button id="reply_submit_btn" class="logout_reply_submit_btn" type="button">동의</button>
                                </c:when>
                                <c:otherwise>
                                    <input type="hidden" class="principalUserId" name="principalUserId" value="${user.id}">
                                    <input type="hidden" name="boardid" value="${boardRespDto.id}">
                                    <textarea id="reply_textarea" class="ajaxComment" name="comment"  placeholder="댓글을 입력해주세요."></textarea>
                                    <button id="reply_submit_btn"  class="login_reply_submit_btn" type="button">작성</button>
                                </c:otherwise>
                            </c:choose>

                        </form>
                    </div>
                </div>
            </main>
        </div>
    </main>
</div>
<script src="/resources/js/board_detail.js"></script>
</body>

</html>