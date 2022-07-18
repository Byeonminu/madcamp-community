const searchBtn = document.querySelector('.searchBtn');

searchBtn.onclick = () => {
    var searchText = document.querySelector('.head_search_input').value;
    alert(searchText);
    window.localStorage.setItem("searchText", searchText);
    document.location.href = '/search';
}