package day1229;

import java.util.Scanner;
public class ScanEqual {

	public static void main(String[] args) {
		// 문자열비교는 관계연산자로 하면 안된다.
		//equals 라는 메서드를 사용해서 비교해야한다.
		
		Scanner sc = new Scanner(System.in);
		String msg;
		
		System.out.println("영어단어를 입력하세요.");
		System.out.println("ex)happy,angel,rose,cat,dog");
		msg=sc.nextLine();
		
		System.out.println("입력한 문자열: "+msg);
		
		
		
//		msg.equalsIgnoreCase(msg) -> 대소문자 구분 X
		if(msg.equals("happy"))    // equals 는 대소문자 구분함.
			System.out.println("***행복하다***");
		else if(msg.equals("angel"))
			System.out.println("***천사***");
		
		else if(msg.equals("rose"))
			System.out.println("***장미***");
		
		else if(msg.equals("cat"))
			System.out.println("***고양이***");
		
		else if(msg.equals("dog"))
			System.out.println("***강아지***");
		else
			System.out.println("**등록되지 않은 단어입니다.**");
		
		
		
		
	}

}
