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
	//request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String lic = request.getParameter("license");
	%>

	<h4>결과값 출력</h4>
	<h6>
		이름 :
		<%=name%></h6>
	<h6>
		비밀번호 :
		<%=pass%></h6>
	<h6>
		면허 :
		<%=lic == null ? "없음" : "있음"%></h6>
</body>
</html>