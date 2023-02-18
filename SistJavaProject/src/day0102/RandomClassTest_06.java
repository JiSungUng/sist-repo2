package day0102;

import java.util.Random;

public class RandomClassTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random 이라는 클래스를 생성해서 구하는 방법. 생성 -> new 라는 연산자를 떠올려야함!!!

		Random r = new Random();
		System.out.println("0~9사이의 난수 5개발생");

		for (int i = 1; i <= 5; i++) {
			int n = r.nextInt(10); // 0~9
			System.out.println(n);
		}

		System.out.println("-------------------");

		System.out.println("0~99사이의 난수 5개발생");

		for (int i = 1; i <= 5; i++) {
			int n = r.nextInt(100); // 0~9
			System.out.println(n);
		}
		System.out.println("1~10사이의 난수 5개발생");

		for (int i = 1; i <= 5; i++) {
			int n = r.nextInt(10) + 1; // 1~10
			System.out.println(n);
		}
		System.out.println("A~Z사이의 난수 5개발생");

		for (int i = 1; i <= 5; i++) {
			int n = r.nextInt(26) + 65; // A~Z
			System.out.println((char) n);
		}
	}

}
