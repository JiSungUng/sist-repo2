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
		
		//��ü����
				int totalCount=dao.getTotalCount();
				
				//��ϰ�������
				List<CarMemberDto> list=dao.getAllDatas();
				
				//request�� ����
				model.addAttribute("totalCount",totalCount);
				model.addAttribute("list",list);
				
		
		
		return "carmember/memberlist";
	}
	
	//�Է������� ����
	
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
		
		//���������ΰ���
		@GetMapping("/member/updateform")
		public String updateform(@RequestParam String num,Model model) {
			
			//dto��������
			CarMemberDto dto=dao.getData(num);
			//����
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
