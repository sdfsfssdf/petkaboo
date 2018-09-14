<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>	
	#topView {
		background:lightgray;
		height:400px;
		width:100%;
		margin-left:auto;
		margin-right:auto;
	}
	
	#topView img {
		width:100%;
		height:100%;
	}
	
	.menu{
		width:18%;
		height:230px;
		margin:3%;
		display:inline-block;
		text-align: center;
		padding-top:20px;
		margin-bottom:0px;
	}
	
	.leftMenu{
		margin-left:5%;
	}
	
	.rightMenu{
		margin-right:5%;
	}
	
	.paddingDiv {
		height:70px;
		width:100%;
	}
	
	.navbar-form pull-left {
		position:absolute;
	}
	
	.menu img {
		width:100%;
		height:80%;
	}
	
	.menuPadding {
		width:100%;
		height:30px;
	}
	
	.reviewArea {
		width:100%;
		height:300px;
		padding-left:100px;
		padding-right:100px;
	}
	
	.star_rating {
		display:inline-block;
	}
	.star_rating a {
		font-size:22px;
		letter-spacing:0;
		display:inline-block;
		margin-left:5px;
		color:#ccc;
		text-decoration:none;
	}
	
	.star_rating a.on {
		color:yellow;
	}
	
	.reviewArea h4{
		display:inline-block;
		margin-left:100px;
	}
	
	
	.reviewPicture{
		width:40%;
		height:200px;
		background:lightgray;
	}
	
</style>

</head>
<body>
	<!--  상단뷰 include 할 것  -->
	<h1 align="center" id="logo">로고</h1><br>
	<%@ include file="views/common/menubar.jsp" %>
	
	<div id="searchBox">
	<%@ include file="views/common/mainSearchForm.jsp" %>
	</div>
	
	<div class="paddingDiv"></div>
	<div class="menu leftMenu"><img src="images/mainPageImgs/menu1.png"><div class="menuPadding"></div><span><h3>SERVICE</h3></span><span>서비스 소개<span></span></div><div class="menu"><img src="images/mainPageImgs/menu4.png"><div class="menuPadding"></div><span><h3>SEARCH</h3></span><span>펫시터찾기</span></div><div class="menu"><img src="images/mainPageImgs/menu3.png"><div class="menuPadding"></div><span><h3>STEP</h3></span><span>이용절차</span></div><div class="menu rightMenu"><img src="images/mainPageImgs/menu6.png"><div class="menuPadding"></div><span><h3>DEVELOPER</h3></span><span>개발진 소개</span></div><br>
	<div class="menuPadding"></div><div class="menuPadding"></div>
	<div class="menu leftMenu"><img src="images/mainPageImgs/menu5.png"><div class="menuPadding"></div><span><h3>VOICE</h3></span>이용후기<span></span></div><div class="menu"><img src="images/mainPageImgs/menu2.png"><div class="menuPadding"></div><span><h3>APPLY</h3></span>펫시터 신청<span></span></div><div class="menu"><img src="images/mainPageImgs/menu7.png"><div class="menuPadding"></div><span><h3>FAQ</h3></span><span>고객센터</span></div><div class="menu rightMenu"><img src="images/mainPageImgs/menu8.png"><div class="menuPadding"></div><span><h3>INTRODUCE</h3></span>회사정보<span></span></div>
	<div class="paddingDiv"></div>
	
	<div class="paddingDiv"></div>
	<h4 align="center">ㅡ</h4>
	<h4 align="center">REVIEW</h4>
	
	<!-- 반복문으로? 아니면 뭐 필요한만큼해서 리뷰 보여줄갯수 보여주면 될듯 -->
	<div class="reviewArea">
		<p>정말 고마웠어요^^(제목)</p>
		<p class="star_rating">
			<a class="on">★</a>
			<a class="on">★</a>
			<a class="on">★</a>
			<a class="">★</a>
			<a class="">★</a>
		</p>
		<h4>이주혁 펫시터</h4>
		<div class="reviewPicture"></div>
		<pre>급하게 여행계획이 잡혀 아이들 케어를....
펫시터분들을 예약하기 힘든데도 ...
펫시터님 너무 고마웠어요!! ^^
(후기내용 들어갈 영역)
	</pre>
	</div>
	<br>
	
</body>
</html>