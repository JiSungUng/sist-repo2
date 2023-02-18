package day0111;

public class ArithExcep_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램시작");
		
		try {
		int num =3/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}

}
