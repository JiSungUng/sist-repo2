package day0104;

import java.util.Scanner;

public class ArrayAgesInwon_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age []  =new int[10];
		int inwon []  =new int[5]; //10대 20 대 30대 40대 50대
	
				
		Scanner sc = new Scanner(System.in);
		
		//10명의 나이 입력.. 인원수 구하기
		
		for(int i=0;i<age.length;i++) {
			System.out.print("나이 입력: ");
			age[i]=sc.nextInt();
			
			if(age[i]<10 || age[i]>60) {
				continue;
			}
			
			inwon[age[i]/10-1]++;
			
		}
		for(int i=0; i<age.length;i++) {
			System.out.printf("%5d",age[i]);
			if((i+1)%5 ==0) {
				System.out.println();
			}
			//분포도
			
		}
		System.out.println("***연령별 나이 분포***");
		
		for(int i=0;i<inwon.length;i++) {
			
			System.out.printf("  %d대:%d명",(i+1)*10,inwon[i]);
		}
		
		
	}

}
