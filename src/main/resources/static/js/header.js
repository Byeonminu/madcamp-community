const searchBtn = document.querySelector('.searchBtn');

searchBtn.onclick = () => {
    var searchText = document.querySelector('.head_search_input').value;
    window.localStorage.setItem("searchText", searchText);
    document.location.href = '/search';
}
