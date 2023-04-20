package boot.data.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.data.dto.MemberDto;
import boot.data.service.MemberService;

@RestController
public class loginRestController {

	@Autowired
	MemberService service;

	@GetMapping("/member/login")
	public Map<String, String> loginproc(String id ,String pass ,HttpSession session){
		
		Map<String, String> map= new HashMap<>();
		
		int result= service.loginIdPassCheck(id, pass);
		
		if(result==1) {
			//세션설정
			session.setMaxInactiveInterval(60*60*4);
			//로그인한 정보 얻어기
			MemberDto mdto= service.getDataById(id);
			
			session.setAttribute("loginok", "yes");
			session.setAttribute("myid", id);
			session.setAttribute("loginphoto", mdto.getPhoto());
			session.setAttribute("loginname", mdto.getName());
		}
		
		map.put("result",result==1?"success":"fail");
		
		return map;
	}
	@GetMapping("/member/logout")
		public void logouotproc(HttpSession session) {
		//로그아웃시 제거되어야 할 세션
		session.removeAttribute("loginok");
		session.removeAttribute("myid");
		}
	}

