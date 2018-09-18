<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.contentArea {
		width:70%;
		margin-left:270px;
		margin-top:50px;
	}
	
	
	.categoryTableArea{
		display:inline-block;
	}
	.categoryTable{
		width:100%;
		
	}
	
	.categoryTable th{
		background: #ddd;
		text-align:center;
	}
	
	.vertical_line{
		width:1px;
		border:0.5px solid black;
		height:300px;
		display:inline-block;
		margin-left:20px;
		margin-right:20px;
	}
	
	h3{
		display:inline-block;
	}
	
	.spaceArea{
		width:32%;
		display:inline-block;
	}
	
	.accountTable{
		width:100%;
	}
	
	.accountTable th{
		background: #ddd;
		text-align:center;
	}
	
	.accountTableArea{
		display:inline-block;
		
	}
	
	.categoryBtns{
		width:40%;
		display:inline-block;
	}
	
	.accountBtns{
		width:58%;
		display:inline-block;
	}
</style>
</head>
<body>
	<%@include file="../main/header.jsp" %>
	<%@include file="leftMenu.jsp" %>
	<div class=contentArea>
	<h2>수수료 및 계좌설정</h2>
	<p>카테고리별 수수료 설정과 무통장 입금용 계좌 설정이 가능합니다.</p>
	<hr>
	
	<h3>수수료 설정</h3><div class="spaceArea"></div><h3>무통장 입금계좌 설정</h3>
	<br>
	<div class="categoryTableArea" style="width:40%; height:300px; overflow:auto">
		<table class="categoryTable table table-hover">
			<tr>
				<th style="width:60%">카테고리</th>
				<th style="widht:40%">수수료</th>
			</tr>
		</table>
	</div>
	
	<div class="vertical_line"></div>
	
	<div class="accountTableArea" style="width:55%; height:300px; overflow:auto">
		<table class="accountTable table table-hover">
			<tr>
				<th width=30%>은행</th>
				<th width=40%>계좌번호</th>
				<th width=20%>예금주</th>
				<th width=10%><input type="checkbox"></th>
			</tr>
		</table>
	</div>
	<br>
	<div class="categoryBtns" align="center">
		<button type="submit" id="write" class="btn btn-success">적용하기</button>
		<button type="submit" id="write" class="btn btn-danger">취소하기</button>
	</div>
	<div class="accountBtns" align="center">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="submit" id="write" class="btn btn-primary">무통장 입금계좌 추가하기</button>
		<button type="submit" id="write" class="btn btn-danger">삭제하기</button>
	</div>
	<br>
	<hr>
	<h3>동물 카테고리 추가</h3>
	</div>
</body>
</html>