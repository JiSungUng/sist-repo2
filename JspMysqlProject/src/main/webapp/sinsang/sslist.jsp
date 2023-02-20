<%@page import="java.util.ArrayList"%>
<%@page import="sinsang.model.SinsangDto"%>
<%@page import="sinsang.model.SinsangDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 번호 이름 핸드폰 혈액형 생년월일 
	이름누르면 개인정본오고 아래 버튼 3개 나오게-->
	<%
		SinsangDao dao = new SinsangDao();
		List<SinsangDto> list = dao.getAllDatas();
	
	%>
	<div style="margin:30px 30px;">
		<button type="button" class="btn btn-info" onclick="location.href='addform.jsp'">개인정보추가</button>
		<hr>
		
		<table class="table table-hover" style="width: 800px;">
			<caption><b>개인정보내역</b></caption>
			<tr class="table-info" bgcolor="lightgray" style="text-align:center;">
				<th width="50">번호</th>
				<td width="100">이름</td>
				<td width="100">핸드폰</td>
				<td width="50">혈액형</td>
				<td width="130">생년월일</td>
			</tr>
			<%
			if(list.size()==0){%>
				<tr>
					<td colspan="5" align="center">
						<h3>
							<b>등록된 사람이 없습니다.</b>
						</h3>
					</td>
				</tr>
			<%} else {
				for (int i = 0; i < list.size(); i++) {
					SinsangDto dto = list.get(i);
				%>
				<tr>
					<td align="center"><%=i + 1%></td>
					<td><a href="sangsepage.jsp?num=<%=dto.getNum()%>" style="color:black; text-decoration:none;"><%=dto.getName() %></a></td>
					<td><%=dto.getHp() %></td>
					<td align="center"><%=dto.getBlood() %></td>
					<td><%=dto.getBirth() %></td>
				</tr>
				<%
				}
			}
			%>
		</table>
	</div>

</body>
</html>