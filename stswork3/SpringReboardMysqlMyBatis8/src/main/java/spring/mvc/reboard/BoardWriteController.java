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
   
   //���� ��� ��� ����
   @GetMapping("/board/writeform")
   public ModelAndView writeform(@RequestParam Map<String, String> map) {
      ModelAndView model = new ModelAndView();
      
      //�Ʒ� 5���� ���� ����� ��쿡�� �Ѿ�´�(�����϶��� �ȳѾ��)
      String currentPage = map.get("currentaPage");
      String num = map.get("num");
      String regroup = map.get("regroup");
      String restep = map.get("restep");
      String relevel = map.get("relevel");
      
      System.out.println(currentPage + "," + num);
      //������ ���� null, ����� ���� ���ڰ� ����
      
      //�Է����� hidden���� �־������...����϶� ���
      model.addObject("currentPage", currentPage==null?"1":currentPage);
      model.addObject("num", num==null?"0":num); //0�̿��� dao���� ���۷� �ν�
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
      
      //���ε��� ���� ���
      String path = session.getServletContext().getRealPath("/WEB-INF/photo/");
      //���ϸ��� ����� ��¥
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
      System.out.println(path);
      
      String photo = "";
      
      //���� ���� ������ ��� no, ���� ����,�� ����
      if(upload.get(0).getOriginalFilename().equals("")) {
         photo = "no";
      } else {
         for(MultipartFile f : upload) {
            String fName = "f_" + sdf.format(new Date()) + f.getOriginalFilename();
            photo += fName + ",";
            
            //���ε�
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
      //dto�� photo �ֱ�
      dto.setPhoto(photo);
      dao.insertReboard(dto);
      
      // ���뺸��� ������ �����غ���!
      
      int num=dao.getMaxNum();
      
      
      return "redirect:content?num="+num+"&currentPage="+currentPage;
   }
}