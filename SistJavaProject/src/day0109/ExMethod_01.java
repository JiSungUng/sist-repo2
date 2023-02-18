package day0109;

public class ExMethod_01 {

		public static int sum(int a, int b) {
			System.out.println("첫번째 함수 호출");
			int sum= a+b;
			return sum;
		}
		
		public static double sum(int a,double b) {
			System.out.println("두번째 함수호출: ");
			return a+b;
		}
		public static double sum(double a,int b) {
			System.out.println("세번째 함수호출: ");
			return a+b;
		}
		public static double sum(double a,double b) {
			System.out.println("네번째 함수호출: ");
			return a+b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3,7));
		System.out.println(sum(3,7.1));
		System.out.println(sum(3.1,7));
		System.out.println(sum(3.1,7.1));
	}

}
