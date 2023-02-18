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
</head>
<body>
    <h3>결과 페이지</h3>
    <table class="table table-striped" style="width: 400px;">
        <tr>
            <th width="100" bgcolor="orange">상품명</th>
            <td><%= request.getParameter("sang") %></td>
        </tr>

        <tr>
            <th width="100" bgcolor="orange">색상</th>
            <td><%= request.getParameter("scolor") %></td>
        </tr>

        <tr>
            <th width="100" bgcolor="orange">사이즈</th>
            <td><%= request.getParameter("ssize") %></td>
        </tr>

        <tr>
            <th width="100" bgcolor="orange">추가상품</th>
            <td><%= request.getParameter("schuga") %></td>
        </tr>
    </table>
</body>
</html>