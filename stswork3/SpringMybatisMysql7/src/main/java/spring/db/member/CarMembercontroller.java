package spring.db.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.db.car.MyCarDto;

@Controller
public class CarMembercontroller {

	@Autowired
	CarMemberDao dao;
	
	@GetMapping("/member/list")
	public String list(Model model) {
		
		//전체개수
				int totalCount=dao.getTotalCount();
				
				//목록가져오기
				List<CarMemberDto> list=dao.getAllDatas();
				
				//request에 저장
				model.addAttribute("totalCount",totalCount);
				model.addAttribute("list",list);
				
		
		
		return "carmember/memberlist";
	}
	
	//입력폼으로 가기
	
		@GetMapping("/member/writeform")
		public String carform() {
			
			return "carmember/writeform";
		}
		
		
		//insert
		@PostMapping("/member/write")
		public String insert(@ModelAttribute CarMemberDto dto) {
			
			dao.insertCarMember(dto);
			
			return "redirect:list";
			
		}
		
		//수정폼으로가기
		@GetMapping("/member/updateform")
		public String updateform(@RequestParam String num,Model model) {
			
			//dto가져오기
			CarMemberDto dto=dao.getData(num);
			//저장
			model.addAttribute("dto", dto);
			
			return "carmember/updateform";
		}
		
		//update
			@PostMapping("/member/update")
			public String update(@ModelAttribute CarMemberDto dto) {
				
				dao.updateCarMember(dto);
				
				return "redirect:list";
				
			}
			
			@GetMapping("/member/delete")
			public String delete(@RequestParam String num) {
				
				dao.deleteCarMember(num);
				
				return "redirect:list";
			}
	
	
}
