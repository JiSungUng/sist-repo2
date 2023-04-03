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
	<form action="upload1" method="post" enctype="multipart/form-data">
	<table class="talbe table-bordered" style="width:400px;">
	<caption><b>스프링 파일업로드(파일 1개)</b></caption>
	<tr>
		<th bgcolor="orange" width="100">제목</th>
		<td><input type="text" name="title" class="form-control"
		style="width:150px;"></td>
	</tr>
	
	<tr>
		<th bgcolor="orange" width="100">제목</th>
		<td><input type="file" name="photo" class="form-control"
		style="width:100px;"></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<button type="submit" class="btn btn-info">업로드#1</button>
		</td>
	</tr>
	
	</table>
		
	</form>
</body>
</html> 