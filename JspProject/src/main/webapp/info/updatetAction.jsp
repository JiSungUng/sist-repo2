<%@page import="info.model.InfoDao"%>
<%@page import="info.model.InfoDto"%>
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
		//한글엔코딩
		request.setCharacterEncoding("utf-8");
		//데이터읽기
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		//dto에 정보를 줘야함.
		//입력데이터를 dto로 묶기
		InfoDto dto = new InfoDto();
		
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		//insert메서드로 전달
		InfoDao dao = new InfoDao();
		dao.updateInfo(dto);
		
		//출력 jsp로 이동_url주소창이 바뀜.
		response.sendRedirect("infoList.jsp");
	%>
</body>
</html>