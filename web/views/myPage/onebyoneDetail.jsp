<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.contentArea {
	margin-top:80px;
	margin-left: 320px;
	width: 60%;
}

.no {
	display: inline-block;
	width: 10%;
}

.oboTitle {
	display: inline-block;
	width: 65%;
}

.topView label {
	width: 10%;
	align: cetner;
}

.topView input[type=text] {
	background: white;
}

.labelTitle {
	margin-left: 15px;
}

.writer {
	display: inline-block;
	width: 20%;
}

.date {
	display: inline-block;
	width: 20%;
}

.category {
	display: inline-block;
	width: 22%;
}
</style>
</head>
<body>
	<h1 align="center" id="logo">로고</h1>
	<br>
	<%@ include file="../common/menubar.jsp"%>
	<%@ include file="../common/sidemenubar.jsp"%>
	<div class="contentArea">
		<!-- 구현하시는 분이 따로 action을 정의해주셔야 합니다. -->
		<form method="post" action="">
		<h2>1:1문의 작성하기</h2>
		<p>나의 1:1 문의를 할 수 있습니다.</p>
		<br>
		<table>
		
			</table>
			<div class="topView">
				<label>글번호</label><input type="text" class="form-control no"
					id="oboNo" name="oboNo" readOnly> &nbsp;&nbsp;<label
					class="labelTitle">제목</label><input type="text"
					class="form-control oboTitle" id="title" name="title" value=""
					readOnly>
				<!-- 받아온 정보를 넣어야함.-->
				<br>
				<br> <label>작성자 </label><input type="text"
					class="form-control writer" readOnly>
				&nbsp;&nbsp;&nbsp;&nbsp;<label>작성일</label> <input type="text"
					class="form-control date"> &nbsp;&nbsp;&nbsp;&nbsp;<label>카테고리</label>
				<input type="text" class="form-control category" value="공지사항"
					readOnly>
			</div>
			<br>
			<div class="content">
				<textarea class="form-control" rows="20" cols="30" id="comment"
					readOnly value=""></textarea>
			</div>
			<br>
			<div class="btns" align="center">
				<button type="submit" class="btn btn-success write">수정하기</button>
				&nbsp;
				<button type="button" class="btn btn-danger cancel">취소하기</button>
			</div>
		</form>
	</div>
</body>
</html>