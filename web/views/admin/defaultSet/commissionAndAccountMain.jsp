<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.pkb.commiAndAccount.model.vo.*"%>
<%
	CommissionAndAccountList caa =(CommissionAndAccountList)request.getAttribute("caa");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.contentArea {
		width:70%;
		margin-left:270px;
		margin-top:50px;
	}
	
	
	.categoryTableArea{
		display:inline-block;
	}
	.categoryTable{
		width:100%;
		
	}
	
	.categoryTable th{
		background: #ddd;
		text-align:center;
	}
	
	.vertical_line{
		width:1px;
		border:0.5px solid black;
		height:300px;
		display:inline-block;
		margin-left:20px;
		margin-right:20px;
	}
	
	h3{
		display:inline-block;
	}
	
	.spaceArea{
		width:32%;
		display:inline-block;
	}
	
	.accountTable{
		width:100%;
	}
	
	.accountTable th{
		background: #ddd;
		text-align:center;
	}
	
	.accountTableArea{
		display:inline-block;
		
	}
	
	.categoryBtns{
		width:40%;
		display:inline-block;
	}
	
	.accountBtns{
		width:58%;
		display:inline-block;
	}
	
	#tdText{
		display:inline-block;
		width:40%;
		align:right;
	}
	
	.persent{
		display:inline-block;
		width:20%;
	}
	
	.modal-backdrop.in {
   	 	z-index: 100;
	}
	
	.modal-content{
		z-index:9999999;
	}
	
	.addCate {
		float:left;
		width:200px;
	}
	
	.totalAddArea{
		width:80%;
		display:inline-block;
	}
	
	.addCateH3{
		display:inline-block;
	}
	
	#selectCategory{
		width:100%;
		
	}
	
	.addCateLabel{
		width:80px;
		float:left;
		margin-left:auto;
		margin-right:auto;
	}
	
	.addCateDiv{
		width:100px;
		float:left;
	}
	
	.addCatePer{
		width:80px;
		float:left;
	}
</style>
</head>
<body>
	<%@include file="../main/header.jsp" %>
	<%@include file="leftMenu.jsp" %>
	<div class=contentArea>
	<h2>수수료 및 계좌설정</h2>
	<p>카테고리별 수수료 설정과 무통장 입금용 계좌 설정이 가능합니다.</p>
	<hr>
	
	<h3>수수료 설정</h3><div class="spaceArea"></div><h3>무통장 입금계좌 설정</h3>
	<br>
	<div class="categoryTableArea" style="width:40%; height:300px; overflow:auto">
		<table class="categoryTable table table-hover" id="categoryTable">
			<tr>
				<th style="width:60%">카테고리</th>
				<th style="widht:40%">수수료</th>
			</tr>
			<% for ( int i = 0 ; i < caa.getClist().size(); i ++){ %>
				<tr align="center">
					<input type="hidden" value="<%= caa.getClist().get(i).getPetCategory()%>">
					<td id="categoryTd"><%= caa.getClist().get(i).getPetCategoryName() %> </td>
					<td><input class="form-control" id="tdText" type="text" placeholder="<%= caa.getClist().get(i).getFee_rate() %>"><label class="persent">%</label></td>
				</tr>
			<%} %>
		</table>
	</div>
	
	
	
	<div class="vertical_line"></div>
	
	<div class="accountTableArea" style="width:55%; height:300px; overflow:auto">
		<table class="accountTable table table-hover">
			<tr>
				<th width=30%>은행</th>
				<th width=40%>계좌번호</th>
				<th width=20%>예금주</th>
				<th width=10%><input type="checkbox" class="masterCheck"></th>
			</tr>
			<% for (int i = 0; i < caa.getAlist().size(); i ++){ %>
				<tr align="center">
					<td><%=caa.getAlist().get(i).getBankName() %></td>
					<td><%=caa.getAlist().get(i).getAccountNo() %></td>
					<td><%=caa.getAlist().get(i).getUser_name() %></td>
					<td><input type="checkbox" class="childCheck" name="selectAccList" value="<%=caa.getAlist().get(i).getWithdrawInfoNo() %>"></td>
				</tr>
			<%} %>
		</table>
	</div>
	
	<script>
	$(function(){
		$('.masterCheck').click(function(){
			$('.childCheck').prop('checked',this.checked);
		});
	});
</script>
	
	<br>
	<div class="categoryBtns" align="center">
		<button type="button" id="commission" class="btn btn-success">적용하기</button>
		<button type="button" id="comReset" class="btn btn-danger">취소하기</button>
	</div>
	
	<script>
		$(function(){
			$('#comReset').click(function(){
				console.log($('#categoryTable tr'));
				for(var i = 0 ; i < $('#categoryTable tr').length-1 ; i ++) {
					$('#categoryTable tr>td>input')[i].value="";
				}
			});
			
			$('#commission').click(function(){
				var category = "";
				var value = "";
				
				
				// 유효성 검사...
				checkInputData = "";
				for(var i = 0 ; i < $('#categoryTable tr').length-1 ; i ++){
					checkInputData+= $('#categoryTable td').parent().children().children('input')[i].value
					if(isNaN($('#categoryTable td').parent().children().children('input')[i].value)){
						alert("변경하실 카테고리 수수료를 숫자로 입력해주세요.")
						return;
					}
				}
				
				if(checkInputData===""){
					alert("변경하실 카테고리 수수료 정보를 입력해 주세요.")
					return;
				}
				
				
				for(var i = 0 ; i < $('#categoryTable tr').length-1 ; i ++) {
					if(i==$('#categoryTable tr').length-2){
						value +=$('#categoryTable td').parent().children().children('input')[i].value;
						category+= $('#categoryTable td').parent().children('input')[i].value ;
					} else {
						value +=$('#categoryTable td').parent().children().children('input')[i].value + ",";
						category+= $('#categoryTable td').parent().children('input')[i].value + ",";
					}
				}
				
				location.href = "<%=request.getContextPath()%>/modifyCommission.caa?category="+category+"&value="+value;
				

			})
			
			
		})
	</script>
	<div class="accountBtns" align="center">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" id="insertAccBtn" class="btn btn-info" data-toggle="modal" data-target="#myModal">무통장 입금계좌 추가하기</button>
		<button type="button" id="deleteAccBtn" class="btn btn-danger " >삭제하기</button>
	</div>
	<div class="modal fade" id="myModal" role="dialog">
    	<div class="modal-dialog modal-lg">
      		<div class="modal-content">
        		<div class="modal-header">
          			<button type="button" class="close" data-dismiss="modal">&times;</button>
          			<h4 class="modal-title">무통장 입금계좌 추가하기 입력창</h4>
        		</div>
        	<form method="post" action="<%=request.getContextPath()%>/insertAccount.caa">
        	<div class="modal-body">
          		<label>은행</label> 
          		<select name="bank" class="form-control modalContent1 modalContent">
          			<option value="NH농협은행">NH농협은행</option>
          			<option value="신한은행">신한은행</option>
          			<option value="우리은행">우리은행</option>
          			<option value="하나은행">하나은행</option>
          			<option value="IBK기업은행">IBK기업은행</option>
          			<option value="KB국민은행">KB국민은행</option>
          			<option value="KEB외환은행">KEB외환은행</option>
          		</select>
          		<label>계좌번호</label>
          		<input type="text" class="form-control modalContent modalContent2" name="accountNo" placeholder="계좌번호를 입력해주세요.">
<!--           		<label>예금주</label>
          		<input type="text" class="form-control modalContent modalContent3" name="name" placeholder="예금주명을 입력해주세요."> -->
        	</div>
        	<div class="modal-footer">
        		<button type="submit" class="btn btn-success">추가하기</button>
          		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        	</div>
        	</form>
      	</div>
    </div>
 	</div>
	<script>
		$(function(){
			$("#deleteAccBtn").click(function(){
				var checkBoxs = document.getElementsByName("selectAccList"); // 체크박스 객체
				var len = checkBoxs.length;
				var checkRow = "";
				var checkCnt = 0;
				var checkLast = "";
				var rowid = '';
				var values = "";
				var cnt = 0;
				
				for(var i = 0; i < len ; i ++){
					if(checkBoxs[i].checked == true){
						checkCnt++;
						checkLast = i;
					}
				}
				
				for(var i = 0; i < len ; i ++){
					if(checkBoxs[i].checked == true){
						checkRow = checkBoxs[i].value;
						
						if(checkCnt == 1){
							rowid += checkRow;
						} else {
							if(i == checkLast){
								rowid += checkRow ;
							} else {
								rowid += checkRow + ",";
							}
						}
						
						cnt ++;
						checkRow = '';
					}	
				}
				location.href="<%=request.getContextPath()%>/deleteAccount.caa?selecAccNo="+rowid;
			})
		})
	</script>
	<br>
	<hr>
	<h3 class="addCateH3">동물 카테고리 추가</h3>
	<div class="totalAddArea">
		<div class="addCateDiv">
		<label> </label>
			<select class="form-control" id="selectCategory">
				<option value="1">대분류</option>
				<option value="2">소분류</option>
			</select>
		</div>
		<div id="major">
			<div class="addCateLabel">
				<label>카테고리명  </label>
			</div>
			<div class="addCate">
				<input class="form-control addCate" type="text">
			</div>
			<div class="addCateLabel">
				<label>수수료  </label>
			</div>
			<div class="addCate">
				<input class="form-control addCatePer" type="number" min="0" max="100">
			</div>
			<div class="addaddCateLabelCate">
				<label>%</label>
			</div>
			<div class="addCate">
				<button class="btn btn-success">추가하기</button>
			</div>
		</div>
		
		<div style="display:none;" id="minor">
			<div class="addCate">
				<select class="form-control addCate">
					<% for (int i = 0 ; i< caa.getClist().size(); i++){ %>
						<option><%=caa.getClist().get(i).getPetCategoryName() %></option>
					<%} %>
				</select>
			</div>
			<div class="addCateLabel">
				<label>카테고리명  </label>
			</div>
			<div class="addCate">
				<input class="form-control addCate" type="text">
			</div>
			<div class="addCate">
				<button class="btn btn-success">추가하기</button>
			</div>
		</div>
	</div>
	<script>
		$(function(){
			$('#selectCategory').change(function(){
				if($('#selectCategory').val() == "1"){
					$('#major').show();
					$('#minor').hide();
				} else {
					$('#major').hide();
					$('#minor').show();
				}
			})
		})
	</script>
	</div>
</body>
</html>