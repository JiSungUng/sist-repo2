package day1227;

public class QuizCastArgs_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sangpum = args[0];
		int su = Integer.parseInt(args[1]);
		int dan = Integer.parseInt(args[2]);
		
		int total = su*dan;
		
		System.out.println("상품명: " + sangpum);
		System.out.println("수량: "+su+"개");
		System.out.println("단가: "+dan+"원");
		System.out.println("총금액: "+ total+"원");
		
	}

}
