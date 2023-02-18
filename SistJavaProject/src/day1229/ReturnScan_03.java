package day1229;

import java.util.Scanner;

public class ReturnScan_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수입력(1~100)");
		score=sc.nextInt();
		
		//잘못입력한 경우 종료
		if(score<1 || score>100) {
			System.out.println("잘못 입력했습니다.");
			return;  // 현재의 메인함수 종료.
		}else
			System.out.println("점수: "+score+"점 입니다.");
		
	}

}
