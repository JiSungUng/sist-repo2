package day0105;
/*
 * 객체를 자바프로그램으로 개발하기위해 클래스형태로 표현
 * 객체의 속성은 인스턴스변수로 표현하고 객체의 동작은 클래스의 메소들 표현한다.
 * Object: 객체, 실제존재하는 사물(핸드폰, 자동차, 붕어빵)
 * class: 객체를 정의해 놓은 것, 객체를 생성하기 위해 존재 (설계도, 붕어빵틀)
 * instance: 클래스에서 만들어진 객체를 그 클래스의 인스턴스 라고 표현
 * 
 * 멤버변수
 * 1.instance변수
 * 2.static 변수(클래스 변수)
 * */

public class ExObject_01 {
	String name; //인스턴스변수,객체생성후 각각 다른값을 가질 수 있다.
	static final String Message ="Happy day!!!";
	
	
	public static void main(String[] args) {
	
		System.out.println("static 멤버변수는 new로 생성없이 호출 가능하다.");
		System.out.println(ExObject_01.Message); // 클래스명, 변수명으로 호출가능
		System.out.println(Message); //같은클래스내에서는 클래스명 생략가능
//		Message ="Nice"; //final에서는 값변경안됨
		
		// 인스턴스 변수는 무조건 객체생성 후 변경, 호출가능.
		ExObject_01 ob1 = new ExObject_01();
		ob1.name="영희";
		ExObject_01 ob2 = new ExObject_01();
		ob2.name = "철수";
		ExObject_01 ob3 = new ExObject_01();
		ob3.name = "성웅";
		
		
		System.out.println(ob1.name);
		System.out.println(ob2.name);
		System.out.println(ob3.name);
		
		System.out.println("다같이 사용하는 메세지:"+Message);
				
		
		
		
		
		
		
		
	}

}
