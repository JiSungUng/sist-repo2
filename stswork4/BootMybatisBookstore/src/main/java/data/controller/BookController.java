package data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import data.dto.BookDto;
import data.mapper.BookMapperInter;

@Controller
public class BookController {
	
	@Autowired
	BookMapperInter mapper;
	
	@GetMapping("/")
	public String start() {
		
		return "redirect:/book/list";
	}
	@GetMapping("/book/list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		
		//list
		List<BookDto> list =mapper.getAllDatas();
		
		model.addObject("list",list);
		
		model.setViewName("booklist");
		return model;
	}
	
	@GetMapping("/book/form")
	public String form() {
		return "addform";
	}
	
	@PostMapping("/book/insert")
	public String insert(@ModelAttribute BookDto dto,
			@RequestParam MultipartFile photo,
			HttpSession session) {
		
		//업로드 경로구하기
		String path = session.getServletContext().getRealPath("/upload");
		System.out.println(path);
		
		if(photo.getOriginalFilename().equals(""))
			dto.setBookphoto("no");
		else {
			//사진명구해서 넣기
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
			String photoname="f_"+sdf.format(new Date());
			
			dto.setBookphoto(photoname);
			
			//실제업로드
			try {
				photo.transferTo(new File(path+"\\"+photoname));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-gener	ated catch block
				e.printStackTrace();
			}
		}
		
		//db에 저장
		mapper.insertBook(dto);
			
		
		return "redirect:list";
	}
	
	
	
	
	
}
