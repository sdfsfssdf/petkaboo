<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

a:-webkit-any-link {
	cursor: pointer;
	text-decoration: none;
	transition: top 1s ease-out;
	color: black;
	margin: 1px 1px 1px 1px;
}

 a:hover {
	
	color: rgb(207, 183, 175);

}  
.depth-02{
	position:relative;
	/* margin :20%; */

}
ul>li>div:hover{
	border:1px solid black;
	border-radius:30px;

	
}
ul>li>div{
   border:1px solid rgba(0,0,0,0);
   border-radius:30px;   
}

li {
	font-size:12px;
	margin:1.5%;
    display: inline-flex;
    text-align: -webkit-match-parent;
}
ul{
	text-align:center;
}
</style>
</head>
<body>
	
	<div>
		

		<div class="depth-02">
		
			<ul>
				<li><div><a href="../index.jsp">HOME</a></div></li>
				<li><div><a href="/w.jsp">SERVICE</a></div></li>
				<li><div><a href="/w.jsp">PETSITTER</a></div></li>
				<li><div><a href="/">STEP</a></div></li>
				<li><div><a href="/">RESERVATION</a></div></li>
				<li><div><a href="01_reviews.jsp">VOICE</a></div></li>
				<li><div><a href="/">FAQ</a></div></li>
				<li><div><a href="05_companyInfo.jsp">INTRODUCE</a></div></li>
			</ul>
		
		
		
		</div>
	</div>

</body>
</html>