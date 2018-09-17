<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css"> 
<title>펫카부 회원가입</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>		
				<span class="icon-bar"></span>					
			</button>
			<a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">펫카부</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/index.jsp">메인</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanede="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../common/login.jsp">로그인</a></li>
						<li class="active"><a href="joinForm.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form name="joinForm" method="post" action="<%=request.getContextPath()%>/join.me">
					<h3 style="text-align:center;">회원가입 화면</h3>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="아이디" name="email" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="user_pwd" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호를 확인해주세요" name="check" maxlength="20">
					</div>
					<input type="submit" id="join" class="btn btn-primary form-control" onclick="sendIt();" value="회원가입">
		
				</form>
			</div>
		<div class="col-lg-4"></div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.js"></script>
	<script>
	function sendIt(){
		//아이디 입력여부 검사
		if(document.joinForm.email.value=="")
		{
		 alert("아이디를 입력하지 않았습니다.")
		 document.joinForm.email.focus()
		 return
		}
		//아이디 유효성 검사 (영문소문자, 숫자만 허용)
		for (i=0;i<document.joinForm.email.value.length ;i++ )
		{
		 ch=document.joinForm.email.value.charAt(i)
		  if (!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') &&!(ch=='@') &&!(ch=='.'))
		  {
		  alert ("숫자, 소문자형태의 이메일 형식으로 입력해주세요")
		  document.joinForm.email.focus()
		  document.joinForm.email.select()
		  return
		  }
		}

		//아이디에 공백 사용하지 않기
		if (document.f.email.value.indexOf(" ")>=0)
		{
		 alert("아이디에 공백을 사용할 수 없습니다.")
		 document.f.email.focus()
		 document.f.email.select()
		 return
		}

		//아이디 길이 체크 (10~30자)
		if (document.joinForm.email.value.length<10 || document.joinForm.email.value.length>30)
		{
		 alert ("이메일을 10~30자까지 입력해주세요.")
		 document.joinForm.email.focus()
		 document.joinForm.email.select()
		 return
		}

		//비밀번호 입력여부 체크
		if(document.f.user_pwd.value=="")
		{
		 alert("비밀번호를 입력하지 않았습니다.")
		 document.joinForm.user_pwd.focus()
		 return
		}

		//비밀번호 길이 체크(8~15자 까지 허용)
		if (document.joinForm.user_pwd.value.length<8 || document.joinForm.user_pwd.value.length>15)
		{
		 alert ("비밀번호를 8~15자까지 입력해주세요.")
		 document.joinForm.user_pwd.focus()
		 document.joinForm.user_pwd.select()
		 return
		}


		//비밀번호와 비밀번호 확인 일치여부 체크
		if (document.joinForm.user_pwd.value!=document.joinFormgh.check.value)
		{
		 alert("비밀번호가 일치하지 않습니다")
		 document.joinForm.user_pwd.value=""
		 document.joinForm.check.value=""
		 document.joinForm.user_pwd.focus()
		 return
		}
		}
	
	
	</script>
</body>


</html>