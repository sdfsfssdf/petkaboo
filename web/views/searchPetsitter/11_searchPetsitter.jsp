<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>펫시터찾기메인</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
#header {
	float: left;
	width: 100%; height : 250px; _border : 1px solid blue;
	background-color: rgb(207, 183, 175);
	height: 250px;
	_border: 1px solid blue;
}
#field-style{
	margin-left:auto;
	margin-right:auto;
	width:80%;
	height:30%;
	background-color:rgb(207, 183, 175);
	display:block;
	align:center;
}

.page-label {
	align: center;
	font-size:
}
.input-style{
	width:55%;
	height:44px;
}
#PSlist{
	width:200px;
	height:90px;

}
.petsitter-list{
	margin-left:auto;
	margin-right:auto;
	

}
.PSList{
	
	width:80%;
	height:50%;
	margin-left:auto;
	margin-right:auto;
}

td{
	/* border:1px solid black; */
	padding-left: 1px;
	padding-right:1px;
	margin-top:1px;
	margin-bottom:1px;
}
.PSphoto{
	width:127px;
	height:127px;
}
.map-style{
	height:600px;
	width:500px;
	padding-left:100px;
}
td ul li{
	display:list-item;
}
nav ul{
	position::relative;
	margin:0px;
	padding:0px;
}
nav ul li{
	display:inline;
	margin-bottom:1%;
}
nav{
	margin-top:3%;
	margin-bottom:3%;
	
}
#nav-icon{
width:1%;
height:1%;
}
</style>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<body>

	<div id="container">
		<div id="header"></div>
		<%@include file="menubar.jsp"%>

		<h2 style="text-align: center; margin-top: 100px;">
			<span style="color: rgb(228, 100, 18);"> <strong>
					펫시터 찾기 </strong>
			</span>
		</h2>
		<br /><br />
		
		<fieldset id="field-style">
		<br /><br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder="&nbsp;&nbsp;&nbsp;지역을 검색해보세요!" class="input-style" />&nbsp;&nbsp;&nbsp;<a href="#"><i class="fas fa-search"></i></a>
			
			<button class="btn btn-default" type="submit">상세조회</button>
			여자<input type="radio" name="gender"/> 남자 <input type="radio" name="gender" />
			
			
			<select name="searchPrice" id="searchPrice">
				<option value="">가격높은순</option>
				<option value="">가격낮은순</option>
			</select>
			<select name="searchRank" id="searchRank">
				<option value="">등급높은순</option>
				<option value="">등급낮은순</option>
			</select>
			
		<br /><br /><br />
		</fieldset>

	<div class="body-div">
	
		<div class="petsitter-list">
		<br /><br /><br /><br /><br />
			<table class="PSList">
					<tr>
					<a href="#"><td width="118px" height="192.2px">
						<img src="https://pbs.twimg.com/profile_images/984239725190901760/-5wrSANU_400x400.jpg" class="PSphoto img-circle img-responsive" alt="Responsive image" />
						</td>
						<td>
						<ul>
							<li>닉네임</li>					
							<li>성별</li>
							<li>주소</li>
							<li>등급</li>
						</ul>
					</td></a>
					<td width="118px" height="192.2px">
						<img src="https://scontent-atl3-1.cdninstagram.com/vp/124d1f94c8e173a98886f9956d4a8ce8/5C3349EB/t51.2885-15/e35/33160048_2066949453569642_3907206528846790656_n.jpg" class="PSphoto  img-circle img-responsive" alt="Responsive image" />
					</td>
					<td>	
						<ul>
							<li>닉네임</li>					
							<li>성별</li>
							<li>주소</li>
							<li>등급</li>
						</ul></td>
					<td colspan="2" rowspan="3" width="50%"><img src="http://cafefiles.naver.net/20150420_295/entarro_1429524996891klNhX_JPEG/image.jpg" class="map-style" /><a href=""><i class="fas fa-map-marker-alt"></i></a></td>
				</tr>
				<tr>
					<td width="118px" height="192.2px"><img src="https://scontent-dfw5-1.cdninstagram.com/vp/0311309cc754aefef94b4434b17d16a1/5C3BA82E/t51.2885-15/e35/s480x480/38643408_211597533047688_3169716521924558848_n.jpg" class="PSphoto img-circle img-responsive" alt="Responsive image" />
					</td><td>
						<ul>
							<li>닉네임</li>					
							<li>성별</li>
							<li>주소</li>
							<li>등급</li>
						</ul></td>
					<td width="118px" height="192.2px"><img src="https://scontent.cdninstagram.com/vp/d432a9c5818f68d1dcfd3860935145f2/5BDCF333/t51.2885-15/sh0.08/e35/p640x640/34982645_1703252956454507_5788207006821122048_n.jpg" class="PSphoto img-circle img-responsive" alt="Responsive image" />
					</td><td>
						<ul>
							<li>닉네임</li>					
							<li>성별</li>
							<li>주소</li>
							<li>등급</li>
						</ul></td>

				</tr>
				<tr>
					<td width="118px" height="192.2px"><img src="http://momojeri.com/web/product/big/201607/33_shop1_658629.jpg" class="PSphoto img-circle img-responsive" alt="Responsive image" />
					</td><td>
						<ul>
							<li>닉네임</li>					
							<li >성별</li>
							<li >주소</li>
							<li >등급</li>
						</ul></td>
					<td width="118px" height="192.2px"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-_6PO3bu0QTN01FCWAiScWQWo9DVCm3t0bj64sphhxGVlthTEJA" class="PSphoto img-circle img-responsive" alt="Responsive image"/>
					</td>
					<td >
						<ul>
							<li style="display:list-item;">닉네임</li>					
							<li style="display:list-item;">성별</li>
							<li style="display:list-item;">주소</li>
							<li style="display:list-item;">등급</li>
						</ul></td>
				</tr>
			</table>
		<br /><br /><br /><br />
		<div>
			<nav align="center">
				<ul>
					<li><a href="#"><img
						src="https://cdn.icon-icons.com/icons2/38/PNG/512/back_arrow_5821.png"
						alt="" id="nav-icon"></a></li>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#"><img
						src="https://cdn.icon-icons.com/icons2/38/PNG/512/forwardarrow_haciaadelante_4836.png"
						alt="" id="nav-icon"></a></li>
				</ul>
			</nav>
		</div>
		
		</div>
		
		
	
	</div>


	</div>
	<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
	<script>
	$('#myModal').on('shown.bs.modal', function () {
		  $('#myInput').trigger('focus')
		})
	</script>
</body>
</html>