package day0105;

class Person{
	String name;
	int age;
	
	//생성자 만들기
	//default 생성자
	public Person(){
		this("홍길동",11);//호출 2
		System.out.println("디폴트 생성자");
	}
	
	public Person(String name) {
		this(name,5);
	}
	public Person(int age) {
		this("오징어",age);
	}
	
	
	public Person(String name, int age){
		this.name=name;
		this.age = age;
	
		System.out.println("호출2 ");
	}
	//메서드
	public void write() {
		System.out.println("이름: "+name+"\t나이: "+age);
	}
	
	
	
}
public class ExObConst_11 {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.write();
		
		Person p2 = new Person("지성웅");
		p2.write();
		
		Person p3 =new Person(22);
		p3.write();
		
		Person p4 = new Person("이정재",55);
		p4.write();

	}

}
