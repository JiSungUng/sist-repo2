<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    
   <script type="text/javascript">
   
   $(function(){
	  $("#btnnewphoto").click(function(){
		 $("#newphoto").trigger("click");
		 
	  }); 
	  
	  $("#newphoto").change(function(){
		  
		  var num=$(this).attr("num");
		//  alert(num);
		  
		var form = new FormData();
		form.append("photo",$("#newphoto")[0].files.[0]);//선택한 1개만 반드시 추가.
		form.append("num",num);
		
		$.ajax({
			type:"post",
			dataType:"text",
			url:"updatephoto",
			processData:false, //서버전달시 데이터가 query String 형태로 전달되는데 파일전송의 경우 이를 하지 않아야 하는 설정이 false
			contentType:false,//enType이 원래 기보이 application... www 이런 형태인데 multipart/form-data로  변경해주는것이 false
			data:form,
			success:function(){
				location.reload();
			}	
		});
		  
	  });
	  
   });
   
   //수정버튼 클릭 시 모달에 데이타 넣기
   $(".btnupdate").click(function(){
	  
	   updatenum=$(this).attr("num");
	   //alert(updatenum);
	   
	   $.ajax({
		  type: 
	   });
   });
   
   
   
   </script>
</head>
<body>
	<div style="margin: 200px;">
		<table class="table table-bordered">
			<c:forEach var="dto" items="${list }">
			<c:if test="${sessionScope.loginok!=null && sessionScope.myid==dto.id }">
			
				<tr>
					<td style="width: 250px;" align="center" rowspan="5">
						<img alt="" src="../photo/${dto.photo }" width="220"
						height="250" border="1">
						<br>
						<input type="file" id="newphoto" style="display: none;" num="${dto.num }"><br> <!-- 수정 시 호출 -->
						<button type="button" class="btn btn-info" id="btnnewphoto">사진수정</button>
					</td>
					
					<td style="width: 300px;">회원명: ${dto.name }</td>
					
					<!-- 수정 삭제 버튼 -->
					<td rowspan="5" align="center" style="width: 200px; vertical-align: middle;">
						<button type="button" class="btn btn-default"
						onclick="location.href='update'">수정</button>	
					
						<button type="button" class="btn btn-default"
						onclick="location.href='delete'">삭제</button>	
					</td>
				</tr>
				
				<tr>
					<td style="width: 300px;">아이디: ${dto.id }</td>
				</tr>
				
				<tr>
					<td style="width: 300px;">이메일: ${dto.email }</td>
				</tr>
				
				<tr>
					<td style="width: 300px;">핸드폰: ${dto.hp }</td>
				</tr>
				
				<tr>
					<td style="width: 300px;">주소: ${dto.addr }</td>
				</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
</body>
</html>