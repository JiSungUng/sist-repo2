<%@page import="java.util.Date"%>
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
	<!-- 변수선언 -->
	<c:set var="name" value="이지민"></c:set>
	<c:set var="age" value="24"></c:set>
	<c:set var="today" value="<%=new Date()%>"/>
	
	<!--변수출력 -->
	<!--  c:out이 변수출력인데 생략가능 -->
	<h2>이름 :<c:out value="${name}"/></h2>
	<h2> 이름: ${name}</h2>
	<h2>  나이: ${age}</h2>
	<h2> 날짜 ${today}</h2>
	
	<!-- pattern  fmt날짜 형식-->
	<pre>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm"/>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd a hh:mm"/>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm EEE"/>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm EEEE"/>
	</pre>
	
	<c:set var="money" value="6789000"/>
	<c:set var="num1" value="123.456787"/>
	
	<!-- jstl에서의 숫자출력양식 -->
	<pre>
		${money }
		${num1 }
		
		<!-- 3자리마다 컴마 -->
		<fmt:formatNumber value="${money }" type="number"/>
		
		<!-- 3자리마다 컴마와 화폐다위 -->
		<fmt:formatNumber value="${money }" type="currncy"/>
		
		<!-- pattern -->
		<fmt:formatNumber value="${num1 }" pattern="0.00"/>
		<fmt:formatNumber value="1.2" pattern="0.##"/><!-- 0.12 ?? -->
		<fmt:formatNumber value="1.2" pattern="0.00"/> <!--1.2-->
	</pre>
	
</body>
</html>