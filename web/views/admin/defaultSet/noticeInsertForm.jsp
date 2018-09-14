<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:1000px;
		height:800px;
		color:black;
		margin:0 auto;
		border:1px solid #000;
	}
	.head{
		background: #ddd;
		padding:0px;
		margin:0px;
		border:0px;
	}
</style>
</head>
<body>
	<div class="outer">
		<br>
		<h2 class="head" align="center">공지 사항 작성</h2>
		<hr>
		<div class="first-row">
			 <form action="" method="post">
				<table class="table1">
					<tr>
						<td>제목</td>
						<td colspan="1"><input type="text" size="50" name="title"></td>
						<td>공지번호</td>
						<td><input type="text"></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td>
							<input type="text" value="" readonly>
							<input type="hidden">
						</td>
						<td>작성일</td>
						<td><input type="date" name="date"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="3"></td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="content" cols="138" rows="40" style="resize:none"></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
					<button type="reset">취소하기</button>
					<button type="submit">등록하기</button>
				</div>
			</form>
		</div>
		
	</div>
</body>
</html>
