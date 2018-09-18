<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.pkb.board.model.vo.*, java.util.*, com.pkb.common.Paging"%>
 <% ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	Paging pg = (Paging)(request.getAttribute("pg"));
	int currentPage = pg.getCurrentPage();
	int startPage = pg.getStartPage();
	int endPage = pg.getEndPage();
	int oneByOneListCount = pg.getListCount();
	int maxPage = pg.getMaxPage();
	
%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
.contentArea {
	margin-top: 80px;
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
	padding: 0px;
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

.form-control {
	width: 15%;
	display: inline-block;
	marig-left: 5px;
}

.search {
	width: 45%;
}
</style>
</head>
<body>
	<h1 align="center" id="logo">로고</h1>
	<br>
	<%@ include file="../common/menubar.jsp"%>
	<%@ include file="../common/sidemenubar.jsp"%>
	<div class="contentArea">
		<h2>내 질문내역</h2>
		<p>나의 1:1 문의내역을 확일할 수 있습니다.</p>
		<br>
		<div class="container">
			<table class="table table-hover">
				<tr>
					<th class="first">글번호</th>
					<th class="second">제목</th>
					<th class="third">작성일</th>
				</tr>

				 <%for(Board b : list){ %>

				<tr>
				
					<td><%=b.getArticle_no() %></td>
					<td><%=b.getArticle_title()%></td>
					<td><%=b.getArticle_date()%></td>
				</tr>

				<% } %> 


			 <!-- <td>John</td>
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
 -->
			</table>
		</div>
		<!-- 페이지처리 -->
		<div class="pagingArea" align="center">
			<%-- <button onclick="location.href='<%=request.getContextPath()%>/selectOnebyOneList.bo?currentPage=1'"><<</button>
			<% if(currentPage <= 1 ){ %>
			<button disabled><</button>
			<%}else{ %>
			<button onclick="location.href'<%=request.getContextPath()%>/selectOnebyOneList.bo?currentPage=<%=currentPage - 1%>'"></button>
			<%} %>

			<!-- 1,2,3,4,5버튼 -->
			<% for(int p = startPage; p <= endPage; p++){
					if(p == currentPage){
				%>
			<button disabled><%= p %></button>
			<% 	}else { %>
			<button
				onclick="location.href='<%=request.getContextPath()%>/selectOnebyOneList.bo?currentPage=<%=p%>'"><%= p %></button>

			<% } %>

			<% } %>

			<% if(currentPage >= maxPage){ %>
			<button disabled>></button>
			<% }else{ %>
			<button
				onclick="location.href='<%=request.getContextPath()%>/selectOnebyOneList.bo?currentPage=<%=currentPage + 1 %>'">></button>
			<% } %>
			<button
				onclick="location.href='<%=request.getContextPath()%>/selectOnebyOneList.bo?currentPage=<%=maxPage%>'">>></button> --%>

		</div>
		<div class="searchArea">
			<select class="form-control" id="searchCondition"
				name="searchCondition">
				<option>----</option>
				<option value="category">제목</option>
				<option value="writer">내용</option>
				<option value="title">작성일</option>
			</select> <input type="search" class="form-control search">
			<button type="submit" class="btn btn-default">검색하기</button>
			<button onclick="location.href='onebyoneQNAWrite.jsp'"
				class="btn btn-success">작성하기</button>
		</div>

	</div>
</body>
</html>