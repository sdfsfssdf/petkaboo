<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
.contentArea {
	margin-top:80px;
	margin-left: 320px;
	width: 60%;
}

th {
	background: lightgray;
}

.container {
	margin-left: 0px;
	width: 90%;
	height: 430px;
	padding:0px;
}

.first {
	width: 15%
}

.second {
	width: 60%;
}

.third {
	width: 25%;
}

.form-control{
	width:15%;
	display:inline-block;
	marig-left:5px;
}

.search{
 	width:45%;
}
</style>
</head>
<body>
	<h1 align="center" id="logo">로고</h1>
	<br>
	<%@ include file="WEB-INF/menubar.jsp"%>
	<%@ include file="WEB-INF/myPageSidebar.jsp" %>
	<div class="contentArea">
		<h2>내 질문내역</h2>
		<p>나의 1:1 문의내역을 확일할 수 있습니다.</p>
		<br>
		<div class="container">
			<table class="table table-hover">
				<thead>
					<tr>
						<th class="first">글번호</th>
						<th class="second">제목</th>
						<th class="third">작성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>John</td>
						<td>Doe</td>
						<td>john@example.com</td>
					</tr>
					<tr>
						<td>Mary</td>
						<td>Moe</td>
						<td>mary@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
					<tr>
						<td>July</td>
						<td>Dooley</td>
						<td>july@example.com</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div align="center">
			<p>페이징 들어갈부분</p>
		</div>
		<div class="searchArea" >
			<select class="form-control" id="searchCondition" name="searchCondition">
				<option>----</option>
				<option value="category">제목</option>
				<option value="writer">내용</option>
				<option value="title">작성일</option>
			</select> <input type="search" class="form-control search">
			<button type="submit" class="btn btn-default">검색하기</button>
			<button onclick="" class="btn btn-success">작성하기</button>
		</div>

	</div>
</body>
</html>