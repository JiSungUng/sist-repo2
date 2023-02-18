package day1228;

import java.util.Calendar;
import java.util.Scanner;

public class QuizScannerMyInfo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("태어난 연도: ");
		int myYear = Integer.parseInt(sc.nextLine());
		System.out.print("핸드폰 번호: ");
		String number = sc.nextLine();
		System.out.print("주소: ");
		String add = sc.nextLine();
		
		int curYear = cal.get(cal.YEAR);
		int myAge = curYear-myYear +1;
		System.out.println("=======================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+ myAge);
		System.out.println("핸드폰: "+number);
		System.out.println("주소: "+add);
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
