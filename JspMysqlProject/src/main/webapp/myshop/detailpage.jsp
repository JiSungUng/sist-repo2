<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="myshop.model.MyshopDao"%>
<%@page import="myshop.model.MyshopDto"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
   pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>
   <%
   String num = request.getParameter("num");
   MyshopDao dao = new MyshopDao();
   MyshopDto dto = dao.getSangpum(num);
   NumberFormat nf = NumberFormat.getCurrencyInstance();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
   %>

   <div style="margin: 30px 30px;">
      <table class="table table-bordered" style="width: 700px;">
         <caption>
            <b>상품상세보기</b>
         </caption>
         <tr>
            <td rowspan="5"><img alt=""
               src="../쇼핑몰사진/<%=dto.getPhoto()%>.jpg"></td>
         </tr>
         <tr>
            <th>상품명</th>
            <td><%=dto.getSangpum()%></td>
         </tr>
         <tr>
            <th>가격</th>
            <td><%=nf.format(dto.getPrice())%></td>
         </tr>
         <tr>
            <th>입고일</th>
            <td><%=dto.getIpgoday() %></td>
         </tr>
         
         <tr>
            <td colspan="3" align="center">
            
               <button type="button" class="btn btn-warning"
               onclick="history.back()">이전</button>
               <button type="button" class="btn btn-warning"
               onclick="location.href='addform.jsp'">등록</button>
               <button type="button" class="btn btn-warning"
               onclick="location.href='shoplist.jsp'">목록</button>
               <button type="button" class="btn btn-warning"
               onclick="location.href='updateform.jsp?num=<%=dto.getNum()%>'">수정</button>
               <button type="button" class="btn btn-warning"
               onclick="location.href='delete.jsp?num=<%=dto.getNum()%>'">삭제</button>
               
            </td>
         </tr>
      </table>
   </div>
</body>
</html>