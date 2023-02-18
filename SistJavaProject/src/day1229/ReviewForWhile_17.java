package day1229;

import java.util.Scanner;

public class ReviewForWhile_17 {

	
	public static void test1() {
	
		
		int sum=0;
		
		for(int num = 1;num<=5;num++) {
			sum+=num;
			
			
		}
		System.out.println("총 합계는"+sum+"입니다.");
	}
	
	public static void sumTest2() {
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
			System.out.println("총 합계는"+sum+"입니다.");
	}
	
	public static void sumTest3() {
		int sum=0;
		int i=0;
		for(;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+(i-1)+"까지의 합은"+sum);
	}
	
	public static void quiz4() {
		
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int num;
		
		System.out.println("(1~100)까지의 점수를 적으세요");
		for(int i=1;i<=5;i++) {
			
			num=sc.nextInt();
			if(1>num || num>100) {
				System.out.println("잘못 입력했습니다.");
				i--;
				continue;
			}
			System.out.println(i+"번째 점수: "+num);
			sum+=num;
			
		}
		System.out.println("5번까지 입력 후 총합계 출력");
		System.out.println("총 합계: "+sum);
	}
	
	public static void quiz5() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		int count1=0,count2=0;
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			num=sc.nextInt();
			if(num==0) {
				break;
			}
			if(num<0) {
				count1++;
			}
			
			if(num>0) {
				count2++;
			}
		}
		System.out.println("==================");
		System.out.println("양수개수: "+ count2);
		System.out.println("음수개수: "+ count1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
//		sumTest2();
//		sumTest3();
//		quiz4();
		quiz5();
	}

}
