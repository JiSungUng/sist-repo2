package day0102;

import java.util.Scanner;

public class RandomSuMatch_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int cnt=0;
		while(true) {
			cnt++;
			int num= sc.nextInt();
			
			if(n==num) {
				System.out.println("정답을 맞췄습니다. 정답:" +n);
				break;
			}
			if(n>num) {
				System.out.println("더 큰 수를 입력하세요");
//				continue;
			}else {
				System.out.println("더 작은 수를 입력하세요.");
//				continue;
			}
			
		}
		System.out.println("총 "+cnt+"번 만에 맞췄습니다.");
	}

}
