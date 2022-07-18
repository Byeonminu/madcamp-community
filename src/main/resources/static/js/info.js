var pagenum = 1;
var totalCount_b = 0;
var totalCount_c = 0;
// 프로필 보드 3개 가져오기 ///////////////////////////////////////
const myBoardParent = document.querySelector('.myBoards');
myBoardLoad(pagenum);
myCommentLoad(pagenum);
function myBoardLoad(pagenum) {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/myprofile/myBoards?pagenum=${pagenum}`,
        dataType: "text",
        success: function (data) {
            let myBoardListObj = JSON.parse(data);
            let myBoardItem = ``;
            myBoardItem += getmyBoards(myBoardListObj.boardList);
            myBoardParent.innerHTML = myBoardItem;
            totalCount_c = myBoardListObj.cnt;
        },
        error: function () {
            alert('myBoard 비동기 처리오류');
        }

    });

}
function getmyBoards(myBoardList) {
    let myBoardHtml = ``;
    for (let myBoard of myBoardList) {
        myBoardHtml += `
        <div class="my_comment">
            <a href="/board-main/${myBoard.id}" class="my_comment_headline">${myBoard.title}</a>
            <ul class="my_comment_info">
                <li class="my_comment_heart">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                        <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${myBoard.likecnt}</div>
                </li>
                <li class="my_comment_comment">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7" xmlns="http://www.w3.org/2000/svg">
                        <path d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                                stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>
                    <div>${myBoard.commentcnt}</div>
                </li>
                <li class="my_comment_date">${myBoard.updatedate}</li>
            </ul>
        </div>

      `;

    }
    return myBoardHtml;
}
// 몰캠14기 게시판 5개 ///////////////////////////////////////
const myCommentParent = document.querySelector('.mycomments');


function myCommentLoad(pagenum) {
    $.ajax({

        type: "get",
        // type 동적으로 처리하기
        url: `/myprofile/myComments?pagenum=${pagenum}`,
        dataType: "text",
        success: function (data) {
            let myCommentItem = ``;
            let myCommentListObj = JSON.parse(data);
            myCommentItem += getmyComments(myCommentListObj.commentList);
            myCommentParent.innerHTML = myCommentItem;
            totalCount_b = myCommentListObj.cnt;
        },
        error: function () {
            alert('myComment 비동기 처리오류');
        }

    });

}
function getmyComments(myCommentList) {
    let myCommentHtml = ``;
    for (let myComment of myCommentList) {
        myCommentHtml += `
        <div  class="my_comment">
            <a class="my_comment_headline">${myComment.comment}</a>
            <ul class="my_comment_info">
                <li class="my_comment_heart">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300" xmlns="http://www.w3.org/2000/svg">
                        <path d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                                stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${myComment.comlikecnt}</div>
                </li>
                
                
            </ul>
        </div>

      `;

    }
    return myCommentHtml;
}
const numList_c = document.querySelector('.main_num_list_c');
setTimeout(() => {

    numList_c.innerHTML = getNumber_c(totalCount_c);
    const numbers_c = document.querySelectorAll('.numbtn_c');
    for (let i = 0; i < numbers_c.length; i++) {
        numbers_c[i].onclick = () => {
            for (let j = 0; j < numbers_c.length; j++) {
                numbers_c[j].id = '';
            }
            numbers_c[i].id = 'clicknum_c';
            myCommentLoad(numbers_c[i].textContent);
        }

    }
}, 400);

// 밑에 숫자 가져오기
function getNumber_c(count) {
    let numHtml_c = `
         <ul class="numbers_c">
            <li id="clicknum_c" class="numbtn_c">1</li>`;
    var num = (count / 10) ;
    for (let i = 0; i < num; i++) {
        numHtml_c += `<li class="numbtn_c">${i + 2}</li>`
    }
    numHtml_c += `</ul>`;

    return numHtml_c;
}

const numList = document.querySelector('.main_num_list_b');
setTimeout(() => {

    numList.innerHTML = getNumber(totalCount_b);
    const numbers = document.querySelectorAll('.numbtn');
    for (let i = 0; i < numbers.length; i++) {
        numbers[i].onclick = () => {
            for (let j = 0; j < numbers.length; j++) {
                numbers[j].id = '';
            }
            numbers[i].id = 'clicknum';
            myBoardLoad(numbers[i].textContent);
        }

    }
}, 400);

// 밑에 숫자 가져오기
function getNumber(count) {
    let numHtml = `
         <ul class="numbers">
            <li id="clicknum" class="numbtn">1</li>`;
    var num = (count / 10) ;
    for (let i = 0; i < num; i++) {
        numHtml += `<li class="numbtn">${i + 2}</li>`
    }
    numHtml += `</ul>`;

    return numHtml;
}