<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.pkb.notice.model.vo.*, java.util.*,com.pkb.common.Paging"%>%>
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	Paging pg = (Paging)request.getAttribute("pg");
	// 아래에서 사용하기 편하기 위해 선언 따로 선언하지 않고 pi의 getter메소드를 사용해도 상관없다...
	int listCount = pg.getListCount();
	int currentPage = pg.getCurrentPage();
	int maxPage = pg.getMaxPage();
	int startPage = pg.getStartPage();
	int endPage = pg.getEndPage();
%>
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
	<%@include file="../main/header.jsp" %>
	<%@include file="leftMenu.jsp" %>
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
				<th width="100px">작성자</th>
			</tr>
			<% for (Notice nt : list) {%>
				<tr>
					<td><input type="checkbox"></td>
					<td><%=nt.getArticle_no_1() %></td>
					<td><%=nt.getArticle_title() %></td>
					<td><%=nt.getArticle_date() %></td>
					<td><%=nt.getUser_name() %></td>
				</tr>
			<%} %>
		</table>
	</div>
	</div>
	</div>
	
	<!-- 페이지 처리 -->
		<div class="pigingArea" align="center">
			<button onclick="location.href='<%=request.getContextPath()%>/selectList.bo?currentPage=1'"><<</button>
			<% if (currentPage <= 1){%>
				<button disabled><</button>
			<% } else { %>
				<button onclick="location.href='<%=request.getContextPath()%>/selectList.bo?currentPage=<%=currentPage - 1%>'"><</button>
			<%} %>
			
			<% for(int p = startPage; p <= endPage; p++){
				if(p == currentPage){%>
				
					<button disabled><%=p %></button>
				<%} else {%>
					<button onclick="location.href='<%=request.getContextPath()%>/selectList.bo?currentPage=<%=p%>'"><%=p %></button>
				<%} %>
			<%} %>
			
			<%if(currentPage >= maxPage) {%>
				<button disabled>></button>
			<%} else { %>
				<button onclick="location.href='<%=request.getContextPath()%>/selectList.bo?currentPage=<%=currentPage + 1%>'">></button>
			<%} %>
			
			<button onclick="location.href='<%=request.getContextPath() %>/selectList.bo?currentPage=<%=maxPage%>'">>></button>
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
