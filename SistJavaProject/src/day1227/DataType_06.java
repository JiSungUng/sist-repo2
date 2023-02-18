package day1227;

public class DataType_06 {
	public static void main(String [] args) {
		//기본적인 자료형 8개
		// 1. 논리형 true or false를 나타내주는  boolean
		
		boolean flag = false;
		System.out.println("flag="+flag);
		System.out.println("flag="+!flag);
		
		//2. 문자형
		//반드시 하나의 문자를 가지며, 문자하나 2바이트
		// 기본적으로 정수형, 아스키코드로 변경 가능... ' ' 소따옴표로 표현
		char ch = '가';
		
		System.out.println("ch ="+ch);
		
		//3.정수형
		byte a = 127; //1바이트 , -128~127
		short b = 32000; //
		int c = 670000; //
		long d = 100L; // L을 안붙이면 기본적인 int를 의미하므로 뒤에 L,l을 붙인다.
		System.out.println("byte="+a);
		System.out.println("short="+b);
		System.out.println("int="+c);
		System.out.println("long="+d);
		
		
		//4.실수형
		double dou = 3456.678;
		float f = 3.1234f; //  뒤에 f 를 붙여지 않으면 double로 인식
		
		//int, float 만약 같은 32bit를 사용하지만, 기본적으로 실수형이 정수형보다 큰타입으로 처리된다.
		
		System.out.println("double = "+ dou); // 정밀도 15 자리
		System.out.println("float = "+ f);  // 8자리
		
		System.out.printf("double = %10.2f\n",dou);
		System.out.printf("double = %.``1f\n",dou);
	
	}
}
