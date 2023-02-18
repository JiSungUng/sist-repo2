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
.main-img:hover {
	width: 200px;
	border: 5px solid orange;
	cursor: pointer;
}
</style>
</head>

<body>
	<%
	int n = 1;
	%>
	<!-- 배열선언없이 이미지20개 4행 5열-->
	<table>
		<%
		for (int i = 0; i < 4; i++) {
		%>
		<tr>
			<%
			for (int j = 0; j < 5; j++) {
			%>
			<td><img src="../image/<%=n%>.jpg" style="width: 100px;"
				class="main-img"></td>
			<%
			n++;
			}
			%>

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>