package spring.mvc.reboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AjaxListController {

	
	@GetMapping("/rest/list")
	public String list(){
		
		return "list";
	}
}
