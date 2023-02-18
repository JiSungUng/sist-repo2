package CodingTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(sdf.format(date));
	}

}
