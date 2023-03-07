<%@page import="javax.security.auth.Subject"%>
<%@page import="java.io.Writer"%>
<%@page import="data.dao.SmartDao"%>
<%@page import="data.dto.SmartDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   //db에 저장할 id 가져오기
   String myid=(String)session.getAttribute("myid");

	//이미지가 업로드되는 실제경로
	String realPath=getServletContext().getRealPath("/save");
	System.out.println(realPath);
	
	int uploadSize=1024*1024*2; //2mb
	MultipartRequest multi=null;
	
	try{
	multi=new MultipartRequest(request,realPath,uploadSize,"utf-8",
			new DefaultFileRenamePolicy());
	
	//multi변수로 모든 폼데이타 읽어오기
	String num=multi.getParameter("num");
	String writer=multi.getParameter("writer");
	String subject=multi.getParameter("subject");
	String content=multi.getParameter("content");
	
	//페이지 번호 읽기
	String currentPage=multi.getParameter("currentPage");
	
	//dao
	SmartDao dao=new SmartDao();
	
	
	
	//dto에 저장
	SmartDto dto=new SmartDto();
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setSubject(subject);
	dto.setContent(content);
	
	//update
	dao.updateSmart(dto);
	
	//방명록 목록으로 이동(수정했던페이지로 이동)
	response.sendRedirect("../index.jsp?main=board/boardlist.jsp?currentPage="+currentPage);

	
	}catch(Exception e){
		
		System.out.println("업로드 오류:"+e.getMessage());
	}
%>