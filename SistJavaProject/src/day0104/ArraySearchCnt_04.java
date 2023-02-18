package day0104;

import java.util.Scanner;

public class ArraySearchCnt_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*검색할 성을 입력해주세요.
		 * 0:김도희
		 * 1: 김병훈
		 * 2: 김영돈
		 * 		총 3명 검색
		 * 검색할 성을 입력해주세요
		 * 송  
		 * 송씨성을 가진 사람은 없습니다.
		 * 검색할 성을 입력해주세요
		 * 종료
		 * 종료합니다!!!*/
		
		
		
		String names[]= {"김도희","김병훈","김영돈","박종수","권예지","이우형","이지영","서동익","지성웅","서아랑"};
		
		Scanner sc = new Scanner(System.in);
		int cnt;
		String search;
		while(true) {
		System.out.println("검색할 성을 입력해주세요.");	
		String sung = sc.nextLine();
		
		boolean find =false;
		if(sung.equals("종료")) {
			System.out.println("프로그램 종료");
			break;
		}
		
		cnt =0; // 검색시마다 초기화
		
			if(!find) {
				
			}
			
			for (int i=0;i<names.length;i++) {
				if(names[i].startsWith(sung)) {
					find = true;
					
					cnt++;
					
					System.out.println(i+":"+names[i]);
				}
			}
			
			if(find)
				System.out.println("\t총 "+cnt+"명 검색");
			else
				System.out.println("\t"+sung+"씨성을 가진 사람은 없습니다.");
			
		}
		
		
	}

}
