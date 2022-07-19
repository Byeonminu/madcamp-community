const type = document.querySelector('.type').value;
const boardID = document.querySelector('.boardId').value;
const main_title = document.querySelector('.main_title');
const principalUserId = document.querySelector('.principalUserId').value;
const isLogin = document.querySelector('.isLogin').value;
const comment_submit_btn = document.querySelector('.login_reply_submit_btn');

comment_submit_btn.onclick = () => {
    const ajaxComment = document.querySelector('.ajaxComment').value;
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/comment_write?principalUserId=${principalUserId}&boardid=${boardID}&comment=${ajaxComment}`,
        dataType: "text",
        success: function (data) {
            alert("댓글작성이 완료되었습니다.");
            commentLoad(boardID);
        },
        error: function () {
            alert('댓글작성 비동기 처리오류');
        }

    });
}

if (type == 1) {
    main_title.innerHTML = "공지사항";

} else if (type == 2) {
    main_title.innerHTML = "일반 게시판";

} else if (type == 3) {
    main_title.innerHTML = "몰입캠프 14기";

}
let addItem = ``;
let recommentItem = ``;





// 게시글 댓글 가져오기 ///////////////////////////////////////
const commentParent = document.querySelector('.main_mid_comment');
commentLoad(boardID);

function commentLoad(boardID) {
    $.ajax({

        type: "get",
        // type 동적으로 처리하기
        url: `/board/comment/${boardID}`,
        dataType: "text",
        async:false,
        success: function (data) {
            let commentItem = ``;
            let commentListObj = JSON.parse(data);
            commentItem += getcomments(commentListObj);
            commentParent.innerHTML = commentItem;
        },
        error: function () {
            alert('comment 비동기 처리오류');
        }

    });

}
function getcomments(commentList) {
    let commentHtml = ``;
    let loginHtml = ``;
    for (let comment of commentList) {
        recomment1Load(`${comment.id}`)
        let addItem = recommentItem;
        if(!isLogin) {
            `
            <textarea id="reply_textarea" name="reply" placeholder="로그인 후 이용하실 수 있습니다."></textarea>
            <button id="reply_submit_btn" class="logout_reply_submit_btn" type="button">작성</button>`;
        }
        else {
            loginHtml = `<input type="hidden" class="principalUserId" name="principalUserId" value="${principalUserId}">
                        <input type="hidden"  class="ajaxCommentId" name="commentid" value="${comment.id}">
                        <textarea id="reply_textarea" class="ajaxRecomments" name="recomment"  placeholder="대댓글을 입력해주세요."></textarea>
                        <button id="comment_submit_btn"  class="login_reply_submit_btn" type="button">작성</button>`;
        }
        commentHtml += `
        <ul class="main_mid_comment_ul">
            <li class="main_mid_comment_li_top">
                <div class="main_mid_comment_li_left">

                    <img class="comment_img" src="../resources/image/board/makguli.jpg"
                        alt="">
                    <div class="comment_user">
                        <h5 class="main_mid_comment_li_title">익명</h5>
                        <p> ${comment.createdate}</p>
                    </div>
                </div>
                <div class="main_mid_comment_li_right">
                    <div class="main_mid_comment_li_right_like">좋아요 : ${comment.comlikecnt}</div>
                    <div class="main_mid_comment_li_right_reco">대댓글 : ${comment.recommentcnt}</div>
                    <div class="main_mid_comment_li_right_report">신고</div>
                </div>
            </li>
            <li class="main_mid_comment_li_bottom">${comment.comment}</li>
            <div class="main_mid_recomment">`
            + addItem + `
            </div>
            <form action="/board/recomment_write" id='recomment_write' class="reply_form recomment_submit_btn" method="post" style="display: none">
                `+ loginHtml +
              `  
            </form>
        </ul>

      `;

    }
    return commentHtml;
}
// 대댓글
function recomment1Load(commentId) {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/board/recomment/${commentId}`,
        dataType: "text",
        async: false,
        success: function (data) {
            recommentItem = ``;
            let recommentListObj = JSON.parse(data);
            recommentItem += getrecomments(recommentListObj);
        },
        error: function () {
            alert('recomment 비동기 처리오류');
        }

    });

}
function getrecomments(recommentList) {
    let recommentHtml = ``;
    for (let recomment of recommentList){
                recommentHtml += `
            <ul class="reco_ul">
                <li class="recomment_li_top">
                    <div class="recomment_li_left">
                        <svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                            xmlns="http://www.w3.org/2000/svg">
                            <path d="M1 8L15 8M15 8L9 1M15 8L9 15" stroke="black"
                                stroke-width="2" stroke-linecap="round"
                                stroke-linejoin="round" />
                        </svg>
                        <img class="reco_img" src="../resources/image/board/makguli.jpg"
                            alt="">
                        <div class="reco_user">
                            <h5 class="recomment_li_title">익명</h5>
                            <p> ${recomment.createdate}</p>
                        </div>
                    </div>
                    <div class="recomment_li_right">
                        <div class="recomment_li_right_like">좋아요 : ${recomment.recomlikecnt}</div>
                        <div class="recomment_li_right_report">신고</div>
                    </div>
                </li>
                <li class="recomment_text">${recomment.recomment}</li>
            </ul>
    
          `;

        }
        return recommentHtml;


}
// 게시글 대댓글 가져오기///////////////////////////////////////
setTimeout(() => {
    const RecoBtn = document.querySelectorAll('.main_mid_comment_li_right_reco');
    var write_form = document.querySelectorAll('#recomment_write');

    for(let i=0; i<RecoBtn.length; i++){
        RecoBtn[i].onclick = () => {
            write_form[i].style.display = 'block';
        }
    }
    const recomment_submit_btn = document.querySelectorAll('#comment_submit_btn');
    const ajaxCommentId = document.querySelectorAll('.ajaxCommentId');
    var ajaxRecomments = ``;

    for(let i=0; i<recomment_submit_btn.length;i++){

        recomment_submit_btn[i].onclick = () => {
            ajaxRecomments = document.querySelectorAll('.ajaxRecomments');

            $.ajax({

                type: "post",
                // type 동적으로 처리하기
                url: `/board/recomment_write?principalUserId=${principalUserId}&commentid=${ajaxCommentId[i].value}&recomment=${ajaxRecomments[i].value}`,
                dataType: "text",
                success: function (data) {
                    commentLoad(boardID);
                },
                error: function () {
                    alert('댓글작성 비동기 처리오류');
                }

            });
        }
    }
    const logout_reply_submit_btn = document.querySelectorAll('logout_reply_submit_btn');
    for(let i =0; i<logout_reply_submit_btn.length;i++){
        logout_reply_submit_btn[i].onclick = () => {
            alert('')
            document.location.href = '/login';
        }
    }
    const main_background = document.querySelector('.main_box');
    main_background.style.backgroundColor = '#F8F8F8';

    const boardLike = document.querySelector('.likeCount');
    const boardReport = document.querySelector('.reportCount');

    const commentLike = document.querySelectorAll('.main_mid_comment_li_right_like');
    const commentReport = document.querySelectorAll('.main_mid_comment_li_right_report');
    const recommentLike = document.querySelectorAll('.recomment_li_right_like');
    const recommentReport = document.querySelectorAll('.recomment_li_right_report');
    boardLike.onclick = () => {
        funBoardLike(boardID);

    }
    boardReport.onclick = () => {
        funBoardReport(boardID);
    }
    for(let i=0;i<commentLike.length; i++){
        commentLike[i].onclick = () => {
            alert('댓글 클릭');
            funCommentLike(ajaxCommentId[i].value);
        }
    }
    for(let i=0;i<commentReport.length; i++){
        commentReport[i].onclick = () => {
            funCommentReport(ajaxCommentId[i].value);
        }
    }
    for(let i=0;i<recommentLike.length; i++){
        recommentLike[i].onclick = () => {
            funRecommentLike(ajaxRecomments[i].value);
        }
    }
    for(let i=0;i<recommentReport.length; i++){
        recommentReport[i].onclick = () => {
            funRecommentReport(ajaxRecomments[i].value)
        }
    }

}, 500);


function funBoardLike(boardid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/likeup/board?boardid=${boardid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                history.go(0);
            }else {
                alert('좋아요는 한번 만 가능합니다.');
            }

        },
        error: function () {
            alert('게시글 좋아요 비동기 처리오류');
        }

    });
}
function funBoardReport(boardid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/report/board?boardid=${boardid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                alert('신고 접수가 완료되었습니다.');
                history.go(0);
            }else {
                alert('신고는 한번 만 가능합니다.');

            }

        },
        error: function () {
            alert('게시글 신고 비동기 처리오류');
        }

    });
}

function funCommentLike(commentid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/likeup/comment?commentid=${commentid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                history.go(0);
            }else {
                alert('좋아요는 한번 만 가능합니다.');
            }

        },
        error: function () {
            alert('댓글 좋아요 비동기 처리오류');
        }

    });
}
function funCommentReport(commentid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/report/comment?commentid=${commentid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                alert('신고 접수가 완료되었습니다.');
                history.go(0);
            }else {
                alert('신고는 한번 만 가능합니다.');
            }

        },
        error: function () {
            alert('댓글신고 비동기 처리오류');
        }

    });
}
function funRecommentLike(recommentid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/likeup/recomment?recommentid=${recommentid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                history.go(0);
            }else {
                alert('좋아요는 한번 만 가능합니다.');
            }

        },
        error: function () {
            alert('대댓글 좋아요 비동기 처리오류');
        }

    });
}
function funRecommentReport(recommentid) {
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/board/report/recomment?recommentid=${recommentid}`,
        dataType: "text",
        success: function (data) {
            let jsonObj = JSON.parse(data);
            if(jsonObj){
                commentLoad(boardID);
                alert('신고 접수가 완료되었습니다.');
                history.go(0);
            }else {
                alert('신고는 한번 만 가능합니다.');
            }

        },
        error: function () {
            alert('대댓글신고 비동기 처리오류');
        }

    });
}