<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    
       <link rel="stylesheet" type="text/css" href="menu/css/font-awesome.css">
   <link rel="stylesheet" type="text/css" href="menu/css/menu.css">
    
   <script type="text/javascript" src="menu/js/jquery.js"></script>
   <script type="text/javascript" src="menu/js/function.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<%
   //프로젝트 경로 구하기..절대경로
   String root=request.getContextPath();
   
   //아이디
   String myid=(String)session.getAttribute("myid");

   //로그인상태
   String loginok=(String)session.getAttribute("loginok");
   
%>
<body>

</body>
</html>