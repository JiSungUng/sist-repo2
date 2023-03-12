<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
button {
  width: 150px;
  height: 50px;
  font-size :15px;
}

div{
font-size:20px;
}


</style>


</head>
<%
   //프로젝트 경로구하기
   String root=request.getContextPath();
%>
<body>

   <a href="<%=root%>" style="color: red;">
   <img src="image/로고1.png" style="max-width: 800px; max-height: 200px; padding-left:300px"></a>
   
   <div style="float: right; padding-right:80px">
   	<b style="color:white; font-size:30px;">???님</b><br>
    	<button type="button" class="btn btn-primary" id="myshop" style="font-size:30px;">장바구니</button>
    	<button type="button" class="btn btn-primary" id="mypage" style="font-size:30px;">마이페이지</button>
   </div>
   
     
  
</script>
</body>
</html>