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
	dao.deleteSinsang(num);
	
	response.sendRedirect("sslist.jsp");
			
%>
</body>
</html>