package day1227;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerMyAge_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int curYear = cal.get(cal.YEAR); // 현재 년도
		System.out.print("나의 이름은-->");
		String name = sc.nextLine(); // 이름

		System.out.print("태어난 년도는 -->");
		int myYear = Integer.parseInt(sc.nextLine());
		
		int myAge = curYear -myYear+1;
		
		System.out.print("나의 이름은 "+name+"입니다.");
		System.out.println("저의 나이는 "+myAge+"세 입니다.");

	}

}
