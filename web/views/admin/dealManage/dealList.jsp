<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
<style>
	.outer{
		float:left;
		width:1000px;
		height:600px;
		color:black;
		margin-left:20px;
		margin-right:auto;
		margin-top:20px;
	}
	.first-row{
		float:left;
		width:100%;
	}
	.table1{
		float:left;
		width:1000px;
		height:600px;
		margin-top:20px;
		marign-left:auto;
		margin-right:auto;
		padding-left:50px;
	}
	.head > th{
		background: #ddd;
		text-align:center;
	}
</style>
</head>
<body>
	<div class="outer">
	<div class="first-row">
	<div class="table1">
	<h2><b>거래현황</b></h2>
	<hr>
		<table id="memberList">
			<tr class="head" >
				<th width="100px">등록번호</th>
				<th width="100px">상태</th>
				<th width="100px">펫시터ID</th>
				<th width="100px">의뢰자ID</th>
				<th width="100px">동물</th>
				<th width="100px">펫시팅 일</th>
				<th width="100px">등록시간</th>
			</tr>
		</table>
	</div>
	</div>
</div>
</body>
</html>
