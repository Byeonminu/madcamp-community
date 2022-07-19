var totalCount = 0;
// 신고 ///////////////////////////////////////
const reportParent = document.querySelector('.report_list');

reportLoad();
function reportLoad() {
    $.ajax({

        type: "get",
        // type 동적으로 처리하기
        url: `/admin/report`,
        dataType: "text",
        async:false,
        success: function (data) {
            let reportListObj = JSON.parse(data);
            let reportItem = ``;
            reportItem += getreports(reportListObj.adminList);
            totalCount = reportListObj.cnt;
            reportParent.innerHTML = reportItem;
        },
        error: function () {
        }

    });

}
function getreports(reportList) {
    let reportHtml = ``;
    for (let report of reportList) {
        var categoryName = '';
        if (report.category == 1) {
            categoryName = '게시글';
        } else if (report.category == 2) {
            categoryName = '댓글';
        }
        else if (report.category == 3) {
            categoryName = '대댓글';
        }
        else {
            categoryName = '몰라용잉'
        }
        reportHtml += `
        <tr>
            <td>   
                <input type="hidden" class="userId ajaxid" value="${report.categoryid}">
                <input type="hidden" class="category" value="${report.category}">
                <a href="#" class="btn btn-light btn-icon-split">
                    <span class="text">${categoryName}</span>
                </a>
            </td>
            <td class="ajaxTitle">${report.title}</td>
            <td>${report.nickname}</td>
            <td>${report.createdate}</td>
            <td>${report.reportcnt}</td>
            <td>
                <a class="btn btn-danger btn-icon-split">
                            <span class="icon text-white-50">
                                <i class="bi bi-x-octagon"></i>
                            </span>
                    <span class="text">삭제</span>
                </a>
            </td>
        </tr>
      `;

    }
    return reportHtml;
}
setTimeout(() => {
    const deleteBtn = document.querySelectorAll('.btn-danger');
    //input
    const category = document.querySelectorAll('.category');
    const ajaxid = document.querySelectorAll('.ajaxid');
    //td
    const ajaxTitle = document.querySelectorAll('.ajaxTitle');
    for(let i =0; i<deleteBtn.length; i++){
        deleteBtn[i].onclick = () => {
            deleteReq(ajaxid[i].value,category[i].value);

        }
    }
}, 500);
// 신고 ///////////////////////////////////////
function deleteReq(id, category) {
    $.ajax({
        type: "delete",
        // type 동적으로 처리하기
        url: `/admin/delete?id=${id}&category=${category}`,
        dataType: "text",
        async:false,
        success: function () {
            alert("삭제 처리가 삭제되었습니다.");
            reportLoad();
        },
        error: function () {
        }

    });
}