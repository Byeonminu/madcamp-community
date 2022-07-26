# MadTime
<a href="http://www.madtime.click">www.madtime.click</a>

#### 프로젝트 기간
- 2022.07.13 ~ 2022.07.19
#### 팀원
- 숙명여자대학교 최예빈
- 부산대학교 신종민
- 포항공과대학교 변민우




## 개발 환경
***
- IDE : IntelliJ IDEA Ultimate
- Git Tools : Source Tree, GitHub Desktop
- SpringBoot 2.7.1
- Java11
- Gradle


## 기술스택
***
- FrontEnd - `HTML` `CSS` `JS` `JSP` `AJAX`
- BackEnd - `Spring Boot` `JPA` `MySQL`
- Infra - `AWS EC2` `S3` `CodeDeploy` `Route 53` `CI/CD Github Actions` `Docker` 


## ERD
***
<img src="./src/main/resources/static/image/ERD.png" width="700">

## 프로젝트 소개
***
이 프로젝트는 몰입캠프 전용 에브리타임 웹 사이트입니다.
<br/>
`로그인 / 회원가입`
<div>
<img src="./src/main/resources/static/image/signinpage.png" width="350">
<img src="./src/main/resources/static/image/signuppage.png" width="350">
</div>

- 닉네임, 이메일, 비밀번호를 입력하여 회원가입할 수 있습니다.
- 이미 가입한 유저의 이메일이거나 몰입캠프 참가자의 이메일이 아니면 이메일이 유효하지 않습니다.
- SIGN UP 버튼을 누르면 입력한 이메일로 인증번호가 전송되며, 인증번호를 입력할 수 있는 칸이 생깁니다.
- 인증번호를 올바르게 입력하면 회원가입이 가능합니다.

`메인 페이지`
<div>
<img src="./src/main/resources/static/image/mainpage_notlogin.png" width="350">
<img src="./src/main/resources/static/image/mainpage_login.png" width="350">
</div>

- 오늘의 접속자 수를 확인할 수 있습니다.
- 전날 대비 접속자 증감율을 확인할 수 있습니다.
- 로그인이 되어 있지 않으면 로그인, 회원가입, 메인페이지 외에 접속할 수 없습니다.
- 로그인 유저가 "ADMIN" ADMIN 버튼을 눌러 관리자 페이지에 접속할 수 있습니다.

`게시판 페이지`

<div>
<img src="./src/main/resources/static/image/boardlistpage.png" width="350">
<img src="./src/main/resources/static/image/boardmainpage.png" width="350">
</div>

- 게시글 좋아요, 신고, 댓글 기능이 있습니다.
- 댓글 또한 좋아요, 신고, 대댓글 기능이 있습니다.


`내 정보 페이지`

<div>
<img src="./src/main/resources/static/image/myprofilepage.png" width="350">
</div>

- 지금까지 작성한 댓글과 글을 불러옵니다.

`관리자 페이지`
<div>
<img src="./src/main/resources/static/image/adminpage.png" width="350">
</div>

- Spring Security를 이용해 ADMIN권한이 있는 유저만 접근할 수 있습니다.
- 신고가 5개 넘는 게시글, 댓글, 대댓글을 불러오며 삭제할 수 있습니다.




