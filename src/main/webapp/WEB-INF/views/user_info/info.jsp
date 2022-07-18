<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%><!DOCTYPE html>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/info.css">
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
                                    NICKNAME
                                </li>
                                <li class="my_info email">
                                    EMAIL@email.com
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col1 my_comment_box">
                        <div class="my_comment_title">내 댓글</div>
                        <div class="my_post_white_box">
                            <!-- 글 10개 -->
                            <div class="my_comment">
                                <div class="my_comment_headline">내가 쓴 댓글</div>
                                <ul class="my_comment_info">
                                    <li class="my_comment_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_comment_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_comment_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                            <div class="my_comment">
                                <div class="my_comment_headline">내가 쓴 댓글</div>
                                <ul class="my_comment_info">
                                    <li class="my_comment_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_comment_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_comment_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                            <div class="my_comment">
                                <div class="my_comment_headline">내가 쓴 댓글</div>
                                <ul class="my_comment_info">
                                    <li class="my_comment_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_comment_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_comment_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                        </div>
                        <!-- 댓글 10개씩? -->
                        <ul class="my comment count">
                            <li class="my comment count">&lt;</li>
                            <li class="my comment count">1</li>
                            <li class="my comment count">2</li>
                            <li class="my comment count">3</li>
                            <li class="my comment count">&gt;</li>
                        </ul>
                    </div>
                </div>
                <div class="row b">
                    <div class="col0 my_post_box">
                        <div class="my_post_title">내 글</div>
                        <div class="my_post_white_box">
                            <!-- 글 10개 -->
                            <div class="my_post">
                                <div class="my_post_headline">내가 쓴 글</div>
                                <ul class="my_post_info">
                                    <li class="my_post_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_post_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_post_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                            <div class="my_post">
                                <div class="my_post_headline">내가 쓴 글</div>
                                <ul class="my_post_info">
                                    <li class="my_post_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_post_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_post_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                            <div class="my_post">
                                <div class="my_post_headline">내가 쓴 글</div>
                                <ul class="my_post_info">
                                    <li class="my_post_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="my_post_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round" />
                                        </svg>
                                        <div>5</div>
                                    </li>
                                    <li class="my_post_date">2022.07.16 08:00:00</li>
                                </ul>
                            </div>
                        </div>
                        <ul class="my post count">
                            <li class="my post count"><a href="">&lt;</a></li>
                            <li class="my post count">1</li>
                            <li class="my post count">2</li>
                            <li class="my post count">3</li>
                            <li class="my post count">&gt;</li>
                        </ul>
                    </div>

                </div>
            </div>
        </div>

    </div>
</div>
</body>

</html>