package day0102;

import java.util.Scanner;

public class QuizForWhile_02 {

	public static void quiz1() {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int result = 1;
		System.out.println("x값을 입력하세요.");
		x = sc.nextInt();
		System.out.println("y값을 입력하세요.");
		y = sc.nextInt();

		for (int i = 1; i <= y; i++) {
			result *= x;

		}
		System.out.println(x + "의" + y + "승은" + result + "입니다.");

	}

	public static void quiz2() {
		int result=1;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		x= sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			result*=i;
		}
		System.out.println(x+"팩토리얼은"+result);
		
	}

	public static void quiz3() {
		
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+". Hello");
			for(int j=1;j<=4;j++) {
				System.out.print(j+".java:");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		quiz1();
//		quiz2();
//		quiz3();
		
	}

}
