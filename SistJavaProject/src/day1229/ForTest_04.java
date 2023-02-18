package day1229;

public class ForTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(초기값;조건문;증감식){}

		for (int i = 0; i < 3; i++) {
			System.out.println(" I Love JAva" + i);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "Hello");
		}
		System.out.println("for문 빠져나옴.");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=====================");

		for (int i = 0; i < 4; i++) {
			System.out.print("Hello ");
		}
		System.out.println();
		System.out.println("======================");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}

		System.out.println();
		System.out.println("=================");

	}
}
