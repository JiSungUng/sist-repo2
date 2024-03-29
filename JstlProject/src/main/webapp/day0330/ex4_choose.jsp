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
	<fmt:requestEncoding value="utf-8" />
	<form action="ex4_choose.jsp" method="post" style="width: 200px;">
		<h3>이름을 입력해주세요</h3>
		<input type="text" name="irum" class="form-control">

		<h3>여행가고싶은 나라를 입력해주세요</h3>
		<input type="text" name="nara" class="form-control"> <br>

		<button type="submit" class="btn btn-info">결과확인</button>
	</form>
	<c:if test="${!empty param.irum }">
		<h3>이름: ${param.irum }</h3>
		<h3>가고싶은 나라: ${param.nara }</h3>
	<c:choose>
	<c:when test="${param.nara=='캐나다' }">
		<h3 style="color:green">캐나다 항공권은 200만원입니다</h3>
	</c:when>
	<c:when test="${param.nara=='하와이' }">
		<h3 style="color:green">하와이 항공권은 100만원입니다</h3>
	</c:when>
	<c:when test="${param.nara=='괌' }">
		<h3 style="color:green">괌 항공권은 80만원입니다</h3>
	</c:when>
	<c:when test="${param.nara=='뉴욕' }">
		<h3 style="color:green">뉴욕 항공권은 250만원입니다</h3>
	</c:when>
	<c:otherwise>
		<h3 style="color:red">${parma.nara }로 가는 항공권이 없습니다.</h3>
	</c:otherwise>
	</c:choose>


	</c:if>
</body>
</html>