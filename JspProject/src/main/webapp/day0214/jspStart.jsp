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
	<h2>Jsp는 Html5구조의 자바코드를 사용할 수 있는 서버언어이다.</h2>
	<h2>
		Servlet 은 확장자가 java이며 자바클래스구조에 <br>HTML css js도 사용할수있는 서버언어.
	</h2>
	<hr>
	<h4>jsp는 두가지의 주석이 가능</h4>
	<!-- 주석1:html기본주석:소스보기에서 보인다 -->
	<%--jsp주석: 소스보기에서 안보임. 안에 자바코드가있으면 이주석은 실행안함 --%>
	<%!//선언문
	//이곳에서 변수나 메서드는 클래스의 멤버변수나 메소드로 등록된다
	//위치가 어디에 있던 관계없음.%>
	<h4>java코드를 쓰려면 scriptlet 영역을 표시후 코딩</h4>
	<%
	//스크립트릿
	//여기서 선언하는 변수는 지역변수로 등록
	//여기서 선언하게되면 사용은 선언한 곳보다는 아래서 사용해야 한다.
	int age = 20;
	String name = "송혜교";
	%>
	
	<h4>문자열이나 변수출력은 표현식을 이용해서 출력을 한다</h4>
	<b>이름: </b><%=name %><br>
	<b>나이: </b><%=age %>
</body>
</html>