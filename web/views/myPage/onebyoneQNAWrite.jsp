<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.contentArea {
	margin-left: 320px;
	width: 60%;
	margin-top:80px;
}
</style>
</head>
<body>
	<h1 align="center" id="logo">로고</h1>
	<br>
	<%@ include file="WEB-INF/menubar.jsp"%>
	<%@ include file="WEB-INF/myPageSidebar.jsp" %>
	<div class="contentArea">
		<h2>1:1 문의</h2>
		<p>관리자에게 1:1 문의를 신청할 수 있습니다.</p>
		<br>
		<div class="title">
			<input type="text" class="form-control" id="usr"
				placeholder="제목을 입력하세요.">
		</div>
		<br>
		<div class="content">
			<textarea class="form-control" rows="20" cols="30" id="comment"
				placeholder="내용을 입력하세요."></textarea>
		</div>
		<br>
		<div class="btns" align="center">
			<button type="submit" class="btn btn-success write">작성하기</button>
			&nbsp;
			<button type="button" class="btn btn-danger cancel">취소하기</button>
		</div>
	</div>

</body>
</html>