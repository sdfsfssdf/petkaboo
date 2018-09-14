<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%@include file="/views/admin/main/header.jsp" %>
	<%@include file="/views/admin/main/leftSide.jsp" %>
	<%@include file="/views/admin/main/rightSide.jsp" %>
	<%-- <script>
		$(function(){
			$.ajax({
				url : "<%=request.getContextPath()%>/getClientIp.ad", //요청을 보냄
				type : "post",
				success : function(data) {
					console.log(data); 

				},
				error : function(status, msg) {
					console.log(status);
					console.log(msg);

				}
			});
		})
	</script> --%>
</body>

</html>