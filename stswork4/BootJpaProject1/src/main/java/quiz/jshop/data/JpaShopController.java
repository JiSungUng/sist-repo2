package quiz.jshop.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JpaShopController {

	@Autowired
	JpaShopDao dao;
	
	
	@GetMapping("/car/jpaform")
	public String form() {
		
		return "jpaaddform";
	}
	
	@PostMapping("/car/insert1")
	public String insert(@ModelAttribute JpaShopDto dto) {
		
		dao.insertJpa(dto);
		return "redirect:list1";
	}
	
	
	@GetMapping("/car/list1")
	public ModelAndView list() {
		ModelAndView mview = new ModelAndView();
		
		//dao
		List<JpaShopDto> list= dao.getAllDatas();
		
		//저장
		mview.addObject("list", list);
		mview.addObject("tcount",list.size());
		
		mview.setViewName("jpashoplist");
		return mview;
	}
	@GetMapping("/car/detail")
	public ModelAndView detail(int num) {
		ModelAndView mview= new ModelAndView();
		mview.setViewName("detail");
		JpaShopDto dto= dao.getData(num);
		mview.addObject("dto", dto);
		return mview;
	}
	
	
	
	
}
