package spring.mvc.today;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String home() {
		
		//request�� ����
		return"index";
	}
	
	@GetMapping("/happy")
	public String happy() {
		
		return"happy";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		//request�� ����
		model.addAttribute("msg","�ȳ��ϼ���");
		return"hello";
	}
	
	@GetMapping("/nice/hi")
	public String nice(Model model ) {
		
		//request�� ����
		model.addAttribute("name","������");
		model.addAttribute("age","26");
		return"nice";
	}
}
