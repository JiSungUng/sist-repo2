package day0109;

import java.util.Scanner;

public class StudentScoreMain_04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inwon;
		
		StudentScore st[];
		
		System.out.println("인원 수 입력");
		inwon = Integer.parseInt(sc.nextLine());
		st= new StudentScore[inwon];
		
		for(int i=0;i<inwon;i++) {
			st[i]= new StudentScore();
			System.out.println("이름");
			String name = sc.nextLine();
			System.out.println("Java 점수");
			int java = Integer.parseInt(sc.nextLine());
			System.out.println("HTML 점수");
			int html = Integer.parseInt(sc.nextLine());
		
			st[i].setName(name);
			st[i].setJava(java);
			st[i].setHtml(html);
		
		System.out.println();
		}
		StudentScore.writeStu(st);
	}

}
