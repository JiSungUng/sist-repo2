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
	<form action="insert1" method ="post">
	<table class="table table-bordered" style="width:300px;">
	<caption><b>상품 정보입력</b></caption>
	<tr>
	<th width="100">상품명</th>
	<td>
		<input type="text" name="sangpum" class="form-control">
	</td>
	</tr>
	
	<tr>
	<th width="100">단가</th>
	<td>
		<input type="text" name="price" class="form-control">
	</td>
	</tr>
	<tr>
	<th width="100">입고일</th>
	<td>
		<input type="date" name="ipgoday" class="form-control" value="2023-04-10">
	</td>
	</tr>
	
	<tr>
	<th width="100">사진입력</th>
	<td>
		<input type="file" name="photo" class="form-control" >
	</td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
			<button type="submit" class="btn btn-success">서버에 전송</button>
			<button type="button" class="btn btn-success"
			onclick="location.href='list'">목록</button>
		</td>
	</tr>
	
	</table>
	
	</form>
</body>
</html>