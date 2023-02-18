package day1228;

import java.util.Scanner;

public class SwitchTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("숫자입력");

		num = sc.nextInt();

		// switch

		switch (num) {

		case 1:
			System.out.println("input 1");
			break;
		case 2:
			System.out.println("input 2");
			break;
		case 3:
			System.out.println("input 3");
			break;
		default:
			System.out.println("not 1, 2, 3");
			break;

		}
		
		switch (num%2) {
		case 0:
			System.out.println(num+"은 짝수입니다.");
			break;

		case 1:
			System.out.println(num+"은 홀수입니다.");
			break;
		}
		
		
	}

}
