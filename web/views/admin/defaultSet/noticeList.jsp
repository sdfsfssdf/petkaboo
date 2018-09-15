<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
	
	.container{
		padding:0px;
		margin-top:30px;
	}
	
</style>
</head>
<body>
	<div class="outer">
	<div class="first-row">
	<div class="table1">
	<h2>공지사항 목록</h2>
	<p>공지사항의 목록을 확인할 수 있고, 관리를 할 수 있습니다.</p>
	<div class="container">
		<table id="table table-hover">
			<tr class="head" >
				<th width="100px">선택</th>
				<th width="100px">공지번호</th>
				<th width="400px">제목</th>
				<th width="200px">작성일</th>
				<th width="100px">조회수</th>
			</tr>
		</table>
	</div>
	</div>
	</div>
	<div class="searchArea" align="center">
	<button class="selectAll">전부선택</button>
			<select id="searchCondition" name="searchCondition">
				<option>----</option>
				<option value="number">공지번호</option>
				<option value="title">제목</option>
				<option value="date">작성일</option>
			</select>
			<input type="search">
			<button type="button" class="btn btn-default">검색하기</button>
			<button type="submit" id="write" class="btn btn-success" >작성하기</button>
			<button type="button" class="btn btn-danger">삭제</button>
			
			<script>
				$(function(){
					$('#write').click(function(){
						location.href="defaultSet.jsp?selectMenu=2-1";
					})
				})
			</script>
	</div>
</div>
</body>
</html>
