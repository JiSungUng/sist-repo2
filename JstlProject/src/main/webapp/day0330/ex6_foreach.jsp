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
	
	<h2>foreach문, forTokenans</h2>
	
	<c:forEach var ="a" begin="1" end="20">
	[${a }&nbsp;]
	
	</c:forEach>
	
	<br>
	<c:forEach var ="a" begin="1" end="10" step="2">
	[${a }&nbsp;]
	
	</c:forEach>
	<br>
	
	<%
		String[] mycolor={"red","pink","gray","yellow","green"};
	%>
	<c:set var="mycolor" value="<%=mycolor %>"/>
	<table class="table table-bordered" sty;e="width:300px;">
		<caption><b>전체출력</b></caption>
		<tr>
		<th>index</th><th>count</th><th>color</th>
		</tr>
		<c:forEach var="a" items= "${mycolor }" varStatus="i">
		<tr>
		<td>${i.index }</td>
		<td>${i.count }</td>
		<td bgcolor="${a }">${a }</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<c:set var="msg" value="장미,후리지아,다알리아, 제라늄, 국화"></c:set>
	${msg }<br>
	
	<h2>msg값을 컴마로 분리해서 출력</h2>
	<c:forTokens var = "s" items="${msg }" delims="," varStatus="i">
	
	<h3>${i.count }:${s }</h3>
	</c:forTokens>
	
	
</body>
</html>