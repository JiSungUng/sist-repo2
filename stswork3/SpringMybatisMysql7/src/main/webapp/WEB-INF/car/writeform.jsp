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
	<form action="write" method="post">
	<table class="table table-bordered" style="width:350px;">
	<caption><b>차정보 입력</b></caption>
	<tr>
	<th bgcolor="pink" width="100">자동차명</th>
	<td>
	<input type="text" name="carname" size="10" required="required">
	</td>
	</tr>
	
	<tr>
	<th bgcolor="pink" width="100">자동차가격</th>
	<td>
	<input type="text" name="carprice" size="10" required="required">
	</td>
	</tr>
	
	<tr>
	<th bgcolor="pink" width="100">색상</th>
	<td>
	<input type="color" name="carcolor" size="10" required="required">
	</td>
	</tr>
	
	<tr>
	<th bgcolor="pink" width="100">구입일</th>
	<td>
	<input type="date" name="carguip" size="10" required="required">
	</td>
	</tr>
	
	<tr>
	<td colspan="2" align="center">
	<button type="submit" class="btn btn-default">DB저장</button>
	<button type="button" class="btn btn-default" onclick="location.href='list'">목록</button>
	</td>
	</tr>
	
	</table>
	</form>
</body>
</html>