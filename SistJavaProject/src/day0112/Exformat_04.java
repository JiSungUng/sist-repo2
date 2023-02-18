package day0112;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exformat_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date);

		// 날짜 , 시간을 원하는 양식대로 출력
		// HH :24시간으로 표시 MM:월 mm :분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
		System.out.println(sdf.format(date));

		// a:오전 /오후 hh:12시간 표시
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));

		/// EEE: 요일 짧게 EEEE요일 길게
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
		System.out.println(sdf3.format(date));

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf4.format(date));

		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년-MM월-dd일 HH시:mm분 EEEE");
		System.out.println(sdf5.format(date));

		// 숫자를 문자열로 변환하여 출력 (컴마나 소수점등을 지정)
		int money = 256841254;
		double num = 67.12548;

		NumberFormat nf1 = NumberFormat.getCurrencyInstance();// 화폐단위 제공
		System.out.println(nf1.format(money));

		NumberFormat nf2 = NumberFormat.getInstance(); // 컴마제공
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));

	}

}
