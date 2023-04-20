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
   <c:set var="root" value="<%=request.getContextPath()%>" />
<body>
<div style="margin-left:100px; margin-top:100px">
   <img alt="" src="${root }/image/03.png" width="200" align="left" hspace="20">
   <br><br>
   <!-- id 통한 이름받아서 표시 -->
   
   <button type="button" class="btn btn-danger"
   onclick="location.href='logoutprocess'">로그아웃</button>
</div>
</body>
</html>