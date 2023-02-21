<%@page import="java.util.Enumeration"%>
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
	MultipartRequest multi=null;

	//톰캣에 업로드되는 실제 프로젝트 경로 구하기
	
	ServletContext context = getServletContext();
	//프로젝트에 업로드의 실제경로구하기
	String realFolder=context.getRealPath("/save");
	System.out.println(realFolder);
	
	//업로드에  허용할 사이즈
	
	int uploadsize = 1024*1024*3; //3mb
	try{
	multi=new MultipartRequest(request,realFolder,uploadsize,"utf-8",new DefaultFileRenamePolicy());
	
	//입력한 값들 읽어오기
	String writer=multi.getParameter("writer");
	%>
	
	<h2>작성자:<%=writer %></h2>
	
	<%
	//파일타입이 여러개인 경우
	Enumeration forNames=multi.getFileNames();//file타입만 얻어옴
	
	while(forNames.hasMoreElements()){
		//파일태그의 name얻기
		String fileName=(String)forNames.nextElement();
		System.out.println("fileType의 name:"+fileName);
		
		//실제업로드된 파일명 얻기
		String uploadFileName=multi.getFilesystemName(fileName);
		
		//파일선택안하면 null
		if(uploadFileName !=null){%>
		<figure>
			<img src="../save/<%=uploadFileName%>"style="max-width:200px;border:1">
			<br>
			<figcaption><b><%=uploadFileName %></b></figcaption>
		</figure>
				
		<%}
		
	}
	%>
	
	
	<%}catch(Exception e){
		
	}
%>
</body>
</html>