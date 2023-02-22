<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.simpleboard.SimpleDto"%>
<%@page import="java.util.List"%>
<%@page import="model.simpleboard.SimpleDao"%>
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
<script>
   function readURL(input) {
      if(input.files && input.files[0]) {
         var reader = new FileReader();//파일을 읽기 위한 FileReader객체 생성
         reader.onload = function(e) {
            //파일 읽어들이기를 성공했을 때 호출되는 이벤트 핸들러
            $('#blah').attr("src", e.target.result);
            //이미지 Tag의 SRC속성에 읽어들인 File내용을 지정
            //(아래 코드에서 읽어들인 dataURL형식)
         }
         reader.readAsDataURL(input.files[0]);
         //File내용을 읽어 dataURL형식의 문자열로 저장
      }
   }
</script>
<style>
#blah {
   position:absolute;
   left:600px;
   top:100px;
}
</style>
</head>
<body>
<%
String num = request.getParameter("num");
SimpleDao db = new SimpleDao();
SimpleDto dto = db.getData(num);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
   <form action="updateAction.jsp" method="post" enctype="multipart/form-data">
      <!-- hidden으로 num 넘기기(폼안에 아무데나) -->
      <input type="hidden" name="num" value="<%=num %>">
      <table class="table table-bordered" style="width: 500px;">
         <tr>
            <th style="width: 100px" bgcolor="lightgray">작성자</th>
            <td>
               <b><%=dto.getWriter() %></b>
            </td>
         </tr>
         
         <tr>
            <th style="width: 100px" bgcolor="lightgray">제목</th>
            <td>
               <input type="text" name="subject" style="width:200px;"
               class="form-control" placeholder="subject" autofocus="autofocus" required="required" value="<%=dto.getSubject()%>">
            </td>
         </tr>
         
         <tr>
            <th style="width:100px;" bgcolor="lightgray">사진업로드</th>
            <td>
               <input type="file" name="photo" style="width:300px;"
               class="form-control" required="required" onchange="readURL(this)" src="">
            </td>
         </tr>
         
         <tr>
            <th style="width:100px;" bgcolor="lightgray">비밀번호</th>
            <td>
               <input type="text" name="pass" style="width:300px;"
               class="form-control" required="required" placeholder="비밀번호"
               pattern="[0-9]{4}">
            </td>
         </tr>
         
         <tr>
            <td colspan="2">
               <textarea style="width: 500px; height: 200px;" class="form-control" name="content" required="required">
                  <%=dto.getContent() %>
               </textarea>
            </td>
         </tr>
         
         <tr>
            <td colspan="2" align="center">
               <input type="submit" class="btn btn-info" value="수정하기">
               <input type="button" class="btn btn-info" value="목록으로" onclick="location.href='boardList.jsp'">
            </td>
         </tr>
      </table>
   </form>
   
   <img src="../upload/<%=dto.getImgname()%>" style="max-width: 300px;" id="blah" >
</body>
</html>