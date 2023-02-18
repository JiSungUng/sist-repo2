package day0106;

import java.util.Calendar;

import day0106_1.Test_03;

public class TestMain_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Test_03 t1=new Test_03();      생성자가 private라 안된다.
		
		Test_03 t1 = Test_03.getInstance();
		t1.writeMessage();
		
		
		
		
		Calendar cal = Calendar.getInstance();
		int y=cal.get(cal.YEAR);
		int m =cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		
		System.out.println(y+"년"+m+"월"+d+"일입니다.");
				
	}

}
