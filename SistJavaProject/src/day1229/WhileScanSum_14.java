package day1229;

import java.util.Scanner;

public class WhileScanSum_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum =0;
		int count =0;
		double avg =0;
		while(true) {
			System.out.println("숫자입력(종료:0)");
			num=sc.nextInt();
			
			if(num ==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			sum+=num;			
			
			count++;
			
			
		}
		avg = (double)sum/count;
		System.out.println("총 입력개수"+count);
		System.out.println("모두 더한 값은 ?"+sum);
		System.out.println("평균"+avg);
	
	
	
	
	}
	
}
