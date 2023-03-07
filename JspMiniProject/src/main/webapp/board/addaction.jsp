<%@page import="data.dao.SmartDao"%>
<%@page import="data.dto.SmartDto"%>
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
	//엔코딩
	request.setCharacterEncoding("utf-8");
//데이타 읽어서 dto읽기
SmartDto dto=new SmartDto();

String writer=request.getParameter("writer");
String subject=request.getParameter("subject");
String content=request.getParameter("content");

dto.setWriter(writer);
dto.setSubject(subject);
dto.setContent(content);

//dao선언후 insert호출
SmartDao dao=new SmartDao();
dao.insertSmart(dto);

//최근에 추가된 num값 얻기
int num=dao.getMaxNum();

//gaipsuccess페이지로 이동
response.sendRedirect("../index.jsp?main=board/boardlist.jsp");


%>
</body>
</html>