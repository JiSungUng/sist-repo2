package day1228;

import java.util.Scanner;

public class QuizPass_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat,tot;
		double avg;
		
		System.out.print("응시자명을 입력하세요-->");
		name=sc.nextLine();
		System.out.println("국어, 영어, 수학 점수를 입력하세요 ->");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		
		tot = kor+eng+mat;
		avg = tot/3;
		System.out.println("***결과***");
		System.out.println("국어: "+kor+"영어"+eng+"수학: "+mat);
		if(avg>=60&&kor>=40&&eng>=40&&mat>=40) {
			System.out.println(name+"님은 합격입니다.");
		}else {
			System.out.println(name+"님은 불합격입니다.");
		}
	}

}
