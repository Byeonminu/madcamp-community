const topSignInBtn = document.querySelector('#top_signin');
const topSignUpBtn = document.querySelector('#top_signun');

topSignInBtn.onclick = () => {
    window.location.href = '/login';
}
topSignUpBtn.onclick = () => {
    window.location.href = '/signup';
}
