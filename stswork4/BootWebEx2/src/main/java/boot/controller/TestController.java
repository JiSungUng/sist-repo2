package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/")
	public ModelAndView list() {
		
		ModelAndView model= new ModelAndView();
		
		//모델에 저장
		model.addObject("name","지성웅" );
		model.addObject("addr","여수" );
		model.addObject("hp","010-3009-3455" );
		//포워드
		model.setViewName("redirect:sist/home");
		
		return model;
	}
}
