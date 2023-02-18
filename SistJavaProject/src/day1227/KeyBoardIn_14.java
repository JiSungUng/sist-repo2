package day1227;

import java.util.Scanner;

public class KeyBoardIn_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 변수선언
		
		System.out.print("이름을 입력해 주세요-->");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("나이를 입력해주세요-->");
//		int age = sc.nextInt();
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(age);
		
		System.out.print("지역을 입력하세요");
		String city = sc.nextLine();
		
		System.out.println(name+age+city);
		
		
	}

}
