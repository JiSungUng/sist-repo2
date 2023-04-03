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

	<h3>${msg }</h3>
	<h3><fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm"/></h3>
	<h2>매핑주소 연습</h2>
	<ul>
	<li><a href="apple/list">apple/list</a></li>
	<li><a href="apple/list.do">apple/list.do</a></li>
	<li><a href="apple/list.nhn">apple/list.nhn</a></li>
	<li><a href="banana/insert">banana/insert</a></li>
	<li><a href="orange/delete">orange/list</a></li>

	</ul>
	<h2>이미지 출력 연습</h2>
	<ul>
		<li><a href="shop/detail">resource의 이미지 출력</a></li>
		<li><a href="board/add/data">퀴즈: 이미지 출력</a></li>
		
	</ul>
</body>
</html>