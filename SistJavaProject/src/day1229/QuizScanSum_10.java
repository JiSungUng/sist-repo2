package day1229;

import java.util.Scanner;

public class QuizScanSum_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int num;
		System.out.println("합계를 구할 숫자는?");
		num=sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		
		System.out.println("1~"+num+"까지의 합: "+sum);
		
	}

}
