package day0102;

public class RandomTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 난수를 구하는 방법 2가지
		 * 1. Math.random()메서드 이용 : 0.0<=r <1.0  0.0이상에서 1.0미만의 dobule형 실수값을 반환. // (* 10) 같은 거해 주는 이유.
		 * 2. Random 이라는 클래스를 생성해서 구하는 방법*/
		
		//10개의 난수 발생
		
		for(int i=0;i<10;i++) {
			double n=Math.random();
			System.out.println(n);
		}
		System.out.println("======================");
		
		
		System.out.println("0~9사이의 난수 발생");
		
		
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*10);
			System.out.println(n);
		}
	System.out.println("1~100사이 난수 발생");
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*100)+1;
			System.out.println(n);
		}
		System.out.println("65~90사이 난수 발생");
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*26)+65;
			System.out.println(n);
		}
		//int n=(int)(Math.random()*m)+n;
		//n~(m+n-1)
		System.out.println("A~Z사이 난수 발생");
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*26)+65;
			System.out.println((char)n);
		
	}

}
}
