package day1228;

import java.util.Scanner;

public class KeyBordIn_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		int tot;
		double avg;
		
		System.out.print("당신의 이름은?");
		name = sc.nextLine();
		System.out.print("국어점수는?");
		kor = sc.nextInt();
		System.out.print("영어점수는?");
		eng = sc.nextInt();
		System.out.print("영어점수는?");
		mat = sc. nextInt();
		
		
		//계산
		tot = kor+eng+mat;
		avg= tot/3.0;
		System.out.println("====================================");
		System.out.println("이름 : "+name);
		System.out.println("평균 : "+avg);
	}

}
