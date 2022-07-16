const signupBtn = document.querySelector('#signup');
const nickname = document.querySelector('#nickname').textContent;
const email = document.querySelector('#email').textContent;
const password = document.querySelector('#password').textContent;
const emailCheckContainer = document.querySelector('.email_check');

const topSignInBtn = document.querySelector('#top_signin');
const topSignUpBtn = document.querySelector('#top_signun');
topSignInBtn.onclick = () => {
    window.location.href = '/login';
}
topSignUpBtn.onclick = () => {
    window.location.href = '/signup';
}

var emailCheckFlag = true;
signupBtn.onclick = () => {
    emailCheck();
}
function emailCheck(email) {
    alert(nickname + " " + email + " " + password);
    $.ajax({

        type: "post",
        // type 동적으로 처리하기
        url: `/emailcheck?email=${email}`,
        dataType: "text",
        success: function (data) {
            alert(data);
            emailCheckFlag = JSON.parse(data);
            isMadCamp(emailCheckFlag);
        },
        error: function () {
            alert('board 비동기 처리오류');
        }

    });

}
function isMadCamp(flag) {
    if (flag) {
        emailCheckContainer.style.display = 'block';
    }
    else {
        alert("이메일이 유효하지 않습니다.");
    }
}