<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://fonts.googleapis.com/css2?family=Anton&family=Edu+VIC+WA+NT+Beginner:wght@600&family=Gamja+Flower&family=Single+Day&family=Jua&family=Nanum+Pen+Script&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
 <!-- 	<a href="samsung/list">리스트</a> -->
 	<button type="button" class = "btn btn-info" style="width:200px;"
 	onclick="location.href='samsung/list'">차량입고</button>
 	<button type="button" class = "btn btn-info" style="width:200px;"
 	onclick="location.href='member/list'">고객명단</button>
<%-- <c:redirect url="samsung/list"></c:redirect> --%>
	
</body> 
</html>