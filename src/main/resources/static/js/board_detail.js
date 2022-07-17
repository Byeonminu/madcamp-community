const type = document.querySelector('.type').value;
const boardID = document.querySelector('.boardId').value;
const main_title = document.querySelector('.main_title');
if (type == 1) {
    main_title.innerHTML = "공지사항";

} else if (type == 2) {
    main_title.innerHTML = "일반 게시판";

} else if (type == 3) {
    main_title.innerHTML = "몰입캠프 14기";

}
commentLoad(boardID);



// 게시글 댓글 가져오기 ///////////////////////////////////////
const commentParent = document.querySelector('.main_mid_comment');


function commentLoad(boardID) {
    alert(boardID);
    $.ajax({

        type: "get",
        // type 동적으로 처리하기
        url: `/board/${boardID}`,
        dataType: "text",
        async:false,
        success: function (data) {
            alert(data);
            let commentItem = ``;
            let commentListObj = JSON.parse(data);
            let commentList = JSON.parse(commentListObj);

            alert(commentList);
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
    for (let comment of commentList) {
        alert(comment);
        let recohtml = getrecomments(comment.recomments);
        commentHtml += `
        <ul class="main_mid_comment_ul">
            <li class="main_mid_comment_li_top">
                <div class="main_mid_comment_li_left">

                    <img class="comment_img" src="../resources/image/board/makguli.jpg"
                        alt="">
                    <div class="comment_user">
                        <h5 class="main_mid_comment_li_title">${comment.userid}</h5>
                        <p>2022-07-15 01:12:11</p>
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
            + recohtml + `
            </div>
        </ul>

      `;

    }
    return commentHtml;
}
// // 대댓글
// function recommentLoad(commentID) {
//     let recommentItem = ``;
//     $.ajax({
//
//         type: "get",
//         // type 동적으로 처리하기
//         url: `board/recomment/${commentID}`,
//         dataType: "text",
//         async: false,
//         success: function (data) {
//             alert(data);
//             let recommentListObj = JSON.parse(data);
//             recommentItem += getcomments(recommentListObj);
//         },
//         error: function () {
//             alert('comment 비동기 처리오류');
//         }
//
//     });
//     return recommentItem;
//
// }
function getrecomments(recommentList) {
    let recommentHtml = ``;
    for (let recomment of recommentList) {
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
                        <h5 class="recomment_li_title">${recomment.userid}</h5>
                        <p>2022-07-15 01:13:11</p>
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