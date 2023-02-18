package day0111;

class OuterClass{
	int a =10;
	static int b=20;
	
	

	class InnerClass{
		int c=30;
		//내부클래스에서는 static이 선언이 안됨.  static int d=40 ; -> 오류
		public void write() {
			System.out.println("외부변수 a= "+a);
			System.out.println("외부정적변수 b= "+b);
			System.out.println("내부변수 c= "+c);
		}
	}
}


public class InnerVar_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OuterClass.InnerClass ic = new OuterClass().new InnerClass();
	ic.write();
	}

}
