<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
<body>
	<%
		//String folder="save";
		ServletContext context=getServletContext();
		String realFolder=context.getRealPath("/save");
		
		System.out.println("folder:"+realFolder);
		int filesize=1024*1024*5;
		MultipartRequest multi=null;
		
		try{
		multi= new MultipartRequest(request,realFolder,filesize,"utf-8",new DefaultFileRenamePolicy());
		
		String name=multi.getParameter("name");
		String title=multi.getParameter("title");
		String uploadFileName=multi.getFilesystemName("uploadFile");
		String originalFileName=multi.getOriginalFileName("uploadFile");
			%>
			<table class="table table-bordered" style="width: 300px;">
				<tr>
					<th width="100">이름</th>
					<td><%=name %></td>
				</tr>
				<tr>
					<th width="100">제목</th>
					<td><%=title %></td>
				</tr>
			
				<tr>
					<th width="100">업로드 파일명</th>
					<td>
						<img alt="" src="../save/<%=uploadFileName%>">
					</td>
				</tr>
				<tr>
					<th width="100">원래 파일명</th>
					<td>
						<%=originalFileName %>
					</td>
				</tr>
				
				<tr>
				<td colspan="2" align="center">
					<input type="button" value="다시 업로드하기" onclick="location.href='uploadForm.jsp'">
				</td>
				</tr>
			</table>
			
		
		<%}catch(Exception e){
		
			
		}
	%>
</body>
</html>