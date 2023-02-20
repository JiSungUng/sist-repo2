<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
   //세션에 저장하는 방법
   session.setAttribute("msg", "happy");
   session.setMaxInactiveInterval(60);    //60초 유지
%>

   <h3>세션값 얻기</h3>
   세션값: <%=session.getAttribute("msg") %><br>
   세션 유지시간: <%=session.getMaxInactiveInterval()%>초 <br>
   세션 생성시간: <%=session.getCreationTime() %> <br>
   세션 생성시간: <%=new Date(session.getCreationTime())%> <br>
</body>

</html>