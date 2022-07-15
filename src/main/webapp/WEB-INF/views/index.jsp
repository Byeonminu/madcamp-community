<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/index.css">
    <title>몰입캠프</title>
</head>

<body>
<div class="container">

    <jsp:include page="./include/nav.jsp"></jsp:include>

    <main class="main_box">
        <div class="main_container">
            <header>
                <div class="head_search">
                    <svg width="28" height="28" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path
                                d="M11.5 21C16.7467 21 21 16.7467 21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21Z"
                                stroke="#7A797D" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
                        <path d="M22 22L20 20" stroke="#7A797D" stroke-width="1.5" stroke-linecap="round"
                              stroke-linejoin="round"/>
                    </svg>
                    <input type="text" class="head_search_input"
                           placeholder="Search Item, Collection and Account..">

                </div>
                <div class="head_role">
                    <div class="head_role_user">User</div>
                    <div class="head_role_Creator">Creator</div>
                </div>
                <div class="head_bell">
                    <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path
                                d="M19.3399 14.49L18.3399 12.83C18.1299 12.46 17.9399 11.76 17.9399 11.35V8.82C17.9399 6.47 16.5599 4.44 14.5699 3.49C14.0499 2.57 13.0899 2 11.9899 2C10.8999 2 9.91994 2.59 9.39994 3.52C7.44994 4.49 6.09994 6.5 6.09994 8.82V11.35C6.09994 11.76 5.90994 12.46 5.69994 12.82L4.68994 14.49C4.28994 15.16 4.19994 15.9 4.44994 16.58C4.68994 17.25 5.25994 17.77 5.99994 18.02C7.93994 18.68 9.97994 19 12.0199 19C14.0599 19 16.0999 18.68 18.0399 18.03C18.7399 17.8 19.2799 17.27 19.5399 16.58C19.7999 15.89 19.7299 15.13 19.3399 14.49Z"
                                fill="#7A797D"/>
                        <path
                                d="M14.8301 20.01C14.4101 21.17 13.3001 22 12.0001 22C11.2101 22 10.4301 21.68 9.88005 21.11C9.56005 20.81 9.32005 20.41 9.18005 20C9.31005 20.02 9.44005 20.03 9.58005 20.05C9.81005 20.08 10.0501 20.11 10.2901 20.13C10.8601 20.18 11.4401 20.21 12.0201 20.21C12.5901 20.21 13.1601 20.18 13.7201 20.13C13.9301 20.11 14.1401 20.1 14.3401 20.07C14.5001 20.05 14.6601 20.03 14.8301 20.01Z"
                                fill="#7A797D"/>
                    </svg>
                </div>
                <div class="head_img">
                    <img src="resources/image/board/makguli.jpg" alt="">
                </div>
            </header>
            <main class="main_center">
                <div class="row-0">
                    <div class="col">
                        <div class="noti_list">
                            <div class="noti_title">공지사항</div>
                            <!-- 글 3개 -->
                            <ul class="noti_list_ul">
                                <div class="noti_list_sub">
                                    <li class="noti_list_title">창업케이스 #1 강의</li>
                                    <li class="noti_list_location">
                                        N117호
                                    </li>
                                    <li class="noti_list_time">
                                        2022.07.13 WED 14:30-16:00
                                    </li>
                                </div>
                            </ul>
                            <ul class="noti_list_ul">
                                <div class="noti_list_sub">
                                    <li class="noti_list_title">창업케이스 #1 강의</li>
                                    <li class="noti_list_location">
                                        N117호
                                    </li>
                                    <li class="noti_list_time">
                                        2022.07.13 WED 14:30-16:00
                                    </li>
                                </div>
                            </ul>
                            <ul class="noti_list_ul">
                                <div class="noti_list_sub">
                                    <li class="noti_list_title">창업케이스 #1 강의</li>
                                    <li class="noti_list_location">
                                        N117호
                                    </li>
                                    <li class="noti_list_time">
                                        2022.07.13 WED 14:30-16:00
                                    </li>
                                </div>
                            </ul>
                        </div>
                    </div>
                    <div class="col">
                        <div class="best_list">
                            <div class="best_title">추천글</div>
                            <!-- 글 3개 -->
                            <ul class="best_list_ul">
                                <li class="best_list_title">
                                    SpringBoot 세팅 방법
                                </li>
                                <div class="best_list_sub">
                                    <li class="best_list_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="best_list_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>5</div>
                                    </li>
                                    <li class="best_list_name">
                                        익명
                                    </li>
                                    <li class="best_list_time">
                                        1일 전
                                    </li>
                                </div>
                            </ul>
                            <ul class="best_list_ul">
                                <li class="best_list_title">
                                    SpringBoot 세팅 방법
                                </li>
                                <div class="best_list_sub">
                                    <li class="best_list_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="best_list_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>5</div>
                                    </li>
                                    <li class="best_list_name">
                                        익명
                                    </li>
                                    <li class="best_list_time">
                                        1일 전
                                    </li>
                                </div>
                            </ul>
                            <ul class="best_list_ul">
                                <li class="best_list_title">
                                    SpringBoot 세팅 방법
                                </li>
                                <div class="best_list_sub">
                                    <li class="best_list_heart">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>72</div>
                                    </li>
                                    <li class="best_list_comment">
                                        <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                    stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                        </svg>

                                        <div>5</div>
                                    </li>
                                    <li class="best_list_name">
                                        익명
                                    </li>
                                    <li class="best_list_time">
                                        1일 전
                                    </li>
                                </div>
                            </ul>
                        </div>

                    </div>
                </div>
                <div class="row-1">
                    <div class="main_title">
                        일반게시판
                    </div>
                    <div class="main_list">
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>

                    </div>
                </div>
                <div class="row-1">
                    <div class="main_title">
                        몰입캠프 14기 게시판
                    </div>
                    <div class="main_list">
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>
                        <ul class="main_list_ul">
                            <li class="main_list_title">
                                SpringBoot 세팅 방법
                            </li>
                            <div class="main_list_sub">
                                <li class="main_list_heart">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>72</div>
                                </li>
                                <li class="main_list_comment">
                                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path
                                                d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                                stroke="none" stroke-width="2" stroke-linejoin="round"/>
                                    </svg>

                                    <div>5</div>
                                </li>
                                <li class="main_list_name">
                                    익명
                                </li>
                                <li class="main_list_time">
                                    1일 전
                                </li>
                            </div>
                        </ul>

                    </div>
                </div>
        </div>
</div>
</main>
</div>
</main>
</div>
</body>

</html>