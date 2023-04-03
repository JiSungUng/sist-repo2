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
<form action="read" method="post">
	사원명:<input type="text" name="name" size="10"><br>
	부서명:<input type="text" name="depart" size="10"><br>
	급여:<input type="text" name="price" size="10"><br>
	나이:<input type="text" name="age" size="10"><br>
	혈액형:<input type="text" name="blood" size="10"><br>
	<button type="submit">post방식 전송</button>





	<%-- 사원멍: ${dto.name }<br>
	부서명: ${dto.depart }<br>
	급여: ${dto.price }<br>
	나이: ${dto.age }<br>
	혈액형: ${dto.blood }<br> --%>
	
</body>
</html>