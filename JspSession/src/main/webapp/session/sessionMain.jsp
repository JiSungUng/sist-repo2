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
   //세션에 저장하는 방법
   
   session.setAttribute("msg", "happy!!!");
   session.setMaxInactiveInterval(10);    //60초 유지
%>

<h2>10초안에 눌러주세요!!</h2>
<form action="sessionAction.jsp" method="post">
<h2>가고싶은 여행지는?</h2>
<input type="radio" value="이탈리아 로마 5박 6일" name="travel">이탈리아 로마 5박 6일&nbsp;
<input type="radio" value="캐나다 밴쿠버 4박 5일" name="travel">캐나다 밴쿠버 4박 5일&nbsp;
<input type="radio" value="일본 2박 3일 "name="travel">일본 후쿠오카 2박 3일&nbsp;
<input type="radio" value="미국 뉴욕 6박 7일" name="travel" checked="checked">미국 뉴욕 6박 7일&nbsp;

<input type="submit" value = "상품신청">
</form>
</body>
</html>