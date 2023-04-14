package board.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import board.data.BoardDao;
import board.data.BoardDto;

@Controller
public class BoardController {
   
   @Autowired
   BoardDao dao;
   
   @GetMapping("/")
   public String home() {
      
      return "redirect:board/list";
   }
   
   @GetMapping("/board/list")
   public ModelAndView list() {
      ModelAndView model=new ModelAndView();

      //dao
      List<BoardDto> list=dao.getAllDatas();
      //list, 전체갯수 저장
      model.addObject("list", list);
      model.addObject("count", list.size());
      model.setViewName("list");
      return model;
   }
   
   @GetMapping("/board/writeform")
   public String form() {
      
      return "addform";
   }
   
   @PostMapping("/board/insert")
   public String insert(@ModelAttribute BoardDto dto, @RequestParam MultipartFile upload, HttpSession session) {
      //업로드된 실제 경로
      String realPath=session.getServletContext().getRealPath("/save"); //webapp/save를 표현하는 것이다.
      System.out.println(realPath);
      
      //사진을 실제경로에 업로드시킨 후 그 파일명을 dto의 photo에 넣는다.
      
      //사진 안넣으면 no라고 저장
      String uploadName=upload.getOriginalFilename();
      if(upload.isEmpty()) {
         dto.setPhoto("no");
      }else {
         dto.setPhoto(uploadName);
      }
      //실제 업로드
      try {
         upload.transferTo(new File(realPath+"\\"+uploadName));
      } catch (IllegalStateException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      //db에저장
      dao.insertBoard(dto);
      
      return "redirect:list";
   }
   
}