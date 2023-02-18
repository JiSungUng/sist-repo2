package day0109;

public class ExMethod_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10,20의 합"+add(10,20));
		System.out.println("10,20의 제곱"+square(4.5));
		System.out.println("10,20의 제곱"+square(4.5));
		divide(7,4);
		divide(7,0);
		
	}
	public static int add (int num1, int num2) {
		int result =num1+num2;
		return result;
	}
	public static void divide (int num1, int num2) {
		
		if (num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return ;
		}
		System.out.println("나눗셈의 결과: " + num1/num2);
	
	}
	public static double square (double num) {
		double result =num*num;
		return result;
	}
}
