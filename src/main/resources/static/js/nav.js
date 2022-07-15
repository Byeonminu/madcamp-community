
const boardNames = document.querySelector('.nav_board_container');
let boardNameItem = ``;

boardNameLoad();

// nav바 제목가져오기 ///////////////////////////////////////
function boardNameLoad() {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/board/category`,
        dataType: "text",
        success: function (data) {
            alert("1"+data);
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
// nav바 제목가져오기 ///////////////////////////////////////

// <svg width="22" height="22" viewBox="0 0 16 16" fill="none"
//      xmlns="http://www.w3.org/2000/svg">
//     <path
//         d="M2 10.2C2 9.07989 2 8.51984 2.21799 8.09202C2.40973 7.71569 2.71569 7.40973 3.09202 7.21799C3.51984 7 4.0799 7 5.2 7H10.8C11.9201 7 12.4802 7 12.908 7.21799C13.2843 7.40973 13.5903 7.71569 13.782 8.09202C14 8.51984 14 9.07989 14 10.2V11.8C14 12.9201 14 13.4802 13.782 13.908C13.5903 14.2843 13.2843 14.5903 12.908 14.782C12.4802 15 11.9201 15 10.8 15H5.2C4.07989 15 3.51984 15 3.09202 14.782C2.71569 14.5903 2.40973 14.2843 2.21799 13.908C2 13.4802 2 12.9201 2 11.8V10.2Z"
//         stroke="white" stroke-width="2" />
//     <path
//         d="M5 7L5 4C5 3.06812 5 2.60218 5.15224 2.23463C5.35523 1.74458 5.74458 1.35523 6.23463 1.15224C6.60217 1 7.06812 1 8 1C8.93188 1 9.39782 1 9.76537 1.15224C10.2554 1.35523 10.6448 1.74458 10.8478 2.23463C11 2.60218 11 3.06812 11 4V7H5Z"
//         stroke="white" stroke-width="2" />
// </svg>