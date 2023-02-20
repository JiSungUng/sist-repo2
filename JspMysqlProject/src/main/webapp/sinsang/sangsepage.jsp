<%@page import="sinsang.model.SinsangDao"%>
<%@page import="sinsang.model.SinsangDto"%>
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
SinsangDao dao = new SinsangDao();
SinsangDto dto = dao.getData(num);
%>
<div style="margin:30px 30px;">
	<table class="table table-bordered" style="width:500px;">
		<caption><h2 class="alert alert-info" style="width:500px;"><%=dto.getName() %>님의 개인정보</h2></caption>
		<tr>
			<td>이름</td>
			<td><%=dto.getName() %></td>
		</tr>
		
		<tr>
			<td>핸드폰번호</td>
			<td><%=dto.getHp() %></td>
		</tr>
		
		<tr>
			<td>혈액형</td>
			<td><%=dto.getBlood() %></td>
		</tr>
		
		<tr>
			<td>생년월일</td>
			<td><%=dto.getBirth() %></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="btn btn-info" onclick="history.back()" value="돌아가기">
				<input type="button" class="btn btn-info" onclick="location.href='updateform.jsp?num=<%=dto.getNum() %>'" value="수정">
				<input type="button" class="btn btn-info" onclick="location.href='deletepassform.jsp?num=<%=dto.getNum() %>'" value="삭제">
			</td>
		</tr>
	</table>
</div>
</body>
</html>