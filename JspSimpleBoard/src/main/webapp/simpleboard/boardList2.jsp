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
<Style type="text/css">
a:link{
text-decoration: none;
color:black;
font-weight:bold;
font-size:10pt;
}
</Style>
<body>
<table class="table table-hover" style="width:800px;">
	<caption>이미지형 목록보기
	<button type="button" class="btn btn-info" onclick="location.href='insertForm.jsp'" style="margin-left:600px;">글쓰기</button>
	</caption>
	
	<tr>
	<%
	for(int i=0;i<list.size();i++){
		
		int no=list.size()-i;
		SimpleDto dto=list.get(i);
		%>
		<td>
		<a href="content.jsp?num=<%=dto.getNum()%>">
		<img alt="" src="../upload/<%=dto.getImgname()%>"
		style="width:200px; height:200px; border:1px solid gray; margin:5px;">
		<br><br>
		<%=dto.getSubject() %>
		</a>
		<br>
		<span style="color:gray; font-size:9pt">
		조회:<%=dto.getReadcount()%> &nbsp;&nbsp;&nbsp;
		<%=dto.getWriteday() %>
		<br>
		<%=dto.getWriter() %>
		</span>
		</td>
		<%
		if((i+1)%4==0){
			%>
			</tr>
			<tr>
		<%}
		%>
			
<%}
	%>
	
	</tr>
	
</table>

</body>
</html>