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
<body>
<form action="insertAction" method="post">

	<table class="table table-bordered" style="width:350px">
	
		<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" size="7" placeholder = "이름" required="required" class="form-control">
				</td>
			</tr>
			
			<tr>
				<th>운전면허</th>
				<td>
					<input type="text" name="lic" size="7" placeholder = "운전면허" required="required" class="form-control">
				</td>
			</tr>
			
			<tr>
				<th>핸드폰번호</th>
				<td>
					<input type="text" name="hp" size="7" placeholder = "핸드폰" required="required" class="form-control">
				</td>
			</tr>
			<tr>
			
				<td colspan = "2" align="center">
					<input type = "submit" value="전송" class="btn btn-info">
					<input type="button" value="목록" onclick="location.href='infoList.jsp'" class="btn btn-danger">
				</td>
			</tr>
	</table>


</form>
</body>
</html>