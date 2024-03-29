<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<c:set var="root" value="<%=request.getContextPath() %>"></c:set>
<body>
<form action="">
	<table class="table table-bordered" style="width: 800px;margin-left: 100px;">
		<caption><h3>스마트 상점 입고</h3></caption>
		<tr>
			<th bgcolor="orange" width="100">상품명</th>
			<td>
				<input type="text" name="sangname" class="form-control"
					required="required" style="width: 130px;">
			</td>
		</tr>
		<tr>
			<th bgcolor="orange" width="100">색상</th>
			<td>
				<input type="color" name="color" class="form-control"
					required="required" style="width: 100px;">
			</td>
		</tr>
		
		<tr>
			<th bgcolor="orange" width="100">단가</th>
			<td>
				<input type="text" name="price" class="form-control"
					required="required" style="width: 130px;">
			</td>
		</tr>
		
	
		<tr>
			<th bgcolor="orange" width="100">입고</th>
			<td>
				<input type="date" name="ipgoday" class="form-control"
					required="required" style="width: 130px;">
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<textarea name="content" id="content"		
					required="required"			
					style="width: 100%;height: 300px;display: none;"></textarea>		
			
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" class="btn btn-warning"
					style="width: 120px;"
					onclick="submitContents(this)">DB저장</button>
				
				<button type="button" class="btn btn-warning"
					style="width: 120px;"
					onclick="location.href='main.jsp?go=smart/list'">목록</button>
			</td>
		</tr>
		
	</table>   
</form>

<!-- 스마트게시판에 대한 스크립트 코드 넣기 -->
<script type="text/javascript">
var oEditors = [];

nhn.husky.EZCreator.createInIFrame({

    oAppRef: oEditors,

    elPlaceHolder: "content",

    sSkinURI: "<%=request.getContextPath()%>/se2/SmartEditor2Skin.html",

    fCreator: "createSEditor2"

}); 

//‘저장’ 버튼을 누르는 등 저장을 위한 액션을 했을 때 submitContents가 호출된다고 가정한다.

function submitContents(elClickedObj) {

    // 에디터의 내용이 textarea에 적용된다.

    oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", [ ]);

 

    // 에디터의 내용에 대한 값 검증은 이곳에서

    // document.getElementById("textAreaContent").value를 이용해서 처리한다.
    try {
        elClickedObj.form.submit();
    } catch(e) { 

    }

}

// textArea에 이미지 첨부

function pasteHTML(filepath){
    var sHTML = '<img src="<%=request.getContextPath()%>/save/'+filepath+'">';
    oEditors.getById["content"].exec("PASTE_HTML", [sHTML]); 

}
</script>

</body>
</html>




