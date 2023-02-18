package day0106;


/*메서드 장점 및작성요령
 * public +satatic +void (int,String)+메소드명
 * 리턴값은 데이터 타입 다 가능
 * 반복적인 코드를 줄여서 관리가 편하다.
 * 하나의 메서드에는 한가지 기능만 수행하게 작성*/

public class MethodTest_14 {
	
	public static boolean aaa() {
		return false;
	}
	
	public static int bbb() {
		return 100;
	}
	
	public static int ccc(int x, int y) {
		int z= x+y;
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a=aaa();
		System.out.println("a= "+a);
		
		
		int b=bbb();
		System.out.println("b= "+b);
		
		
		int c=ccc(20,30);
		System.out.println("c= "+c);
	}

}
