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
<style>
.box{
width:40px;
height:40px;
border:px solid gray;
border-radius:100px;
}
</style>
<body>
<button type="button" class="btn btn-info"
onclick="location.href='jpaform'">차 정보 추가</button>
	<h3 class="alert alert-info">
	디테일 페이지입니다</h3>

	<table class="table table-bordered" style="width:800px;">
	<caption><b>상품목록 목록</b></caption>
	<tr bgcolor="#ddd">
	<th width="60">번호</th>
	<th width="160">상품명</th>
	<th width="120">가격</th>
	<th width="150">입고일</th>
	<th width="160">등록일</th>
	</tr>
	<tr>
	<td> <img src="../image/${dto.photo }"></td>
	<td>${dto.sangpum }</td>
	<td><fmt:formatNumber value="${dto.price }" type="currency"/></td>
	<td>${dto.ipgoday }</td>
	<td><fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/></td>
	<td>
	<button type="button" class="btn btn-success btn-xs" onclick="location.href='updateform?num=${dto.num}'">수정</button>
	<button type="button" class="btn btn-success btn-xs" onclick="location.href='delete?num=${dto.num}'">삭제</button>
	</td>
	</tr>
	</table>

</body>
</html>