package day0102;

import java.util.Scanner;

public class ReviewForWhile_01 {
	
	
	public static void whileTest() {
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt=0 , sum=0;
		double avg;
		
		while(true) {
			
			System.out.println("점수를 입력하세요");
			num = sc.nextInt();
				
			if(num == 0)
			break;
			
			if(num<0 || num>100) {
				
				System.out.println("다시 입력해주세요.");
				continue;
			
			
			
			}
			cnt++;
			sum+=num;
				
		}
		
		avg=(double)sum/cnt;
		System.out.println("총 개수:"+cnt);
		System.out.println("총 점수:"+sum);
		System.out.println("총 평균:"+avg);
		
		
	}
	
	public static void forTest() {
		Scanner sc= new Scanner(System.in);
		
		int num;
		int sum=0;
		for(int i = 0 ; i<5 ; i++) {
			System.out.println((i+1)+"번의 점수:");
			num = sc.nextInt();
			if(num<1||num>100) {
				System.out.println("점수를 잘못 입력했습니다.");
				i--;
				continue;
				
			}
			sum+=num;
		}
		System.out.println("총 합계는"+sum);
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileTest();
		forTest();
	}

}
