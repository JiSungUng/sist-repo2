package spring.mvc.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //json전용 일반메서드 X 
public class JsonTest2controller {

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

	@GetMapping("/list3")
	public Map<String,Object> list3(@RequestParam String name){
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("그림1", "15.png"));
		list.add(new PhotoDto("그림2", "16.png"));
		list.add(new PhotoDto("그림3", "17.png"));
		list.add(new PhotoDto("그림4", "18.png"));
		list.add(new PhotoDto("그림5", "19.png"));
		
		Map<String, Object>map= new HashMap<String, Object>();
		for(PhotoDto dto:list) {
			if(name.equals(dto.getName())) {
				map.put("name",dto.getName());
				map.put("name",dto.getPhoto());
				
			}
		}
		
		return map;
	}
	
}
