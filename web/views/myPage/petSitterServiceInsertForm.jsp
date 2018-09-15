<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>펫시터 등록</title>
<style>
.contentArea {
	margin-top: 80px;
	margin-left: 320px;
	width: 60%;
}

.profileImg {
	width: 200px;
	background: lightgray;
}

.form-control {
	display: inline-block;
}

label {
	display: inline-block;
}
</style>
</head>
<body>
	<h1 align="center" id="logo">로고</h1>
	<br>
	<!-- 인클루드 파일 경로 수정 필요 -->
	<%@ include file="/views/common/menubar.jsp"%>
	<%@ include file="/views/common/sidemenubar.jsp"%>

	<div class="contentArea">
		<h2>펫시터 서비스 등록</h2>
		<p>펫시터 서비스를 등록할 수 있습니다.</p>
		<form>
		<table>
			<tr>
				<td rowspan="10" class="profileImg"></td>
				<td></td>
			</tr>
			<tr>
				<td><label>이름</label> <input type="text" class="form-control"></td>
			</tr>
			<tr>
				<td><label>주소</label><input type="text" class="form-control"></td>
			</tr>
			<tr>
				<td><label>자기소개</label><input type="text" class="form-control"></td>
			</tr>
			<tr>
				<td><label>카테고리 선택 : </label> <input type="radio" value="dog"
					name="category" id="dog"><label for="dog">개</label> <input
					type="radio" value="dog" name="category" id="cat"><label
					for="cat">고양이</label> <input type="radio" value="dog"
					name="category" id="rep"><label for="rep">파충류</label> <input
					type="radio" value="dog" name="category" id="bird"><label
					for="bird">조류</label> <input type="radio" value="dog"
					name="category" id="fish"><label for="fish">어류</label></td>
			</tr>
			<tr>
				<td><label>예약가능 요일 선택 : </label><input type="checkbox"
					name="day" id="mon" value="mon"><label for="mon">월</label>
					<input type="checkbox" name="day" id="tues" value="tues"><label
					for="tues">화</label> <input type="checkbox" name="day" id="wed"
					value="wed"><label for="wed">수</label> <input
					type="checkbox" name="day" id="thurs" value="thurs"><label
					for="thurs">목</label> <input type="checkbox" name="day" id="fri"
					value="fri"><label for="fri">금</label> <input
					type="checkbox" name="day" id="sat" value="sat"><label
					for="sat">토</label> <input type="checkbox" name="day" id="sun"
					value="sun"><label for="sun">일</label></td>
			</tr>
			<tr>
				<td><label>펫시팅 이용가격 : </label><input type="spinner" step=""
					class="form-control"></td>
			</tr>
			<tr>
				<td><label>제한 사항</label> <input type="text"
					class="form-control"></td>
			</tr>
			<tr>
				<td><label>서비스 내용</label> <input type="text"
					class="form-control"></td>
			</tr>
			<tr>
				<td><label>반려견 여부 : </label> Y</td>
			</tr>
		</table>
		</form>

		<br>
		<div class="btnsArea" align="center">
			<button type="submit" class="btn btn-default write">추가하기</button>
			&nbsp;
			<button type="submit" class="btn btn-success write">등록하기</button>
			&nbsp;
			<button type="button" class="btn btn-danger cancel">취소하기</button>
		</div>
	</div>

</body>
</html>