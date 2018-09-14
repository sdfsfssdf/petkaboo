<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
<script>
	function init(){
	console.log('init');
	gapi.load('auth2', function(){
		window.googleAuthObj = gapi.auth2.init({
			client_id:'813464990898-qo4elebsbveqjcue4n774m7caep7g6gb.apps.googleusercontent.com'
		});
		googleAuthObj.then(function(){
			checkLoginStatus();
		})
	});
	}
	function checkLoginStatus(){
		var loginBtn = document.querySelector('#loginBtn');
		console.log('checkLoginStatus');
		if(googleAuthObj.isSignedIn.get()){
			loginBtn.value= 'Logout';
		}else{
			loginBtn.value= 'Login';
		}
	}
</script>

<link rel="stylesheet" href="css/bootstrap.css"> 
<title>펫카부 로그인</title>
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
			<a class="navbar-brand" href="main.jsp">펫카부</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">메인</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanede="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="login.jsp">로그인</a></li>
						<li><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="<%=request.getContextPath()%>/login.me">
					<h3 style="text-align:center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디" name="email" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="user_pwd" maxlength="20">
					</div>
					<input type="submit" class="btn btn-primary form-control" value="로그인">
					<div class="form-group">
					<br>				
						<input type="button" class="btn btn-primary form-control" style="background-color:lightgray" id="loginBtn" value="구글 아이디 로그인"
							onclick="
						if(this.value === 'Login'){
							googleAuthObj.signIn().then(function(){
								checkLoginStatus();
							});
						}else{
							googleAuthObj.signOut().then(function(){
								checkLoginStatus();
							});
						}
						">
					</div>
				</form>
			</div>
		<div class="col-lg-4"></div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>


</html>