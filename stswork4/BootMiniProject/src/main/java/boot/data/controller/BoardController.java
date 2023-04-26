package boot.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import boot.data.dto.BoardDto;
import boot.data.service.BoardAnswerService;
import boot.data.service.BoardService;
import boot.data.service.MemberService;
import lombok.ToString;

@Controller
public class BoardController {
   
   @Autowired
   BoardService service;
   @Autowired
   MemberService mservice;
   
   @Autowired
   BoardAnswerService aservice;
   
   /*
    * @GetMapping("/board/list") public ModelAndView boardlist() { ModelAndView
    * model = new ModelAndView();
    * 
    * int totalCount = service.getTotalCount(); model.addObject("totalCount",
    * totalCount);
    * 
    * model.setViewName("/board/boardlist"); return model; }
    */
   @GetMapping("/board/form")
   public String form() {
      return "/board/writeform";
   }
   
   @PostMapping("/board/insert")
   public String insert(@ModelAttribute BoardDto dto, HttpSession session) {
      //upload할 폴더 지정
      String path=session.getServletContext().getRealPath("/photo");
      //upload할 파일명
      SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
      //upload 안한경우
      if(dto.getUpload().getOriginalFilename().equals("")) {
         dto.setUploadfile("no");
      }else {//upload 한 경우
         String uploadFile="f_"+sdf.format(new Date())+dto.getUpload().getOriginalFilename();
         dto.setUploadfile(uploadFile);
         //실제업로드
         try {
            dto.getUpload().transferTo(new File(path+"\\"+uploadFile));
         } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      //세션에서 나머지 id얻어서 dto에 저장
      String myid=(String)session.getAttribute("myid");
      dto.setMyid(myid);
      //이름은 memberservice에서 얻어서 dto에 저장
      String name=mservice.getName(myid);
      dto.setName(name);
      
      //db에 insert
      service.insertBoard(dto);
      
      return "redirect:content?num="+service.getMaxNum();
   }
   
   @GetMapping("/board/content")
   public ModelAndView content(String num, @RequestParam(defaultValue = "1") int currentPage) {
      ModelAndView model = new ModelAndView();
      
      service.updatereadCount(num);//조회수 증가
      
      BoardDto dto=service.getData(num);
      
      //uploadfile의 확장자를 구해서 따로 보내기
      int dotLoc=dto.getUploadfile().lastIndexOf('.'); //마지막 .의 위치
      String ext=dto.getUploadfile().substring(dotLoc+1); //.다음글자부터 끝까지 추출
      if(ext.equalsIgnoreCase("jpg")||ext.equalsIgnoreCase("gif")||ext.equalsIgnoreCase("png")||ext.equalsIgnoreCase("jpeg")) {
         model.addObject("bupload", true);
      }else {
         model.addObject("bupload", false); //이미지인지 아닌지를 보고 출력하기 위함이다.
      }
      model.addObject("dto", dto);
      model.addObject("currentPage", currentPage);
      model.setViewName("/board/content");
      return model;
   }
   
   
   
   @GetMapping("/board/list")
    public ModelAndView list(@RequestParam (value="currentPage", defaultValue = "1")int currentPage) {
        ModelAndView model=new ModelAndView();
        
        //총 글의 개수
        int totalCount =service.getTotalCount();
        
        int totalPage; //총 페이지수
        int startPage; //각 블럭의 시작페이지
        int endPage; //각 블럭의 끝페이지
        int start;    //각 페이지의 시작번호
        int perPage=10; //한 페이지에 보여질 글의 갯수
        int perBlock=5; //한 블럭당 보여지는 페이지 갯수
    
             
        //총 페이지 갯수     
              totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
        //각 블럭의 시작페이지
              startPage=(currentPage-1)/perBlock*perBlock+1;
              endPage=startPage+perBlock-1;
            
        //총페이지=8일 경우 endpage를 8로 수정한다.     
              if(endPage>totalPage)
                    endPage=totalPage;

        //각 페이지에서 불러올 시작번호
        start=(currentPage-1)*perPage;

        //각 페이지에서 필요한 게시글 가져오기
        List<BoardDto> list=service.getlist(start, perPage);
        
        //list에 각글에 대한 댓글 개수 추가하기
        
        //댓글추가
        
        for(BoardDto d:list) {
        	d.setAcount(aservice.getAllAnswers(d.getNum()).size());
        	
        }
        

       
        model.setViewName("/board/boardlist");
        return model;
    }
}