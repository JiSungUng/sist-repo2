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
<c:if test="${totalCount==0 }">
<div class="alert alert-info">
	<b>저장된 상품정보가 없습니다.</b>
</div>
</c:if>
<c:if test="${totalCount>0 }">
<div class="alert alert-info">
	<b>총 ${totalCount }개의 상품정보가 있습니다.</b>
</div>
</c:if>

<c:forEach var="a" items="${list}">
	<table class="table table-bordered" style="width:500px;">
	<tr>
		<td>
			<c:if test="${a.photoname!=null }">
			<img alt="" src="../upload/${a.photoname }" style="max-width:150px;" align="left">
			</c:if>
			<c:if test="${a.photoname==null }">
			<img alt="" src="../upload/noimage.jpg" style="max-width:150px;" align="left">
			</c:if>
			<h4>상품명: ${a.sang }</h4>
			<h4>단가:  <fmt:formatNumber value="${a.dan }" type="currency"/></h4>
			<h4>날짜: <fmt:formatDate value="${a.ipgo }" pattern="yyyy-MM-dd HH:mm"/></h4>
			<h4>
				<button type="button" class="btn btn-success btn-xs" onclick="location.href='updateform?num=${a.num}'">상품수정</button>
				<button type="button" class="btn btn-danger btn-xs" onclick="location.href='delete?num=${a.num}'">상품삭제</button>
			</h4>
		</td>
	</tr>
	</table>
 </c:forEach>
</body>
</html>