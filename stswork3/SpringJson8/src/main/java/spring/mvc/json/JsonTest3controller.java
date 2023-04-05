package spring.mvc.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //json전용 일반메서드 X 
public class JsonTest3controller {

	@GetMapping("/list2")
	public List<PhotoDto> list2(){
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("그림1", "15.png"));
		list.add(new PhotoDto("그림2", "16.png"));
		list.add(new PhotoDto("그림3", "17.png"));
		list.add(new PhotoDto("그림4", "18.png"));
		list.add(new PhotoDto("그림5", "19.png"));
		
		return list;
	}
	
}
