
const boardNames = document.querySelector('.nav_board_container');
let boardNameItem = ``;

boardNameLoad();

// 게시글 10개 가져오기 ///////////////////////////////////////
function boardNameLoad() {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/board/category`,
        dataType: "text",
        success: function (data) {
            let boardListObj = JSON.parse(data);
            boardNameItem += getBoards(boardListObj);
            boardNames.innerHTML = boardNameItem;
        },
        error: function () {
            alert('nav 비동기 처리오류');
        }
    });
}
function getBoards(boardList) {
    let boardHtml = ``;
    for (let board of boardList) {
        boardHtml += `
        <ul class="nav_board_name">
            <li class="nav_board_name_svg">
                <svg width="22" height="22" viewBox="0 0 16 16" fill="none"
                     xmlns="http://www.w3.org/2000/svg">
                    <path
                            d="M1 15V11C1 9.89543 1.89543 9 3 9H6C7.10457 9 8 9.89543 8 11V15M11 11H13C14.1046 11 15 11.8954 15 13V15M4.5 1C5.80503 1 7 2 7 3.5C7 5 5.80503 6 4.5 6C3.19497 6 2 5 2 3.5C2 2 3.19497 1 4.5 1ZM12 3C10.9865 3 10 3.79796 10 5C10 6.20204 10.9865 7 12 7C13.0135 7 14 6.20204 14 5C14 3.79796 13.0135 3 12 3Z"
                            stroke="white" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" />
                </svg>
            </li>
            <li class="nav_board_name_text">
                <a href="#">${board.type}</a>
            </li>
        </ul>
        `;

    }
    return boardHtml;
}
// 게시글 10개 가져오기 ///////////////////////////////////////

