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
	<h3 class="alert alert-info">${totalCount }개의 상품이 등록되었습니다.</h3>
	<button type="button" class="btn btn-info"
	onclick="location.href='form'">상품추가</button>
	<!-- 번호		상품명	색상		가격	입고일 -->
	<table class="table table-bordered" style="width:600px">
	<caption><b>상품등록</b></caption>
	<tr bgcolor="">
	<th width="80">번호</th>
	<th width="180">상품명</th>
	<th width="100">색상</th>
	<th width="120">가격</th>
	<th width="180">입고일</th>
	</tr>
	
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${no }</td>
		<c:set var="no" value="${no-1 }"/>
		<td>
		<a href="">{dto.sangname</a>
		</td>
		<td>${dto.color }</td>
		<td>${dto.price }</td>
		<td>${dto.ipgoday }</td>
	</tr>
	</c:forEach>
	
	
	</table>
	
	<!-- 페이징 -->
</body>
</html>