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
	<h3>ex02_two.jsp include하기</h3>
	<jsp:include page="ex02_twoInclude.jsp">
		<jsp:param value="안녕하세요" name="msg" />
		<jsp:param value="../image2/a01.png" name="imgname" />
	</jsp:include>
</body>
</html>