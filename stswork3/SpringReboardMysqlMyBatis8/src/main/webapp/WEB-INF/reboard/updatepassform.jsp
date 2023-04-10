<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://fonts.googleapis.com/css2?family=Anton&family=Edu+VIC+WA+NT+Beginner:wght@600&family=Gamja+Flower&family=Single+Day&family=Jua&family=Nanum+Pen+Script&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<div style="margin: 100px 100px;">
  <form action="updatepass" method="post" class="form-inline">
      <!-- hideen -->
      <input type="hidden" name="num" value="${num }">
      <input type="hidden" name="currentPage" value="${currentPage }">
      
      <div class="alert alert-info" style="font-size: 1.3em; width: 350px;">
        <b>비밀번호를 입력해 주세요</b>
      </div>
      <div>
         <input type="password" name="pass" class="form-control" style="width: 130px;"
         required="required">
         <button type="submit" class="btn btn-info">수정하기</button>
         <button type="button" class="btn btn-success"
         onclick="history.back()">이전으로</button>
      </div>
  </form>
</div>
</body>
</html>