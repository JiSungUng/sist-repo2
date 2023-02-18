package day1229;

import java.util.Scanner;

public class WhileContinueBreak_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score;
		int sum=0;
		
		
		while(true) {
			
			System.out.println("점수를 입력하시오");
			score = sc.nextInt();
		
			
		if(score<0 || score>100)
			continue;
		
		if(score==0)
			break;
		
		sum+=score;
		
		
		}
		System.out.println("총합계: " +sum);
	}

}
