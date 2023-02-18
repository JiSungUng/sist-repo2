<%@page import="team.model.TeamDao"%>
<%@page import="team.model.TeamDto"%>
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
		String name = request.getParameter("name");
		String lic = request.getParameter("lic");
		String hp = request.getParameter("hp");
		
		//dto에 정보를 줘야함.
		//입력데이터를 dto로 묶기
		TeamDto dto = new TeamDto();
		
		dto.setName(name);
		dto.setLic(lic);
		dto.setHp(hp);
		
		//insert메서드로 전달
		TeamDao dao = new TeamDao();
		dao.insertTeam(dto);
		
		//출력 jsp로 이동_url주소창이 바뀜.
		response.sendRedirect("TeamList.jsp");
	%>
</body>
</html>