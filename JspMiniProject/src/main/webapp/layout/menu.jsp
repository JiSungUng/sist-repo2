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
<%
	//프로젝트 경로 구하기
	String root=request.getContextPath();
%>
<body>
<a href="<%=root %>/index.jsp">메인</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/index.jsp?main=login/loginmain.jsp">로그인</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/index.jsp?main=member/addform.jsp">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/index.jsp?main=guest/guestlist.jsp">방명록</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/index.jsp?main=board/boardlist.jsp">Q&A게시판</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/">스마트게시판</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=root %>/">상품등록</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>