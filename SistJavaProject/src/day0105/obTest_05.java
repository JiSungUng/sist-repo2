package day0105;

class TestA{
	String name ="이수진";
	static String MESSAGE = "HappyDay!!";
	
}

public class obTest_05 {
	int a;
	static int b;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=20;
		System.out.println("b=" +b);
		
		//일반멤버변수는 인스턴스가 있어야 접근가능.
		obTest_05 ob1=new obTest_05();
		obTest_05 ob2=new obTest_05();
		
		ob1.a =10;
		ob2.a=20;
		
		System.out.println("ob2.a =" +ob1.a);
		System.out.println("ob2.a = " +ob2.a);
		
		TestA ta=new TestA();
		System.out.println(ta.name);
		System.out.println(TestA.MESSAGE);
		
		
	}

}
