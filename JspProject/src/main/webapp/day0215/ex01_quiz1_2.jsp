<%@page import="javax.swing.text.Document"%>
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
		String name = request.getParameter("name");
		String birthday = request.getParameter("date");
		String []hobby = request.getParameterValues("hobby");
	%>
	<h1>폼 태그로부터 읽은 값</h1>
	
	<h4>이름: <%=name %></h4>
	<h4>생년월일 : <%=birthday %></h4>
	<h4>
	취미 : 
	<%
		for(int i=0;i<hobby.length;i++){
	%>
			<%=hobby[i] %>
	<% 
		}
	%>
	
	</h4>
	
	
</body>
</html>