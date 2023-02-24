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
    <script type="text/javascript">
    $(function(){
      
      $("#btn1").click(function(){
               
               var s="<img src='../image/1.jpg'";
           
               $("#main").html(s);
            }
         });
         
      });
      $("#btn2").click(function(res){
          
          $.ajax({
          
             type:"get",
             url:"jshopToJson.jsp",
             dataType:"json",
             success:function(data){
                
                var s="<table class='table table-bordered' style='width:700px'>";
                s+="<caption><b>json jshop읽어오기</b></caption>";
                s+="<tr bgcolor='lightyellow'>";
                s+="<th>번호</th><th>상품명</th><th>색상</th><th>가격</th><th>상품이미지</th>";
                s+="</tr>";
                
                $.each(data,function(i,elt){
                   
                   s+="<tr align='center'>";
                   s+="<td>"+elt.num+"</td>";
                   s+="<td>"+elt.sangpum+"</td>";
                   s+="<td>"+elt.color+"<br>"+
                   "<div class='box' style='background-color:"+elt.color+";'></td>";
                   s+="<td>"+elt.price+"</td>";
                   var img=elt.imagename;
                   s+="<td><img src='"+img+"' width='50'></td>";
                   s+="</tr>";
                });
                
                s+="</table>";
                $("#show").html(s);
             }
          });
          
       });
      $("#btn3").click(function(res){
          
          $.ajax({
          
             type:"get",
             url:"jshopToJson.jsp",
             dataType:"json",
             success:function(data){
                
                var s="<table class='table table-bordered' style='width:700px'>";
                s+="<caption><b>json jshop읽어오기</b></caption>";
                s+="<tr bgcolor='lightyellow'>";
                s+="<th>번호</th><th>상품명</th><th>색상</th><th>가격</th><th>상품이미지</th>";
                s+="</tr>";
                
                $.each(data,function(i,elt){
                   
                   s+="<tr align='center'>";
                   s+="<td>"+elt.num+"</td>";
                   s+="<td>"+elt.sangpum+"</td>";
                   s+="<td>"+elt.color+"<br>"+
                   "<div class='box' style='background-color:"+elt.color+";'></td>";
                   s+="<td>"+elt.price+"</td>";
                   var img=elt.imagename;
                   s+="<td><img src='"+img+"' width='50'></td>";
                   s+="</tr>";
                });
                
                s+="</table>";
                $("#show").html(s);
             }
          });
          
       });
      
      
      
      
      
   });
</script>
</head>
<body>
<button type="button" class="btn btn-info" id="btn1">Home</button>
<button type="button" class="btn btn-info" id="btn2">Jshop</button>
<button type="button" class="btn btn-info" id="btn3">SimpleBoard</button>
   
   <div id="main"></div>
   <div id="Jshop"></div>
   <div id="SimpleBoard"></div>
</body>
</html>