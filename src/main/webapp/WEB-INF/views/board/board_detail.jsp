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
                            몰입캠프 14기 게시판
                        </div>
                        <div class="main_container2">
                            <div class="main_top">
                                <div class="main_profile">
                                    <img class="user_img" src="/resources/image/board/makguli.jpg" alt="">
                                    <div class="main_profile_box">
                                        <div class="main_profile_name">신종민</div>
                                        <div class="main_profile_date">2022-07-15 01:11:11</div>
                                    </div>
                                </div>
                                <div class="main_board_detail">
                                    <div class="likeCount">좋아요 : 50</div>
                                    <div class="commentCount">댓글 : 23</div>
                                    <div class="reportCount">신고</div>
                                </div>

                            </div>
                            <div class="main_mid">
                                <div class="main_mid_title">
                                    나랑 놀 사람
                                </div>
                                <div class="main_mid_context">
                                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Provident nobis ullam quibusdam,
                                    aperiam minima deleniti voluptatem ipsa, hic unde labore suscipit dolorem exercitationem
                                    quia dolorum accusantium ipsam doloremque adipisci consequatur?
                                </div>
                                <h5 class="main_mid_comment_title">댓글</h5>
                                <div class="main_mid_comment">
                                    <ul class="main_mid_comment_ul">
                                        <li class="main_mid_comment_li_top">
                                            <div class="main_mid_comment_li_left">

                                                <img class="comment_img" src="/resources/image/board/makguli.jpg" alt="">
                                                <div class="comment_user">
                                                    <h5 class="main_mid_comment_li_title">변민우</h5>
                                                    <p>2022-07-15 01:12:11</p>
                                                </div>
                                            </div>
                                            <div class="main_mid_comment_li_right">
                                                <div class="main_mid_comment_li_right_like">좋아요 : 15</div>
                                                <div class="main_mid_comment_li_right_reco">대댓글 : 3</div>
                                                <div class="main_mid_comment_li_right_report">신고</div>
                                            </div>
                                        </li>
                                        <li class="main_mid_comment_li_bottom">댓글댓글댓글댓글</li>
                                        <div class="main_mid_recomment">
                                            <ul class="reco_ul">
                                                <li class="recomment_li_top">
                                                    <div class="recomment_li_left">
                                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                                             xmlns="http://www.w3.org/2000/svg">
                                                            <path d="M1 8L15 8M15 8L9 1M15 8L9 15" stroke="black" stroke-width="2"
                                                                  stroke-linecap="round" stroke-linejoin="round" />
                                                        </svg>
                                                        <img class="reco_img" src="/resources/image/board/makguli.jpg" alt="">
                                                        <div class="reco_user">
                                                            <h5 class="recomment_li_title">최예빈</h5>
                                                            <p>2022-07-15 01:13:11</p>
                                                        </div>
                                                    </div>
                                                    <div class="recomment_li_right">
                                                        <div class="recomment_li_right_like">좋아요 : 3</div>
                                                        <div class="recomment_li_right_report">신고</div>
                                                    </div>
                                                </li>
                                                <li class="recomment_text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                                    Dolores molestiae architecto animi nulla dolorem est, rerum,
                                                    fugit laboriosam laborum hic quis saepe obcaecati, doloribus odit
                                                    voluptas quaerat cum tenetur voluptate!</li>
                                            </ul>
                                        </div>
                                        <div class="main_mid_recomment">
                                            <ul class="reco_ul">
                                                <li class="recomment_li_top">
                                                    <div class="recomment_li_left">
                                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                                             xmlns="http://www.w3.org/2000/svg">
                                                            <path d="M1 8L15 8M15 8L9 1M15 8L9 15" stroke="black" stroke-width="2"
                                                                  stroke-linecap="round" stroke-linejoin="round" />
                                                        </svg>
                                                        <img class="reco_img" src="/resources/image/board/makguli.jpg" alt="">
                                                        <div class="reco_user">
                                                            <h5 class="recomment_li_title">최예빈</h5>
                                                            <p>2022-07-15 01:13:11</p>
                                                        </div>
                                                    </div>
                                                    <div class="recomment_li_right">
                                                        <div class="recomment_li_right_like">좋아요 : 3</div>
                                                        <div class="recomment_li_right_report">신고</div>
                                                    </div>
                                                </li>
                                                <li class="recomment_text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                                    Dolores molestiae architecto animi nulla dolorem est, rerum,
                                                    fugit laboriosam laborum hic quis saepe obcaecati, doloribus odit
                                                    voluptas quaerat cum tenetur voluptate!</li>
                                            </ul>
                                        </div>
                                    </ul>
                                    <ul class="main_mid_comment_ul">
                                        <li class="main_mid_comment_li_top">
                                            <div class="main_mid_comment_li_left">

                                                <img class="comment_img" src="/resources/image/board/makguli.jpg" alt="">
                                                <div class="comment_user">
                                                    <h5 class="main_mid_comment_li_title">변민우</h5>
                                                    <p>2022-07-15 01:12:11</p>
                                                </div>
                                            </div>
                                            <div class="main_mid_comment_li_right">
                                                <div class="main_mid_comment_li_right_like">좋아요 : 15</div>
                                                <div class="main_mid_comment_li_right_reco">대댓글 : 3</div>
                                                <div class="main_mid_comment_li_right_report">신고</div>
                                            </div>
                                        </li>
                                        <li class="main_mid_comment_li_bottom">댓글댓글댓글댓글</li>
                                        <div class="main_mid_recomment">
                                            <ul class="reco_ul">
                                                <li class="recomment_li_top">
                                                    <div class="recomment_li_left">
                                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                                             xmlns="http://www.w3.org/2000/svg">
                                                            <path d="M1 8L15 8M15 8L9 1M15 8L9 15" stroke="black" stroke-width="2"
                                                                  stroke-linecap="round" stroke-linejoin="round" />
                                                        </svg>
                                                        <img class="reco_img" src="/resources/image/board/makguli.jpg" alt="">
                                                        <div class="reco_user">
                                                            <h5 class="recomment_li_title">최예빈</h5>
                                                            <p>2022-07-15 01:13:11</p>
                                                        </div>
                                                    </div>
                                                    <div class="recomment_li_right">
                                                        <div class="recomment_li_right_like">좋아요 : 3</div>
                                                        <div class="recomment_li_right_report">신고</div>
                                                    </div>
                                                </li>
                                                <li class="recomment_text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                                    Dolores molestiae architecto animi nulla dolorem est, rerum,
                                                    fugit laboriosam laborum hic quis saepe obcaecati, doloribus odit
                                                    voluptas quaerat cum tenetur voluptate!</li>
                                            </ul>
                                        </div>
                                    </ul>

                                </div>
                            </div>
                        </div>


                        <div class="main_num_list">


                        </div>

                    </main>


<%--                    <script src="/resources/js/board.js"></script>--%>
    </body>

</html>