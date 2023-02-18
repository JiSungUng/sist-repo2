package day0105;

public class StudentMain_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_03 st1 = new Student_03();
		Student_03 st2 = new Student_03();
		
		st1.name ="홍길동";
		st1.age =17;
		st2.name ="김나영";
		st2.age =16;
		
		System.out.println("클래스 멤버값 출력");
		System.out.println("학교명: "+st1.SCHOOLNAME);
		System.out.println("**학생정보1**");
		System.out.println("이름: "+st1.name);
		System.out.println("나이: "+st1.age);
		System.out.println();
		System.out.println("**학생정보2**");
		
		System.out.println("이름: "+st2.name);
		System.out.println("나이: "+st2.age);
	
	
	}

}
