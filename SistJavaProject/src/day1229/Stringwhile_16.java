package day1229;

import java.util.Scanner;

public class Stringwhile_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//startswitch, equasl 이용 .반복문안에서 입력, 종료..
		
		Scanner sc = new Scanner(System.in);
		String name;
		int cnt = 0;
		
		while(true) {
		System.out.println("이름입력(종료=끝)");
		name=sc.nextLine();
		
		if(name.equals("끝")){
			System.out.println("프로그램 종료");
			break;
		}
			
		//조건
		if(name.startsWith("김")) {
			cnt++;
			
		}
		
		}
		
		System.out.println("김씨성을 가진사은 총 "+cnt+"입니다.");
		
		
	}

}
