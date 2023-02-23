<%@page import="java.io.File"%>
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
<body>
<%
//num,pass 읽기
	String num = request.getParameter("num");
	String pass = request.getParameter("pass");
	
	
	//db선언
	SimpleDao db=new SimpleDao();
	//메서드 isEqualPass 로부터 반환값 b 받기
	boolean b=db.isEqualPass(num, pass);
	
	//b가 참이면 삭제 후 목록.. 거짓이면 스크립트 경고창
	if(b){
		//게시글을 지우기 전에 업로드 이미지 지우기
		String imgName=db.getData(num).getImgname();
		
		//업로드 경로구하기
		String uploadPath=getServletContext().getRealPath("/upload");
		
		//파일생성
		File file=new File(uploadPath+"\\"+imgName);
		//파일삭제
		if(file.exists())//파일이 존재하면
			file.delete();//파일 삭제
		
			//db 삭제
			
			db.deleteBoard(num);
			
			response.sendRedirect("boardList.jsp");
	}else{%>
		<script type="text/javascript">
			alert("비밀번호가 맞지않아요");
			history.back();
		</script>
	<%}
	
	
%>
</body>
</html>