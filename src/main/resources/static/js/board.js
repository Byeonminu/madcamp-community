const boardParent = document.querySelector('.main_list');
// const roleUser = document.querySelector('.head_role_user');
// const roleCreaater = document.querySelector('.head_role_Creator');
const type = document.querySelector('.type').value;
var main_title = document.querySelector('.main_title');
const writebtn = document.querySelector('.writebtn');
writebtn.onclick = () => {
    document.location.href = '/board-write';
}
var pagenum = 1;
var totalCount = 0;
boardLoad(type,pagenum);
if(type == 1) {
    main_title.innerHTML = "공지사항";

}else if(type == 2) {
    main_title.innerHTML = "일반 게시판";

}else if(type == 3) {
    main_title.innerHTML = "몰입캠프 14기";

}

// 게시글 10개 가져오기 ///////////////////////////////////////
function boardLoad(type,pagenum) {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/board?type=${type}&pagenum=${pagenum}`,
        dataType: "text",
        success: function (data) {
            let boardListObj = JSON.parse(data);
            let boardItem = ``;
            boardItem += getBoards(boardListObj.boardList);
            totalCount = boardListObj.cnt;
            boardParent.innerHTML = boardItem;
        },
        error: function () {
        }

    });

}
function getBoards(boardList) {
    let boardHtml = ``;
    for (let board of boardList) {
        boardHtml += `
         <ul class="main_list_ul">
            <li class="main_list_title">
                <a href='/board-main/${board.id}'>${board.title}</a>
            </li>
            <div class="main_list_sub">
                <li class="main_list_heart">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                        xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                            stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${board.likecnt}</div>
                </li>
                <li class="main_list_comment">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                        xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                            stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${board.reportcnt}</div>
                </li>
                <li class="main_list_name">
                    ${board.isanonymous}
                </li>
                <li class="main_list_time">
                    ${board.updatedate}
                </li>
            </div>
        </ul>

      `;

    }
    return boardHtml;
}
// 게시글 10개 가져오기 ///////////////////////////////////////


// 밑에 숫자 가져오기
function getNumber(count) {
    let numHtml = `
         <ul class="numbers">
            <li id="clicknum" class="numbtn">1</li>`;
    var num = count % 10;
    for(let i =0; i<num; i++){
        numHtml += `<li class="numbtn">${i+2}</li>`
    }
    numHtml+=`</ul>`;

    return numHtml;
}
const numList = document.querySelector('.main_num_list');
setTimeout(() => {

    numList.innerHTML = getNumber(totalCount);
    const numbers = document.querySelectorAll('.numbtn');
    for(let i=0; i<numbers.length; i++){
        numbers[i].onclick = () => {
            for(let j=0; j<numbers.length; j++){
                numbers[j].id ='';
            }
            numbers[i].id='clicknum';
            boardLoad(type,numbers[i].textContent);
        }

    }
}, 500);

// 밑에 숫자 가져오기
function getNumber(count) {
    let numHtml = `
         <ul class="numbers">
            <li id="clicknum" class="numbtn">1</li>`;
    var num = (count / 10) -1;
    for(let i =0; i<num; i++){
        numHtml += `<li class="numbtn">${i+2}</li>`
    }
    numHtml+=`</ul>`;

    return numHtml;
}