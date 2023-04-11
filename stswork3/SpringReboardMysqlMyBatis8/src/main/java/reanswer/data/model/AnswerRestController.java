package reanswer.data.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reboard.data.model.ReboardDaoInter;
import reboard.data.model.ReboardDto;

@RestController
public class AnswerRestController {

	@Autowired
	ReanswerDao adao;
	
	@Autowired
	ReboardDaoInter dao;
	
	@GetMapping("/board/adelete") //ajax의 url과 일치
	public HashMap<String, Integer> answerDelete(@RequestParam int idx,
			@RequestParam String pass){
		
		int check = adao.getCheckPass(idx,pass);
		
		if(check==1) {
			adao.deletAnswer(idx);
		}
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("check", check);
		return map;
	}
	
	//ajax연습 위한 출력문제
	@GetMapping("/rest/list1")
	public List<ReboardDto> ajaxlist(){
		List<ReboardDto> list =dao.getAlldatas();
		
		for(ReboardDto dto:list) {
			if(!dto.getPhoto().equals("no")) {
			String [] photos=	dto.getPhoto().split(",");
			dto.setPhoto(photos[0]);//사진은 첫번째 사진으로 넣어진다.
			}
		}
			
		return list;
	}
	
	
	
	
	

}
