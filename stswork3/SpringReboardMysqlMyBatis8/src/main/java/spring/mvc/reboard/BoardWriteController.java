package spring.mvc.reboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import reboard.data.model.ReboardDao;
import reboard.data.model.ReboardDto;

@Controller
public class BoardWriteController {
   
   @Autowired
   ReboardDao dao;
   
   //새글 답글 모두 포함
   @GetMapping("/board/writeform")
   public ModelAndView writeform(@RequestParam Map<String, String> map) {
      ModelAndView model = new ModelAndView();
      
      //아래 5개의 값은 답글일 경우에만 넘어온다(새글일때는 안넘어옴)
      String currentPage = map.get("currentaPage");
      String num = map.get("num");
      String regroup = map.get("regroup");
      String restep = map.get("restep");
      String relevel = map.get("relevel");
      
      System.out.println(currentPage + "," + num);
      //새글인 경우는 null, 답글인 경우는 숫자가 나옴
      
      //입력폼에 hidden으로 넣어줘야함...답글일때 대비
      model.addObject("currentPage", currentPage==null?"1":currentPage);
      model.addObject("num", num==null?"0":num); //0이여야 dao에서 새글로 인식
      model.addObject("regroup" , regroup==null?"0":regroup);
      model.addObject("restep" , restep==null?"0":restep);
      model.addObject("relevel" , relevel==null?"0":relevel);
      
      model.setViewName("writeform");
      return model;
   }
   
   @PostMapping("/board/insert")
   public String insert(@ModelAttribute ReboardDto dto,
         @RequestParam ArrayList<MultipartFile> upload,
         HttpSession session,
         @RequestParam int currentPage) {
      
      //업로드할 실제 경로
      String path = session.getServletContext().getRealPath("/WEB-INF/photo/");
      //파일명에 사용할 날짜
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
      System.out.println(path);
      
      String photo = "";
      
      //사진 선택 안했을 경우 no, 했을 경우는,로 나열
      if(upload.get(0).getOriginalFilename().equals("")) {
         photo = "no";
      } else {
         for(MultipartFile f : upload) {
            String fName = "f_" + sdf.format(new Date()) + f.getOriginalFilename();
            photo += fName + ",";
            
            //업로드
            try {
               f.transferTo(new File(path+"\\"+fName));
            } catch (IllegalStateException e) {
               e.printStackTrace();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
         photo = photo.substring(0, photo.length() - 1);
      }
      //dto에 photo 넣기
      dto.setPhoto(photo);
      dao.insertReboard(dto);
      
      // 내용보기로 가도록 수정해보자!
      
      int num=dao.getMaxNum();
      
      
      return "redirect:content?num="+num+"&currentPage="+currentPage;
   }
}