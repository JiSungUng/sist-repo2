<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.simpleboard.SimpleDto"%>
<%@page import="java.util.List"%>
<%@page import="model.simpleboard.SimpleDao"%>
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
SimpleDao db=new SimpleDao();

List<SimpleDto> list = db.getAllBoardDatas();

%>
<body>


<div class="alert alert-danger" style="width:800px;">
<b총><%=list.size()%>개의 글이 있습니다.</b>
</div>

<br>
<table class="table table-hover" style="width:800px;">
	<caption>게시판형 목록보기
	<button type="button" class="btn btn-info" onclick="location.href='insertForm.jsp'">글쓰기</button>
	<button type="button" class="btn btn-info" onclick="location.href='boardList2.jsp'">목록2</button>
	<button type="button" class="btn btn-info" onclick="location.href='/JspSimpleBoard/index.jsp'">index</button>
	</caption>

	<tr style="background:#d8bfd8">
		<th width="70">번호</th>
		<th width="400">제목</th>
		<th width="120">작성자</th>
		<th width="170">작성일</th>
		<th width="70">조회</th>
	</tr>	
		<%
		//출력할 날짜
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		for(int i=0;i<list.size();i++){
			//1번열에 출력할 번호
			int no=list.size()-i;
			//dto
			SimpleDto dto=list.get(i);
			%>
			<tr>
			<td align="center"><%=no %></td>
			<!-- 제목누르면 내용보기로 넘어가기 -->
			<td>
			<a href="content.jsp?num=<%=dto.getNum()%>">
			<img src="../upload/<%=dto.getImgname() %>" style="width:30;height:30px;">
			<%=dto.getSubject() %></a>
			</td>
			<!-- 작성자 -->
			<td><%=dto.getWriter() %></td>
			<!--작성일 -->
			<td><%=sdf.format(dto.getWriteday()) %></td>
			<!--조회수-->
			<td align="center"><%=dto.getReadcount() %></td>
			
			
			
			</tr>
			
		<%}
		
		%>
	
</table>
</body>
</html>