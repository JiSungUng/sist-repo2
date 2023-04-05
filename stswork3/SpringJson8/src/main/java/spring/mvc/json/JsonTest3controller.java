package spring.mvc.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //json���� �Ϲݸ޼��� X 
public class JsonTest3controller {

	@GetMapping("/list2")
	public List<PhotoDto> list2(){
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("�׸�1", "15.png"));
		list.add(new PhotoDto("�׸�2", "16.png"));
		list.add(new PhotoDto("�׸�3", "17.png"));
		list.add(new PhotoDto("�׸�4", "18.png"));
		list.add(new PhotoDto("�׸�5", "19.png"));
		
		return list;
	}
	
}
