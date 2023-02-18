package day1228;

import java.util.Scanner;

public class IfTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
//		char grade;
		String grade;
		//scanner 이용
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해주세요");
//		int score = sc.nextInt();
//		if (score>=90) {
//			System.out.println("A학점입니다.");
//		}else if(score>=80){
//			System.out.println("B학점입니다.");			
//		}else if(score>70) {
//			System.out.println("C학점입니다.");
//		}else if(score>60) {
//			System.out.println("D학점입니다.");
//		}else {
//			System.out.println("F학점입니다.");
//		}
		
		
		
//		if (score>=90) {
//			grade ='A';
//		}else if(score>=80){
//			grade ='B';			
//		}else if(score>70) {
//			grade ='C';
//		}else if(score>60) {
//			grade ='D';
//		}else {
//			grade ='F';
//		}
//		
		
		
		//삼항연산자  (조건 ? "참" : "거짓")
		grade = score>=90? "A":
				score>=80? "B":
				score>=70? "C":
				score>=60? "D":"F";
		
		System.out.println("학점은 "+grade+"입니다.");
		
		
	}

}
