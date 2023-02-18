<%@page import="info.model.InfoDao"%>
<%@page import="info.model.InfoDto"%>
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
</head>
<body>
	<%
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		//dto에 정보를 줘야함.
		//입력데이터를 dto로 묶기
		InfoDto dto = new InfoDto();
		
		dto.setName(name);
		dto.setAddr(addr);
		
		//insert메서드로 전달
		InfoDao dao = new InfoDao();
		dao.insertInfo(dto);
		
		//출력 jsp로 이동_url주소창이 바뀜.
		response.sendRedirect("infoList.jsp");
	%>
</body>
</html>