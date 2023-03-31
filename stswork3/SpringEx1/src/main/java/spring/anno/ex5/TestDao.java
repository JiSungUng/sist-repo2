package spring.anno.ex5;

import org.springframework.stereotype.Component;

@Component
public class TestDao {
	public void insert(String name) {
		System.out.println(name+"님 을 db에 추가완료!!");
	}
	
	
	public void select(String name) {
		System.out.println(name+"님은 대한민국 남성입니다.");
	}
	
	public void delete(String num) {
		System.out.println(num+"번 데이타 삭제완료!");
	}
	
	
}
