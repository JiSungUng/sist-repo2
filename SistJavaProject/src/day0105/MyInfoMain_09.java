package day0105;

public class MyInfoMain_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체생성
		//클래스명 참조변수명= new 클래스명()

		MyInfo_09 info = new MyInfo_09();
		
		//2. setter메서드를 활용해서 값을 수정, 설정
		
		info.setName("최정원");
		info.setAge(33);
		
		//3. getter 메서드를 활용해서 값 얻기.
		String name=info.getName();
		int age = info.getAge();
		
		//출력
		System.out.println(name);
		System.out.println(age);
	
	}

}
