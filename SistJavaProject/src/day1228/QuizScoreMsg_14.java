package day1228;

import java.util.Scanner;

public class QuizScoreMsg_14 {

	public static void main(String[] args) {
		
		String name ;
		int java, oracle, spring , score, tot;
		double avg;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("이름을 입력하세요 ->");
		name = sc.nextLine();
		System.out.print("자바 점수를 입력해주세요->");
		java = sc.nextInt();
		System.out.print("오라클 점수를 입력해주세요->");
		oracle = sc.nextInt();
		System.out.print("스프링 점수를 입력해주세요->");
		spring = sc.nextInt();
		
		tot= java+oracle+spring;
		avg = tot/3.0;
		System.out.println("이름: "+name);
		System.out.printf("총점 : %d , 평균 %.1f\n", tot,avg);
		if (avg>=80) {
			System.out.println("합격입니다.");
		}else if(avg>=70){
			System.out.println("노력하세요.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		//삼항 연산자 .. 이용법 system.out.println("평가: " + (avg>=80? " 합격:"불합격")) ;  이렇게도 사용 가능!
		
		
		
	}

}
