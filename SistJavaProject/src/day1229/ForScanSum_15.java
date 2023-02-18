package day1229;

import java.util.Scanner;

public class ForScanSum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int score;
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+"번째 점수를 입력하세요(1~100)");
			score = sc.nextInt();
			
			//continue 조건문
			if(score<1 || score>100) {
				System.out.println("잘못된 점수 입니다.");
				i--;
				continue;
			}
			
			
			
			
			sum+=score;
		}
		System.out.println("=================");
		System.out.println("총합계: "+sum);
		
	}

}
