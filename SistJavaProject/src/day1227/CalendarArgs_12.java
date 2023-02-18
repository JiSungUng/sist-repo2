package day1227;

import java.util.Calendar;

public class CalendarArgs_12 {

	public static void main(String[] args) {
		// 
		Calendar cal = Calendar.getInstance();
		//변수 선언
		int curYear = cal.get(cal.YEAR);
		String name = args[0];
		int myYear = Integer.parseInt(args[1]); //String 을 int 로 형변환
		
		//계산
		
		int myAge = curYear - myYear+1;
		
		//출력
		System.out.println("이름"+name);
		System.out.println("태어난 년도 :"+myYear+ "년생");
		System.out.println("태어난 년도 :"+myAge+ "세");
	}
	

}
