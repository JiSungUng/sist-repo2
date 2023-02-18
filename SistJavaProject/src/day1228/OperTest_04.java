package day1228;

public class OperTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool=false;
		System.out.println("a="+bool);
		System.out.println("b="+!bool);
		
		boolean bool1= 5>4;
		
		System.out.println("c=" + bool1);
		System.out.println("d=" + !(5>4));
		
//		System.out.println("d=" + !5);  숫자를 바로 부정할 수는 없다.
		
		
//		비교연산자 (관계): > , < , >= , <= , == , !=
//		논리연산자: &&(and) , ||(or) , !(not)
		
		
		int a = 3 , b= 3 , c = 5;
		
		//결과값을 ture or false
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(!(a==b));
		System.out.println(a!=b);
		System.out.println(a>b&&c>b);
		System.out.println(a>b||c>b);
		
		
	}

}
