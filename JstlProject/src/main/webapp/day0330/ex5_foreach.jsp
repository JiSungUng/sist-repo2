<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<%
		List<String> list= new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("orange");
		list.add("magenta");
		list.add("gray");
		list.add("pink");
		
		request.setAttribute("list", list);
		request.setAttribute("total",list.size());
		
		//세션에 저장
		session.setAttribute("id","angel");
		
	%>
	
	<h3>1~10까지 출력</h3>
	<c:forEach	var="a" begin="1" end="10">
	${a }&nbsp;
	</c:forEach>
	
		<h3>0~30까지 출력 3의 배수출력</h3>
	<c:forEach	var="a" begin="0" end="30" step="3">
	${a }&nbsp;
	</c:forEach>
	
	<!-- requestScope 생략가능 -->
	<h3>list에는 총 ${requestScope.total }개의 색상이 들어있습니다.</h3>
	<h3>list에는 총 ${total }개의 색상이 들어있습니다.</h3>
	
	
	<!-- sessionScope는 생략하지않는다. -->
	<h3>세션아이디 출력</h3>
	<h3>현재로그인한 아이디는 ${sessionScope.id }입니다.</h3>
	<h3>현재로그인한 아이디는 ${id }입니다.</h3>
	 
	 <hr>
	 
	 <h3>list 전체를 테이블로 출력하기</h3>
	 <table class="table table-bordered" style="width:300px;">
	 	<tr>
	 		<th>번호</th><th>인덱스</th><th>색상</th>
	 	</tr>
	 	<c:forEach var="s" items="${list}" varStatus="i"></c:forEach>
	 	<tr>
	 		<td>${i.count }</td><!-- 무조건 1부터 출력 -->
	 		<td>${i.index }</td><!-- 실제 list의 index값이 출력 -->
	 		<td style="color: ${s};">${s}</td><!-- 실제 list의 index값이 출력 -->
	 	</tr>
	 </table>
	 
	  <h3>list 전체를 테이블로 출력하기</h3>
	 <table class="table table-bordered" style="width:300px;">
	 	<tr>
	 		<th>번호</th><th>인덱스</th><th>색상</th>
	 	</tr>
	 	<c:forEach var="s" items="${list}" begin="2" end="4" varStatus="i"></c:forEach>
	 	<tr>
	 		<td>${i.count }</td><!-- 무조건 1부터 출력 -->
	 		<td>${i.index }</td><!-- 실제 list의 index값이 출력 -->
	 		<td style="color:${s};">${s}</td><!-- 실제 list의 index값이 출력 -->
	 	</tr>
	 </table>
	 
</body>
</html>