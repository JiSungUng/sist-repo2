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
	<h3 class="alert alert-warning">Ex3 예제</h3>
	<br>
	<h4>그림 번호 입력후 엔터를 눌러주시요</h4>
<input type="text" id="search" calss="form-control" style="width:130px;">	
	<br><br>
	<script type="text/javascript">
	$("#search").keyup(function(e){
		if(e.keyCode==13){
			
		var name=$(this).val();
		
		$.ajax({
			
			type:"get",
			dataType:"json",
			url:"list3",
			data:{"name":name},
			success:function(res){
				$("#fname").text(res.name);
				$("#photo").attr("src","upload/"+res.photo);
				$("#search").val('');//입력값  지우기
			}
			
		});
		}
	});
	
	</script>
	
	
</body>
</html>