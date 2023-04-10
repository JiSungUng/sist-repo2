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
	<div style="marign: 50px 50px;">
	<table class="tablle gtable-bordered" style="width:600px;">
	<caption><b>내용보기</b></caption>
	<tr>
	<td>
	<h2><b>${dto.subject }</b></h2>
	<span style="float:right; margin-left:20px;">
	조회${dto.readcount }&nbsp;&nbsp;&nbsp;&nbsp;
	<fmt:formatDate value="${dto.writeday }"
	pattern="yyyy-MM-dd HH:mm"/>
	</span>
	<h5><b>작성자:${dto.writer }</b></h5>
	</td>
	</tr>
	
	<tr>
	<td>
		<pre style="background-color: white; border:0px;">${dto.content }</pre>
		<br><br>
		
		<c:if test="${dto.photo!='no' }">
			<c:forTokens var="ps" items="${dto.photo }" delims="">
			<a href="../photo/${ps }">
			<img alt="" src="../photo/${ps }" style="width:100px; height:100px;
			border:3px solid green">
			</a>
			</c:forTokens>
			
		</c:if>
		
	</td>
		</tr>
		
		<tr>
		<td align="right">
			<button clss="btn btn-default btn-sm"
			onclick="location.href='writeform'">글쓰기</button>
			<button clss="btn btn-default btn-sm"
			onclick="location.href='writeform?num=${dto.num}&regroup=${dto.regroup}&restep=${dto.restep}&relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>
			<button clss="btn btn-default btn-sm"
			onclick="location.href='updatepassform?num=${dto.num}&currentPage=${currentPage }'">수정</button>
			<button clss="btn btn-default btn-sm"
			onclick="location.href='deletepassform?num=${dto.num}&currentPage=${currentPage }'">삭제</button>
			<button clss="btn btn-default btn-sm"
			onclick="location.href='list?currentPage=${currentPage}'">목록</button>
		</td>
		
		
		</tr>
	</table>
	
	</div>
</body>
</html>