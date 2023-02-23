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
<script type="text/javascript">
function funcdel(num){
	var yes=confirm("삭제하시겠습니까?");
	
	if(yes){
		location.href="deleteAction.jsp?num="+num;
	}
	
}
</script>
<body>
<%
String num=request.getParameter("num");

%>

</body>
<form action ="deleteAction.jsp" method = "post">
<table class = " table table - bodered" style="width :300px;">
	<caption><b>삭제비밀번호 입력</b></caption>
	<tr>
		<th>비밀번호를 입력해 주세요 <br><br>
			<input type="password" class="form-control" name="pass" required="required" placeholder="숫자4자리">
			<!-- hidden 값 넘기기 -->
			<input type="hidden" name="num" value="<%=num %>">
			<br><br>
			<button type="submit" class="btn btn-danger" onclick="funcdel('<%=num%>')">삭제</button>  <!-- 자바스크립트 넘버값 보낼때는 소따옴표로 감싸줘야함 -->
			<button type="button" class="btn btn-info" onclick="history.back()">이전으로</button>
		</th>
	</tr>
</table>

</form>

</html>
<!-- 페이징처리
	totalCount()
	getList(1,2)
 -->