<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<!DOCTYPE html>
<!DOCTYPE html>
<html lang="kor">

<head>

    <title>몰입커뮤니티 관리자 페이지</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Custom fonts for this template-->
    <link href="/resources/css/bootstrap/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">
    <!-- bootstrap-icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">

    <!-- Custom styles for this template-->
    <link href="/resources/css/bootstrap/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for table -->
    <link href="/resources/css/bootstrap/dataTables.bootstrap4.min.css" rel="stylesheet">

    <!-- Custom styles my admin.html  -->
    <link rel="stylesheet" href="/resources/css/admin.css">
</head>

<body>
<div class="container">
    <jsp:include page="../include/nav.jsp"></jsp:include>
    <main class="main_box">
        <div class="main_container">
            <header>
                <jsp:include page="../include/header.jsp"></jsp:include>
            </header>
            <main class="main_center">
                <!-- 관리자 페이지 -->
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">관리자</h1>
                    <p class="mb-4">몰입캠프 커뮤니티의 관리자 페이지 입니다.</p>

                    <!-- Content Row -->
                    <!-- DataTales Example 신고 게시글 테이블-->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">신고 게시글</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>타입</th>
                                        <th>작성 내용</th>
                                        <th>작성자</th>
                                        <th>게시 날짜</th>
                                        <th>누적 신고 수</th>
                                        <th>게시글 삭제 처리</th>

                                    </tr>
                                    </thead>
                                    <tbody class="report_list">
                                    <!-- table records -->


                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </main>

        </div>
    </main>
</div>
<script src="/resources/js/admin.js"></script>
<!-- Bootstrap core JavaScript-->
<script src="/resources/js/bootstrap/jquery.min.js"></script>
<script src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/js/bootstrap/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/resources/js/bootstrap/sb-admin-2.min.js"></script>

<!-- Page level plugins : table-->
<script src="/resources/js/bootstrap/jquery.dataTables.min.js"></script>
<script src="/resources/js/bootstrap/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts : table-->
<script src="/resources/js/bootstrap/datatables-demo.js"></script>

<!-- Custom scripts my admin.html  -->

</body>

</html>