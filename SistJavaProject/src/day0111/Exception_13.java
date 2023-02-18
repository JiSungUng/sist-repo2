package day0111;

import java.io.IOException;
import java.io.InputStream;

public class Exception_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		
		int n=0;
		System.out.println("한글자 입력");
		try {
			n=is.read(); //한바이트밖에 못읽어서 2바이트인 한글 못읽는다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("오류: "+e.getMessage());
		}
		System.out.println("3초 뒤에 실행합니다.");
		
		try {
			Thread.sleep(3000); // 3초뒤
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력 값: "+(char)n);
	}

}
