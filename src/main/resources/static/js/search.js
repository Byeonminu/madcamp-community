const searchParent = document.querySelector('.main_list');
var searchText = window.localStorage.getItem("searchText");
var titleName =  document.querySelector('.title');
titleName.textContent = searchText;
var totalCount = 0;
var pagenum = 1;
searchLoad(searchText, pagenum);
// 게시글 10개 가져오기 ///////////////////////////////////////
function searchLoad(searchText, pagenum) {
    $.ajax({
        type: "get",
        // type 동적으로 처리하기
        url: `/board/search?search=${searchText}&pagenum=${pagenum}`,
        dataType: "text",
        async : false,
        success: function (data) {
            let searchListObj = JSON.parse(data);
            let searchItem = ``;
            searchItem += getsearch(searchListObj.boardList);
            totalCount = searchListObj.cnt;
            searchParent.innerHTML = searchItem;
            searchColor();
        },
        error: function () {
        }

    });

}

function getsearch(searchList) {
    let searchHtml = ``;
    for (let search of searchList) {
        searchHtml += `
         <ul class="main_list_ul">
            <li class="main_list_title">
                <a class="red" href='/board-main/${search.id}'>${search.title}</a>
            </li>
            <div class="main_list_sub">
                <li class="main_list_heart">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#F40300"
                        xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M13.9447 3.04697C12.5376 1.65101 10.2563 1.65101 8.84926 3.04697L8 4L7.15074 3.04699C5.74368 1.65102 3.46237 1.65102 2.0553 3.04699C0.648234 4.44295 0.648232 6.70626 2.0553 8.10222L7.99998 14L13.9447 8.10221C15.3518 6.70625 15.3518 4.44294 13.9447 3.04697Z"
                            stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${search.likecnt}</div>
                </li>
                <li class="main_list_comment">
                    <svg width="16" height="16" viewBox="0 0 16 16" fill="#007BF7"
                        xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M1.21799 2.09202C1 2.51984 1 3.0799 1 4.2V8.3C1 9.42011 1 9.98016 1.21799 10.408C1.40973 10.7843 1.71569 11.0903 2.09202 11.282C2.39717 11.4375 2.7696 11.4821 3.36454 11.4949V15L8.87496 11.5L11.8 11.5C12.9201 11.5 13.4802 11.5 13.908 11.282C14.2843 11.0903 14.5903 10.7843 14.782 10.408C15 9.98016 15 9.42011 15 8.3V4.2C15 3.0799 15 2.51984 14.782 2.09202C14.5903 1.71569 14.2843 1.40973 13.908 1.21799C13.4802 1 12.9201 1 11.8 1H4.2C3.0799 1 2.51984 1 2.09202 1.21799C1.71569 1.40973 1.40973 1.71569 1.21799 2.09202Z"
                            stroke="none" stroke-width="2" stroke-linejoin="round" />
                    </svg>

                    <div>${search.reportcnt}</div>
                </li>
                <li class="main_list_name">
                    익명
                </li>
                <li class="main_list_time">
                    ${search.updatedate}
                </li>
            </div>
        </ul>

      `;

    }
    return searchHtml;
}
// 게시글 10개 가져오기 //////////////////////////////////////
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
            searchLoad(searchText,numbers[i].textContent);
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
function searchColor(){
    $(".red:contains('"+searchText+"')").each(function () {
        var regex = new RegExp(searchText,'gi');
        $(this).html( $(this).text().replace(regex, "<span class='text-red'>"+searchText+"</span>") );
    });
}

