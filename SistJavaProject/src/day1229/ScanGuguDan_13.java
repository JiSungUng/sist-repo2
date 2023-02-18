package day1229;

import java.util.Scanner;

public class ScanGuguDan_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int dan;
//		System.out.println("원하는 단을 입력해주세요->");
//		dan = sc.nextInt();
//		
//		for(int i =1 ; i<10;i++) {
//			System.out.println(dan+"X"+i +"="+ dan*i);
//			
//					
//				
//			}

			while(true) {
				System.out.println("원하는 단을 입력해 주세요 -> (종료 : 0)");
				dan = sc.nextInt();
				
				
				if (dan == 0)
				{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				//예외조항
				if(dan<2|| dan>9) {
					System.out.println("2~9까지의 숫자 다시 선택바람");
					continue;
				}
					
				
				for(int i1 =1 ; i1<10;i1++) {
					System.out.println(dan+"X"+i1 +"="+ dan*i1);
				
//				
		
		}
	}

	}
}