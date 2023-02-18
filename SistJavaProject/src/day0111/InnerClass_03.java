package day0111;

class Outer{
	String name ="최보현";
	int age =25;
	
	//내부 클래스 #1
	class Inner1{
		//내부클래스에서는 외부클래스의 멤버변수사용이 가능하다.
		
		public void disp1() {
			System.out.println("**inner1 내부클래스**");
			System.out.println("이름: "+name+"나이: "+age);
		}
		//외부클래스의 메서드 추가
	}
	
	//내부클래스_#2
	class Inner2{
		public void disp2(){
			System.out.println("**inner2 내부클래스**");
			System.out.println("이름: "+name+"나이: "+age);
		}
	}
	
	
	public void disp() {
		//외부클래스의 메서드에서 내부클래스 선언하는 방법
		Inner1 in1 = new Inner1();
		in1.disp1();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
	
	
}


public class InnerClass_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.disp();
		
		System.out.println("직접 내부클래스의 메소드를 호출하려면 ?");
		Outer.Inner1  in1 = new Outer().new Inner1();
		in1.disp1();
		Outer.Inner2 in2=out.new Inner2();
		in2.disp2();
	}

}
