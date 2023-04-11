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
	<div
		style="width: 800px; text-align: right; margin: 50px 50px; font-size: 2em;">
		<span class="glyphicon glyphicon-th-large list1"
			style="font-size: 50pt; cursor: pointer"></span> <span
			class="glyphicon glyphicon-list list2"
			style="font-size: 50pt; cursor: pointer"></span>
	</div>
	<div class="restlist" style="margin-top: 50px margin-left:50px;"></div>

	<script type="text/javascript">
		//1번째 아이콘

		$("span.list1").click(function() {
			$("span.list1").css("color", "red")
			$("span.list2").css("color", "black")

			//$(".restlist").html("출력1");
			$.ajax({
				type : "get",
				dataType : "json",
				url:"list1",
				success:function(res){
					var tag="";
					tag+="<table class='table' style='width:800px;'>"
					$.each(res,function(i,elt){
						
						tag+="<tr hegiht='110'><td>";
						tag+="<h3><b>"+elt.subject+"</b></h3>"
						tag+=elt.content+"<br>";
						
						if(elt.photo!='no'){
							
							tag+="<span style='float:right'>";
							tag+="<img width='100' height='50' src='../photo/"+elt.photo+"'><br>";
							tag+="</span>";
						}
						tag="작성자:"+elt.writer;
						tag+="</td></tr>"
					});
					tag+="</table>";
					$(".restlist").html(tag);
				}
			});
		});

		//2번째 아이콘
		$("span.list2").click(function() {
			$("span.list1").css("color", "red")
			$("span.list2").css("color", "black")

			//$(".restlist").html("출력1");

		});
	</script>

</body>
</html>