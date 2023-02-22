<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
	String pass = request.getParameter("pass");
	String num = request.getParameter("num");
	
	//비밀번호가 a1234면 삭제
	if(pass.equals(dto.getPass())) {
		response.sendRedirect("ssdelete.jsp?num=" + num);
	} else {
		%>
		<script>
			alert("비밀번호가 맞지 않습니다.");
			history.back();
		</script>
		<%
	}
%>
</body>
</html>