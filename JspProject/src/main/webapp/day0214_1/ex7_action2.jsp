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
	String sname = request.getParameter("sang");
	String color[] = request.getParameterValues("scolor");
	String size = request.getParameter("ssize");
	String chuga = request.getParameter("schuga");
	%>


	<b>이름 : <%=sname%></b>
	<br>
	<b>색상 : </b>
	<%
	for (int i = 0; i < color.length; i++) {
	%>
	<%=color[i]%>
	<%
	}
	%>
	<br>
	<b>사이즈 : <%=size%></b>
	<br>
	<b>추가상품 : <%=chuga%></b>

</body>
</html>