package day1227;

import java.util.Calendar;
import java.util.Date;
public class CalTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Date date = new Date();
		
//		System.out.println("지금은 " +(date.getYear()+1900)+"년도 입니다.");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("지금은"+cal.get(cal.YEAR)+"년입니다.");
		System.out.println("지금은"+(cal.get(cal.MONTH)+1)+"월입니다."); // month는  +1 해줘야함
		System.out.println("지금은"+cal.get(cal.DAY_OF_MONTH)+"일입니다.");
		System.out.println("지금은"+cal.get(cal.DATE)+"일입니다.");
	System.out.println("지금은"+cal.get(cal.HOUR)+"시"+cal.get(cal.MINUTE)+"분 입니다.");//HOUR_OF_DAY -> 24시간 체제
	}

}