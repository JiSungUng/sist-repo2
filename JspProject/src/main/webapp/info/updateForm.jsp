<%@page import="info.model.InfoDto"%>
<%@page import="info.model.InfoDao"%>
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
<%
String num=request.getParameter("num");
InfoDao dao=new InfoDao();
InfoDto dto=dao.getData(num);

%>

<body>
	<form action="updatetAction.jsp" method="post"><!-- insert는 무조건 post -->
		<table class="table table-bordered" style="width:350px;">
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" size="7" placeholder = "이름" required="required" class="form-control" value="<%=dto.getName()%>">
				</td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td>
					<input type="text" name="addr" size="20" placeholder = "주소" required="required" class="form-control" value="<%=dto.getAddr()%>">
				</td>
			</tr>
			
			<tr>
				<td colspan = "2" align="center">
				<!--  hidden은 폼안에 어디에 있던 상관없다. num값을 넘겨준다. -->
					<input type="hidden" name="num" value="<%=num%>">
					<input type = "submit" value="전송" class="btn btn-info">
					<input type="button" value="목록" onclick="location.href='infoList.jsp'" class="btn btn-danger">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>