package spring.mvc.today;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String home() {
		
		//request에 저장
		return"index";
	}
	
	@GetMapping("/happy")
	public String happy() {
		
		return"happy";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		//request에 저장
		model.addAttribute("msg","안녕하세요");
		return"hello";
	}
	
	@GetMapping("/nice/hi")
	public String nice(Model model ) {
		
		//request에 저장
		model.addAttribute("name","지성웅");
		model.addAttribute("age","26");
		return"nice";
	}
}
