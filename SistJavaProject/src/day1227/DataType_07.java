package day1227;

public class DataType_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a =127; //-128~127
		byte b =(byte)128; // 더 작은 자료형으로 변환
		
		System.out.println(a);
		System.out.println(b);
		
		//강제형변환(cast연산자)를 바르게 사용하기
		
		int x=7;
		int y=4;
		System.out.println(x/y); // 1. 정수형끼리의 계산결과는 무조건 정수 int
		System.out.println((double)x/y); // 계산시 x 를 double로 변환해서 계산 -> 결과는 double 로 나옴
		System.out.println(x/(double)y); // 계산시 y를 double로 변환해서 계산 -> 결과는 double 로 나옴 값중 하나만 double이여도 double 로 나옴
		
		
		double d = 100.0;
		int i = 100;
		int result = (int)d+i;
		double result2= d+i;
		System.out.println(d);
		System.out.println(i);
		System.out.println(result);
		System.out.println(result2);
	}

}
