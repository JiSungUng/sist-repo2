package day1228;

import java.util.Scanner;
public class ScanIfTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요");
		int score = sc.nextInt();
		
		String msg=score>=90?"장학생": score>=80?"좀더 노력할 것!": "다음 기회에...";
		System.out.println("점수: "+score);
		System.out.println("평가메세지: "+msg);
		
		
		//학점 if 문으로 
		if (score>=90) {
			System.out.println("A학점입니다.");   // grade="A";    . 이렇게도 가능.
		}else if(score>=80){
			System.out.println("B학점입니다.");			
		}else if(score>=70) {
			System.out.println("C학점입니다.");
		}else if(score>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		//삼항 연산자
		String grade = score>=90?"A": score>=80?"B": score>=70?"C": score>=60?"D":"F";	
		System.out.println("학점: "+grade);
	}

}
