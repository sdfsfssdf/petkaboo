<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>펫시팅예약신청서</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style>
#container {
	position: absolute;
	left: 0;
	top: 0;
	right: 0;
	bottom: 0;
}

#header {
	float: left;
	width: 100%;
	height: 250px;
	_border: 1px solid blue;
	background-color: rgb(207, 183, 175);
}

#ip-style {
	margin-left: 20%;
}

#body-div {
	margin-left: 20%;
	margin-right: 20%;
	width: 60%;
}

.div1 {
	background: lightgray;
	border-radius: 4px;
	margin-left: 2px;
	margin-right: 2px;
}

.PSphoto {
	width: 127px;
	height: 127px;
	display: inline;
}

.div2 {
	background: lightgray;
	border-radius: 4px;
	margin-left: 2px;
	margin-right: 2px;
}
.input-style{
	width:55%;
}
table{
	margin-left:2%;
	margin-bottom:2%;
	margin-top:1%;
}
</style>
</head>
<body>
	<div id="container">
		<div id="header"></div>
		<%@include file="../common/menubar.jsp"%>

		<div>
			<h2 style="text-align: center; margin-top: 100px;">
				<span style="color: rgb(228, 100, 18);"> <strong>
						펫시터 예약 신청 </strong>
				</span>
			</h2>
		</div>
		<br />
		<br />
		<br />
		<br />
		<br />
		<div id="ip-style">
			맡기기<input type="radio" name="howToPS" /> 부르기 <input type="radio"
				name="howToPS" />
		</div>
	<br />
		<div id="body-div">
			<div class="div1">
				<br />
				<br />
				<p>&nbsp;&nbsp;&nbsp;예약 전 확인 해주세요</p>
				<br />
				<br />
				<p>&nbsp;&nbsp;
					더이상 우리의 소중한 아이를 낯선곳에 맡기지 마세요. <br> &nbsp;&nbsp;평소와 똑같이 집에서 산책하고 놀아주는 펫카부가
					있습니다.
				</p>
				<br />
			</div>
			<br />
			<div class="div2">
			<br />
				<h4>&nbsp;&nbsp;선택하신 펫시터입니다.</h4>
				<table style="display:inline-block">
					<tr>
					
						<td rowspan="2"><img src="http://momojeri.com/web/product/big/201607/33_shop1_658629.jpg"
							class="PSphoto img-circle img-responsive" alt="Responsive image" />
						</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;이름 :</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;입력란</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;주소 :</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;입력란</td>
					</tr>
				
				</table>
			</div>
			<br />
			<div class="div1 div3">
				<br />
				<h4>&nbsp;&nbsp;1.지역을 알려주세요</h4>
				<br />
				&nbsp;&nbsp;<input type="text" placeholder="주소 검색" class="input-style"/> <button class="btn btn-default" type="submit">확인</button>
				<input type="checkbox"  />&nbsp;&nbsp;기본주소로 설정하기
				<br /><br /><br />
			
			</div>
			<br />
			<div class="div1 div4">
				<br />
				<h4>&nbsp;&nbsp;2.날짜를 알려주세요</h4>
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="Date" placeholder="시작 날짜 입력" style="width:200px;"/> - <input type="Date" placeholder="종료 날짜 입력" style="width:200px;"/>
				<br />
				<br /><br />
			</div>
			<br />
			<div class="div1 div5">
				<br />
				
				<h4>&nbsp;&nbsp;3.연락받을 휴대전화 번호를 알려주세요</h4>
				&nbsp;&nbsp;&nbsp;&nbsp;<select name="phoneNum" id="phoneNum">
					<option value="">010</option>
					<option value="">011</option>
					<option value="">017</option>
					<option value="">016</option>
					<option value="">019</option>
				</select>
				
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder=" ' - , . / '를 제외한 나머지 번호 입력" style="width:250px;"/>&nbsp;&nbsp; <button class="btn btn-default" type="submit" onclick="">인증</button>
				<br />
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder="인증번호 입력" />&nbsp;&nbsp; <button class="btn btn-default" type="submit">확인</button>
				<br /><br />
			</div>
			<br />
			<div class="div1 div6">
			<br />
				<h4>&nbsp;&nbsp;4.추가 요청 사항을 기재해 주세요</h4>
				<br />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="msg" id="" cols="60" rows="6">내용을 입력해주세요</textarea>
				<br /><br /><br />
			</div>
			<br />
			<fieldset class="div1 f-style">
			<br />
				&nbsp;&nbsp;<label for="">약관을 확인해 주세요</label>
				<br /><br />
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" />모두 동의 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" />서비스 이용약관 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" />개인정보 약관&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" />위치정보 활용약관
				<br /><br /><br />
			</fieldset>	
			<br /><br />
			 <button class="btn btn-default" type="submit">제출</button>
			  <button class="btn btn-default" type="reset">취소</button>
		</div>
		
	<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
	</div>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
</body>
</html>
