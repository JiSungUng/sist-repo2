<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.simpleboard.SimpleDto"%>
<%@page import="java.util.List"%>
<%@page import="model.simpleboard.SimpleDao"%>
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
<%
SimpleDao db=new SimpleDao();

//List<SimpleDto> list = db.getAllBoardDatas();
int totalCount;
int totalPage;//총페이지수
int startPage;//각블럭의 시작페이지
int endPage;//각블럭의 끝페이지
int start; //각페이지의 시작번호
int perPage=6; //한페이지에 보여질 글의 갯수
int perBlock=5; //한블럭당 보여지는 페이지개수
int currentPage; //현재페이지
int no;
//총갯수
totalCount=db.getTotalCount();
//현재페이지번호 읽기(단 null 일때는 1페이지로 설정)
if(request.getParameter("currentPage")==null)
	currentPage=1;
else
currentPage=Integer.parseInt(request.getParameter("currentPage"));
//총 페이지 갯수
totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
//각블럭의 시작페이지..현재페이지가 3(s:1,e:5) 6(s:6 e:10)
startPage=(currentPage-1)/perBlock*perBlock+1;
endPage=startPage+perBlock-1;
//총페이지가 8. (6~10...endpage를 8로 수정해주어야 한다)
if(endPage>totalPage)
	endPage=totalPage;
//각페이지에서 불러올 시작번호
start=(currentPage-1)*perPage;
//각페이지에서 필요한 게시글 가져오기
List<SimpleDto> list=db.getList(start, perPage);
no=totalCount-(currentPage-1)*perPage;



%>
<body>


<div class="alert alert-danger" style="width:800px;">
 <%-- <b총><%=list.size()%>개의 글이 있습니다.</b>--%>
</div>

<br>
<table class="table table-hover" style="width:800px;">
	<caption>게시판형 목록보기
	<button type="button" class="btn btn-info" onclick="location.href='insertForm.jsp'">글쓰기</button>
	<button type="button" class="btn btn-info" onclick="location.href='boardList2.jsp'">목록2</button>
	<button type="button" class="btn btn-info" onclick="location.href='/JspSimpleBoard/index.jsp'">index</button>
	</caption>

	<tr style="background:#d8bfd8">
		<th width="70">번호</th>
		<th width="400">제목</th>
		<th width="120">작성자</th>
		<th width="170">작성일</th>
		<th width="70">조회</th>
	</tr>	
		<%
		//출력할 날짜
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		//for(int i=0;i<list.size();i++){
			for(SimpleDto dto:list){
			
			//1번열에 출력할 번호
			//int no=list.size()-i;
			//dto
			//SimpleDto //dto=list.get(i);
			%>
			<tr>
			<td align="center"><%=no--%></td>
			<!-- 제목누르면 내용보기로 넘어가기 -->
			<td>
			<a href="content.jsp?num=<%=dto.getNum()%>">
			<img src="../upload/<%=dto.getImgname() %>" style="width:30;height:30px;">
			<%=dto.getSubject() %></a>
			</td>
			<!-- 작성자 -->
			<td><%=dto.getWriter() %></td>
			<!--작성일 -->
			<td><%=sdf.format(dto.getWriteday()) %></td>
			<!--조회수-->
			<td align="center"><%=dto.getReadcount() %></td>
			
			
			
			</tr>
			
		<%}
		
		%>
	
</table>


<!-- 페이징 처리 -->
<div style="width: 500px; text-align: center;" class="container">
<ul class="pagination">
<%
//이전

if(startPage>1){%>
	<li>
		<a href="boardList.jsp?currentPage<%=startPage-1%>">이전</a>
	</li>
<%}
for(int pp=startPage;pp<=endPage;pp++)
{
	 if(pp==currentPage)
	 {%>
		 <li class="active">
		 <a href="boardList.jsp?currentPage=<%=pp%>"><%=pp %></a>
		 </li>
	 <%}else{%>
		
		 <li>
		 <a href="boardList.jsp?currentPage=<%=pp%>"><%=pp %></a>
		 </li>
	 <%}
}
//다음
if(endPage < totalPage) { %>
   <li>
      <a href="boardlist.jsp?currentPage=<%=endPage+1%>">다음</a>
   </li>
<%
}
%>




</ul>
</div>






</body>
</html>