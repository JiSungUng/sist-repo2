<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link
	href="https://fonts.googleapis.com/css2?family=Anton&family=Edu+VIC+WA+NT+Beginner:wght@600&family=Gamja+Flower&family=Single+Day&family=Jua&family=Nanum+Pen+Script&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<style type="text/css">
   #answer{
      border-bottom: 1px soild #ddd;
      margin-bottom: 20px;
      padding-top: 10px;
      padding-bottom: 10px;
      padding-left: 20px;
   }
  
</style>
</head>
<body>
<div style="margin: 50px 50px;">
<table class="table table-bordered" style="width: 600px;">
   <caption><b>내용보기</b></caption>
      <tr>
         <td>
            <h2><b>${dto.subject }</b></h2>
            <span style="float: right; margin-left: 20px;">
               조회수 ${dto.readcount } &nbsp;&nbsp;&nbsp;&nbsp;
               <fmt:formatDate value="${dto.writeday }"
               pattern="yyyy-MM-dd HH:mm"/>
            </span>
            
            <h5><b>작성자: ${dto.writer }</b></h5>
         </td>
      </tr>
      <tr>
         <td>
            <pre style="background-color: white; border: 0px">
               ${dto.content }
            </pre>
            <br><br>
            
            <c:if test="${dto.photo != 'no' }">
               <c:forTokens var="ps" items="${dto.photo }" delims=",">
               <a href="../photo/${ps }">
                  <img alt="" src="../photo/${ps }" style="width: 150px;
                  border: 8px solid green">
               </a>
               </c:forTokens>
            </c:if>
            
         </td>
      </tr>
      
      <tr>
         <td>
            <div id="answer">
               <b>댓글  ${acount}</b><br><br>
            <c:forEach var="list" items="${alist }" varStatus="i">
               <div style=" margin-bottom: 10px;">
               ${list.nickname } : ${list.content }
               &nbsp;&nbsp;
               <span style="color: gray; font: 0.8em;">
                  <fmt:formatDate value="${list.writeday }" pattern="yyyy-MM-dd HH:mm"/>
               </span>
               &nbsp;&nbsp;
               <span class="adel glyphicon glyphicon-remove" style="cursor: pointer; color: green; float: right; margin-left: 20px;"
               idx="${list.idx }"></span>
               <span class="glyphicon glyphicon-pencil" style="cursor: pointer; color: red; float: right; margin-rigth: 10px;"></span>
               </div>
            </c:forEach>
            </div>
            <form action="ainsert" method="post" class="form-inline">
               <!-- hidden -->
               <input type="hidden" name="num" value="${dto.num}"> 
               <input type="hidden" name="currentPage" value="${currentPage}"> 
               <b>닉네임: </b>
               <input type="text" name="nickname" class="form-control input-sm" style="width: 100px;"
               required="required">
               <b style="margin-left: 30px;">비밀번호: </b>
               <input type="password" name="pass" class="form-control input-sm" style="width: 100px;"
               required="required">
               <br><br>
               <input type="text" name="content" class="form-control input-sm"
               style="width: 500px;" required="required" placeholder="댓글을 입력해주세요">
               <button type="submit" class="btn btn-info btn-sm">확인</button>
            </form>
         </td>
      </tr>
      
      <tr>
         <td align="right">
         <button class="btn btn-default btn-sm"
         onclick="location.href='writeform'">글쓰기</button>
         <button class="btn btn-default btn-sm"
         onclick="location.href='writeform?num=${dto.num}&regroup=${dto.regroup }&restep=${dto.restep }&relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>
         <button class="btn btn-default btn-sm"
         onclick="location.href='updatePassForm?num=${dto.num}&currentPage=${currentPage }'">수정</button>
         <button class="btn btn-default btn-sm"
         onclick="location.href='deletePassForm?num=${dto.num}&currentPage=${currentPage }'">삭제</button>
         <button class="btn btn-default btn-sm"
         onclick="location.href='list?currentPage=${currentPage}'">목록</button>
         </td>
      </tr>
</table>
</div>


<script type="text/javascript">
//댓글삭제
$("span.adel").click(function(){
	var idx=$(this).attr("idx");
	console.log(idx);
	
	//비번입력
	var pass=prompt("비밀번호 입력해 주세요");
	//alert(pass); //취소시 null확인
	
	if(pass==null)
		return; // 취소시 함수 종료
	
		
		
		$.ajax({
			type:"get",
			dataType:"json",
			url:"adelete",
			data:{"idx":idx,"pass":pass},
		success:function(res){
			
			if(res.check==0){
				alert("비밀번호가 맞지않네요");
			}else{
				alert("댓글을 삭제했습니다.");
				location.reload();
			}
		}	
		});
	
	
});
</script>


</body>
</html>