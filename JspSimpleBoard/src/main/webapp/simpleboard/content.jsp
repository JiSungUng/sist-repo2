<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.simpleboard.SimpleDto"%>
<%@page import="model.simpleboard.SimpleDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<%
String num = request.getParameter("num");
SimpleDao dao = new SimpleDao();
//조회수 증가
dao.updateReadCount(num);
//데이타
SimpleDto dto = dao.getData(num);

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<body>
	<table class="table table-condensed" style="width: 600px">
		<tr>
			<td style="width: 500px;">
				<h2><%=dto.getSubject()%></h2>
			</td>
			<td><span style="color: gray; font-size: 9pt;"><%=sdf.format(dto.getWriteday())%></span>
			</td>
		</tr>

		<tr>
		<td colspan="2">
		<span style="color: gray;font-size:9pt"><%=dto.getWriter() %></span>
		<br><br>
		<%=dto.getContent().replace("\n","<br>") %>
		<br><br>
		<a href="../upload/<%=dto.getImgname()%>">
		<img src="../upload/<%=dto.getImgname()%>" style="max-width:300px;"></a>
		</td>
		</tr>
	</table>
		
		<div style="magin-left:400;">
		<button type="button" class="btn btn-default"
		onclick="location.href='insertForm.jsp'">글쓰기</button>
		<button type="button" class="btn btn-default"
		onclick="location.href='boardList.jsp'">목록</button>
		<button type="button" class="btn btn-default"
		onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">수정</button>
		<button type="button" class="btn btn-default"
		onclick="location.href='deleteForm.jsp?num=<%=dto.getNum()%>'">삭제</button>
		
		</div>
		

</body>
</html>