<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
		table, td, tr {
			border:1px solid black;
			border-collapse: collapse;
		}
	</style>
</head>
<body>

	<form action="ex01_quiz1_2.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td>생년월일</td>
				<td><input type="date" name="date"></td>
			</tr>
			
			<tr>
				<td>취미</td>
				<td>
					<input type="checkbox" name="hobby" value="게임">게임
					<input type="checkbox" name="hobby" value="공부">공부
					<input type="checkbox" name="hobby" value="여행">여행
					<input type="checkbox" name="hobby" value="코딩">코딩
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;">
					<input type="submit" class="btn btn-danger" value="서버전송">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>