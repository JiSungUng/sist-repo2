<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
	String num = request.getParameter("num");	
%>
	<div style="margin:100px 100px;"></div>
	<form action="deletepassaction.jsp">
		<table class="table table-bordered" style="width:250px;">
			<tr height="120" align="center">
				<td>
					<b>삭제시 필요한 <br>비밀번호를 입력하세요.</b>
					<br><br>
					<input type="password" name="pass" size="5" required="required">
					<input type='hidden' name="num" value="<%=num %>">
					<input type="submit" value="확인" class="btn btn-danger">
					<input type="button" value="목록" onclick="location.href='sslist.jsp'">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>