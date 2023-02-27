<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="memo.model.MemoDto"%>
<%@page import="java.util.List"%>
<%@page import="memo.model.MemoDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
   MemoDao dao = new MemoDao();
   //전체목록
   List<MemoDto> list = dao.getAllMemoDatas();
   JSONArray arr = new JSONArray();

   //arr에 먼저 size부터 보내보기
   /*JSONObject size = new JSONObject();
   size.put("size", list.size());
   arr.add(size);*/
   
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM-dd HH:mm");
   for(MemoDto dto: list){
      JSONObject ob = new JSONObject();
      ob.put("num", dto.getNum());
      ob.put("writer", dto.getWriter());
      ob.put("content", dto.getContent());
      ob.put("avata", dto.getAvata());
      ob.put("writeday", sdf.format(dto.getWriteday()));
      
      //arr에추가
      arr.add(ob);
   }
%>
<%=arr.toString()%>